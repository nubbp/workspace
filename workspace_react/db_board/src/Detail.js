import axios from "axios";
import { useEffect, useState } from "react";
import { useParams } from "react-router-dom";

const Detail = ({}) => {
   // route의 url로 전달되는 데이터 받기
   const params = useParams();
   console.log(params);

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
      </div>
   );
};

export default Detail;