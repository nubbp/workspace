import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

const StuDetail = () => {

   const params = useParams();
   console.log(params);

   const [detail, setDetail] = useState({});
   const navigate = useNavigate();

   useEffect(() => {
      axios
      .get(`/studentDetail/${params.stuNum}`)
      .then((res) => {
         console.log(res.data);
         setDetail(res.data);
      })
      .catch((error) => {
         alert("상세정보 불러오기 중 오류 발생")
      });
   }, []);

return (

   <div className="detail-div">
      <table>
         <tbody>
            <tr>
               <td>이름</td>
               <td>{detail.stuName}</td>
               <td>나이</td>
               <td>{detail.stuAge}</td>
            </tr>
            <tr>
               <td>연락처</td>
               <td>{detail.stuTel}</td>
               <td>주소</td>
               <td>{detail.stuAddr}</td>
            </tr>
            <tr>
               <td>국어점수</td>
               <td>{detail.korScore}</td>
               <td>영어점수</td>
               <td>{detail.engScore}</td>
            </tr>
            <tr>
               <td>수학점수</td>
               <td>{detail.mathScore}</td>
               <td>평균</td>
               <td>{(detail.korScore + detail.engScore + detail.mathScore)/3.0}</td>
            </tr>
         </tbody>
      </table>

      <div className="btn-div">
         <button type="button" onClick={() => {
            navigate('/');
         }
         }>뒤로가기</button>
      </div>
   </div>
);
} 
export default StuDetail;