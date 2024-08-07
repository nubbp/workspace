import axios from 'axios'
import React, { useEffect, useState } from 'react'
import Modal from '../../common/Modal';
import { useNavigate } from 'react-router-dom';

const RegItem = () => {

   const navigate = useNavigate();
   // 카테고리 리스트
   const [categoryList, setCategoryList] = useState([]);
   // 상품
   const [newItem, setNewItem] = useState({
      cateCode : 0,
      itemName : '',
      itemPrice : 0,
      itemIntro : ''
   })
   // 모달창 랜더링
   const [isShow, setIsShow] = useState(false);

   // 모달창 닫음
   function onclickModalBtn(){
      navigate('/');
   };

   // 카테고리 받아오기
   useEffect(() => {
      axios.get('/admin/getCategoryList')
      .then((res) => {
         setCategoryList(res.data);
      })
      .catch((error) => {
         alert(error);
      });

   }, []);

   // 상품 정보 받아오기
   function changeItem(e) {
      setNewItem({
         ...newItem,
         [e.target.name] : e.target.value
      })
   }

   // 상품 등록 버튼
   function regItemBtn() {
      axios.post('/admin/regItem', newItem)
      .then((res) => {
         setIsShow(true);
      })
      .catch((error) => {alert(error);});
   }

   console.log(newItem);

  return (
    <div className='page-div reg-item'>
      <div>
         <p>상품 카테고리</p>
         <select className='form-control' name="cateCode" onChange={(e) => {changeItem(e);}}>
            {
               categoryList.map((category, i) => {
                  return (
                     <option key={i} value={category.cateCode}>{category.cateCode} {category.cateName} </option>
                  );
               })
            }
         </select>
         <p>상품명</p>
         <input type='text' name='itemName' className='form-control' onChange={(e) => {changeItem(e);}} />
         <p>상품 가격</p>
         <input type='text' name='itemPrice' className='form-control' onChange={(e) => {changeItem(e);}} />
         <p>상품 소개</p>
         <textarea rows={7} name='itemIntro' className='form-control' onChange={(e) => {changeItem(e);}} />
      </div>
      <div className='btn-div'>
         <button className='btn' type='button' onClick={() => {regItemBtn();}}>상품 등록하기</button>
      </div>

      {/* 등록 완료 시 모달 창 */}
      {
         isShow
         ?
         <Modal content={() => {return(<div>상품 등록이 완료되었습니다.</div>);}} setIsShow={setIsShow} clickCloseBtn={onclickModalBtn} />
         :
         null
      }
   </div>
   )
}

export default RegItem