import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom';

const CartList = ({loginInfo}) => {
   const navigate = useNavigate();
   const memId = JSON.parse(window.sessionStorage.getItem('loginInfo')).memId;
   const [cartList, setCartList] = useState([]);
   const [newCnt, setNewCnt] = useState({
      cartCode : 1,
      cartCnt : 0
   });

   useEffect(() => {
      axios.get(`/cart/getCartList/${memId}`)
      .then((res) => {
         setCartList(res.data);
      })
      .catch((error) => {alert(error);});
   }, []);

   function changeCnt(e) {
      setNewCnt({
         ...newCnt,
         [e.target.name] : e.target.value
      })
   }

   async function updateCntBtn(e, cartCode) {
      
      const data = {
         cartCode : cartCode,
         cartCnt : e.target.previousElementSibling.value
      }

      console.log(newCnt);
      await axios.post(`/cart/updateCnt`, data)
      .then((res) => {
         alert("변경 완료");
         setCartList(cartList);
      })
      .catch((error) => {alert(error)})
   }

   const [isCheckAll, setIsCheckAll] = useState(false);
   const [isCheck, setIsCheck] = useState(false);
   const [checkCnt, setCheckCnt] = useState(0);

   function changeAllCheck(e) {
      setIsCheckAll(e.target.checked ? true : false);
      setCheckCnt(isCheckAll ? cartList.length : 0);
      console.log(checkCnt);
      console.log(isCheckAll);
   }

   function deleteOneBtn(e) {
      console.log(e.target.value);
      if (!window.confirm("삭제하시겠습니까?")) {
         return ;
      } else {
         axios.delete(`/cart/deleteOneCart/${e.target.value}`)
         .then((res) => {
            alert("삭제 완료");
            setCartList(cartList);
         })
         .catch((error) => {alert(error)});
      }
   }

   return (
   <div className='page-div cart'>
      <div>
         <table>
            <colgroup>
               <col width="3%" />
               <col width="3%" />
               <col width="*%" />
               <col width="10%" />
               <col width="15%" />
               <col width="10%" />
               <col width="13%" />
               <col width="10%" />
            </colgroup>
            <thead>
               <tr>
                  <td>No</td>
                  <td><input type='checkbox' onClick={(e) => {changeAllCheck(e)}} /></td>
                  <td>상품 정보</td>
                  <td>가격</td>
                  <td>수량</td>
                  <td>구매가격</td>
                  <td>구매일시</td>
                  <td></td>
               </tr>
            </thead>
            <tbody>
               {
                  cartList.map((cart, i) => {
                     return(
                        <tr key={i}>
                        <td>{i+1}</td>
                        <td><input type='checkbox' onClick={(e) => {}} /></td>
                        <td>
                           <div className='item-name'>
                              <div className='img-div'>
                                 <img src={`http://localhost:8080/upload/${cart.imgList[0].attachedFileName}`} />
                              </div>
                              {cart.itemList[0].itemName}
                           </div>
                        </td>
                        <td>{
                           Object.keys(cart).length == 0 ? '' :
                           cart.itemList[0].itemPrice.toLocaleString()
                        }원</td>
                        <td>
                           <input type='number' className='form-control small' name='cartCnt' defaultValue={cart.cartCnt} onChange={(e) => {changeCnt(e)}} />
                           <button type='button' className='btn small' onClick={(e) => {updateCntBtn(e, cart.cartCode);}}>변경</button>
                        </td>
                        <td>{
                           Object.keys(cart).length == 0 ? '' : 
                           (cart.itemList[0].itemPrice * cart.cartCnt).toLocaleString()
                           }원</td>
                        <td>{cart.cartDate}</td>
                        <td><button type='button' className='btn small' value={cart.cartCode} onClick={(e) => {deleteOneBtn(e)}} >삭제</button></td>
                     </tr>
                     )
                  })
               }
            </tbody>
         </table>
      </div>
      <div className='total-cost'>
         <p>총 구매금액 ￦{}</p>
      </div>
      <div className='btn-div'>
         <button type='button' className='btn'>선택 삭제</button>
         <button type='button' className='btn'>선택 구매</button>
      </div>
    </div>
  )
}

export default CartList