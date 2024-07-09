//item_list는 현재 쇼핑몰에서 판매하고 있는 상품들의 목록 정보이다.
//아래 데이터를 참고하여 요구사항을 해결하시오.
const item_list = [
  {
    item_name : '여름 셔츠',
    price : 25000,
    brand : 'java마켓',
    size : [90, 100, 110]
  },
  {
    item_name : '라운드 티',
    price : 20000,
    brand : 'java마켓',
    size : [90, 95, 100, 105, 110]
  },
  {
    item_name : '데님 청바지',
    price : 30000,
    brand : 'python마켓',
    size : [90, 100, 110, 120]
  },
  {
    item_name : '슬림 면바지',
    price : 35000,
    brand : 'python마켓',
    size : [90, 95, 100]
  }
];

//1. 'java마켓'에서 팔고 있는 상품들의 상품명과 가격을 각각 콘솔창에 출력하여라.
console.log('1번')

for (const item of item_list) {
    console.log(`상품명: ${item.item_name}, 가격: ${item.price}원`);
}

//2. 95사이즈를 구매할 수 있는 상품들의 상품명을 콘솔창에 출력하시오.
console.log('');
console.log('2번');

for (const item of item_list) {
  if (item.size.includes(95)) {
    console.log(`${item.item_name}`);
  }
}


//3. '등록 및 출력' 버튼을 클릭하면 입력 내용 저장 후 콘솔창에 데이터를 출력하시오.
function addItem(){
  console.log('');
  console.log('3번')
  // 각각의 input 값 가져오기
  const itemName = document.querySelector('#itemName').value;
  const price = document.querySelector('#price').value;
  const brand = document.querySelector('#brand').value;
  const sizeChecked = document.querySelectorAll('.size');
  
  // 사이즈 배열로 만들기........................
  let itemSize = [];
  for (const chk of sizeChecked) {
    if (chk.checked == true) {
      itemSize.push(Number(chk.value));
    }
  }

  // 상품명 공백 불가
  if (itemName == null) {
    alert('상품명을 입력하세요.');
  }

  // item_list에 저장
  let newItem = {
    item_name : itemName,
    price : price,
    brand : brand,
    size : itemSize
  }
  item_list.push(newItem);

  // item_list에 출력
  for (const item of item_list) {
    console.log(`상품명: ${item.item_name}, 가격: ${item.price}원, 브랜드: ${item.brand}, 사이즈: ${item.size}`);
  }
  console.log('--------');
}
