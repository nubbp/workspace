import { useNavigate } from "react-router-dom";

const RegMemberForm = () => {

   const navigate = useNavigate();

   return (
      <div className="form">
      <p>아이디</p>
      <input type="text" name="memID" /> <button type="button">중복확인</button>
      <p>비밀번호</p>
      <input type="text" name="memPW" />
      <p>비밀번호 확인</p>
      <input type="text" name="memPW" />
      <p>이름</p>
      <input type="text" name="memName" />
      <p>성별</p>
      <input type="radio" name="gender" value="male" />남자
      <input type="radio" name="gender" value="female" />여자

      <div className="btn-div">
         <button type="button" onClick={() => {
            navigate('/loginForm');
         }}>회원가입</button>
      </div>
   </div>
   );
}

export default RegMemberForm;