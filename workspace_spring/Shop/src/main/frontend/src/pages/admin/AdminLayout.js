
import React, { useState } from 'react'
import { Outlet, useNavigate } from 'react-router-dom'

const AdminLayout = () => {
  const [sideMenuValue, setSideMenuValue] = useState(1);
  const navigate = useNavigate();

  function changeSideMenu (e) {
    setSideMenuValue(e.target.value);
  }

  // 사이드메뉴 그리는 함수
  function drawSideMenu() {
    if (sideMenuValue == 1) {
      return (
        <>
          <li onClick={() => {navigate('/admin/itemManage')}}>상품관리<i class="bi bi-caret-right-fill" /></li>
          <li onClick={() => {navigate('/admin/regItem')}}>상품등록<i class="bi bi-caret-right-fill" /></li>
          <li onClick={() => {navigate('/admin/categoryManage')}}>카테고리관리<i class="bi bi-caret-right-fill" /></li>
        </>
      );
    } else if (sideMenuValue == 2) {
      return (
        <>
          <li onClick={() => {navigate('/admin/saleHistoryOfMonth')}}>이달의 구매내역<i class="bi bi-caret-right-fill" /></li>
          <li>구매정보 검색<i class="bi bi-caret-right-fill" /></li>
        </>
      );
    } else if (sideMenuValue == 3) {
      return (
        <>
          <li onClick={() => {navigate('/admin/searchUser')}}>유저 검색<i class="bi bi-caret-right-fill" /></li>
          <li>유저정보 변경<i class="bi bi-caret-right-fill" /></li>
          <li>탈퇴유저 관리<i class="bi bi-caret-right-fill" /></li>
        </>
      );
    } else if (sideMenuValue == 4) {
      return (
        <>
          <li onClick={() => {navigate('/admin/recordOfMonth')}}>이달의 매출<i class="bi bi-caret-right-fill" /></li>
          <li>월별 매출<i class="bi bi-caret-right-fill" /></li>
          <li>카테고리별 매출<i class="bi bi-caret-right-fill" /></li>
        </>
      );
    }
  }

  return (
    <div>
      <div className='admin-menu-div'>
        <ul className='menu-ul'onClick={(e) => {changeSideMenu(e);}} >
          <li value={1} onClick={() => {navigate('/admin/regItem')}}>상품관리</li>
          <li value={2} onClick={() => {navigate('/admin/saleHistoryOfMonth')}}>구매관리</li>
          <li value={3} onClick={() => {navigate('/admin/searchUser')}} >유저관리</li>
          <li value={4} onClick={() => {navigate('/admin/recordOfMonth')}}>매출관리</li>
        </ul>
      </div>
      <div className='admin-pages'>
        <div className='side-menu-div'>
          <ul className='menu-ul'>
            {
              drawSideMenu()
            }
          </ul>
        </div>
        <Outlet />
      </div>
    </div>
  )
}

export default AdminLayout