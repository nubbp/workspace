import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

const RegSaleForm = () => {
   const navigate = useNavigate();

   const [modelList, setModelList] = useState([]);

   useEffect(() => {
      axios.get("/car/getCarList")
      .then((res) => {setModelList(res.data)})
      .catch((error) => {alert(error)})
   }, []);

   const [regNewSale, setRegNewSale] = useState({
      buyerName : '',
      color : '블랙',
      modelNum : 1,
      buyerPhone : ''
   });

   function changeRegSale(e) {
      setRegNewSale({
         ...regNewSale,
         [e.target.name] : e.target.value
      })
   }

   function regSaleBtn() {
      axios.post("/sales/regSalesInfo", regNewSale)
      .then((res) => {
         alert("등록 완료");
         navigate('/saleList');
      })
      .catch((error) => {alert(error);})
   }

   console.log(regNewSale);

   return (
      <div className="reg-sale-div">
         <div className="table form">
            <table>
               <tbody>
                  <tr>
                     <td>구매자명</td>
                     <td colSpan={3}><input type="text" name="buyerName" onChange={(e) => {changeRegSale(e);}} /></td>
                  </tr>
                  <tr>
                     <td>색상</td>
                     <td >
                     <select name="color" onClick={(e) => {changeRegSale(e);}}>
                        <option value="블랙">블랙</option>
                        <option value="화이트">화이트</option>
                        <option value="실버">실버</option>
                        <option value="레드">레드</option>
                        </select>
                     </td>
                     <td>모델</td>
                     <td >
                        <select name="modelNum" onClick={(e) => {changeRegSale(e);}}>
                           {
                              modelList.map((model, i) => {
                                 return(
                                    <option key={i} value={model.modelNum}>{model.modelName}</option>
                                 );
                              })
                           }
                           
                        </select>
                     </td>
                  </tr>
                  <tr>
                     <td>연락처</td>
                     <td colSpan={3}><input type="text" name="buyerPhone" onChange={(e) => {changeRegSale(e);}} /></td>
                  </tr>
               </tbody>
            </table>
         </div>
         <div className="btn-div" >
            <button type="button" onClick={() => {regSaleBtn();}}>등록</button>
         </div>
      </div>
   );
}

export default RegSaleForm;