// Viewer 컴포넌트
function Viewer (props) {
   return (
   <div className='viewer'>
         <p>현재 카운터</p>
         <p>{props.cnt}</p>
   </div>
   )
 }

 export default Viewer;