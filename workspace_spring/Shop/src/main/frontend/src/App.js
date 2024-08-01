import { Route, Routes, useNavigate } from 'react-router-dom';
import './App.css';
import './reset.css';
import UserLayout from './pages/user/UserLayout';
import AdminLayout from './pages/admin/AdminLayout';
import Join from './pages/user/Join';
import Login from './pages/user/Login';

function App() {
  const navigate = useNavigate();
  return (
    <div className="container">
      <div className="login-div">
          <span onClick={() => {navigate('/login');}}>Login</span>
          <span onClick={() => {navigate('/join');}}>Join</span>
      </div>
      <div className='banner-div'>
        <div className='banner'>
          <img src="http://localhost:8080/images/book_banner.PNG" />
          <div onClick={() => {navigate('/')}}>Book Shop</div>
        </div>
        <div>유저 관리자 공용</div>
      </div>
        <div>
          <Routes>
            {/* 일반 유저용 */}
            <Route path='/' element={<UserLayout />}>
              {/* 상품 목록 화면 */}
              <Route path='' element={<div >상품 목록 화면</div>} />
              <Route path='join' element={<Join />} />
              <Route path='login' element={<Login />} />

              <Route path='test1' element={<div>1번 화면</div>} />
              <Route path='test2' element={<div>2번 화면</div>} />
            </Route>
            {/* 관리자용 */}
            <Route path='/admin' element={<AdminLayout />}>
              <Route path='test1' element={<div>상품등록</div>} />
              <Route path='test2' element={<div>2번 화면</div>} />
            </Route>
          </Routes>
        </div>
    </div>
  );
}

export default App;
