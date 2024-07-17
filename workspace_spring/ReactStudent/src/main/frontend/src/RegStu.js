import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

const RegStu = () => {

   const navigate = useNavigate();
   const [newStudent, setNewStudent] = useState({
      stuName: '',
      stuAge: 0,
      stuAddr: '',
      stuTel: ''
   });

   function regStudent(e) {
      setNewStudent({
         ...newStudent,
         [e.target.name] : e.target.value
      }
      );
   };

   function regButtonClick() {
      axios
      .post('/regStudent', newStudent)
      .then((res) => {
         navigate('/');
      })
      .catch((error) => {
         alert('등록 중에 오류 발생');
         console.log(error);
      });
   }

   return (
      <div className="reg-div">
         <div>
            <p><span>이름</span><input type="text" name="stuName" onChange={(e) => {
               regStudent(e);
            }}/></p>
            <p><span>나이</span><input type="text" name="stuAge" onChange={(e) => {
               regStudent(e);
            }}/></p>
            <p><span>연락처</span><input type="text" name="stuTel" onChange={(e) => {
               regStudent(e);
            }}/></p>
            <p><span>주소</span><input type="text" name="stuAddr" onChange={(e) => {
               regStudent(e);
            }}/></p>
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