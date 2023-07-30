# Lemonade Change

At a lemonade stand, each lemonade costs <code>$5</code>. Customers are standing in a queue to buy from you and order one at a time (in the order specified by bills). Each customer will only buy one lemonade and pay with either a <code>$5</code>, <code>$10</code>, or <code>$20</code> bill. You must provide the correct change to each customer so that the net transaction is that the customer pays <code>$5</code>.

Note that you do not have any change in hand at first.

Given an integer array <code>bills</code> where <code>bills[i]</code> is the bill the <code>i<sup>th</sup></code> customer pays, return <code>true</code> *if you can provide every customer with the correct change, or* <code>false</code> *otherwise*.


**Example 1:**
>
> **Input:** bills = [5,5,5,10,20]
>
> **Output:** true
>
> **Explanation:**
>
> From the first 3 customers, we collect three $5 bills in order.
>
> From the fourth customer, we collect a $10 bill and give back a $5.
>
> From the fifth customer, we give a $10 bill and a $5 bill.
>
> Since all customers got correct change, we output true.

**Example 2:**
>
> **Input:** bills = [5,5,10,10,20]
>
> **Output:** false
>
> **Explanation:**
>
> From the first two customers in order, we collect two $5 bills.
>
> For the next two customers in order, we collect a $10 bill and give back a $5 bill.
>
> For the last customer, we can not give the change of $15 back because we only have two $10 bills.
>
> Since not every customer received the correct change, the answer is false.


**Constraints:**

- <code>1 &lt;= bills.length &lt;= 10<sup>5</sup></code>

- <code>bills[i]</code> is either <code>5</code>, <code>10</code>, or <code>20</code>.
