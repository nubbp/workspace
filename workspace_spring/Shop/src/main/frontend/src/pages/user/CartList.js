import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useParams } from 'react-router-dom';

const CartList = ({loginInfo}) => {
   const [cartList, setCartList] = useState([]);
   const memId = useParams();

   console.log(loginInfo);
   useEffect(() => {
      axios.get(`/cart/getCartList/${memId}`)
      .then((res) => {
         setCartList(res.data);
      })
      .catch((error) => {alert(error);});
   }, []);

   console.log(cartList);

   return (
   <div className='page-div cart'>
      <div>
         <table>
            <thead>
               <tr>
                  <td>No</td>
                  <td><input type='checkbox' /></td>
                  <td>상품 정보</td>
                  <td>가격</td>
                  <td>수량</td>
                  <td>구매가격</td>
                  <td>구매일시</td>
                  <td></td>
               </tr>
            </thead>
            <tbody>
               <tr>
                  <td>1</td>
                  <td><input type='checkbox' /></td>
                  <td>
                     <div className='item-name'>
                        {/* <div className='img-div'>
                           <img src='https://image.yes24.com/goods/59417581/XL' />
                        </div> */}
                        상품명
                     </div>
                  </td>
                  <td>1</td>
                  <td><input type='number' className='form-control small' defaultValue={1} /><button type='button' className='btn'>변경</button></td>
                  <td>1</td>
                  <td>1</td>
                  <td><button type='button' className='btn'>삭제</button></td>
               </tr>
            </tbody>
         </table>
      </div>
      <div className='total-cost'>
         <p>총 구매금액 ￦</p>
      </div>
      <div className='btn-div'>
         <button type='button' className='btn'>선택 삭제</button>
         <button type='button' className='btn'>선택 구매</button>
      </div>
    </div>
  )
}

export default CartList