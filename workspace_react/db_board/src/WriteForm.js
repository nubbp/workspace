import { useState } from "react";
import { useNavigate } from "react-router-dom";

const WriteForm = () => {

   const [newBoard, setNewBoard] = useState({
      boardNum : 0,
      boardTitle : '',
      boardWriter: '',
      createDate : '2024-01-01',
      boardContent : ''
   });

   function writeNewBoard(e) {
      setNewBoard({
         [e.target.name] : e.target.value
      });
   }

   const navigate = useNavigate();

   return (
      <div className="write-form-div">
         <table>
            <tbody>
               <tr>
                  <td>제목</td>
                  <td><input type="text" name="boardTitle" onChange={(e)=>{
                     writeNewBoard(e);}} /></td>
               </tr>
               <tr>
                  <td>작성자</td>
                  <td><input type="text" name="boardWriter" onChange={(e)=>{
                     writeNewBoard(e);}}/></td>
               </tr>
               <tr>
                  <td>내용</td>
                  <td><input type="text" name="boardContent" onChange={(e)=>{
                     writeNewBoard(e);}}/></td>
               </tr>
            </tbody>
         </table>
         <div className="btn-div">
            <button type="button" onClick={(e) => {
               setNewBoard(e);
               console.log(newBoard);
               navigate(`/`);
            }}>등록하기</button>
         </div>
      </div>
   );
}

export default WriteForm;