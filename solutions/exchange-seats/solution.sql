-- Table: Seat
-- +-------------+---------+
-- | Column Name | Type    |
-- +-------------+---------+
-- | id          | int     |
-- | student     | varchar |
-- +-------------+---------+
-- id is the primary key (unique value) column for this table.
-- Each row of this table indicates the name and the ID of a student.
-- id is a continuous increment.

SELECT IF(id + 1 IN (SELECT id FROM Seat), id + 1, id) AS id, student
FROM Seat
WHERE id % 2 != 0
UNION
SELECT id - 1 AS id, student
FROM Seat
WHERE id % 2 = 0
ORDER BY id

----------------------------------------------------------
SELECT CASE
        WHEN id % 2 != 0 AND id + 1 IN (SELECT id FROM Seat) THEN id + 1
        WHEN id % 2 = 0 THEN id - 1
        ELSE id
        END as id,
    student
FROM Seat
ORDER BY id