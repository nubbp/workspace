import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

const RegStu = () => {

   const navigate = useNavigate();
   const [newStudent, setNewStudent] = useState({
      stuName: '',
      stuAge: 0,
      stuTel: '',
      stuAddr: ''
   });

   function regStudent(e) {
      setNewStudent({
         ...newStudent,
         [e.target.name] : e.target.value
      }
      );
   };

   function regButtonClick(e) {

      const nameInputTag = document.querySelector('input[name="stuName"]');
      if (nameInputTag.value == '') {
         alert('이름은 필수입력입니다.');
         nameInputTag.focus();
         return ;
      }

      axios
      .post('/regStudent', newStudent)
      .then((res) => {
         navigate('/');
      })
      .catch((error) => {
         alert('등록 중에 오류 발생');
         alert(error);
         console.log(error);
      });
   }

   return (
      <div className="reg-div">
         <div className="reg-table-div">
            <table>
               <tbody>
                  <tr>
                     <td>이름</td>
                     <td>
                        <input type="text" name="stuName" onChange={(e) => {regStudent(e);}}/>
                     </td>
                  </tr>
                  <tr>
                     <td>나이</td>
                     <td>
                        <input type="text" name="stuAge" onChange={(e) => {regStudent(e);}}/>
                     </td>
                  </tr>
                  <tr>
                     <td>연락처</td>
                     <td>
                        <input type="text" name="stuTel" onChange={(e) => {regStudent(e);}}/>
                     </td>
                  </tr>
                  <tr>
                     <td>주소</td>
                     <td>
                        <input type="text" name="stuAddr" onChange={(e) => {regStudent(e);}}/>
                     </td>
                  </tr>
               </tbody>
            </table>
         </div>
         <div className="btn-div">
            <button type="button" onClick={(e) => {
               regButtonClick(e);
            }}>글쓰기</button>
         </div>
      </div>
   );
}

export default RegStu;