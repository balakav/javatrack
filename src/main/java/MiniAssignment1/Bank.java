package MiniAssignment1;


class BankAccount {
    private int accno;
    private String accname;
    protected int balance;
    public BankAccount(int accno, String accname,int balance) {
        this.accno = accno;
        this.accname = accname;
        this.balance = balance; 
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(int amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public void getAccountInfo() {
        System.out.println("Account Number: " + accno);
        System.out.println("Account Holder: " + accname);
        System.out.println("Balance: " + balance);
    }
}
class SA extends BankAccount{
       private int r;

	public SA(int accno, String accname, int balance, int r) {
		super(accno, accname, balance);
		this.r = r;
	}
	public void FindInterst() {
		System.out.println("Interst: "+balance*(r/100.0));
	}
	
	
}
public class Bank {
    public static void main(String[] args) {
    	SA s=new SA(20,"BALA",10000,4);
    	s.FindInterst();
    	s.deposit(1000);
    	s.withdraw(200);
    	s.getAccountInfo();
    }
}
