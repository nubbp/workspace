import { useParams } from 'react-router-dom';
import './'
import { useEffect, useState } from 'react';

const Detail = ({item_list}) => {
   // url로 전달되는 데이터 받기
   // 1번 방식
   const params = useParams();
   // console.log(`params.id = ${params.id}`);

   // 2번 방식
   const {id} = useParams();
   
   // useEffect();
   // 컴포넌트의 라이프싸이클 사이에 필요한 기능 추가
   // mount: 최초에 컴포넌트가 생성
   // update: 컴포넌트가 재렌더링 되는 상태
   // unmount: 컴포넌트가 사라질 떄

   const [num, setNum] = useState(0);
   const [num1, setNum1] = useState(0);

   // 해당 컴포넌트가 랜더딩되면 마지막에 실행 : mount 되면 실행
   // mount(컴포넌트를 새로 읽을 떄) + update(재랜더링) 될 때
   // useEffect의 두 번째 매개변수가 없으면 mount + update 될 때 실행
   useEffect(() => {
      console.log(1);
   });
   // mount(컴포넌트를 새로 읽을 때) 될 때 실행
   // 두번째 매개변수로 빈 배열을 전달하면 mount 될 때만 실행
   useEffect(() => {
      console.log(2);
   }, []);
   // 두번째 매개변수에 배열형태로 state변수를 넣으면
   // 해당 useEffect는 mount+배열에 넣은 state 값이 변경되어 재랜더링될 때 실행
   useEffect(() => {
      console.log(3);
   }, [num]);
   useEffect(() => {
      console.log(4);
   }, [num, num1]);
   // return안의 내용은 마운트될 떄 실행x
   // update될 떄 실행되는데 가장 먼저 실행
   // unmnout 될 때도 실행
   useEffect(() => {
      console.log(5);
      return () => {
         console.log(6);
      };
   }, [num]);
   // unmount 될 때만 7을 출력  
   useEffect(() => {
      return () => {
         console.log(7);
      }
   }, []);


   return (
   <div className='detail'>
      <button type="button" onClick={(e) => {setNum(num+1)}}>num 값 변경</button>
      <div>num = {num}</div>
      <button type="button" onClick={(e) => {setNum1(num1+1)}}>num 값 변경</button>
      <div>num1 = {num1}</div>
      {
         item_list.map((item, i)=>{
            if (i+1 == id) {
               return (
                  <div>
                     <div>
                        <div className='detail-img'>
                           <img src={process.env.PUBLIC_URL + '/' + item.imgName} />
                        </div>
                        <div className='detail-text'>
                           <h3>{item.itemName}</h3>
                           <p>{item.price}</p>
                           <button type='button'>주문하기</button>
                        </div>
                     </div>
                     <div className='detail-intro'>
                        <p>{item.intro}</p>
                     </div>
                  </div>
                  
               );
            }
         })
      }
   </div>
   );
}

export default Detail;