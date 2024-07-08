import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import Viewer from './Viewer';
import Controller from './Controller';

function App() {

  let [cnt, setCnt] = useState(0);

  function changeCnt (num) {
    const result = cnt + Number(num);
    console.log(result);
    setCnt(result);
  }
  
  return (
    <div className='container'>
      <h3>Simple Counter</h3>
      <Viewer cnt={cnt}/>
      <Controller changeCnt={changeCnt} />
    </div>
  );
}


export default App;
