import axios from "axios";
import { useState } from "react";
import { useNavigate } from "react-router-dom";

const WriteForm = () => {
   
   const navigate = useNavigate();
   
   // 입력한 내용을 저장하는 state 변수
   const [newBoard, setNewBoard] = useState({
      boardTitle : '',
      boardWriter: '',
      boardContent : ''
   });
   
   // 입력 값 세팅
   function writeNewBoard(e) {
      setNewBoard({
         ...newBoard,
         [e.target.name] : e.target.value
      });
   }

   // 글 등록 버튼 클릭 시 실행하는 함수
   function insertBoard() {
      // 제목과 작성자 공백 시 axios 실행 x
      const title_input = document.querySelector('input[name="boardTitle"]');
      if (title_input.value == '') {
         alert('제목은 필수입력입니다.');
         title_input.focus();
         return ;
      }

      if (document.querySelector('input[name="boardWriter"]').value == '') {
         alert('작성자는 필수입력입니다.');
         return ;
      }

      axios
      .post('/regBoard', newBoard)
      .then((res) => {
         alert('게시글이 등록되었습니다');
         navigate(`/`);
      })
      .catch((error) => {
         alert('오류 발생');
         console.log(error);
      });
   }


   return (
      <div className="write-form-div">
         <table>
            <tbody>
               <tr>
                  <td>제목</td>
                  <td><input type="text" name="boardTitle" onChange={(e)=>{
                     // setNewBoard({
                     //    ...newBoard,
                     //    boardTitle : e.target.value
                     // });

                     writeNewBoard(e);
                     }} /></td>
               </tr>
               <tr>
                  <td>작성자</td>
                  <td><input type="text" name="boardWriter" onChange={(e)=>{
                     // setNewBoard({
                     //    ...newBoard,
                     //    boardWriter : e.target.value
                     // });
                     
                     writeNewBoard(e);
                     }}/></td>
               </tr>
               <tr>
                  <td>내용</td>
                  <td><textarea name="boardContent" onChange={(e)=>{
                     // setNewBoard({
                     //    ...newBoard,
                     //    boardContent : e.target.value
                     // });
                     writeNewBoard(e);
                     }}/></td>
               </tr>
            </tbody>
         </table>
         <div className="btn-div">
            <button type="button" onClick={(e) => {
               insertBoard(e);
            }}>등록하기</button>
         </div>
      </div>
   );
}

export default WriteForm;