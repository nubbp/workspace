import axios from 'axios';
import './App.css';
import data from './data';
import ItemList from './ItemList';
import Items from './Items';
import { Link, Route, Routes } from 'react-router-dom';
import Detail from './Detail';

function App() {
  
  const item_list = data;
  
  console.log(3);
  return (
    <div className="App">
      <div className="header">
        Book Shop
        <Link to={'/list'}>상품목록</Link>
        <Link to={'/detail'}>상품상세</Link>
      </div>
      <div className="banner">
        <img src={process.env.PUBLIC_URL + '/header.jpg'} />
      </div>
      
      

      {/* 이동할 수 있는 페이지의 url */}
      <Routes>
        <Route path='/' element={<div>메인페이지</div>} />
        <Route path='/detail/:id' element={<Detail item_list={item_list} />} />
        <Route path='/list' element={<ItemList item_list={item_list} />}/>
        <Route path='*' element={<div>잘못된 페이지입니다.</div>} />
      </Routes>

      {/* <ItemList item_list={item_list} /> */}
      {/* <Test name={'홍길동'} age={20}/> */}
      {/* <Items /> */}

    </div>
  );
}


const Test= ({name, age}) => {
  console.log(name);
  console.log(age);
  return (
    <div>div임</div>
  );
}

export default App;
