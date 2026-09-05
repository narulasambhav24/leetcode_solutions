# Write your MySQL query statement below
select * from Cinema where id in (select id from Cinema where (id % 2 != 0)) AND description not in ('Boring') order by rating DESC;