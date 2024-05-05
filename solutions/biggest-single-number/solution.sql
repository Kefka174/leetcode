-- Table: MyNumbers
-- +-------------+------+
-- | Column Name | Type |
-- +-------------+------+
-- | num         | int  |
-- +-------------+------+
-- This table may contain duplicates (In other words, there is no primary key for this table in SQL).
-- Each row of this table contains an integer.

SELECT MAX(num) AS num
FROM (
    SELECT *
    FROM MyNumbers
    GROUP BY num
    HAVING COUNT(*) = 1
) AS uniqueNums