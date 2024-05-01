-- Table: Activity
-- +--------------+---------+
-- | Column Name  | Type    |
-- +--------------+---------+
-- | player_id    | int     |
-- | device_id    | int     |
-- | event_date   | date    |
-- | games_played | int     |
-- +--------------+---------+
-- (player_id, event_date) is the primary key (combination of columns with unique values) of this table.
-- This table shows the activity of players of some games.
-- Each row is a record of a player who logged in and played a number of games (possibly 0) before logging out on someday using some device.

SELECT ROUND(COUNT(*) / (SELECT COUNT(DISTINCT player_id) FROM Activity), 2) AS fraction
FROM Activity a1 JOIN Activity a2 ON a1.player_id = a2.player_id
WHERE (a1.player_id, a1.event_date) IN (
    SELECT player_id, MIN(event_date)
    FROM Activity
    GROUP BY player_id
)
AND DATEDIFF(a1.event_date, a2.event_date) = -1