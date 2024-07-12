import logo from './logo.svg';
import './App.css';
import { Route, Routes } from 'react-router-dom';
import data from './data';
import StuList from './StuList';

function App() {

  const stuList = data;

  return (
    <div className="container">
      <Routes>
        <Route path='/' element={<StuList stuList={stuList} />} />
        <Route path='/detail' />
        <Route path='/regStu' />
        <Route path='/delStu' />
        <Route path='/score' />
        <Route path='/regScore' />
      </Routes>
      <div className='header-div'>
        <ul>
          <li>학생정보조회</li>
          <li>학생등록</li>
          <li>학생삭제</li>
          <li>성적관리</li>
        </ul>

        <table>
          <thead>
            <tr>
              <td>No</td>
              <td>학생명</td>
              <td>국어점수</td>
              <td>영어점수</td>
              <td>수학점수</td>
              <td>평균</td>
            </tr>
          </thead>
          
        </table>
      </div>
    </div>
  );
}

export default App;
