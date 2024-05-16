-- Table: Customer
-- +---------------+---------+
-- | Column Name   | Type    |
-- +---------------+---------+
-- | customer_id   | int     |
-- | name          | varchar |
-- | visited_on    | date    |
-- | amount        | int     |
-- +---------------+---------+
-- In SQL,(customer_id, visited_on) is the primary key for this table.
-- This table contains data about customer transactions in a restaurant.
-- visited_on is the date on which the customer with ID (customer_id) has visited the restaurant.
-- amount is the total paid by a customer.

SELECT DISTINCT c1.visited_on, 
    SUM(c2.amount) / COUNT(DISTINCT c1.customer_id) AS amount, 
    ROUND(SUM(c2.amount) / COUNT(DISTINCT c1.customer_id) / 7, 2) AS average_amount
FROM Customer c1, Customer c2
WHERE DATEDIFF(c1.visited_on, c2.visited_on) BETWEEN 0 AND 6
GROUP BY c1.visited_on
HAVING COUNT(DISTINCT c2.visited_on) >= 7
ORDER BY c1.visited_on