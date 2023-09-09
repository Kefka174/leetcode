# Online Stock Span

Design an algorithm that collects daily price quotes for some stock and returns **the span** of that stock's price for the current day.

The **span** of the stock's price in one day is the maximum number of consecutive days (starting from that day and going backward) for which the stock price was less than or equal to the price of that day.

- For example, if the prices of the stock in the last four days is <code>[7,2,1,2]</code> and the price of the stock today is <code>2</code>, then the span of today is <code>4</code> because starting from today, the price of the stock was less than or equal <code>2</code> for <code>4</code> consecutive days.

- Also, if the prices of the stock in the last four days is <code>[7,34,1,2]</code> and the price of the stock today is <code>8</code>, then the span of today is <code>3</code> because starting from today, the price of the stock was less than or equal <code>8</code> for <code>3</code> consecutive days.

Implement the <code>StockSpanner</code> class:

- <code>StockSpanner()</code> Initializes the object of the class.

- <code>int next(int price)</code> Returns the **span** of the stock's price given that today's price is <code>price</code>.


**Example 1:**
>
> **Input**
>
> ["StockSpanner", "next", "next", "next", "next", "next", "next", "next"]
>
> [[], [100], [80], [60], [70], [60], [75], [85]]
>
> **Output**
>
> [null, 1, 1, 1, 2, 1, 4, 6]
>
> **Explanation**
>
> StockSpanner stockSpanner = new StockSpanner();
>
> stockSpanner.next(100); // return 1
>
> stockSpanner.next(80);  // return 1
>
> stockSpanner.next(60);  // return 1
>
> stockSpanner.next(70);  // return 2
>
> stockSpanner.next(60);  // return 1
>
> stockSpanner.next(75);  // return 4, because the last 4 prices (including today's price of 75) were less than or equal to today's price.
>
> stockSpanner.next(85);  // return 6


**Constraints:**

- <code>1 &lt;= price &lt;= 10<sup>5</sup></code>

- At most <code>10<sup>4</sup></code> calls will be made to <code>next</code>.
