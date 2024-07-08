import './App.css';
import { useState } from 'react';
import List from './List';
import Add from './Add';

function App() {
  // 장보기 목록
  const [list, setList] = useState(['계란 한 판', '생수', '불고기용 돼지고기']);

  return (
    <div className="App">
      <List list={list} setList={setList} />

      <Add list={list} setList={setList} />
    </div>
  );
}

export default App;
