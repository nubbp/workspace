import { useState } from "react";
import { useNavigate } from "react-router-dom";
import * as boardApi from "../apis/boardApis";

const BoardWriteForm = ({loginInfo}) => {

   console.log(loginInfo.memID);

   const [newBoard, setNewBoard] = useState({
      title: '',
      content: '',
      memID: loginInfo.memID
   });
   const navigate = useNavigate();

   function writeBoard(e) {
      setNewBoard({
         ...newBoard,
         [e.target.name]: e.target.value
      })
   }

   function regBoardBtn() {
      boardApi.regBoard(newBoard)
      .then((res) => {
         alert('게시글이 등록되었습니다');
         navigate(`/`);
      })
      .catch((error) => {
         alert(error);
      });
   }

   return (
      <div className="form">
         <table>
            <tbody>
               <tr>
                  <td>제목</td>
                  <td><input type="text" name="title" onChange={(e) => {writeBoard(e)}} /></td>
               </tr>
               <tr>
                  <td>내용</td>
                  <td><textarea name="content" onChange={(e) => {writeBoard(e)}} /></td>
               </tr>
            </tbody>
         </table>
         <div className="btn-div" >
            <button type="button" onClick={(e) => {regBoardBtn();}}>글 등록</button>
         </div>
      </div>
   );
}

export default BoardWriteForm;