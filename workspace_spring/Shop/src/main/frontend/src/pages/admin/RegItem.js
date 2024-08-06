import React, { useState } from 'react'

const RegItem = () => {

   const [category, setCategory] = useState([]);

  return (
    <div className='reg-item-div'>
      <div>
         <table className='form table'>
            <tbody>
               <tr>
                  <td>
                     <span>상품 카테고리</span>
                     <select name='cateCode'>
                        <option>상품 카테고리</option>
                     </select>
                  </td>
               </tr>
               <tr>
                  <td>
                     <span>상품명</span>
                     <input type='text' name='cateName' />
                  </td>
               </tr>
               <tr>
                  <td>
                     <span>상품가격</span>
                     <input type='text' name='itemPrice' />
                  </td>
               </tr>
               <tr>
                  <td>
                     <span>상품소개</span>
                     <input type='text' name='itemIntro' />
                  </td>
               </tr>

            </tbody>
         </table>
         <button type='button' >상품 등록</button>
      </div>
    </div>
  )
}

export default RegItem