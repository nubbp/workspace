// 전체 선택/해제
function checkAllMenu() {
   // 전체선택/해제 체크박스 접근
   const allCursor = document.querySelector('#chk_all');
   // 전체 선택됐는지 받아오기
   const isAllCheck = allCursor.checked;
   // 모든 체크박스 접근
   const allCheck = document.querySelectorAll('input[type="checkbox"]');

   // 전체 선택 및 해제 반응
   if (isAllCheck) {
      for (const chk of allCheck) {
         chk.checked = true;
      }
   } else {
      for (const chk of allCheck) {
         chk.checked = false;
      }
   }
}

// 메뉴 선택/해제
function checkAllOption(selectedTag) {
   // 옵션 접근
   const allOption = selectedTag.nextElementSibling.querySelectorAll('input');
   // 메뉴 체크됐는지 받아오기
   const isMenuCheck = selectedTag.checked;

   // 메뉴 선택 및 해제 반응
   if (isMenuCheck) {
      for(const opt of allOption) {
         opt.checked = true;
      }
   } else {
      for (const opt of allOption) {
         opt.checked = false;
      }
   }
}