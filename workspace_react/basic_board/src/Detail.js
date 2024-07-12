import { useNavigate, useParams } from "react-router-dom";

const Detail = ({boardList}) => {
   const {id} = useParams();
   console.log(id);

   const navigate = useNavigate();
   let boardCnt = 0;
      
   return (
      <div className="detail-container">
         {
            boardList.map((board, i) => {
               if (id == board.boardNum) {
                  boardCnt = i;
                  return (
                     <table className='detail-table'>
                        <tr>
                           <td>글 번호</td>
                           <td>{board.boardNum}</td>
                           <td>작성자</td>
                           <td>{board.writer}</td>
                           <td>작성일</td>
                           <td>{board.createDate}</td>
                        </tr>
                        <tr>
                           <td>제목</td>
                           <td colSpan={5}>{board.title}</td>
                        </tr>
                        <tr>
                           <td>내용</td>
                           <td colSpan={5}>{board.content}</td>
                        </tr>
                     </table>
                  );
               }
            })
         }
         
      <button type="button" onClick={() => {navigate(-1);}}>뒤로가기</button>
      <button type="button" onClick={() => {
         if (window.confirm('해당 게시글을 삭제하시겠습니까?')) {
            boardList.splice(boardCnt,1);
            navigate('/');
         }
      }}>삭제</button>
   </div>
   );
}

export default Detail;