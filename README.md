# Spending tracker

## Function
- The app allows for users to record spending by categories and has a graphical 
demonstration of spending trend and a comparison to the proposed budget.
- The app allows for users to compare between monthly spending totals.

## Personal interest
- I'm interested in controlling my spending recently and have found the apps i'm using to be inaccurate.
- I want to keep my spending habit private

## User stories

In the context of a person interested in controlling spending
- I want to add a spending in the app with its category an arbitrary number of times. 
- I want to select a category and see all the transactions with date and amount with the chosen month.
- I want to select a category and see the total amount of spending in selected month 
- I want to view the total amount of spending in the selected month
- I want to save all the transactions to file
- I want to be able to access the previous transactions when reopen the program.

# Instructions for Grader

- You can generate the first required event related to adding Xs to a Y by 
entering all blank inputs and press add spending button
- You can generate the second required event related to adding Xs to a Y by enter year, month, category and 
and press view transactions in category
- You can generate the third required event related to adding Xs to a Y by enter year, month and
    and press view total amount in selected month
- You can locate my visual component by on the top left of the window
- You can save the state of my application by pressing save
- You can reload the state of my application by pressing load

# Phase 4: Task 2
Fri Dec 02 15:30:47 PST 2022
Added a spending


Fri Dec 02 15:30:54 PST 2022
Added a spending


Fri Dec 02 15:30:58 PST 2022
Checked all transactions


Fri Dec 02 15:30:59 PST 2022
Checked the total amount of spending in month 12 year 2020


Fri Dec 02 15:31:00 PST 2022
Checked list of spending in month 12 year 2020 in category cat2

# Phase 4: Task 3

- In Spendings class, the following methods: transactionsInMonthInCategory(),spendingByCategoryInXMonthYear(), could 
be designed as one method because there are a lot of overlap in these two functions. We can have two loops, one of them
calculates total amount of spending in year, month by category, and the other one simply sums the totals we get in that loop.
- I could have used the date class built in Java to represents the date instead of year, month, day. 
It would make the code easier to read.
- I could have different classes of UI. For example, I could have a class called DateUI with everything related to day, 
month, year, DataAccessUI class with load, save and display all button. 
