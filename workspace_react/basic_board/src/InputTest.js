import { useState } from "react";

const InputTest = () => {
   // input 태그에 입력한 내용을 저장하는 변수
  const [inputData, setInputData] = useState('');
  console.log(1);
  
  const [stu, setStu] = useState({
    stuName: '',
    age : 0,
    score : 0,
    addr : ''
  });

  function changeStu(e) {
   setStu({
     ...stu,
     [e.target.name] : e.target.value
   });
 }

   return (
      <div>
         <div>
            <input type='text' onChange={(e) => {
               // inputData = e.target.value; // 아래랑 동일
               setInputData(e.target.value);
               console.log(inputData);
            }} />
         </div>

         <div>
            학생명: <input type='text' name='stuName' onChange={(e)=>{
               setStu({
                  ...stu,
                  stuName: e.target.value
               });
            }}/> <br />
            나이: <input type='text' name='age' onChange={(e)=>{
               changeStu(e);
            }}/> <br />
            점수: <input type='text' name='score' onChange={(e)=>{
               changeStu(e);
            }}/> <br />
            주소: <input type='text' name='addr' onChange={(e) => {
               changeStu(e);
            }}/> <br />
         </div>

         <div>
            이름: {stu.stuName} <br />
            나이: {stu.age} <br />
            점수: {stu.score} <br />
            주소: {stu.addr} <br />
         </div>
      </div>
   );
}

export default InputTest;