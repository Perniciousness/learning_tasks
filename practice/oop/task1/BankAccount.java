package practice.oop.task1;

/*
* Basic output to console irritates sonar lint.
* TODO: Change every sout and seut with logger.
* 
* This class can theoretically be abstract.
* In this case all getters and constructors
* would have to be protected, not public.
* But the unit tests wouldn't work...
* 
* Something is not right here, basic operations
* when used together are failing.
* TODO: Split giant test into several small ones
* to identify where the problem's at.
*/

public  class BankAccount {
    private double account;
    private Person holder;
    private String holderName;

    public double getAccount(){ return account; }
    public Person getHolder(){ return holder; }
    public String getHolderName(){ return holderName; }

    public BankAccount(String holder) {
        this.holder = new Person(holder);
        holderName = this.holder.getName();
        account = 0; // Empty by default
    }

    public double takeMoney(double cash) {
        if (account - cash < 0) {
            try {
                throw new EmptyBankAccountException(String.format("The requested bill exceeds the sum stored on your account, %s. Please, try again or contact our support for more information." + "\n", holderName));
            }
            catch (EmptyBankAccountException ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (cash <= 0) {
            try {
                throw new EmptyBankAccountException(String.format("Dear %s, please try again and enter a natural number as amount of money you can take." + "\n", holderName));
            }
            catch (EmptyBankAccountException ex) {
                System.out.println(ex.getMessage());
            }
        }
        account -= cash;
        System.out.println("Transaction successful.");
        return cash;
    }
    public void storeMoney(double cash){
        if (account < account + cash) {
            try {
                throw new EmptyBankAccountException(String.format("Dear %s, attempted stealing is still a crime. Please, check the entered value carefully and try again." + "\n", holderName));
            }
            catch (EmptyBankAccountException ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (cash <= 0) {
            try {
                throw new EmptyBankAccountException(String.format("Dear %s, please try again and enter a natural number as amount of money you can store." + "\n", holderName));
            }
            catch (EmptyBankAccountException ex) {
                System.out.println(ex.getMessage());
            }
        }

        account += cash;
        System.out.println("Transaction successful.");
    }

    private class Person {
        private final String name; // Name cannot be changed once assigned
        public Person(String name) { this.name = name; } // Constructor
        public String getName() { return name; } // Generic getter
    }
}

// Custom exception
class EmptyBankAccountException extends Exception {
    public EmptyBankAccountException(String s)
    {
        super(s);
    }
}