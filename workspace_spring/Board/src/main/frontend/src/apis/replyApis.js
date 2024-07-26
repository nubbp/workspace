import axios from "axios"

export const getReplyList = (data) => {
   const response = axios.get(`/reply/list/${data}`);
   return response;
}

export const regReply = (data) => {
   const response = axios.post(`/reply/reg`, data);
   return response;
}