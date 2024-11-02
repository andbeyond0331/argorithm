# -- 코드를 작성해주세요
# SELECT ANY_VALUE(i.id) AS id, n.fish_name, MAX(i.length) AS length
# from fish_info i join fish_name_info n on i.fish_type = n.fish_type
# # where length>10
# group by 2
# having length > 10
# order by 1;
SELECT i.id AS ID, n.fish_name AS FISH_NAME, i.length AS LENGTH
FROM fish_info i
JOIN fish_name_info n ON i.fish_type = n.fish_type
WHERE (i.fish_type, i.length) IN (
    SELECT fish_type, MAX(length)
    FROM fish_info
    WHERE length IS NOT NULL
    GROUP BY fish_type
)
ORDER BY i.id;
