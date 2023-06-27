### DQL - Data Query Language

#### LVL 1

1. **Selecting data:**\
   Write a query to select all records from the 'actor' table.

2. **Where clause:**\
   Write a query to fetch all movies in the 'film' table that are rated 'R'. Use the WHERE clause.

3. **Joining tables:**\
   Write a query to join the 'film' table and the 'language' table to show the film title and the language of each film.

4. **Ordering data:**\
   Write a query to list all stores in the 'store' table in ascending order of their address ID.

5. **Grouping data:**\
   Write a query to count the number of films in each rating category in the 'film' table. Use the GROUP BY clause.

6. **Aggregate functions:**\
   Write a query to find the average rental rate of films in the 'film' table.

7. **Subqueries:**\
   Write a query to find films in the 'film' table with a rental rate higher than the average rental rate.

8. **Inserting data:**\
   Insert a new record into the 'customer' table with appropriate values.
   This should include customer first name, last name, email, address id and store id at least.

9. **Updating data:**\
   Update the 'rental_rate' of film 'ALICE FANTASIA' in the 'film' table to 2.99

#### LVL 2

1. **Complex Joins:**
   Write a query that joins 'film', 'inventory', and 'rental' tables to fetch the films that have never been rented out.

2. **Pattern Matching:**
   Write a query to find customers in the 'customer' table whose first name starts with 'A' and ends with 'S'.\
   Use `LIKE` operator.

3. **Date Functions:**
   Find the customers who have a rental from the 'rental' table due within the last 7 days.

4. **Use of CASE Statement:**
   Write a query to categorize films from the 'film' table into 'SHORT' (length < 60), 'NORMAL' (length between 60 and
   120), and 'LONG' (length > 120) using the `CASE` statement.

5. **Having Clause:**
   Write a query to list the categories from the 'category' table that have more than 100 films.\
   Use the `HAVING` clause.

6. **Complex Aggregate Functions:**
   Find the total rental duration for each customer by summing up the rental duration of all films they've rented.
   Display the top 10 customers with the highest total rental duration.

7. **Nested Queries:**
   Write a query to find films in the 'film' table that have a rental rate within the top 10% of rental rates.

8. **Using LIMIT and OFFSET:**
   Fetch 10 films starting from the 11th highest length film in the 'film' table.

9. **Updating using subqueries:**
   Increase the rental_rate by 10% for films in the 'film' table that have been rented out more than the average number
   of rentals.

10. **Creating Views:**
    Create a view that joins the 'customer', 'rental', and 'payment' tables and shows each customer's email, total
    number of rentals, and total amount paid.

