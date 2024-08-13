import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom';

const ItemDetail = ({loginInfo}) => {
   const navigate = useNavigate();
   const {itemCode} = useParams();
   const [item, setItem] = useState({});
   const [shopCart, setShopCart] = useState({
      itemCode : itemCode
      , cartCnt : 1
      , memId : loginInfo.memId
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
         alert("장바구니에 담기 성공");
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
                     <div>수량 : <input type='number' name='cartCnt' defaultValue={1} onClick={(e) => {changeCart(e);}} /></div>
                     <div>총 가격 : {Number(item.itemPrice*shopCart.cartCnt).toLocaleString()}원</div>
                     <div className='btn-div'>
                        <button type='button' onClick={() => {buyBtn();}}>구매하기</button>
                        <button type='button' onClick={() => {}}>장바구니에 담기</button>
                        <button type='button' onClick={() => {navigate(`/cartList/${loginInfo.memId}`);}}>장바구니로 이동</button>
                     </div>
                  </div>
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