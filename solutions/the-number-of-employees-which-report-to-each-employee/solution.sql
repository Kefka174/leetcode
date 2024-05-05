-- Table: Employees
-- +-------------+----------+
-- | Column Name | Type     |
-- +-------------+----------+
-- | employee_id | int      |
-- | name        | varchar  |
-- | reports_to  | int      |
-- | age         | int      |
-- +-------------+----------+
-- employee_id is the column with unique values for this table.
-- This table contains information about the employees and the id of the manager they report to. Some employees do not report to anyone (reports_to is null).

SELECT m.employee_id, m.name, COUNT(e.employee_id) AS reports_count, ROUND(AVG(e.age),0) AS average_age
FROM Employees m, Employees e
WHERE m.employee_id = e.reports_to
GROUP BY m.employee_id
ORDER BY m.employee_id