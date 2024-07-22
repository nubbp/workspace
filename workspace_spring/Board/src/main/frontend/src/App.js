import { Route, Routes, useNavigate } from 'react-router-dom';
import './reset.css';
import './App.css';
import List from './pages/List';
import RegMemberForm from './pages/RegMemberForm';
import LoginForm from './pages/LoginForm';
import BoardDetail from './pages/boardDetail';
import BoardWriteForm from './pages/BoardWriteForm';

function App() {

  const navigate = useNavigate();

  return (
    <div className="container">

      <div className='login-bar'>
        <div>
          <ul>
            <li onClick={() => {
              navigate('/regMemberForm');
            }}>Join</li>
            <li onClick={() => {
              navigate('/loginForm');
            }}>Login</li>
          </ul>
        </div>
      </div>
      <h1 onClick={() => {
        navigate('/');
      }}>자유게시판</h1>

      <Routes>
        <Route path='/' element={<List />} />
        <Route path='/regMemberForm' element={<RegMemberForm />} />
        <Route path='/loginForm' element={<LoginForm />} />
        <Route path='/boardDetail/:id' element={<BoardDetail />} />
        <Route path='/writeForm' element={<BoardWriteForm />} />
      </Routes>
    </div>
  );
}

export default App;
