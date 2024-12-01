# Delete Duplicate Emails

Table: <code>Person</code>
>
> +-------------+---------+
>
> | Column Name | Type    |
>
> +-------------+---------+
>
> | id          | int     |
>
> | email       | varchar |
>
> +-------------+---------+
>
> id is the primary key (column with unique values) for this table.
>
> Each row of this table contains an email. The emails will not contain uppercase letters.


Write a solution to** delete** all duplicate emails, keeping only one unique email with the smallest <code>id</code>.

For SQL users, please note that you are supposed to write a <code>DELETE</code> statement and not a <code>SELECT</code> one.

For Pandas users, please note that you are supposed to modify <code>Person</code> in place.

After running your script, the answer shown is the <code>Person</code> table. The driver will first compile and run your piece of code and then show the <code>Person</code> table. The final order of the <code>Person</code> table **does not matter**.

The result format is in the following example.


**Example 1:**
>
> **Input:**
>
> Person table:
>
> +----+------------------+
>
> | id | email            |
>
> +----+------------------+
>
> | 1  | john@example.com |
>
> | 2  | bob@example.com  |
>
> | 3  | john@example.com |
>
> +----+------------------+
>
> **Output:**
>
> +----+------------------+
>
> | id | email            |
>
> +----+------------------+
>
> | 1  | john@example.com |
>
> | 2  | bob@example.com  |
>
> +----+------------------+
>
> **Explanation:** john@example.com is repeated two times. We keep the row with the smallest Id = 1.
