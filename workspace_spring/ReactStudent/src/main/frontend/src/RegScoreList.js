import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

const RegScoreList = () => {

   const [regScores, setRegScores] = useState([]);
   const navigate = useNavigate();

   useEffect(() => {
      axios
      .get('/list')
      .then((res) => {
         console.log(res.data);
         setRegScores(res.data);
      })
      .catch((error) => {
         alert('학생 삭제 리스트 불러오는 중에 오류 발생')
      });
   }, []);

   return (
      <div className="score-div">
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
                  regScores.map((regScore, i) => {
                     return (
                        <tr key={i}>
                           <td>{i+1}</td>
                           <td>{regScore.stuName}</td>
                           <td><button type="button" onClick={(e) => {
                              navigate(`/regScore/${regScore.stuNum}`);
                           }}>성적입력</button></td>
                        </tr>
                     );
                  })
               }
            </tbody>
         </table>
      </div>
   );
}

export default RegScoreList;