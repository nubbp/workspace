import { useParams } from 'react-router-dom';
import './'

const Detail = ({item_list}) => {
   // url로 전달되는 데이터 받기
   // 1번 방식
   const params = useParams();
   console.log(`params.id = ${params.id}`);

   // 2번 방식
   const {id} = useParams();

   return (
   <div className='detail'>

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