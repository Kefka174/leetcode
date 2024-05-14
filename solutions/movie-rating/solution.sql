-- Table: Movies
-- +---------------+---------+
-- | Column Name   | Type    |
-- +---------------+---------+
-- | movie_id      | int     |
-- | title         | varchar |
-- +---------------+---------+
-- movie_id is the primary key (column with unique values) for this table.
-- title is the name of the movie.

-- Table: Users
-- +---------------+---------+
-- | Column Name   | Type    |
-- +---------------+---------+
-- | user_id       | int     |
-- | name          | varchar |
-- +---------------+---------+
-- user_id is the primary key (column with unique values) for this table.

-- Table: MovieRating
-- +---------------+---------+
-- | Column Name   | Type    |
-- +---------------+---------+
-- | movie_id      | int     |
-- | user_id       | int     |
-- | rating        | int     |
-- | created_at    | date    |
-- +---------------+---------+
-- (movie_id, user_id) is the primary key (column with unique values) for this table.
-- This table contains the rating of a movie by a user in their review.
-- created_at is the user's review date. 

(SELECT name AS results
    FROM Users JOIN MovieRating USING(user_id)
    GROUP BY user_id
    ORDER BY COUNT(movie_id) DESC, name
    LIMIT 1)
UNION ALL
(SELECT title AS results
    FROM Movies JOIN MovieRating USING(movie_id)
    WHERE DATE_FORMAT(created_at,'%M %Y') = "February 2020"
    GROUP BY movie_id
    ORDER BY AVG(rating) DESC, title
    LIMIT 1)