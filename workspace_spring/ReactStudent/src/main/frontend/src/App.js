import { Route, Routes, useNavigate } from 'react-router-dom';
import './reset.css';
import './App.css';
import StuList from './StuList';
import RegStu from './RegStu';
import Score from './Score';
import StuDetail from './StuDetail';
import DelStuList from './DelStuList';

function App() {

  const navigate = useNavigate();

  return (
    <div className="container">
      <div className='header-div'>
        <ul>
          <li><span onClick={() => {navigate('/')}}>학생정보조회</span></li>
          <li><span onClick={() => {navigate('/regStu')}}>학생등록</span></li>
          <li><span onClick={() => {navigate('delStu')}}>학생삭제</span></li>
          <li><span onClick={() => {navigate('/score')}}>성적관리</span></li>
        </ul>
      </div>
      <div className='content-div'>
        <Routes>
          {/* 학생정보조회 */}
          <Route path='/' element={<StuList />} />
          {/* 학생상세정보조회 */}
          <Route path='/stuDetail/:stuNum' element={<StuDetail />} />
          {/* 학생등록페이지 */}
          <Route path='/regStu' element={<RegStu />} />
          {/* 학생삭제페이지 */}
          <Route path='/delStu' element={<DelStuList />} />
          {/* 성적관리페이지 */}
          <Route path='/score' element={<Score />} />
        </Routes>
      </div>
    </div>
  );
}

export default App;
