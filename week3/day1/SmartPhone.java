package week3.day1;

public class SmartPhone extends AndroidPhone {

	public void connectWhatsapp() {
		System.out.println("Whatsapp connected");

	}
	
	public void takeVideo(){
		
		System.out.println("Video captured in Smart Phone");
	}
	
	public static void main(String[] args) {
		
		SmartPhone smtPh = new SmartPhone();
		
		smtPh.sendMsg();
		smtPh.makeCall();
		smtPh.saveContact();
		smtPh.takeVideo();
		smtPh.connectWhatsapp();

	}

}
