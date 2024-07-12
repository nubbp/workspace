import { useNavigate } from "react-router-dom";

const List = ({boardList}) => {

   const navigate = useNavigate();
   
   return (
      <div className="list-container">
       <table>
         <thead>
          <tr>
            <td>글번호</td>
            <td>제목</td>
            <td>작성자</td>
            <td>작성일</td>
          </tr>
         </thead>
         <tbody>
         {
            boardList.map((board, i)=>{
               return (
                  <tr key={i}>
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
         </tbody>
       </table>
         <button type='button' onClick={() => {
            navigate(`/board_write_form`);
         }}>글쓰기</button>
      </div>
   );
}

export default List;