import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import * as boardApi from "../apis/boardApis";

const List = ({loginInfo}) => {

   const [boardList, setBoardList] = useState([]);
   const navigate = useNavigate();
   const [searchData, setSearchData] = useState({
      searchType: 'TITLE',
      searchValue: ''
   });

   useEffect(() => {
      boardApi.getBoardList(searchData)
      .then((res) => {
         setBoardList(res.data);
      })
      .catch((error) => {
         alert('리스트 불러오기 중 오류 발생')
      })
   }, []);

   function searchBoard() {
      boardApi.getBoardList(searchData)
      .then((res) => {
         setBoardList(res.data);
      })
      .catch((error) => {alert(error)});
   }

   function changeSearchData(e) {
      setSearchData({
         ...searchData,
         [e.target.name] : e.target.value
      })
   }

   return(
      <div className='list-div'>
         <div className='search-tool'>
            <select name="searchType" onChange={(e) => {changeSearchData(e)}}>
               <option value="TITLE" >제목</option>
               <option value="MEM_ID" >작성자</option>
            </select>
            <input type='text' name="searchValue" onChange={(e) => {changeSearchData(e)}} />
            <button type='button' onClick={() => {searchBoard();}}>검색</button>
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