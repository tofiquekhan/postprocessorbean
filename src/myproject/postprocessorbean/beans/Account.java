package myproject.postprocessorbean.beans;

public class Account {

	private String accNo;
	private String accHolderName;
	private String accType;
	private int balance;
	private String accHolderEmail;
	private String accHolderMobileNo;
	
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getAccHolderEmail() {
		return accHolderEmail;
	}
	public void setAccHolderEmail(String accHolderEmail) {
		this.accHolderEmail = accHolderEmail;
	}
	public String getAccHolderMobileNo() {
		return accHolderMobileNo;
	}
	public void setAccHolderMobileNo(String accHolderMobileNo) {
		this.accHolderMobileNo = accHolderMobileNo;
	}
	
	public void getAccountDetails() {
		System.out.println("Account Details");
		System.out.println("------------------------------------");
		System.out.println("Account Number 			: "+accNo);
		System.out.println("Account Holder Name		: "+accHolderName);
		System.out.println("Account Type 			: "+accType);
		System.out.println("Account Balance  		: "+balance);
		System.out.println("Account Holder Email	: "+accHolderEmail);
		System.out.println("Account Holder mobile	: "+accHolderMobileNo);
		
		
	}
}
