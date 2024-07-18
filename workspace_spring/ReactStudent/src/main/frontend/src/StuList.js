import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

const StuList = () => {

   // 학생 목록을 저장할 state 변수
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
         <p>총 {studentList.length}명</p>
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
                  studentList.length == 0 ?
                  <tr>
                     <td colSpan={6}>조회된 데이터가 없습니다</td>
                  </tr>
                  :
                  studentList.map((student, i) => {
                     const avg = (student.korScore + student.engScore + student.mathScore)/3;
                     return (
                        <tr key={{i}}>
                           <td>{studentList.length-i}</td>
                           <td><span onClick={() => {
                              navigate(`/stuDetail/${student.stuNum}`);
                           }}>{student.stuName}</span></td>
                           <td>{student.korScore}</td>
                           <td>{student.engScore}</td>
                           <td>{student.mathScore}</td>
                           <td>{Math.round(avg * 100)/100}</td>
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