import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

const DelStuList = () => {
   const params = useParams();
   const [delStudents, setDelStu] = useState([]);
   const navigate = useNavigate();

   useEffect(() => {
      axios
      .get('/list')
      .then((res) => {
         console.log(res.data);
         setDelStu(res.data);
      })
      .catch((error) => {
         alert('학생 삭제 리스트 불러오는 중에 오류 발생')
      });
   }, []);

   function delButtonClick(e) {
      axios
      .delete(`/deleteStudent/${e.stuNum}`)
      .then((res) => {
         navigate(0);
      })
      .catch((error) => {
         console.log(error);
         alert('삭제 중에 오류 발생');
      });
   }

   return (
      <div className="delList-div">
         <table>
            <thead>
               <tr>
                  <td>No</td>
                  <td>학생명</td>
                  <td>삭제</td>
               </tr>
            </thead>
            <tbody>
               {
                  delStudents.map((delStudent, i) => {
                     return (
                        <tr key={i}>
                           <td>{i+1}</td>
                           <td>{delStudent.stuName}</td>
                           <td><button type="button" onClick={(e) => {
                              console.log(delStudent);
                              delButtonClick(delStudent);
                           }}>삭제</button></td>
                        </tr>
                     );
                  })
               }
            </tbody>
         </table>
      </div>
   );
}

export default DelStuList;