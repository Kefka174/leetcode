-- Table: Insurance
-- +-------------+-------+
-- | Column Name | Type  |
-- +-------------+-------+
-- | pid         | int   |
-- | tiv_2015    | float |
-- | tiv_2016    | float |
-- | lat         | float |
-- | lon         | float |
-- +-------------+-------+
-- pid is the primary key (column with unique values) for this table.
-- Each row of this table contains information about one policy where:
-- pid is the policyholder's policy ID.
-- tiv_2015 is the total investment value in 2015 and tiv_2016 is the total investment value in 2016.
-- lat is the latitude of the policy holder's city. It's guaranteed that lat is not NULL.
-- lon is the longitude of the policy holder's city. It's guaranteed that lon is not NULL.

WITH nonUniqueTiv15s AS (
    SELECT tiv_2015
    FROM Insurance
    GROUP by tiv_2015
    HAVING COUNT(tiv_2015) > 1),
uniqueCities AS (
    SELECT lat, lon
    FROM Insurance
    GROUP by lat, lon
    HAVING COUNT(*) = 1
    )
SELECT ROUND(SUM(tiv_2016), 2) AS tiv_2016
FROM Insurance RIGHT JOIN nonUniqueTiv15s USING(tiv_2015)
LEFT JOIN uniqueCities u USING(lat, lon)
WHERE u.lat IS NOT NULL