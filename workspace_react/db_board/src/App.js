import './App.css';
import { Route, Routes } from 'react-router-dom';
import BoardList from './BoardList';
import Detail from './Detail';
import { useEffect, useState } from 'react';
import AxiosTest from './AxiosTest';
import WriteForm from './WriteForm';

function App() {

  // 가장 나중에 실행
  // 컴포넌트의 생애주기에 따라 기능을 구현
  // 생애주기: mount, update, unmount
  const [age, setAge] = useState(0);
  const [addr, setAddr] = useState('');
  useEffect(() => {}); // 마운트 + 업데이트
  useEffect(() => {}, []); // 마운트
  useEffect(() => {}, [age]); // 마운트 + age라는 state 변수 값이 update될 때
  useEffect(() => {}, [age, addr]); 

  return (
    <div className="container">
      <Routes>
        {/* Axios 예제 페이지 */}
        <Route path='/axios' element={<AxiosTest />}/>
        {/* 게시글 목록 페이지 */}
        <Route path='/' element={<BoardList />} />
        <Route path='/detail/:boardNum' element={<Detail />} />
        <Route path='/writeForm' element={<WriteForm />} />
      </Routes>
    </div>
  );
}

export default App;
