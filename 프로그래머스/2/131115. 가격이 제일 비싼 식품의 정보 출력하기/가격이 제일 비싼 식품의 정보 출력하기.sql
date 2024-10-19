-- 코드를 입력하세요
SELECT product_id, product_name, product_cd, category, price
from food_product, (select max(price) m
                    from food_product) f
where food_product.price = f.m;