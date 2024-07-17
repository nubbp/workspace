import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

const Detail = ({}) => {
   // route의 url로 전달되는 데이터 받기
   const params = useParams();
   console.log(params);

   const navigate = useNavigate();

   const [board, setBoard] = useState({});

   useEffect(() => {
      axios
      .get(`/boardDetail/${params.boardNum}`)
      .then((res) => {
         console.log(res.data);
         setBoard(res.data);
      })
      .catch((error) => {
         alert('오류 발생');
         console.log(error);
      });
   }, []);

   function deleteBoard() {
      if(window.confirm('삭제할까요?')) {
         axios.delete(`/deleteBoard/${board.boardNum}`)
            .then((res) => {
               navigate('/');
            })
            .catch((error) => {alert(error)});
      }
   }


   return (
      <div>
         <table>
            <tbody>
            <tr>
                  <td>글번호</td>
                  <td>{board.boardNum}</td>
                  <td>작성자</td>
                  <td>{board.boardWriter}</td>
                  <td>작성일</td>
                  <td>{board.createDate}</td>
               </tr>
               <tr>
                  <td>제목</td>
                  <td colSpan={5}>{board.boardTitle}</td>
               </tr>
               <tr>
                  <td>내용</td>
                  <td colSpan={5}>{board.boardContent}</td>
               </tr>
               
            </tbody>
         </table>
         <div className="btn-div">
            <button type="button" onClick={(e) => {
               deleteBoard(e);
            }
            }>삭제하기</button>
            <button type="button">수정하기</button>
         </div>
      </div>
   );
};

export default Detail;