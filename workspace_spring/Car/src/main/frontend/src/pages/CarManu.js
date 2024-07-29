const CarManu = () => {
   return (
      <div className='car-manu-div'>
         <div className='car-reg-div'>
            <div className='reg form'>
               <hr />
               <span>
               제조사 
               <select name='brand'>
                  <option value="hd">현대</option>
                  <option value="kia">기아</option>
                  <option value="ss">쌍용</option>
               </select>
               </span>
               <span>모델명<input type='text' /></span>
               <span>차량가격<input type='text' /></span>
            </div>
            <div className='btn-div'>
               <button type='button'>등록</button>
            </div>
            <hr />
         </div>

         <div className='car-list-div'>
            <table>
               <thead>
               <tr>
                  <td>모델번호</td>
                  <td>모델명</td>
                  <td>제조사</td>
               </tr>
               </thead>
               <tbody>
               <tr>
                  <td>1</td>
                  <td>모델며엉</td>
                  <td>제조사아</td>
               </tr>
               </tbody>
            </table>
         </div>
      </div>
   );
}

export default CarManu;