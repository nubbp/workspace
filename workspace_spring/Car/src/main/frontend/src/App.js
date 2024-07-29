import './reset.css';
import './App.css';
import { Route,  Routes, useNavigate } from 'react-router-dom';
import Home from './pages/Home';
import CarManu from './pages/CarManu';
import SaleList from './pages/SaleList';
import RegSaleForm from './pages/RegSaleForm';

function App() {
  const navigate = useNavigate();

  return (
    <div className="container">
      <div className='navigation-div'>
        <span onClick={() => {navigate('/');}}>홈</span>
        <span onClick={() => {navigate('/carManuForm')}}>차량관리</span>
        <span onClick={() => {navigate('/regSaleForm')}}>판매 정보 등록</span>
        <span onClick={() => {navigate('/saleList')}}>판매 목록</span>
      </div>
    
    <Routes>
      <Route path='/' element={<Home />} />
      <Route path='/carManuForm' element={<CarManu />} />
      <Route path='/regSaleForm' element={<RegSaleForm />} />
      <Route path='/saleList' element={<SaleList />} />
    </Routes>
    </div>

  );
}

export default App;
