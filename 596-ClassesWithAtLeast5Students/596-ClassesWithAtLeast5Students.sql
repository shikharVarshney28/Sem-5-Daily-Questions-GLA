-- Last updated: 8/7/2025, 2:54:26 PM
# Write your MySQL query statement below
select class from Courses
Group by class having count(student)>=5; 