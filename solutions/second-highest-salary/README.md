# Second Highest Salary

Table: <code>Employee</code>
>
> +-------------+------+
>
> | Column Name | Type |
>
> +-------------+------+
>
> | id          | int  |
>
> | salary      | int  |
>
> +-------------+------+
>
> id is the primary key (column with unique values) for this table.
>
> Each row of this table contains information about the salary of an employee.


Write a solution to find&nbsp;the second highest **distinct** salary from the <code>Employee</code> table. If there is no second highest salary,&nbsp;return&nbsp;<code>null (return&nbsp;None in Pandas)</code>.

The result format is in the following example.


**Example 1:**
>
> **Input:**
>
> Employee table:
>
> +----+--------+
>
> | id | salary |
>
> +----+--------+
>
> | 1  | 100    |
>
> | 2  | 200    |
>
> | 3  | 300    |
>
> +----+--------+
>
> **Output:**
>
> +---------------------+
>
> | SecondHighestSalary |
>
> +---------------------+
>
> | 200                 |
>
> +---------------------+

**Example 2:**
>
> **Input:**
>
> Employee table:
>
> +----+--------+
>
> | id | salary |
>
> +----+--------+
>
> | 1  | 100    |
>
> +----+--------+
>
> **Output:**
>
> +---------------------+
>
> | SecondHighestSalary |
>
> +---------------------+
>
> | null                |
>
> +---------------------+
