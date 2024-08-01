import React, { useState } from 'react'
// import * as userApi from "../";
import axios from 'axios';
import { useNavigate } from 'react-router-dom';

const Join = () => {

  const navigate = useNavigate();
  const [member, setMember] = useState({});

  function changeMember(e) {
    setMember({
      ...member,
      [e.target.name] : e.target.value
    })
  }

  function joinBtn () {
    axios.post('/member/join', member)
    .then((res) => {
      alert("회원가입완료");
      navigate('/');
    })
    .catch((error) => {alert(error);});
  }

  return (
    <div className='join-div'>
      <div>
        <table className='table form join'>
          <colgroup>
            <col width="25%" />
            <col width="*" />
            <col width="25%" />
          </colgroup>
          <tbody>
            <tr>
              <td>아이디</td>
              <td><input type='text' name='memId' onChange={(e) => {changeMember(e);}} /></td>
              <td><button type='button'>중복확인</button></td>
            </tr>
            <tr>
              <td>비밀번호</td>
              <td colSpan={2}><input type='password' name='memPw' onChange={(e) => {changeMember(e);}} /></td>
            </tr>
            <tr>
              <td>비밀번호 확인</td>
              <td colSpan={2}><input type='password' name='memPw' onChange={(e) => {changeMember(e);}} /></td>
            </tr>
            <tr>
              <td>이름</td>
              <td colSpan={2}><input type='text' name='memName' onChange={(e) => {changeMember(e);}} /></td>
            </tr>
            <tr>
              <td>연락처</td>
              <td colSpan={2}><input type='text' name='memTel' placeholder='숫자만 입력하세요' onChange={(e) => {changeMember(e);}} /></td>
            </tr>
            <tr>
              <td rowSpan={3}>주소</td>
              <td><input type='text' name='post'placeholder='우편번호' onChange={(e) => {changeMember(e);}} /></td>
              <td><button type='button'>검색</button></td>
            </tr>
            <tr>
              <td colSpan={2}><input type='text' name='memAddr' placeholder='주소' onChange={(e) => {changeMember(e);}} /></td>
            </tr>
            <tr>
              <td colSpan={2}><input type='text' name='addrDetail' placeholder='주소 상세입력' onChange={(e) => {changeMember(e);}} /></td>
            </tr>
            <tr>
              <td>이메일</td>
              <td><input type='text' name='memEmail' onChange={(e) => {changeMember(e);}} /></td>
              <td>
                <select>
                  <option value="naver">naver.com</option>
                  <option value="gmail">gmail.com</option>
                </select>
                </td>
            </tr>
          </tbody>
        </table>
        <div className='btn-div'>
          <button type='button' onClick={() => {joinBtn();}}>회원가입</button>
        </div>
      </div>

    </div>
  )
}

export default Join;