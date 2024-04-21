-- 코드를 입력하세요
# select substr(datetime, 1, 10) as date, datetime, substring(datetime, 12, 2)
with recursive hours as (
select 0 as rnum
union all
select rnum +1 from hours
where rnum < 23
)
# select * from hours;

# select hour(date_format(datetime, '%Y-%m-%d %h:%m'))
# from animal_outs
# order by 1;

select hours.rnum as hour, count(animal_outs.datetime) as count
from hours left join animal_outs on hours.rnum = HOUR(date_format(datetime, '%Y-%m-%d %H:%m'))
group by hours.rnum
order by hours.rnum;

# select hour(date_format(datetime, '%Y-%m-%d %H:%m')) as hour, datetime
# from animal_outs;


# , select substring(datetime, 12, 2) as hour
# WITH RECURSIVE HAPPY AS
# (
# SELECT 0 AS HOUR
#     UNION ALL
#     SELECT HOUR+1
#     FROM HAPPY
#     WHERE HOUR<24
# )

# SELECT HAPPY.HOUR, COUNT(IFNULL(HOUR(A.DATETIME),0))
# FROM ANIMAL_OUTS AS A
# RIGHT JOIN HAPPY
# ON HAPPY.HOUR = HOUR(A.DATETIME)
# ORDER BY HAPPY.HOUR;