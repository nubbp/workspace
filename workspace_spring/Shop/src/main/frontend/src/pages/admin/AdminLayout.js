
import React from 'react'
import { Outlet } from 'react-router-dom'

const AdminLayout = () => {
  return (
    <div>
      <div className='admin-menu-div'>
        <ul className='menu-ul'>
          <li>상품관리</li>
          <li>구매관리</li>
          <li>유저관리</li>
          <li>매출관리</li>
        </ul>
      </div>
      <div className='admin-pages'>
        <div className='side-menu-div'>
          <ul className='menu-ul'>
            <li>상품관리</li>
            <li>상품등록</li>
            <li>카테고리관리</li>
          </ul>
        </div>
        <Outlet />
      </div>
    </div>
  )
}

export default AdminLayout