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
   console.log(itemList);

   return (
      <div className='page-div item-list'>
         <div className='item-div'>
            {
               itemList.map((item, i) => {
                  return (
                     <div className='item' key={i} onClick={() => {navigate(`/itemDetail/${item.itemCode}`);}}>
                        {/* {console.log(item.imgList[0].attachedFileName)} */}
                        <img src={`http://localhost:8080/upload/${item.imgList[0].attachedFileName}`}/>
                        <h4>{item.itemName}</h4>
                        <p>{item.itemPrice.toLocaleString()}원</p>
                     </div>
                  );
               })
            }
            
         </div>
      </div>
   )
}

export default ItemList