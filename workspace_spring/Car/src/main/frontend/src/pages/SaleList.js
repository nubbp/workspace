const SaleList = () => {
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
                  <tr>
                     <td>1</td>
                     <td>2</td>
                     <td>3</td>
                     <td>4</td>
                     <td>5</td>
                     <td>6</td>
                     <td>7</td>
                  </tr>
               </tbody>
            </table>
         </div>
      </div>
   );
}

export default SaleList;