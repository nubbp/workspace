import { Route, Routes } from 'react-router-dom';
import './App.css';
import data from './data';
import List from './List';
import Detail from './Detail';

const boardList = data;

function App() {

  return (
    <div className="container">
      
      <Routes>
        {/* 게시글 목록 페이지 */}
        <Route path='/' element={<List boardList={boardList} />} />
        <Route path='/board_write_form' element={<div>게시글 작성 폼</div>} />
        <Route path='/board_detail/:id' element={<Detail boardList={boardList} />}/>
        <Route path='*' element={<div>잘못된 페이지입니다.</div>} />
      </Routes>
        

      

    </div>
  );
}

export default App;
