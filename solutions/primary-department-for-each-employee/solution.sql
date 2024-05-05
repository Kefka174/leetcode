-- Table: Employee
-- +---------------+---------+
-- | Column Name   |  Type   |
-- +---------------+---------+
-- | employee_id   | int     |
-- | department_id | int     |
-- | primary_flag  | varchar |
-- +---------------+---------+
-- (employee_id, department_id) is the primary key (combination of columns with unique values) for this table.
-- employee_id is the id of the employee.
-- department_id is the id of the department to which the employee belongs.
-- primary_flag is an ENUM (category) of type ('Y', 'N'). If the flag is 'Y', the department is the primary department for the employee. If the flag is 'N', the department is not the primary.

SELECT employee_id, department_id
From Employee
WHERE primary_flag = 'Y' OR (employee_id, department_id) IN ( -- could use UNION
    SELECT employee_id, department_id
    FROM Employee
    GROUP BY employee_id
    HAVING COUNT(department_id) = 1
)