package day1.classroom;

public class Mobile {

	public boolean makeCall (int a){ 
		System.out.println("Call picked");
		return true;
	}
	public String sendSms (String sms) { 
		System.out.println("texted");
		return "Message";
	}
	public void shutDown (){ 
		System.out.println("Shutting down");
	}
	public static void main(String[] args) {
		Mobile features = new Mobile();
		boolean a = features.makeCall(12345);
		System.out.println(a);
		String sms = features.sendSms("Hi");
		System.out.println("sms");
		features.shutDown();
	}
}
