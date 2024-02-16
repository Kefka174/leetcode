# Design a Food Rating System

Design a food rating system that can do the following:

- **Modify** the rating of a food item listed in the system.

- Return the highest-rated food item for a type of cuisine in the system.

Implement the <code>FoodRatings</code> class:

- <code>FoodRatings(String[] foods, String[] cuisines, int[] ratings)</code> Initializes the system. The food items are described by <code>foods</code>, <code>cuisines</code> and <code>ratings</code>, all of which have a length of <code>n</code>.

- <ul>

- <li><code>foods[i]</code> is the name of the <code>i<sup>th</sup></code> food,</li>

- <li><code>cuisines[i]</code> is the type of cuisine of the <code>i<sup>th</sup></code> food, and</li>

- <li><code>ratings[i]</code> is the initial rating of the <code>i<sup>th</sup></code> food.</li>

- </ul>

- 

- <code>foods[i]</code> is the name of the <code>i<sup>th</sup></code> food,

- <code>cuisines[i]</code> is the type of cuisine of the <code>i<sup>th</sup></code> food, and

- <code>ratings[i]</code> is the initial rating of the <code>i<sup>th</sup></code> food.

- <code>void changeRating(String food, int newRating)</code> Changes the rating of the food item with the name <code>food</code>.

- <code>String highestRated(String cuisine)</code> Returns the name of the food item that has the highest rating for the given type of <code>cuisine</code>. If there is a tie, return the item with the **lexicographically smaller** name.

Note that a string <code>x</code> is lexicographically smaller than string <code>y</code> if <code>x</code> comes before <code>y</code> in dictionary order, that is, either <code>x</code> is a prefix of <code>y</code>, or if <code>i</code> is the first position such that <code>x[i] != y[i]</code>, then <code>x[i]</code> comes before <code>y[i]</code> in alphabetic order.


**Example 1:**
>
> **Input**
>
> ["FoodRatings", "highestRated", "highestRated", "changeRating", "highestRated", "changeRating", "highestRated"]
>
> [[["kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"], ["korean", "japanese", "japanese", "greek", "japanese", "korean"], [9, 12, 8, 15, 14, 7]], ["korean"], ["japanese"], ["sushi", 16], ["japanese"], ["ramen", 16], ["japanese"]]
>
> **Output**
>
> [null, "kimchi", "ramen", null, "sushi", null, "ramen"]
>
> **Explanation**
>
> FoodRatings foodRatings = new FoodRatings(["kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"], ["korean", "japanese", "japanese", "greek", "japanese", "korean"], [9, 12, 8, 15, 14, 7]);
>
> foodRatings.highestRated("korean"); // return "kimchi"
>
> // "kimchi" is the highest rated korean food with a rating of 9.
>
> foodRatings.highestRated("japanese"); // return "ramen"
>
> // "ramen" is the highest rated japanese food with a rating of 14.
>
> foodRatings.changeRating("sushi", 16); // "sushi" now has a rating of 16.
>
> foodRatings.highestRated("japanese"); // return "sushi"
>
> // "sushi" is the highest rated japanese food with a rating of 16.
>
> foodRatings.changeRating("ramen", 16); // "ramen" now has a rating of 16.
>
> foodRatings.highestRated("japanese"); // return "ramen"
>
> // Both "sushi" and "ramen" have a rating of 16.
>
> // However, "ramen" is lexicographically smaller than "sushi".


**Constraints:**

- <code>1 &lt;= n &lt;= 2 * 10<sup>4</sup></code>

- <code>n == foods.length == cuisines.length == ratings.length</code>

- <code>1 &lt;= foods[i].length, cuisines[i].length &lt;= 10</code>

- <code>foods[i]</code>, <code>cuisines[i]</code> consist of lowercase English letters.

- <code>1 &lt;= ratings[i] &lt;= 10<sup>8</sup></code>

- All the strings in <code>foods</code> are **distinct**.

- <code>food</code> will be the name of a food item in the system across all calls to <code>changeRating</code>.

- <code>cuisine</code> will be a type of cuisine of **at least one** food item in the system across all calls to <code>highestRated</code>.

- At most <code>2 * 10<sup>4</sup></code> calls **in total** will be made to <code>changeRating</code> and <code>highestRated</code>.
