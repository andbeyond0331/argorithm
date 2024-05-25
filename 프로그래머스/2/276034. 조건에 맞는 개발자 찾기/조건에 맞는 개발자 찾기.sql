-- 코드를 작성해주세요
select d.id, d.email, d.first_name, d.last_name
from developers d, (select sum(code) code
                    from skillcodes
                    where name = 'Python' or name = 'C#') t
where d.skill_code & t.code
order by id asc;
