import './App.css';
import './reset.css'
import { Route, Routes, useNavigate } from 'react-router-dom';
import UserLayout from './pages/user/UserLayout';
import AdminLayout from './pages/admin/AdminLayout';
import Join from './pages/user/Join';
import Login from './pages/user/Login';
import { useEffect, useState } from 'react';
import RegItem from './pages/admin/RegItem';
import ItemList from './pages/user/ItemList';
import ItemDetail from './pages/user/ItemDetail';
import ItemManage from './pages/admin/ItemManage';
import CategoryManage from './pages/admin/CategoryManage';
import SaleHistoryOfMonth from './pages/admin/SaleHistoryOfMonth';
import SearchUser from './pages/admin/SearchUser';
import RecordOfMonth from './pages/admin/RecordOfMonth';

// 새로고침과 재렌더링은 다르다
// 새로고침하면 state 변수와 값이 전부 초기화된다
// 재렌더링하면 state 변수의 값은 보존된다

function App() {
  const navigate = useNavigate();

  // 로그인 정보를 저장할 수 있는 state 변수
  const [loginInfo, setLoginInfo] = useState({});

  // 로그인 성공 시 loginInfo에 로그인 정보를 저장하지만
  // 새로고침하면 App.js를 다시 시작하면서 loginInfo 변수의 값이 초기화된다 
  // 새로고침을 하더라도 sessionStorage에 로그인 정보는 곤재하니.
  // 새로고치맣 라 떄 만약 로그인 정보가 sessionStorage에 남아있다면 loginInfo state 변수에 로그인정보를 저장시켜야 함 


  // App.js가 mount(새로고침) 되면 실행
  // 그림 다 그린 후
  useEffect(() => {
    // 세션에 저장된 로그인 정보 가져옴
    const sessionLoginInfo = window.sessionStorage.getItem('loginInfo');

    // 세션에 로그인 정보가 있으면
    if(sessionLoginInfo != null) {
      // 로그인 정보를 loginInfo에 저장
      // 1. 세션에서 가져온 데이터를 다시 객체로 변환
      const obj_loginInfo = JSON.parse(sessionLoginInfo);

      // 2. 로그인 정보를 loginInfo에 저장
      setLoginInfo(obj_loginInfo);
    }
  }, []);

  // 빈 객체인지 확인하는 코드
  // Object.keys() -> 객체 안의 모든 키 값을 가져옴
  // console.log(Object.keys(loginInfo).length);
  
  return (
    <div className="container">

      <div className='login-div'>
          {
            Object.keys(loginInfo).length == 0
            ?
            <div>
              <ul className='header-menu'>
                <li>
                  <span onClick={(e)=> {navigate('/loginForm')}}>LOGIN</span>
                </li>
                <li>
                  <span onClick={() => {navigate('/join')}}>JOIN</span>
                </li>
              </ul>
            </div>
            : 
            <div>
              {loginInfo.memName} 님 반갑습니다.
              <span onClick={() => {
                // 세션에 저장된로그인 정보 삭제
                window.sessionStorage.removeItem('loginInfo');
                // 
                setLoginInfo({});
                // 상품 목록 페이지로 이동
                navigate('/');
                }}>Logout</span>
            </div>
          }

        <div className='banner'>
          <div>
            <img className='banner-img' src='http://localhost:8080/images/book_banner.PNG'/>
          </div>
          <div className='title-div' onClick={() => {navigate('/');}}>BOOK SHOP</div>
        </div>
      </div>


      <div className='layout-div'>
        <Routes>
          {/* 일반 유저용 */}
          <Route path='/' element={ <UserLayout /> }>
            {/* 상품 목록 화면 */}
            <Route path='' element={ <ItemList /> }/>

            {/* 회원가입 페이지 */}
            <Route path='join' element={ <Join /> }/>

            {/* 로그인 페이지 */}
            <Route path='loginForm' element={ <Login setLoginInfo={setLoginInfo} loginInfo={loginInfo} /> }/>

            {/* 상품 상세 */}
            <Route path='itemDetail/:itemCode' element={ <ItemDetail /> }/>
          </Route>

          {/* 관리자용 */}
          <Route path='admin' element={ <AdminLayout /> }>
            {/* 연습용 */}
            <Route path='test1' element={ <div>상품등록페이지</div> }/>
            {/* 상품 등록 화면 */}
            <Route path='regItem' element={ <RegItem /> }/>
            <Route path='itemManage' element={ <ItemManage /> }/>
            <Route path='categoryManage' element={ <CategoryManage /> }/>
            <Route path='saleHistoryOfMonth' element={ <SaleHistoryOfMonth /> }/>
            <Route path='searchUser' element={ <SearchUser /> }/>
            <Route path='recordOfMonth' element={ <RecordOfMonth /> }/>
          </Route>
        </Routes>
      </div>
    </div>
  );
}

export default App;
