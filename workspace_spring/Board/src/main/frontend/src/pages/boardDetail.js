import { useNavigate, useParams } from "react-router-dom";
import * as boardApi from "../apis/boardApis";
import * as replyApi from "../apis/replyApis";
import { useEffect, useState } from "react";
import axios from "axios";

const BoardDetail = ({loginInfo}) => {
   // console.log('BoardDetail 컴포넌트 실행');
   const {boardNum} = useParams();
   const [deleteState, setDeleteState] = useState({});
   // const [cnt, setCnt] = useState(0);
   const [board, setBoard] = useState({});
   const [replys, setReplys] = useState([]);
   const [newReply, setNewReply] = useState({
      replyContent : '',
      memID : loginInfo.memID,
      boardNum : boardNum
   });
   const navigate = useNavigate();
   
   // useEffect(()=>{
   //    boardApi.BoardDetail(boardNum)
   //    .then((res) => {
   //       setBoard(res.data);
   //    })
   //    .catch((error) => {
   //       alert(error);
   //    });
   // }, []);
   
   // useEffect(() => {
   //    replyApi.getReplyList(boardNum)
   //    .then((res) => {
   //       setReplys(res.data);
   //    })
   //    .catch((error) => {
   //       alert(error);
   //    });
   // }, []);

   // db에서 데이터 조회 여러 개 동시에 실행하기
   useEffect(() => {
      axios.all([boardApi.BoardDetail(boardNum)
         , replyApi.getReplyList(boardNum)])
      .then(axios.spread((res1, res2) => {
         setBoard(res1.data);
         setReplys(res2.data);
      }))
      .catch(axios.spread((error1, error2) => {
         alert(error1);
         alert(error2);
      }));
   }, [newReply, deleteState]);

   // 삭제하기 버튼
   function deleteBtn() {
      if (window.confirm("게시글을 삭제합니다")) {
         // replyApi.delBoardReply(boardNum)
         // .then(()=>{})
         // .catch((error) => {alert("댓글 삭제 중 오류 발생")});

         boardApi.delBoard(boardNum)
         .then((res) => {
         })
         .catch((error) => {
            alert(error);
         });
         navigate('/');
      } else {return ;}
   }

   // 리플 정보 갱신
   function writeReply(e) {
      setNewReply({
         ...newReply,
         [e.target.name] : e.target.value,
      })
   }

   // 리플 버튼 클릭
   function replyRegBtn() {
      replyApi.regReply(newReply)
      .then((res) => {
         console.log(newReply);
         alert("댓글 등록 완");
         document.querySelector('input[type="text"]'.value);
         setNewReply( {
            ...newReply,
            replyContent:''
         })
         // setCnt(cnt + 1);
         // navigate(0);
      })
      .catch((error) => {
         console.log(newReply);
         alert(error);
      });
   }

   // 리플 삭제
   function deleteReplyBtn(data) {
      replyApi.delReply(data)
      .then((res) => {
         setDeleteState({});
      })
      .catch((error) => {})
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
         {
            (loginInfo.memID == 'admin' || loginInfo.memID == board.memID) ?
            <div className="btn-div reply">
               <button type="button" onClick={() => {navigate('/');}}>목록가기</button>
               <button type="button" onClick={() => {navigate(`/updateForm/${board.boardNum}`)}}>수정</button>
               <button type="button" onClick={() => {deleteBtn();}}>삭제</button>
            </div>
            :
            null
         }
         {
            loginInfo.memID == null ?
            null
            :
            <div className="form reply">
               <table>
                  <tbody>
                     <tr>
                        <td>댓글 작성</td>
                        <td><input value={newReply.replyContent} type="text" name="replyContent" onChange={(e) => {writeReply(e);}} /></td>
                        <td> <button type="button" onClick={() => {replyRegBtn();}}>등록</button></td>
                     </tr>
                  </tbody>
               </table>
            </div>
         }
         {
            replys.map((reply, i) => {
               return (
                  <div className="reply-div" key={i}>
                     <p>─────────────────────────────────────</p>
                     <p>{reply.replyDate}</p>
                     <p>{reply.memID}</p>
                     <p>{reply.replyContent} <button type="button" onClick={(e) => {deleteReplyBtn(reply.replyNum);}}>삭제</button></p>
                     <p>─────────────────────────────────────</p>
                  </div>
               );
            })
         }
      </div>
   );
}

export default BoardDetail;