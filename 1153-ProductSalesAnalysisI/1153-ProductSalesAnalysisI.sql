-- Last updated: 8/7/2025, 2:52:12 PM
# Write your MySQL query statement below
select product_name,Sales.year,Sales.price from Product right join Sales on Sales.product_id=Product.product_id;