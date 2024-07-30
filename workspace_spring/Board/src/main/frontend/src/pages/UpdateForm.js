import React, { useEffect, useState } from 'react'
import * as boardApi from '../apis/boardApis'
import { useNavigate, useParams } from 'react-router-dom';

function UpdateForm() {
  const navigate = useNavigate();
  const {boardNum} = useParams();
  const [board, setBoard] = useState({});
  const [updateData, setUpdateData] = useState({
    boardNum: boardNum,
    title: '',
    content: ''
  });

  useEffect(() => {
    boardApi.BoardDetail(boardNum)
    .then((res) => {
      setBoard(res.data);
      setUpdateData({
        ...updateData,
        title: res.data.title,
        content: res.data.content
      });
    })
    .catch((error) => {alert(error);});
  }, []);

  function changeBoard(e) {
    setUpdateData({
      ...updateData,
      [e.target.name] : e.target.value
    });
  }

  function updateBtn() {
    boardApi.updateBoard(updateData)
    .then((res) => {
      navigate(`/detail/${boardNum}`)
    })
    .catch((error ) => {alert(error);})
  }

  return (
    <div className='update-div'>
      <table>
        <tbody>
            <tr>
              <td>작성일</td>
              <td>{board.createDate}</td>
              <td>작성자</td>
              <td>{board.memID}</td>
            </tr>
            <tr>
              <td>제목</td>
              <td colSpan={3}>
                <input type='text' name='title' value={updateData.title} onChange={(e) => {changeBoard(e);}} />
              </td>
            </tr>
            <tr>
              <td>내용</td>
              <td colSpan={3}>
                <textarea name='content' value={updateData.content} onChange={(e) => {changeBoard(e);}} />
              </td>
            </tr>
        </tbody>
      </table>
      <div className='btn-div'>
        <button type='button' onClick={() => {navigate(-1)}}>뒤로가기</button>
        <button type='button' onClick={() => {updateBtn();}}>완료</button>
      </div>
    </div>
  )
}

export default UpdateForm