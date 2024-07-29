import axios from "axios"

export const getReplyList = (data) => {
   const response = axios.get(`/reply/list/${data}`);
   return response;
}

export const regReply = (data) => {
   const response = axios.post(`/reply/reg`, data);
   return response;
}

export const delReply = (data) => {
   const response = axios.delete(`/reply/deleteReply/${data}`);
   return response;
}

export const delBoardReply = (data) => {
   return axios.delete(`/reply/deleteBoardReply/${data}`);
}