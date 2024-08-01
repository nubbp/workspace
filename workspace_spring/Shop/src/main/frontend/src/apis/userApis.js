import axios from "axios"

export const join = (data) => {
   return axios.post('/member/join', data);
}