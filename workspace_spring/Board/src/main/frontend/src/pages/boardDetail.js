import { useNavigate, useParams } from "react-router-dom";
import * as boardApi from "../apis/boardApis";
import * as replyApi from "../apis/replyApis";
import { useEffect, useState } from "react";

const BoardDetail = () => {
   const {boardNum} = useParams();
   const [board, setBoard] = useState({});
   const [replys, setReplys] = useState([]);
   const navigate = useNavigate();
   
   useEffect(()=>{
      boardApi.BoardDetail(boardNum)
      .then((res) => {
         setBoard(res.data);
      })
      .catch((error) => {
         alert(error);
      });
   }, []);
   
   useEffect(() => {
      replyApi.getReplyList(boardNum)
      .then((res) => {
         setReplys(res.data);
      })
      .catch((error) => {
         alert(error);
      });
   }, []);
   

   function deleteBtn() {
      boardApi.delBoard(boardNum)
      .then((res) => {
         if (window.confirm("게시글을 삭제합니다")) {
            navigate('/');
         } else {
            return ;
         }
      })
      .catch((error) => {
         alert(error);
      })
   }

   return (
      <div>
         <table>
            <tbody>
               <tr>
                  <td>작성일</td>
                  <td>{board.createDate}</td>
                  <td>작성자</td>
                  <td>{board.memID}</td>
               </tr>
               <tr>
                  <td>제목</td>
                  <td colSpan={3}>{board.title}</td>
               </tr>
               <tr>
                  <td>내용</td>
                  <td colSpan={3}>{board.content}</td>
               </tr>
            </tbody>
         </table>
         <div className="btn-div">
            <button type="button" onClick={() => {navigate('/');}}>목록가기</button>
            <button type="button">수정</button>
            <button type="button" onClick={() => {deleteBtn();}}>삭제</button>
         </div>

         {
            replys.map((reply, i) => {
               return (
                  <div className="reply-div">
                     <p>──────────────────────────────────────</p>
                     <p>{reply.replyDate}</p>
                     <p>{reply.memID}</p>
                     <p>{reply.replyContent}</p>
                     <p>──────────────────────────────────────</p>
                  </div>
               );
            })
         }
      </div>
   );
}

export default BoardDetail;