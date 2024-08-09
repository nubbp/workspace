import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

const CarManu = () => {
   const navigate = useNavigate();
   const [carList, setCarList] = useState([]);
   const [newCar, setNewCar] = useState({
      brand : '',
      modelName : '',
      cost : 0
   });

   // 목록 화면 꾸리기
   useEffect(() => {
      axios.get('/car/getCarList')
      .then((res) => {setCarList(res.data);})
      .catch((error) => {alert(error);});
   }, []);

   // 차량 등록 정보 정보 받아오기
   function changeRegCar(e) {
      setNewCar({
         ...newCar,
         [e.target.name] : e.target.value
      })
   }
   
   // 차량 등록 버튼 누르기
   function regCarBtn() {
      axios.post('/car/regCar', newCar)
      .then((res) => {
         alert("등록 성공");
         navigate(0);
      })
      .catch((error) => {alert(error);});
   }

   // console.log(carList);
   console.log(newCar);
   
   return (
      <div className='car-manu-div'>
         <div className='car-reg-div'>
            <div className='reg form'>
               <hr />
               <span>
               제조사 
               <select name='brand' onChange={(e) => {changeRegCar(e);}}>
                  <option value="현대">현대</option>
                  <option value="기아">기아</option>
                  <option value="쌍용">쌍용</option>
               </select>
               </span>
               <span>모델명<input type='text' name="modelName" onChange={(e) => {changeRegCar(e);}} /></span>
               <span>차량가격<input type='text' name="cost" onChange={(e) => {changeRegCar(e);}} /></span>
            </div>
            <div className='btn-div'>
               <button type='button' onClick={() => {regCarBtn();}}>등록</button>
            </div>
            <hr />
         </div>

         <div className='car-list-div'>
            <table>
               <thead>
                  <tr>
                     <td>모델번호</td>
                     <td>모델명</td>
                     <td>제조사</td>
                  </tr>
               </thead>
               <tbody>
                  {
                     carList.map((car, i) => {
                        return(
                           <tr key={i}>
                              <td>{car.modelNum}</td>
                              <td>{car.modelName}</td>
                              <td>{car.brand}</td>
                           </tr>
                        );
                     })
                  }
               </tbody>
            </table>
         </div>
      </div>
   );
}

export default CarManu;