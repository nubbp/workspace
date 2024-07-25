import axios from "axios"

export const getReplyList = (data) => {
   const response = axios.get(`/reply/list/${data}`);
   return response;
}