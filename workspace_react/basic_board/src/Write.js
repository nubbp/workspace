import { useState } from "react";
import { useNavigate } from "react-router-dom";

const Write = ({boardList, setBoardList}) => {

   const navigate = useNavigate();

   const [newBoard, setNewBoard] = useState({
      boardNum : 0,
      title : '',
      writer: '',
      createDate : '2024-01-01',
      content : ''
   });

   function writeNewBoard(e) {
      setNewBoard({
         ...newBoard,
         [e.target.name] : e.target.value
      });
   }

   return (
      <div className='wirte-container'>
         
        <table>
          <tr>
            <td>글번호</td>
            <td><input type='text' name="boardNum" onChange={(e)=>{
               writeNewBoard(e);
            }}/></td>
          </tr>
          <tr>
            <td>제목</td>
            <td><input type='text' name="title" onChange={(e)=>{
               writeNewBoard(e);
            }}/></td>
          </tr>
          <tr>
            <td>작성자</td>
            <td><input type='text' name="writer" onChange={(e)=>{
               writeNewBoard(e);
            }}/></td>
          </tr>
          <tr>
            <td>작성일</td>
            <td><input type='date' name="createDate" onChange={(e)=>{
               writeNewBoard(e);
            }}/></td>
          </tr>
          <tr>
            <td>내용</td>
            <td><textarea name="content" onChange={(e)=>{
               writeNewBoard(e);
            }}/></td>
          </tr>
        </table>
        <button type="button" onClick={(e) => {
            // boardList.push(newBoard);
            setBoardList([...boardList, newBoard])
            navigate('/');
        }}>글 등록</button>
      </div>
   );
}

export default Write;