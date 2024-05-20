-- 코드를 입력하세요
SELECT MCDP_CD as '진료과코드', count(*) as '5월예약건수'
FROM APPOINTMENT
WHERE SUBSTRING(APNT_YMD, 1, 7) = '2022-05'
GROUP BY 1
ORDER BY 2, 1;
