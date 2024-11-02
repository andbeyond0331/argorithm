-- 코드를 입력하세요 2022 5/1 출고 완료 이후 출고 대기 미정 출고미정
SELECT order_id, product_id, date_format(out_date, '%Y-%m-%d'), if(out_date<='2022-05-01', '출고완료', if(out_date is null, '출고미정', '출고대기')) as 출고여부
from food_order
order by order_id asc;
                        