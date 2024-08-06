import axios from 'axios';
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom'
import Modal from '../../common/Modal';

const Login = () => {
   
   const navigate = useNavigate();
   const [login, setLogin] = useState({
      memId : '',
      memPw : ''
   });
   
   //모달창 랜더링 여부
   const [beforeLoginModal, setBeforeLoginMoal] = useState(false);
   // login 버튼 클릭 시 화면에 보여지는 모달창의 상태
   const [afterLoginModal, setAfterLoginMoal] = useState(false);
   
   const [isLoginSuccess, setIsLoginSuccess] = useState(false);

   // 로그인 내용 변경
   function changeLogin(e) {
      setLogin({
         ...login,
         [e.target.name] : e.target.value
      })
   }

   // 로그인 버튼 눌렀을 때
   function loginBtn () {

      // 아이디 비번 없으면 alert 안내 후 취소
      if (login.memId == '' || login.memPw == '') {
         setBeforeLoginMoal(true);
         return ;
      }

      axios.post('/api_member/loginForm', login)
      .then((res) => {
         // alert("로그인 완료");
         console.log(res.data);
         
         if(res.data != '') {
            setAfterLoginMoal(true);
            setIsLoginSuccess(true);

            const loginInfo = {
               memId : res.data.memId,
               memPw : res.data.memPw,
               memRole : res.data.memRole
            }
            window.sessionStorage.setItem('loginInfo', JSON.stringify(loginInfo));
            setLogin(loginInfo);
            
            if (loginInfo.memRole != 'USER') {
               navigate('/admin/regItem');
            }
            
         } else {
            setAfterLoginMoal(false);
            setIsLoginSuccess(false);
            alert("로그인 데이터 없음")
         }

      })
      .catch((error) => {alert(error);})
   }

     //모달창 안의 내용을 생성하는 함수
   function setModalContent(){
      return (<div>아이디, 비밀번호를 입력하세요</div>);
   }
   function drawModalContent() {
      return(
         <>
         {
            isLoginSuccess
            ?
            <div>환영합니다</div>
            :
            <div>아이디 비밀번호를 확인하세요</div>
         }
         </>
      );
   }

     // 모달창을 닫으면 실행되는 함수
   function onclickModalBtn() {
      navigate('/loginForm');
   }
   function handleBtn() {
      if (isLoginSuccess) {
         // 로그인 성공 시 확인 버튼 내용
            navigate('/');
      }
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
                  <td><input type='text' name='memId' placeholder='아이디를 입력하세요' onChange={(e) => {changeLogin(e);}} /></td>
               </tr>
               <tr>
                  <td>비밀번호</td>
                  <td><input type='password' name='memPw' placeholder='비밀번호를 입력하세요' onChange={(e) => {changeLogin(e);}} /></td>
               </tr>
            </tbody>
         </table>
         <div className='btn-div'>
            <button type='button' onClick={() => {loginBtn();}}>로그인</button>
            <button type='button' onClick={() => {navigate('/join');}}>가입하기</button>
         </div>
      </div>

      {/* 아이디 비번 없어서 실패하면 뜨는 모달 */}
      {
         beforeLoginModal 
         ? 
         <Modal content={setModalContent} setIsShow={setBeforeLoginMoal} clickCloseBtn={onclickModalBtn} /> 
         : 
         null
      }
      {/* 로그인 성공 시 뜨는 모달 */}
      {
         afterLoginModal 
         ? 
         <Modal content={drawModalContent} setIsShow={setAfterLoginMoal} clickCloseBtn={handleBtn} /> 
         : 
         null
      }

    </div>
  )
}

export default Login