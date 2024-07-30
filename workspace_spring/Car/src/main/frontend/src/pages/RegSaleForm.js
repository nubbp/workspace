const RegSaleForm = () => {
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
                           <option value="black">블랙</option>
                           <option value="white">화이트</option>
                           <option value="sliver">실버</option>
                           <option value="red">레드</option>
                        </select>
                     </td>
                     <td>모델</td>
                     <td >
                        <select name="brand">
                           <option value="?">?</option>
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