
##Make Change Project

##Overview
This code was written to simulate a cash register or self checkout kiosk. The user is asked to enter the cost of a product following which the user is asked to submit the amount of money used to buy the product (cash tendered). The change machine returns the amount of change the user should receive. Change is administered in dollar bills ($10, $5, and $1) and coin change (quarters, dimes, nickels, and pennies). Total cash tendered should not exceed twenty dollars, and change returned must be greater than zero or the user will receive an error message.

###Topics

*Taking User Input

Two types of input are taken from the user using a scanner: 1) Purchase price and 2) Cash tendered.

*Variables 
The initial variable given is changeA which denotes the total amount of change to be returned to the user. Following this initial variable, a series of methods are called (e.g. findTenDollars) to find the number of each type of cash/coin type (e.g. ten dollar bills, quarters). Remaining money left over following finding the amount of each cash type are also assigned variables.

*methods
Each method is similiar in setup. The main differences involve quantity of cash/coin type and variable names. General steps include identifying whether the coin or cash type is valid for the amount of change using cash/coin values. If valid, the amount of that type is found via simple division and integer casting. The amount is then  returned to the method.

*Print out
If amount tendered is greater than .01, less than 20, and change is greater than 0, the user will receive a message indicating how much change they will receive in each of the cash/coin types.
If amount tendered does not pass these checkpoints, the user will receive an error message.

* Instructions

User simply enters the purchase price and cash tendered. The computer will print an error message or list of the amount of cash/coin types the user will receive in return.
