import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import * as boardApi from "../apis/boardApis";

const List = ({loginInfo}) => {

   const navigate = useNavigate();

   // 조회된 게시글 목록을 저장할 변수
   const [boardList, setBoardList] = useState([]);

   // 자바에서 가져온 페이지 정보를 담을 변수
   const [pages, setPages] = useState({});

   // // 그림 그릴 페이지 숫자를 담을 배열
   // const [pageArr, setPageArr] = useState([]);

   // 검색 조건을 저장할 변수
   const [searchData, setSearchData] = useState({
      searchType: 'TITLE',
      searchValue: ''
   });

   useEffect(() => {
      boardApi.getBoardList(1)
      .then((res) => {
         setBoardList(res.data.boardList);
         setPages(res.data.pageInfo);

         // const pageData = [];
         // for(let i = res.data.pageInfo.beginPage; i <= res.data.page.endPage; i++) {
         //    pageData.push(i);
         // }
         // setPageArr(pageData);
      })
      .catch((error) => {
         alert('리스트 불러오기 중 오류 발생')
      })
   }, []);

   function searchBoard() {
      boardApi.getBoardList()
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

   // 페이지 그리기
   function drawPagination() {
      const arr = [];
      // arr.push(pages.prec ? <span>prec</span> : null);
      if (pages.prev) {
         arr.push(<span onClick={() => {getList(pages.beginPage - 1);}}>prev</span> )
      }
      for (let i = pages.beginPage; i <= pages.endPage; i++) {
         arr.push(<span key={i} onClick={(e) => {getList(i);}}>{i}</span>);
      }
      if (pages.next) {
         arr.push(<span onClick={(e) => {getList(pages.endPage + 1);}}>next</span>)
      }
      console.log(arr);
      return arr;
   }
// 페이징 처리한 곳에서 숫자(페이지번호)를 클릭하면 다시 게시글 조회
   function getList(pageNo) {
      boardApi.getBoardList(pageNo)
      .then((res) => {
         setBoardList(res.data.boardList);
         setPages(res.data.pageInfo);
      })
      .catch((error) => {});
   };

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
               <col width="11%" />
               <col width="*" />
               <col width="15%" />
               <col width="35%" />
            </colgroup>
            <thead>
               <tr>
                  <td>No</td>
                  <td>글번호</td>
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
                           <td>{board.boardNum}</td>
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
      <div className="page-div">
         {drawPagination()}
      </div>
   </div>
   );
}
export default List;