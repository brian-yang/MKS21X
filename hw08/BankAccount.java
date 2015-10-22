public class BankAccount {
    private double balance;
    private int accountID;
    private String username, password;
    private int pin;

    public BankAccount(double balance, int accountID, String username, String password, int pin) {
	this.balance = balance;
	this.accountID = accountID;
	this.username = username;
	this.password = password;
	this.pin = pin;
    }

    public static void main(String[] args) {
	BankAccount john = new BankAccount(15.0, 123456789, "J0ker", "testing", 1010);
	// Bank info test
	System.out.println("Bank Info:");
	john.printBankInfo();
	System.out.println();

	// Mutator and accessor tests
	System.out.println("Username: " + john.getUsername());
	System.out.println("Account ID: " + john.getAccountID());
	System.out.println("Balance: " + john.getBalance());
	System.out.println();

	System.out.println("Bank Info:");
	john.setPassword("flag{bank_robber}");
	john.setPin(1337);
	john.printBankInfo();
	System.out.println();

	// Deposit and withdrawal tests
	john.deposit(100.0);
	System.out.println(john.withdraw(15.0));
	System.out.println();

	// toString test
	System.out.println(john.toString());
    }

    public void printBankInfo() {
	System.out.println(balance);
	System.out.println(accountID);
	System.out.println(username);
	System.out.println(password);
	System.out.println(pin);
    }

    /*
    Accessors
    */
    public double getBalance() {
	return balance;
    }
    public int getAccountID() {
	return accountID;
    }
    public String getUsername() {
	return username;
    }

    /*
    Mutators
    */
    public void setPassword(String newPassword) {
	password = newPassword;
    }
    public void setPin(int newPin) {
	pin = newPin;
    }

    public void deposit(double amount) {
	balance += amount;
    }

    // Should return false if balance is too low
    // If false, do no change balance at all
    public boolean withdraw(double amount) {
	if (balance - amount >= 100.0) {
	    balance -= amount;
	    return true;
	} else {
	    return false;
	}
    }

    public String toString() {
	return username + "\t" + accountID + "\t" + balance;
    }

}
