import axios from "axios";
import { useNavigate } from "react-router-dom";
import * as memberApi from '../apis/memberApis';
import { useState } from "react";

const RegMemberForm = () => {

   const navigate = useNavigate();

   const [isDisabled, setIsDisabled] = useState(true);

   const [joinData, setJoinData] = useState({
      memID: '',
      memPW: '',
      confirmPW: '',
      memName: '',
      gender: 'male'
   });
   
   // input 태그에 값 입력 시 joinData 변경
   function changeJoinData(e) {

      if(e.target.name == 'memID') {
         setIsDisabled(true);
      }

      setJoinData({
         ...joinData,
         [e.target.name] : e.target.value
      });
   }

   function checkID() {
      if(joinData.memID == '') {
         alert('ID를 입력하세요.');
         return ;
      }
   }

   // 아이디 중복 확인 함수
   function checkID() {
      // 아이디 값을 가지고 자바로 가서 중복 확인 쿼리를 실행
      memberApi.checkID(joinData.memID)
      .then((res) => {
         const result = res.data;
         alert(result ? 'ID 중복' : '사용 가능');

         if(!result) {
            setIsDisabled(false);
         }
      })
      .catch((error) => {
         alert("중복 확인 오류");
         console.log(error);
      });
   }


   // 회원가입 버튼 클릭 시 실행
   function join() {
      // validation 처리(유효성 검사)
      if (joinData.memPW != joinData.confirmPW) {
         alert("비밀번호 불일치");
         return ;
      }

      // 아이디 4~8글자
      if (joinData.memID.length < 4 || joinData.memID.length > 8) {
         alert("아이디는 4글자 이상 8글자 이하로 작성")
         return ;
      }

      // 회원가입
      memberApi.join(joinData)
      .then((res) => {
         navigate('/');
      })
      .catch((error) => {
         console.log(error);
         alert("등록 오류 발생")
      });
   }

   return (
      <div className="form">
         <div className="reg-div">
            <p>아이디</p>
            <input type="text" name="memID" className="id-reg" onChange={(e) => {changeJoinData(e);}} />
            <button type="button" className="id-reg-btn" onClick={() => {checkID();}}>중복확인</button>
            <p>비밀번호</p>
            <input type="password" name="memPW" onChange={(e) => {changeJoinData(e);}} />
            <p>비밀번호 확인</p>
            <input type="password" name="confirmPW" onChange={(e) => {changeJoinData(e);}} />
            <p>이름</p>
            <input type="text" name="memName" onChange={(e) => {changeJoinData(e);}} />
            <p>성별</p>
            <input type="radio" name="gender" value="male"
            onChange={(e) => {changeJoinData(e);}}
            checked={joinData.gender == "male"}
            />남자
            <input type="radio" name="gender" value="female"
            onChange={(e) => {changeJoinData(e);}}
            checked={joinData.gender == "female"}
            />여자
         </div>

      <div className="btn-div">
         <button type="button" disabled={isDisabled} onClick={() => {
            join();
         }}>회원가입</button>
      </div>
   </div>
   );
}

export default RegMemberForm;