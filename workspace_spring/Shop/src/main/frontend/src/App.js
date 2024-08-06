import './App.css';
import './reset.css'
import { Route, Routes, useNavigate } from 'react-router-dom';
import UserLayout from './pages/user/UserLayout';
import AdminLayout from './pages/admin/AdminLayout';
import Join from './pages/user/Join';
import Login from './pages/user/Login';
import RegItem from './pages/admin/RegItem';

function App() {
  const navigate = useNavigate();
  
  return (
    <div className="container">

      <div className='login-div'>
        <div>
          <ul className='header-menu'>
            <li>
              <span onClick={() => {navigate('/loginForm')}}>LOGIN</span>
            </li>
            <li>
              <span onClick={() => {navigate('/join')}}>JOIN</span>
            </li>
            {/* <li>
              <span onClick={() => {navigate('/admin/regItem')}}>reg</span>
            </li> */}
          </ul>
        </div>
        <div className='banner'>
          <div>
            <img className='banner-img' src='http://localhost:8080/images/book_banner.PNG'/>
          </div>
          <div className='title-div'>BOOK SHOP</div>
        </div>
      </div>


      <div className='layout-div'>
        <Routes>
          {/* 일반 유저용 */}
          <Route path='/' element={ <UserLayout /> }>
            {/* 상품 목록 화면 */}
            <Route path='' element={ <div>상품목록화면</div> }/>

            {/* 회원가입 페이지 */}
            <Route path='join' element={ <Join /> }/>

            {/* 로그인 페이지 */}
            <Route path='loginForm' element={<Login />} />
          </Route>

          {/* 관리자용 */}
          <Route path='admin' element={ <AdminLayout /> }>
            {/* 상품 등록 페이지 */}
            <Route path='regItem' element={ <RegItem /> }/>
          </Route>
        </Routes>
      </div>
    </div>
  );
}

export default App;
