// 게시판 테이블에서 사용하는 axios 모음
import axios from "axios"

// 게시글 목록 조회
export const getBoardList = () => {
   const response = axios.get('/board/list');
   return response;
}


export const BoardDetail = (data) => {
   const response = axios.get(`/board/detail/${data}`);
   return response;
}

export const regBoard = (data) => {
   const response = axios.post('/board/regBoard', data);
   return response;
}

export const delBoard = (data) => {
   const response = axios.delete(`/board/deleteBoard/${data}`);
   return response;
}
