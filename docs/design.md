# Design
## Problem Description
The program is meant to identify the most profitable consecutive period of sales for a company over a year. The data the program will require is the months names and the monthly sales change for each of those months. The program needs to produce the starting month of the profitable period, the end month of the period, and the max combined sales change during that period. 

## Data Design
For the month names I will store them in a array of strings starting for the January and ending in December in order. For the sales Value I'll use a double array matching the order to the months. Since the arrays are in parallel and there index's follow the same months from index 0-11 the index's should line up and represent each individual month and the sales change for that month. Ill have to make a variable to calculate the running total of a period and make another one to keep track of the highest total found. Ill have to make two more variables one to track the starting index and one to track the finishing index of the best period. To prevent a tie ill have to make a check that only checks for a greater than so if there is a tie it would be ignored.

The program is going to be organized it to three methods main, analyzeSales, and displayResults. The main will be used for the month and sale change arrays and to execute the program. The analyzeSales will be were most the logic and loops will be to find the best period. The displayResults will be used to output the best period stating month, finishing month, and the max total change.

Program Flow: Start -> Create parallel arrays -> Analyze consecutive periods -> Calculate totals -> compare and ignore ties -> store best period -> Display results -> End
