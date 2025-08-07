-- Last updated: 8/7/2025, 2:47:13 PM
# Write your MySQL query statement below
select teacher_id, Count(Distinct subject_id) as cnt from Teacher
Group by teacher_id;