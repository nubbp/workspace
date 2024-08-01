import { Outlet } from "react-router-dom";

const UserLayout = () => {
return (
   <div className="layout-div">
      <h3>유저전용화면</h3>
      <Outlet />
   </div>
);
}

export default UserLayout;