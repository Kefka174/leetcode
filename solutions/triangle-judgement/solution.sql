-- Table: Triangle
-- +-------------+------+
-- | Column Name | Type |
-- +-------------+------+
-- | x           | int  |
-- | y           | int  |
-- | z           | int  |
-- +-------------+------+
-- In SQL, (x, y, z) is the primary key column for this table.
-- Each row of this table contains the lengths of three line segments.

SELECT *, IF((x + y + z - GREATEST(x, y, z) > GREATEST(x, y, z)), "Yes", "No") AS triangle
FROM Triangle