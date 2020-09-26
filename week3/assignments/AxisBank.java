package week3.assignments;

public class AxisBank extends BankInfo{
	
	
	public void deposit(int d) {
		System.out.println("AxisBank deposit:"+d);

	}
	
	public static void main(String[] args) {
		
		AxisBank aB = new AxisBank();
		aB.deposit(5000);
		
		BankInfo bI = new BankInfo();
		bI.deposit(10000);
		aB.fixed(50000);
		aB.saving(100000);
		
	}
	

}
