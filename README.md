# ATM Simulation Project

A simple Java-based ATM simulation program with authentication, account selection, and basic banking operations.

## Features

- User authentication with predefined user IDs and PINs
- Account type selection (Savings/Checking)
- Banking operations:
  - Credit (deposit)
  - Debit (withdrawal)
  - Check balance
- Secure session handling with exit option
---
## How its work

1. **Start**: The program begins and displays a welcome message.
2. **User  Input**: Prompts the user for User ID and PIN.
3. **Authentication**: Checks the credentials against a predefined list.
   - If valid, proceeds to account type selection.
     - If invalid, displays an error message.
4. **Account Type Selection**: User selects:
     - Savings Account (Option 1)
     - Checking Account (Option 2)
     - Exit (Option 3)
  5. **Banking Operations** (if Savings Account is selected):
     - User can choose to credit, debit, or check balance.
  6. **Looping**: Continues to prompt for User ID and PIN until exit is selected.
  7. **End**: Displays a thank you message and terminates the program.
   ---  
## Sample output

```
Welcome to my ATM project.
Enter user ID: 1013605
Enter the pin number: 8952
Say your account type:  
 1.Savings Account 
 2.Checking Account  
 3.exit
1
Enter the Operation: 
 1.credit 
 2.Debit 
 3.View balance
1
Enter amount to credit: 
24000
Amount credited!Balance: 24000
Say your account type:  
 1.Savings Account 
 2.Checking Account  
 3.exit
1
Enter the Operation: 
 1.credit 
 2.Debit 
 3.View balance
2
Enter amount to debit: 
2000
Amount debited!Balance: 22000
Say your account type:  
 1.Savings Account 
 2.Checking Account  
 3.exit
2
Balance: 22000
Say your account type:  
 1.Savings Account 
 2.Checking Account  
 3.exit
3
Thank you! Come again
```
 

