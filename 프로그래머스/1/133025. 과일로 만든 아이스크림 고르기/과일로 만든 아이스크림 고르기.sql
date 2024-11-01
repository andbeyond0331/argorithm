-- 코드를 입력하세요
SELECT i.flavor
from icecream_info i join first_half f on i.flavor = f.flavor
where f.total_order>3000 and i.ingredient_type = 'fruit_based'
order by f.total_order desc;