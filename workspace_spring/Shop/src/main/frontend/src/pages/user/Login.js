import axios from 'axios';
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom'

const Login = () => {
   const navigate = useNavigate();
   const [login, setLogin] = useState({});

   function changeLogin(e) {
      setLogin({
         ...login,
         [e.target.name] : e.target.value
      })
   }

   function loginBtn () {
      axios.post('/member/login', login)
      .then((res) => {
         // alert("로그인 완료");
         console.log(login);
         navigate('/');
      })
      .catch((error) => {alert(error);})
   }

  return (
    <div className='login-form-div'>
      <div>
         <table className='table form login'>
            <colgroup>
               <col width="20%"></col>
               <col width="*"></col>
            </colgroup>
            <tbody>
               <tr>
                  <td>아이디</td>
                  <td><input type='text' name='memId' onChange={(e) => {changeLogin(e);}} /></td>
               </tr>
               <tr>
                  <td>비밀번호</td>
                  <td><input type='password' name='memPw' onChange={(e) => {changeLogin(e);}} /></td>
               </tr>
            </tbody>
         </table>
         <div className='btn-div'>
            <button type='button' onClick={() => {loginBtn();}}>로그인</button>
            <button type='button' onClick={() => {navigate('/join');}}>가입하기</button>
         </div>
      </div>
    </div>
  )
}

export default Login