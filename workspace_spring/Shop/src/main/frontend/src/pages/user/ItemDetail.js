import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useParams } from 'react-router-dom';

const ItemDetail = () => {
   const {itemCode} = useParams();
   const [item, setItem] = useState({});

   useEffect(() => {
      axios.get(`/item/itemDetail/${itemCode}`)
      .then((res) => {setItem(res.data);})
      .catch((error) => {alert(error);});
   }, []);

   // console.log(item);

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
                     <div>책 번호 : {item.itemCode}</div>
                     <div>책 제목 : {item.itemName}</div>
                     <div>가격 : {Number(item.itemPrice).toLocaleString()}원</div>
                     <div>재고 : {item.itemStock}개</div>
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