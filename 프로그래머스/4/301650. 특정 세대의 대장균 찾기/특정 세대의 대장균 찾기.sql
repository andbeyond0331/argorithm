-- 코드를 작성해주세
select e.id
from ecoli_data e, (select e.id
                   from ecoli_data e, (select id
                                      from ecoli_data
                                      where parent_id is null) t
                   where e.parent_id  = t.id) t
where e.parent_id = t.id
order by id;