-- Last updated: 8/7/2025, 2:51:55 PM
# Write your MySQL query statement below
select distinct author_id as id from Views 
where author_id=viewer_id
order by id