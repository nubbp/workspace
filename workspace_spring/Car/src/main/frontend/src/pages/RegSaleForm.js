import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

const RegSaleForm = () => {
   const navigate = useNavigate();
   const [saleInfoList, setSaleInfoList] = useState([]);
   const [regNewSale, setRegNewSale] = useState({
      buyerName : '',
      color : '블랙',
      brand : '',
      buyerPhone : ''
   });

   useEffect(() => {
      axios.get("/sales/getSalesList")
      .then((res) => {setSaleInfoList(res.data);})
      .catch((error) => {alert(error);});
   }, [])
   
   return (
      <div className="reg-sale-div">
         <div className="table form">
            <table>
               <tbody>
                  <tr>
                     <td>구매자명</td>
                     <td colSpan={3}><input type="text" name="buyerName" /></td>
                  </tr>
                  <tr>
                     <td>색상</td>
                     <td >
                     <select name="color">
                        <option value="블랙">블랙</option>
                        <option value="화이트">화이트</option>
                        <option value="실버">실버</option>
                        <option value="레드">레드</option>
                        </select>
                     </td>
                     <td>모델</td>
                     <td >
                        <select name="modelNum">
                           {
                              saleInfoList.map((saleInfo, i) => {
                                 return(
                                    <option key={i} value="{saleInfo.modelNum}">{saleInfo.modelNum}</option>
                                 );
                              })
                           }
                           
                        </select>
                     </td>
                  </tr>
                  <tr>
                     <td>연락처</td>
                     <td colSpan={3}><input type="text" name="buyerPhone" /></td>
                  </tr>
               </tbody>
            </table>
         </div>
         <div className="btn-div" >
            <button type="button">등록</button>
         </div>
      </div>
   );
}

export default RegSaleForm;