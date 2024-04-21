select t.datetime
from (select rank() over(order by datetime desc) as r, datetime
      from animal_ins) t
where t.r = 1;