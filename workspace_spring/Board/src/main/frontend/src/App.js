import { Route, Routes, useNavigate } from 'react-router-dom';
import './reset.css';
import './App.css';
import List from './pages/List';
import RegMemberForm from './pages/RegMemberForm';
import LoginForm from './pages/LoginForm';
import BoardDetail from './pages/BoardDetail';
import BoardWriteForm from './pages/BoardWriteForm';
import { useEffect, useState } from 'react';

function App() {

  const navigate = useNavigate();

  const [loginInfo, setLoginInfo] = useState({});

  useEffect(() => {
    const loginDataString = window.sessionStorage.getItem('loginInfo');

    if (loginDataString != null) {
      const loginData = JSON.parse(loginDataString);
      setLoginInfo(loginData);
    }
  }, []);

  return (
    <div className="container">
          {/* {
            loginInfo.memID == null ? <div>없음</div> : <div>있음</div>
          } */}
      <div className='login-bar'>
        <div>
          {
            loginInfo.memID == null ?
              <ul>
                <li onClick={() => {navigate('/regMemberForm');}}>Join</li>
                <li onClick={() => {navigate('/loginForm');}}>Login</li>
              </ul>
            :
            <div>
              <span>{loginInfo.memName}님 반갑습니다</span>
              <span onClick={(e) => {
                // 세션 스토리지에 저장된 로그인 정보를 제거
                window.sessionStorage.removeItem('loginInfo');
                alert("로그아웃");
                navigate('/');
                setLoginInfo({});
              }}>Logout</span>
            </div>
          }
          
        </div>

      </div>
      <h1 onClick={() => {
        navigate('/');
      }}>자유게시판</h1>

      <Routes>
        <Route path='/' element={<List loginInfo={loginInfo} />} />
        <Route path='/regMemberForm' element={<RegMemberForm />} />
        <Route path='/loginForm' element={<LoginForm setLoginInfo={setLoginInfo} />} />
        <Route path='/detail/:boardNum' element={<BoardDetail />} />
        <Route path='/writeForm' element={<BoardWriteForm loginInfo={loginInfo} />} />
      </Routes>
    </div>
  );
}

export default App;
