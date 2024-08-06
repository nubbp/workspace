-- 날짜 관련 함수 및 기능

-- 현재 날짜 및 시간 조회
SELECT NOW();
-- 현재 날짜만 조회
SELECT CURRENT_DATE();
-- 현재 시간만 조회
SELECT CURRENT_TIME();

-- 날짜 조회 시 포맷 지정하기
-- DATE_FORMAT(조회할 날짜, 포맷);
-- Y: 풀 연도(2024년), M: 영어식 월(January), D: 서수식 일자(1st)
-- y: 약식 연도(24년), m: 두 자리 숫자 월(01월), d: 두 자리 숫자 일자(01일)
-- H: 시간을 24시간 기준으로 표현 / h: 시간을 12시간 형식으로 표현
-- i: 분을 두 자리 숫자로 표현 / s: 초를 두 자리 숫자로 표현
SELECT NOW()
	, DATE_FORMAT(NOW(), '%Y-%m-%d')
	, DATE_FORMAT(NOW(), '%y-%M-%D')
	, DATE_FORMAT(NOW(), '%Y%m%d')
	, DATE_FORMAT(NOW(), '%Y-%m-%d %H:%i:%s');
	
-- 날짜 및 시간에서 특정 정보만 추출하기
SELECT NOW()
	, YEAR(NOW())
	, MONTH(NOW())
	, DAY(NOW())
	, HOUR(NOW())
	, MINUTE(NOW())
	, SECOND(NOW());
	
SELECT * FROM emp;
-- 2월에 입사한 사원의 사번, 이름, 입사일을 조회
-- 입사일은 '2024-10-10' 형태로 조회

SELECT EMPNO, ENAME, DATE_FORMAT(HIREDATE, '%Y-%m-%d') AS HIREDATE
	, SUBSTRING('PYTHON', 2, 3), SUBSTRING(HIREDATE, 6,2)
FROM emp
-- WHERE MONTH(HIREDATE) = 2
WHERE SUBSTRING(HIREDATE, 6, 2) = '02';

-- 날짜 및 시간 연산
SELECT NOW()
	, ADDDATE(NOW(), INTERVAL 10 DAY)
	, ADDDATE(NOW(), INTERVAL -10 DAY)
	, ADDDATE(NOW(), INTERVAL 1 YEAR)
	, ADDDATE(NOW(), INTERVAL 3 MONTH);
	
-- 날짜 및 시간 차이
-- 매개변수의 형태는 반드시 YYYYMM
SELECT PERIOD_DIFF(202407, 202401);
-- 일 차이
SELECT DATEDIFF(CURRENT_DATE(), '2020-05-05');