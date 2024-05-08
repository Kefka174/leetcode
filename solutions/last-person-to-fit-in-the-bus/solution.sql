-- Table: Queue
-- +-------------+---------+
-- | Column Name | Type    |
-- +-------------+---------+
-- | person_id   | int     |
-- | person_name | varchar |
-- | weight      | int     |
-- | turn        | int     |
-- +-------------+---------+
-- person_id column contains unique values.
-- This table has the information about all people waiting for a bus.
-- The person_id and turn columns will contain all numbers from 1 to n, where n is the number of rows in the table.
-- turn determines the order of which the people will board the bus, where turn=1 denotes the first person to board and turn=n denotes the last person to board.
-- weight is the weight of the person in kilograms.

SELECT person_name
FROM (
    SELECT person_name, (@runningSum := @runningSum + weight) AS running_weight
    FROM Queue, (SELECT @runningSum := 0) AS rs
    ORDER BY turn
) AS rw
WHERE running_weight <= 1000
ORDER BY running_weight DESC
LIMIT 1