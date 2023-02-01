package OppsPractice;
class Bank{
	int getRateOfInterest() {
		return 0;
	}
}

 class SBI extends Bank{
	 int getRateOfInterest() {
			return 8;
		}
 }
 
 class HDFC extends Bank{
	 int getRateOfInterest() {
			return 7;
		}
 }
 
 class ICICI extends Bank{
	 int getRateOfInterest() {
			return 9;
		}
 }
 
public class MethOverRiding2 {

	public static void main(String[] args) {
		SBI sbi = new SBI();
		HDFC hdfc = new HDFC();
		ICICI icici =new ICICI();
		
		System.out.println("SBI RATE OF INTEREST =" +sbi.getRateOfInterest());
		System.out.println("HDFC RATE OF INTEREST =" +hdfc.getRateOfInterest());
		System.out.println("ICICI RATE OF INTEREST =" +icici.getRateOfInterest());

	}

}
