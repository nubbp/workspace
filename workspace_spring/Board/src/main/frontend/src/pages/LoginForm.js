import { useNavigate } from "react-router-dom";

const LoginForm = () => {
   const navigate = useNavigate();

   return (
      <div className="form">
         <p>아이디</p>
         <input type="text" name="memID" />
         <p>비밀번호</p>
         <input type="text" name="memPW " />
         <div className="btn-div">
            <button type="button" onClick={() => {
               navigate('/');
            }}>로그인</button>
            <button type="button" onClick={() => {
               navigate('/');
            }}>목록가기</button>
         </div>
      </div>
   );
}

export default LoginForm;