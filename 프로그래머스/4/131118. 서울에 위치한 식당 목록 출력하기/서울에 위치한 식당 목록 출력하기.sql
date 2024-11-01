# -- 코드를 입력하세요
SELECT i.rest_id, i.rest_name, i.food_type, i.favorites, i.address, round(avg(r.review_score),2) as score
from rest_info i join rest_review r on i.rest_id = r.rest_id
where substring(i.address, 1, 2) = '서울'
group by rest_id
order by score desc, i.favorites desc;
# select substring(i.address, 1, 5)
# from rest_info i join rest_review r on i.rest_id = r.rest_id;
# # where concat(i.address, 0, 5) = '서울특별시';