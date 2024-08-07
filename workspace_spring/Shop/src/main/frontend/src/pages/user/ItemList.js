import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate } from 'react-router-dom'

const ItemList = () => {
   const navigate = useNavigate();

   // 상품 목록
   const [itemList, setItemList] = useState([]);

   useEffect(() => {
      axios.get('/admin/getItemList')
      .then((res) => {
         setItemList(res.data);
      }).catch(() => {});
   }, []);
   // console.log(itemList);

   return (
      <div className='page-div item-list'>
         <div>
            <table>
               <thead>
                  <tr>
                     <td>번호</td>
                     <td>제목</td>
                     <td>분류</td>
                  </tr>
               </thead>
               <tbody>
                  {
                     itemList.map((item, i) => {
                        return(
                           <tr key={i}>
                              <td>{i+1}</td>
                              <td>{item.itemName}</td>
                              <td>{item.cateCode}</td>
                           </tr>
                        );
                     })
                  }
               </tbody>
            </table>
         </div>
      </div>
   )
}

export default ItemList