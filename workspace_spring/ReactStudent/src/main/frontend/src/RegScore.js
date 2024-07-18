import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

const RegScore = () => {

   const params = useParams();
   // console.log(params);

   const [scores, setScores] = useState({
      korScore: 0
      , engScore: 0
      , mathScore: 0
   });
   const navigate = useNavigate();

   useEffect (() => {
      axios
      .get(`/getScore/${params.stuNum}`)
      .then((res) => {
         setScores(res.data);
      })
      .catch((error) => {alert('점수 불러오는 중에 오류 발생')});
   }, [])

   function regScore (e) {
      setScores({
         ...scores,
         [e.target.name]: e.target.value
      })
   }

   function regScoreBtn (e) {
      axios
      .post('/regScore', scores)
      .then((res) => {
         navigate('/');
      })
      .catch((error) => {
         alert('점수 갱신 중 오류 발생');
      })
   }


  return (
    <div className="reg-score-div">
      <table>
         <thead>
            <tr>
               <td colSpan={2}>{} 학생 성적 입력</td>
            </tr>
         </thead>
         <tbody>
            <tr>
               <td>국어</td>
               <td><input type="text" name="korScore" placeholder={scores.korScore} onChange={(e) => regScore(e)} /></td>
            </tr>
            <tr>
               <td>영어</td>
               <td><input type="text" name="engScore" placeholder={scores.engScore} onChange={(e) => regScore(e)} /></td>
            </tr>
            <tr>
               <td>수학</td>
               <td><input type="text" name="mathScore" placeholder={scores.mathScore} onChange={(e) => regScore(e)} /></td>
            </tr>
         </tbody>
      </table>
      <div className="btn-div">
         <button type="button" onClick={(e) => {
            console.log(scores);
            regScoreBtn(scores);
         }
         }>점수등록</button>
      </div>
    </div>
  )
}

export default RegScore;