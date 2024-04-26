-- 코드를 작성해주세요
SELECT t.id as ID, f.length as LENGTH
from (select rank() over (order by length desc) r, id
     from fish_info where length >10) t, fish_info f
where t.r <= 10 and t.id = f.id
order by 2 desc, 1 asc;