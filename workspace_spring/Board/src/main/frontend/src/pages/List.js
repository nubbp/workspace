import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import * as boardApi from "../apis/boardApis";

const List = ({loginInfo}) => {

   const [boardList, setBoardList] = useState([]);
   const navigate = useNavigate();

   useEffect(() => {
      boardApi.getBoardList()
      .then((res) => {
         setBoardList(res.data);
      })
      .catch((error) => {
         alert('리스트 불러오기 중 오류 발생')
      })
   }, []);


   return(
      <div className='list-div'>
         <div className='search-tool'>
            <select>
               <option value="title">제목</option>
            </select>
            <input type='' />
            <button type='button'>검색</button>
         </div>
      <div className='table-div'>
         <table>
            <colgroup>
            <col width="10%" />
            <col width="*" />
            <col width="15%" />
            <col width="40%" />
            </colgroup>
            <thead>
               <tr>
                  <td>No</td>
                  <td>제목</td>
                  <td>작성자</td>
                  <td>작성일</td>
               </tr>
            </thead>
            <tbody>
               {
                  boardList.map((board, i) => {
                     return (
                        <tr key={i}>
                           <td>{boardList.length - i}</td>
                           <td onClick={() => {
                              navigate(`/detail/${board.boardNum}`);
                           }}>{board.title}</td>
                           <td>{board.memID}</td>
                           <td>{board.createDate}</td>
                        </tr>
                     );
                  })
               }
            </tbody>
         </table>
      </div>
      <div className="btn-div">
         {
            loginInfo.memID == null ?
            null
            :
            <button type='button' onClick={() => {
               navigate('/writeForm');
            }}>글쓰기</button>
         }
      </div>
   </div>
   );
}
export default List;