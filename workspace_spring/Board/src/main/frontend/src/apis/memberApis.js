import axios from "axios"

// ID 중복 확인
export const checkID = (data) => {
   const response = axios.get(`/member/checkID/${data}`);
   return response;
}
// 가입하기
export const join = (data) => {
   const response = axios.post('/member/join', data);
   return response;
}

export const login = (data) => {
   const response = axios.post('/member/login', data);
   return response;
}