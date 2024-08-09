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
      cateCode : 1,
      itemName : '',
      itemPrice : 0,
      itemIntro : ''
   })
   // 첨부파일을 저장할 state 변수
   const [mainImg, setMainImg] = useState(null);
   const [subImg, setSubImg] = useState(null);
   
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
   // post(url, data, config)
   // get(url, config)
   // put(url, data, config)
   // delete(url, config)
   function regItemBtn() {
      // axios 통신으로 자바로 갈 때 첨부파일이 있으면
      // 반드시 아래의 설정코드를 axios에 추가
      const fileConfig = {headers : {'Content-Type' : 'multipart/form-data'}};
      // 위의 설정코드를 axios 통신할 때 추가하면
      // 자바로 넘어가는 데이터를 전달하는 방식이 달라짐
      // 첨부파일이 있는 데이터를 자바로 전달하기 위해서는 form 태그를 사용해서 전달

      // 1. form 객체 생성
      const itemForm = new FormData();

      // 2. form 객체에 데이터 추가
      // itemForm.append('itemName', '상품1');
      // itemForm.append('itemPrice', 10000);

      itemForm.append('itemName', newItem.itemName);
      itemForm.append('itemPrice', newItem.itemPrice);
      itemForm.append('itemIntro', newItem.itemIntro);
      itemForm.append('cateCode', newItem.cateCode);
      itemForm.append('mainImg', mainImg);
      itemForm.append('subImg', subImg);

      // 3. 데이터를 가진 form 객체를 axios 통신에서 자바로 전달한다
      // axios.post('/admin/regItem', newItem, fileConfig)

      axios.post('/admin/regItem', itemForm, fileConfig)
      .then((res) => {
         setIsShow(true);
      })
      .catch((error) => {alert(error);});
   }
   
      // 모달창 랜더링
      const [isShow, setIsShow] = useState(false);
      // 모달창 닫음
      function onclickModalBtn(){
         navigate('/');
      };
   
   // console.log(newItem);
   
   return (
      <div className='page-div reg-item'>
      <div>
         <p>상품 카테고리</p>
         <select className='form-control' name="cateCode" onChange={(e) => {changeItem(e);}}>
            {
               categoryList.map((category, i) => {
                  return (
                     <option key={i} value={category.cateCode}>{category.cateCode}. {category.cateName} </option>
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
      <div>
         <input type='file' onChange={(e) => {
            // 선택한 파일 정보
            setMainImg(e.target.files[0]);
         }} />
      </div>
      <div>
         <input type='file' onChange={(e) => {
            // 선택한 파일 정보
            setSubImg(e.target.files[0]);
         }} />
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