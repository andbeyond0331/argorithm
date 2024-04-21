-- 코드를 입력하세요
SELECT t.price as MAX_PRICE
from (select RANK() OVER(order by price desc) as ran, price
from product) t
where t.ran = 1;