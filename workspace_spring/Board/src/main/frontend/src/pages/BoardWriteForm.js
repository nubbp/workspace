const BoardWriteForm = () => {
   return (
      <div className="form">
         <table>
            <tbody>
               <tr>
                  <td>제목</td>
                  <td><input type="text" name="title" /></td>
               </tr>
               <tr>
                  <td>내용</td>
                  <td><input type="text" name="content" /></td>
               </tr>
            </tbody>
         </table>
         <div className="btn-div" >
            <button type="button">글 등록</button>
         </div>
      </div>
   );
}

export default BoardWriteForm;