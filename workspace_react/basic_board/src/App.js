import { Route, Routes } from 'react-router-dom';
import './App.css';
import data from './data';
import List from './List';
import Detail from './Detail';
import Write from './Write';
import InputTest from './InputTest';
import { useState } from 'react';


function App() {
  // 게시글 목록
  // let boardList = data;
  const [boardList, setBoardList] = useState(data);

  return (
    <div className="container">

      <Routes>
        {/* 게시글 목록 페이지 */}
        <Route path='/' element={<List boardList={boardList} />} />
        <Route path='/board_write_form' element={<Write boardList={boardList} setBoardList={setBoardList} />} />
        <Route path='/board_detail/:id' element={<Detail boardList={boardList} />}/>
        <Route path='/test' element={<InputTest />} />
        <Route path='*' element={<div>잘못된 페이지입니다.</div>} />
      </Routes>
    </div>
  );
}

export default App;
