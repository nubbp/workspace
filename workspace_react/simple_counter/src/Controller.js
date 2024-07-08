function Controller (props) {
   return (
      <div className='controller'>
        <button type='button' value="-10" onClick={(e) => {
         props.changeCnt(e.target.value);
         // props.setCnt(10);
        }}>-10</button>
        <button type='button' value="-1" onClick={(e) => {
          props.changeCnt(e.target.value);
        }}>-1</button>
        <button type='button' value="+1" onClick={(e) => {
          props.changeCnt(e.target.value);
        }}>+1</button>
        <button type='button' value="+10" onClick={(e) => {
          props.changeCnt(e.target.value);
        }}>+10</button>
      </div>
   );
}


export default Controller;