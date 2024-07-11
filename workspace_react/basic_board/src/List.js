import { useNavigate } from "react-router-dom";

const List = ({boardList}) => {

   const navigate = useNavigate();
   
   return (
       <table>
          <tr>
            <td>글번호</td>
            <td>제목</td>
            <td>작성자</td>
            <td>작성일</td>
          </tr>
         {
            boardList.map((board, i)=>{
               return (
                  <tr>
                     <td>{board.boardNum}</td>
                     <td onClick={(e) => {
                        navigate(`/board_detail/${board.boardNum}`);
                     }}>{board.title}</td>
                     <td>{board.writer}</td>
                     <td>{board.createDate}</td>
                  </tr>
               );
            })
         }
         <button type='button'>글쓰기</button>
       </table>
   );
}

export default List;