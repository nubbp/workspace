function setTable() {
   
   // 집어넣을 위치 잡기
   const tableDiv = document.querySelector('.table-div');

   // 전 내용 없애기
   tableDiv.innerHTML = ``;

   // 행 열 값 받아오기
   const rowNum = document.querySelector('#rowInput').value;
   const colNum = document.querySelector('#colInput').value;


   // 반복할 공간 선언
   let str = '';

   // str 행 열 수만큼 반복
   for (let i = 0; i < rowNum; i++) {
      for (let j = 0; j < colNum; j++) {
         str = str + `<td>${i+1}행 ${j+1}열</td>`;
      }
      str = `<tr>${str}</tr>`;
   }

   // str에 table 태그 추가
   str = `<table>${str}</table>`;

   // table-div 안에 집어넣기
   tableDiv.insertAdjacentHTML('beforeend', str);
}