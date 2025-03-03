# Encapsulation
**It’s the process of hiding the internal details of an object and providing a secure way to access and modify its data.**

### Encapsulation solves these problems by:
- **Protecting Data:** Preventing unauthorized access or modification of data.
- **Adding Control:** Allowing you to set rules (e.g., age cannot be negative, marks must be between 0 and 100).
- **Simplifying Code:** Making the code easier to understand and maintain.

**Exmaple:**
- Imagine you have a bank account with a balance of ₹10,000. Without encapsulation, anyone could directly access and change your balance:
``` Java
class BankAccount {
    public double balance = 10000; // Balance is public (not secure)
}
```
- Here, the balance is public, so anyone can modify it directly:
``` Java
BankAccount account = new BankAccount();
account.balance = 0; // Uh-oh! Someone just emptied your account!
```
- To encapsulate the balance, we:
    - Make the balance private.
    - Provide public methods (getters and setters) to access and modify the balance.
``` Java
class BankAccount {
    private double balance = 10000; // Balance is private (secure)

    // Getter method to access balance
    public double getBalance() {
        return balance;
    }

    // Setter method to modify balance
    public void setBalance(double amount) {
        if (amount > 0) { // Validation to ensure balance is not negative
            balance = amount;
        } else {
            System.out.println("Invalid amount!");
        }
    }
}
```

### Benefits of Encapsulation
- **Data Protection:** Prevents unauthorized access or modification of data.
- **Flexibility:** You can change the internal implementation (e.g., how balance is stored) without affecting other parts of the code.
- **Validation:** You can add rules (e.g., balance cannot be negative) to ensure data integrity.
- **Code Reusability:** Encapsulated code is easier to reuse in other projects..

## Encapsulation Example: 
``` Java
class PiggyBank {
    private double money;  // Private! No direct access

    public void addMoney(double amount) {
        if (amount > 0) {
            money += amount;
        } else {
            System.out.println("Nice try! Can't add negative money.");
        }
    }

    public void withdrawMoney(double amount) {
        if (amount > 0 && amount <= money) {
            money -= amount;
        } else {
            System.out.println("Sorry, not enough funds or invalid amount.");
        }
    }

    public double checkBalance() {
        return money;
    }
}

public class Main {
    public static void main(String[] args) {
        PiggyBank myBank = new PiggyBank();
        myBank.addMoney(100.0);  // Adding money
        myBank.withdrawMoney(50.0);  // Withdrawing money
        System.out.println("Balance: $" + myBank.checkBalance());
        
        myBank.addMoney(-50.0);  // Trying to add negative money
        myBank.withdrawMoney(1000.0);  // Trying to withdraw too much
    }
}
```