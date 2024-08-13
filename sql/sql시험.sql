-- 1. 회원정보를 관리하는 테이블을 생성하려고 한다. 이 테이블에서 관리하는 정보로는 회원번호, 아이디, 비밀번호, 
-- 회원이름, 나이, 이메일주소가 있다. 해당 테이블명을 MY_MEMBER라고 했을 때, 테이블 생성 쿼리문을 
-- 작성하세요. 단, 기본키는 회원번호로 하고 나이와 메일주소만 NULL값을 허용한다. 
CREATE TABLE MY_MEMBER (
	MEM_NUM INT PRIMARY KEY
	, MEM_ID VARCHAR(15) NOT NULL
	, MEM_PW VARCHAR(15) NOT NULL
	, MEM_NAME VARCHAR(15) NOT NULL
	, MEM_AGE INT
	, MEM_EMAIL VARCHAR(15)
);

-- ===== 확인용 ======
SELECT * FROM my_member;
-- ===================


-- 2. 위에서 생성한 MY_MEMBER에 데이터를 삽입하는 쿼리문과 모든 데이터를 삭제하는 쿼리문을 작성하시오. 
-- 삽입되는 내용은 임의로 작성하면 된다.
-- 2-1) 데이터 삽입
INSERT INTO MY_MEMBER VALUES (1, 'firstId', 'firstPw', '홍길동', 20, 'aaa@gamil.com');

-- 2-2) 모든 데이터 삭제
DELETE FROM MY_MEMBER;


--  3. 위에서 생성한 MY_MEMBER에서 회원번호가 1번인 회원의 이름을 ‘김자바’로, ID는 ‘KIMJAVA’로 수정하는 
-- 쿼리문을 작성하세요.
UPDATE my_member 
SET MEM_NAME = '김자바', MEM_ID = 'KIMJAVA'
WHERE MEM_NUM = 1;


-- 아래 문제부터는 EMP, DEPT 테이블을 참고하여 푸시오.
--  4. 급여가 500에서 3000 사이이고 커미션이 NULL이 아닌 사원의 사원번호, 사원명, 급여, 커미션을 조회하는 
-- 쿼리문을 작성하세요.

-- ===== 확인용 ======
SELECT * FROM emp;
-- ===================

SELECT EMPNO, ENAME, SAL, COMM
FROM emp
WHERE SAL >= 500
	AND SAL <= 3000
	AND COMM IS NOT NULL;


--  5. 사원들 중 이름이 ‘기’로 끝나기나, ‘김’이 들어가는 사원들의 사번, 이름, 입사일을 조회하되, 사번기준 내림차순 
-- 정렬하여 조회하는 쿼리문을 작성하세요.
SELECT EMPNO, ENAME, HIREDATE
FROM emp
WHERE ENAME LIKE '%기'
	OR ENAME LIKE '%김%'
ORDER BY EMPNO DESC;


--  6. 사원의 사번, 이름, 부서번호, 부서명을 조회해보자. 부서명은 부서번호가 10일 때는 ‘인사부’, 20일 때는 ‘영업부’, 
-- 30일 때는 ‘개발부’, 그 외의 값은 ‘생산부’로 조회되어야 한다. 조인 사용하는 문제 아님. CASE 사용.
SELECT EMPNO, ENAME, DEPTNO, 
CASE
	WHEN (DEPTNO = 10) THEN '인사부'
		  WHEN (DEPTNO = 20) THEN '영업부'
		  WHEN (DEPTNO = 30) THEN '개발부'
		  ELSE '생산부'
		  END AS DNAME
FROM emp;


--  7. 1월에 입사한 모든 사원의 사번, 이름, 입사일, 커미션을 입사일 기준 오름차순으로 조회하는 쿼리문을 작성하세요. 
-- 단, 커미션이 NULL일 경우 커미션은 0으로 조회되어야 한다.
SELECT EMPNO, ENAME, HIREDATE, IFNULL(COMM, 0) AS COMM
FROM emp
WHERE MONTH(HIREDATE) = '01'
ORDER BY HIREDATE ASC;


--  8. 부서별로 그룹지어서 부서별 급여의 합과 급여의 평균, 커미션의 평균을 조회하는 쿼리문을 작성하여라. 
-- 단 조회는 부서별 급여의 총합이 큰 순서대로 조회되어야 한다.
-- ============= 사담 =============
-- DEPTNO는 확인용으로 적어뒀습니다
-- ================================
SELECT DEPTNO, SUM(SAL), AVG(SAL), AVG(IFNULL(COMM, 0))
FROM emp
GROUP BY DEPTNO
ORDER BY SUM(SAL) DESC;


--  9. 서브쿼리를 사용하여 부서명이 ‘인사부’인 사원의 사번, 이름, 입사일, 급여, 부서번호, 부서명을 조회하는 쿼리문을 
-- 작성해보자. 
SELECT EMPNO, ENAME, HIREDATE, SAL, DEPTNO
	, (SELECT DNAME FROM dept
		WHERE DEPTNO = emp.DEPTNO) AS DNAME
FROM emp
WHERE DEPTNO = (SELECT DEPTNO FROM dept WHERE DNAME = '인사부');


-- 10. 조인을 사용하여 부서명이 ‘인사부’가 아니고 급여가 500이상인 사원의 사번, 이름, 입사일, 급여, 부서번호, 
-- 부서명을 조회하는 쿼리문을 작성해보자. 단, 정렬은 사번 기준 내림차순으로 정렬 후 사원 이름 기준 
-- 오름차순으로 정렬한다
SELECT EMPNO, ENAME, HIREDATE, SAL, E.DEPTNO, DNAME
FROM emp E, dept D
WHERE DNAME != '인사부'
	AND SAL >= 500
ORDER BY EMPNO DESC, ENAME ASC;