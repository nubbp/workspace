import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

const StuList = () => {

   const [studentList, setStudentList] = useState([]);
   const navigate = useNavigate();

   useEffect(() => {
      axios
      .get('/list')
      .then((res) => {
         console.log(res.data);
         setStudentList(res.data);
      })
      .catch((error) => {
         alert('학생 리스트 불러오는 중에 오류 발생')
      });
   }, []);

   return (
      <div className="list-div">
         <table>
            <thead>
               <tr>
               <td>No</td>
               <td>학생명</td>
               <td>국어점수</td>
               <td>영어점수</td>
               <td>수학점수</td>
               <td>평균</td>
               </tr>
            </thead>
            <tbody>
               {
                  studentList.map((student, i) => {
                     return (
                        <tr key={{i}}>
                           <td>{student.stuNum}</td>
                           <td><span onClick={() => {
                              navigate(`/stuDetail/${student.stuNum}`);
                           }}>{student.stuName}</span></td>
                           <td>{student.korScore}</td>
                           <td>{student.engScore}</td>
                           <td>{student.mathScore}</td>
                           <td>{(student.korScore + student.engScore + student.mathScore)/3.0}</td>
                        </tr>
                     );
                  })
               }
            </tbody>
        </table>
      </div>
   );
}

export default StuList;