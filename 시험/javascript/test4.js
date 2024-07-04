// 전체 선택/해제
function checkAllMenu() {
   // 전체선택/해제 체크박스 접근
   const allCursor = document.querySelector('#chk_all');
   // 선택됐는지 받아오기
   const isAllCheck = allCursor.checked;
   // 모든 체크박스 접근
   const allCheck = document.querySelectorAll('input[type="checkbox"]');

   // 전체선택 및 해제 반응
   if (isAllCheck) {
      console.log(isAllCheck);
      for (const chk of allCheck) {
         chk.checked = true;
      }
   } else {
      console.log(isAllCheck);
      for (const chk of allCheck) {
         chk.checked = false;
      }
   }
}


function checkAllOption() {
   // 메뉴 체크박스 접근
   var menuCursor = document.getElementsByClassName('menu');
   console.log(menuCursor);
}