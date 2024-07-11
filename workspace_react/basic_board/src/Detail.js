import { useNavigate, useParams } from "react-router-dom";

const Detail = ({boardList}) => {
   const {id} = useParams();
   console.log(id);

   const navigate = useNavigate();
      
   return (
      <div className="detail-container">
         {
            boardList.map((board, i) => {
               if (id == i+1) {
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
         const deleteYN = confirm('해당 게시글을 삭제하시겠습니까?');
         if (deleteYN) {
            boardList.splice(id-1,1);
            navigate('/');
         }
      }}>삭제</button>
   </div>
   );
}

export default Detail;