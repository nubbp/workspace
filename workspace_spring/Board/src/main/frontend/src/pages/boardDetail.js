import { useState } from "react";

const BoardDetail = () => {

   const [board, setBoard] = useState({});

   return (
      <div>
         <table>
            <tbody>
               <tr>
                  <td>작성일</td>
                  <td>ㅇ</td>
                  <td>작성자</td>
                  <td>ㅇ</td>
               </tr>
               <tr>
                  <td>제목</td>
                  <td colSpan={3}>제목</td>
               </tr>
               <tr>
                  <td>내용</td>
                  <td colSpan={3}>내용</td>
               </tr>
            </tbody>
         </table>
         <div className="btn-div">
            <button type="button">목록가기</button>
            <button type="button">수정</button>
            <button type="button">삭제</button>
         </div>
      </div>
   );
}

export default BoardDetail;