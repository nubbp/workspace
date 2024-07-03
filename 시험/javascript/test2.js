
function setAvgAge(){
   // 합 구하기
   const ageAll = document.querySelectorAll('.ageTd');
   let sum = 0;
   ageAll.forEach(function(age, i) {
      sum = Number(age.textContent) + sum;
   });
   const avg = sum / 3.0;
   console.log(avg);

   const resultTable = document.querySelector('#resultTd');
   resultTable.textContent = avg;
}