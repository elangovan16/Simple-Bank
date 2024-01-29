# Simple Bank

## Overview

* The Banking Application is a console-based Java program that simulates basic banking operations. Users can create accounts, log in, check balances, and perform deposits and withdrawals. The application is designed to be a learning resource and can serve as a starting point for more complex banking systems.

### Offering options
1. Login: Allows existing users to log in.

2. Create Account: Allows new users to create an account.

3. Exit: Closes the application.

### Creating an Account

* If you choose to create an account:

* Enter your name.

* Provide an initial deposit amount.

* Your account will be created with a unique ID, and you'll see account details.

### Logging In

* If you choose to log in:

* Enter your customer ID.

* If the ID is valid, you'll be logged in, and you can perform various operations.

1. Account Operations Once logged in, you can:

    * Check your balance.
    
    * Deposit money into your account.
    
    * Withdraw money from your account.
    
    * View previous transactions.
2. Features

* Account creation and login functionality.
    * Balance checking.
    
    * Deposit and withdrawal operations.
    
    * Transaction history tracking.
----

```
+-------------------+     +------------------------+    +--------------------------+    +-----------------------+
|      Customer     |     |   BankRepository       |    |          Get             |    |      BankView         |
+-------------------+     +------------------------+    +--------------------------+    +-----------------------+
| - customerName    |     | - customers: Map       |    | + getId(): int           |    | - bankViewModel:      |
| - balance         |-----|  - getCustomers(): Map |    | + getInt(): int          |    |   BankViewModel       |
| - customerId      |     |   - addCustomers(cus)  |    +--------------------------+    +-----------------------+
| -transaction: List|     |   - getCustomer(id)    |
+-------------------+     +------------------------+

+---------------------------+     +-----------------------------+    +-----------------------------+
|    CreateAccountViewModel |     |       LoginViewModel        |    |        BankViewModel        |
+---------------------------+     +-----------------------------+    +-----------------------------+
| - createAccountView       |     | - loginView                 |    | - bankView                  |
+---------------------------+     +-----------------------------+    +-----------------------------+
| + createAccount(cus)      |     | + getCustomer(id)           |    |                             |
+---------------------------+     | + deposit(cus, n)           |    |                             |
                                  | + withdraw(cus, amt)        |    |                             |
                                  +-----------------------------+    +-----------------------------+

```