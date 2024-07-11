import { useNavigate } from "react-router-dom";

const Item = ({item}) => {
   // navigate('이동할 url');
   // navigate(-1); -> 한 페이지 뒤로 가기
   // navigate(-2); -> 두 페이지 뒤로 가기
   // navigate(1); -> 한 페이지 앞으로 가기
   const navigate = useNavigate(); // navigate => 함수임

   return (
      <div className="item">
         <img onClick={(e) => {
            navigate(`/detail/${item.itemNum}`);
         }} src={process.env.PUBLIC_URL + '/' + item.imgName} />
            <h3>{item.itemName}</h3>
            <p>{item.price}</p>
         </div>
   );
}

export default Item;