-- 코드를 입력하세요
(
    SELECT substring(sales_date, 1, 10) as sales_date, product_id, user_id, sales_amount
from online_sale
where substring(sales_date, 1, 7) = '2022-03'
)
union
(
    SELECT substring(sales_date, 1, 10) as sales_date, product_id, NULL as user_id, sales_amount
from offline_sale
where SUBSTRING(sales_date, 1, 7) = '2022-03'
    
)
order by sales_date, product_id, user_id;