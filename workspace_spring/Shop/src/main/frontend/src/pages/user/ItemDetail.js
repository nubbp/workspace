import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { json, useNavigate, useParams } from 'react-router-dom';

const ItemDetail = () => {
   const navigate = useNavigate();
   const memId = JSON.parse(window.sessionStorage.getItem('loginInfo')).memId;
   const {itemCode} = useParams();
   console.log(itemCode);
   const [item, setItem] = useState({});
   const [shopCart, setShopCart] = useState({
      itemCode : itemCode
      , cartCnt : 1
      , memId : memId
   });

   

   function changeCart(e) {
      setShopCart({
         ...shopCart,
         [e.target.name] : e.target.value
      })
   }

   function buyBtn() {
      axios.post('/cart/plusCart', shopCart)
      .then((res) => {
         if(!window.confirm('장바구니에 상품을 담았습니다. \n계속 쇼핑하겠습니까?')) {
            navigate(`/cartList`);
         }
      })
      .catch((error) => {alert(error);})
   }

   useEffect(() => {
      axios.get(`/item/itemDetail/${itemCode}`)
      .then((res) => {setItem(res.data);})
      .catch((error) => {alert(error);});
   }, []);

   console.log(shopCart);
   return (
      <div className='detail page-div'>
         {
            Object.keys(item).length == 0 ? <div>loading...</div> :
            <>
               <div className='detail info-div'>
                  <div className='detail img-div main'>
                     <img src={`http://localhost:8080/upload/${item.imgList[0].attachedFileName}`} />
                  </div>
                  <div className='detail text-div'>
                     <div>카테고리 : {item.cateList[0].cateName}</div>
                     <div>책 제목 : {item.itemName}</div>
                     <div>수량 : <input type='number' name='cartCnt' defaultValue={1} onChange={(e) => {
                        e.target.value < 1 || e.target.value > 10
                        ?
                        e.target.value = 1
                        :
                        e.target.value = e.target.value
                        
                        changeCart(e);}} min={1} /></div>
                     <div>총 가격 : {
                        Object.keys(item).length == 0 ? '' : 
                        (item.itemPrice * shopCart.cartCnt).toLocaleString()
                     }원</div>
                     <div className='btn-div'>
                        <button type='button' className='btn' onClick={() => {buyBtn();}}>구매하기</button>
                        <button type='button' className='btn' onClick={() => {}}>장바구니에 담기</button>
                        <button type='button' className='btn' onClick={() => {navigate(`/cartList`);}}>장바구니로 이동</button>
                     </div>
                  </div>
               </div>
               <div className='detail intro-div'>
                  <h5>책 설명</h5>
                  <p>{item.itemIntro}</p>
               </div>
               <div className='detail img-div sub'>
                  <img src={`http://localhost:8080/upload/${item.imgList[1].attachedFileName}`} />
               </div>
            </>
         }
      </div>
   )
}

export default ItemDetail