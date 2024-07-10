import axios from 'axios';
import './App.css';
import data from './data';
import ItemList from './ItemList';
import Items from './Items';

function App() {
  
  // const item_list = data;
  let item_list = [];
  
  axios.get('/test1')
       .then(resopse => {
        console.log(resopse.data);
       });

  axios.get('/test2').then((res) => {
    console.log(res.data);
  });

  let arr = [];
  axios.get('/test3').then((res) => {
    console.log(res.data);
    arr = res.data;
  });

  console.log(1);
  
  axios.get('/test4').then((res) => {
    console.log(res.data);
    item_list = res.data;
    console.log(2);
  })
  
  console.log(3);
  return (
    <div className="App">
      <div className="header">
        Book Shop
      </div>
      <div className="banner">
        <img src={process.env.PUBLIC_URL + '/header.jpg'} />
      </div>
      <ItemList item_list={item_list} />
      <Test name={'홍길동'} age={20}/>
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
