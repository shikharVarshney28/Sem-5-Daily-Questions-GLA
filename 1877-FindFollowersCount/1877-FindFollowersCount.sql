-- Last updated: 8/7/2025, 2:49:26 PM
# Write your MySQL query statement below
select user_id,count(follower_id) as followers_count from Followers
Group by user_id 
order by user_id asc