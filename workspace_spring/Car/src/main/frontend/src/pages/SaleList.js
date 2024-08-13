import axios from "axios";
import { useEffect, useState } from "react";

const SaleList = () => {
   const [saleInfoList, setSaleInfoList] = useState([]);
   useEffect(() => {
      axios.get("/sales/getSalesList")
      .then((res) => {setSaleInfoList(res.data);})
      .catch((error) => {alert(error);})
   }, [])
   console.log(saleInfoList);
   return (
      <div className="sale-list-div">
         <div className="table">
            <table>
               <thead>
                  <tr>
                     <td rowSpan={2}>No.</td>
                     <td colSpan={4}>구매자정보</td>
                     <td colSpan={2}>차량정보</td>
                  </tr>
                  <tr>
                     <td>구매자명</td>
                     <td>연락처</td>
                     <td>구매일</td>
                     <td>색상</td>
                     <td>모델명</td>
                     <td>금액</td>
                  </tr>
               </thead>
               <tbody>
                  {
                     saleInfoList.map((saleInfo, i) => {
                        return(
                           <tr key={i}>
                              <td>{i+1}</td>
                              <td>{saleInfo.buyerName}</td>
                              <td>{saleInfo.buyerPhone}</td>
                              <td>{saleInfo.saleDate}</td>
                              <td>{saleInfo.color}</td>
                              <td>{saleInfo.car.modelName}</td>
                              <td>{saleInfo.car.cost}</td>
                           </tr>
                        );
                     })
                  }
               </tbody>
            </table>
         </div>
      </div>
   );
}

export default SaleList;