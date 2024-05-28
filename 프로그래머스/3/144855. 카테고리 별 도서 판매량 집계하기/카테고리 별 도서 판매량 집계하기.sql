-- 코드를 입력하세요
SELECT b.category, sum(bs.sales)
from book b join book_sales bs on b.book_id = bs.book_id
where substring(bs.sales_date, 1, 7) = '2022-01'
group by b.category
order by b.category;