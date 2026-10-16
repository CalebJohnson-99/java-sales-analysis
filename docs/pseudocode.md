# Pseudocode
## Main Method
1. Initialize an array of strings named months with the 12 months.
2. Initialize an array of numbers named salesChange with the 12 monthly sales values.
3. Call the analyzeSales method, passing the two arrays into it.
## Sales Analysis
Method analyzeSales (Accepts: months array, salesChange array):

1. Initialize maxCombinedChange to negative infinity.
2. Initialize bestStartIndex to -1.
3. Initialize bestEndIndex to -1.

4. Loop through each month from the beginning to the end of the year to pick a start index:
    a. Initialize a currentWindowSum accumulator to 0.
    
    b. Loop forward from that start index to the end of the year to pick an end index:
        1. Add the sales value at the current end position to currentWindowSum.
        
        2. Compare: If currentWindowSum is greater than maxCombinedChange:
            - Update maxCombinedChange to equal currentWindowSum.
            - Set bestStartIndex to equal the current start index.
            - Set bestEndIndex to equal the current end index.
        
        3. Otherwise (if it is less or a tie), ignore and continue the loop.
        
5. Call the displayResults method, passing the month name at bestStartIndex, the month name at bestEndIndex, and the value of maxCombinedChange.
## Display Results
Method displayResults (Accepts: startMonth string, endMonth string, totalChange number):

1. Prints a message to the console showing the best starting month, ending month, and total change.
