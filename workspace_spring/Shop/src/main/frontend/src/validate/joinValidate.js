// 유효성 검사 결과를 저장할 변수
let resultArr = [
   false, //아이디
   false, //비번
   false, //이름
   false //연락처
];

let result_pw1 = false;
let result_pw2 = false;

export const joinValidate = (newData, valid_tag, tagName) => {
   

   // id가 영문만 포함 + 4~12자리인지 검사하는 정규식
   
   // id 값을 변경했으면 id 피드백만 띄움
   // pw 값을 변경했으면 pw 피드백만 띄움
   // name 값을 변경했으면 name 피드백만 띄움
   // tel 값을 변경했으면 tel 피드백만 띄움
   
   switch(tagName) {
      case 'memId' : 
         const regex_memId = /^[a-z|A-Z]{4,12}$/;
         //  test(): 매개변수로 들어온 데이터가 조건에 부합하면 true 리턴 
         if(!regex_memId.test(newData.memId)) {
            // // div에 error 클래스 추가
            // memId_valid_tag.current.className = 'feedback error';
            // // div 태그 안에 글자 변경: 4자리 이상 가능
            // memId_valid_tag.current.textContent = '4~12자 사이의 영문 아이디만 허용';
            sendFeedbackMsg(valid_tag[0],  '4~12자 사이의 영문 아이디만 허용', 'error');
            resultArr[0] = false;
         } else {
            sendFeedbackMsg(valid_tag[0],  '사용 가능한 아이디', 'good');
            resultArr[0] = true;
         }
         break;
         
         case 'memPw' :
            const regex_memPw = /^(?=.*[a-z])(?=.*[0-9]).{4,12}$/
            if(regex_memPw.test(newData.memPw)) {
               sendFeedbackMsg(valid_tag[1], '', 'good');
               result_pw1 = true;
            } else {
               sendFeedbackMsg(valid_tag[1], '4~12자 사이의 영문+숫자 조합 비밀번호만 허용', 'error');
               result_pw1 = false;
            }
            break;
            
            case 'memPw': case 'confirmPw' : 
            if (newData.memPw != newData.confirmPw) {
               sendFeedbackMsg(valid_tag[2], '비밀번호 불일치', 'error');
               result_pw2 = false;
            } else {
               sendFeedbackMsg(valid_tag[2], '비밀번호 일치', 'good');
               result_pw2 = true;
            }
            resultArr[1] = (result_pw1 && result_pw2) ? true : false;
            break;
            
            case 'memName' : 
            // 이름 값 유효성 검사
            // 정규식 : 2~10글자 + 한글만
            const regex_memName = /^[ㄱ-ㅎ|가-힣]{2,10}$/;
            
            // 정규식에 충족하면
            if(regex_memName.test(newData.memName)){
               sendFeedbackMsg(valid_tag[3],  '사용 가능한 이름', 'good');
               resultArr[2] = true;
            } else {
               sendFeedbackMsg(valid_tag[3], '2~10자 사이의 한글 이름만 허용', 'error');
               resultArr[2] = false;
            }
            
            break;
            
            case 'memTel' : 
            const regex_memTel = /^\d{2,3}-\d{3,4}-\d{4}$/;
            if(regex_memTel.test(newData.memTel)){
               sendFeedbackMsg(valid_tag[4],  '유효한 전화번호', 'good');
               resultArr[3] = true;
            } else {
               sendFeedbackMsg(valid_tag[4], '올바른 전화번호 형식으로 입력', 'error');
               resultArr[3] = false;
            }
            break;
         }
         console.log(resultArr);
         return !resultArr.includes(false);

         // for (const e of resultArr) {
         //    if(!e) { return false; }
         // }
         
         // return resultArr;
      }

// 유효성 결과 메세지를 띄우는 함수
function sendFeedbackMsg(feedbackTag, msg, type) {
   feedbackTag.current.className = `feedback ${type}`;
   feedbackTag.current.textContent = msg;
}