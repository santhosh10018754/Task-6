package task6;

class Account {
	private double balance;  
	private int accNo;
	
	
	public Account() {
	}


	public Account(double balance, int accNo) {
		this.balance = balance;
		this.accNo = accNo;
	}



	public double checkBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public int getAccNo() {
		return accNo;
	}


	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}


	public double withdraw(double withdraw) {
		if (balance >= withdraw) {
			this.balance = balance-withdraw;
			return withdraw;
		}else {
			System.err.println("Insufficiant Balance");
			return -1;
		}
	}
	
	public void deposit(double deposit) {
		balance += deposit;
		}
	}


public class AccountDetails {

	public static void main(String[] args) {
Account acc = new Account(5000,100001);
		
		System.out.println("Balance: "+acc.checkBalance());
		acc.deposit(1000);
		System.out.println("Withdraw: "+acc.withdraw(500));
		System.out.println("Balance: "+acc.checkBalance());

	}

}
