package Entities;

public class contaBancaria {

	private int accountNumber;
	private String accountName;
	private double accountCash;
	
	
	
	public contaBancaria(int accountNumber, String accountName, double accountCash) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountCash = accountCash;
	}
	
	public contaBancaria() {
		//tive que instanciar uma classe default pois como criei uma classe fiha, preciso do default par an instanciar nada na classe filha
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	
	public double getAccountCash() {
		return accountCash;
	}
	public void setDeposito(double accountCash) {
		this.accountCash += accountCash;
	}
	public void setSaque(double accountCash) {
	this.accountCash = (this.accountCash - accountCash) - 5  ;
	}
	public void setValorInicial(double accountCash) {
		this.accountCash = accountCash;
	}
	
	
	
	
}
