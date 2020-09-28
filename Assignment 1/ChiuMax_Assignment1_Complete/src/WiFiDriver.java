import java.util.*;
public class WiFiDriver {

	public static void main(String[] args) {
		String userInput;
		Scanner in = new Scanner(System.in);
		
		System.out.println("This project will help you go through what steps you should follow when you do not have connectivity");		
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.");
		
		while(WiFiDiagnosis.doesNextExist()) {
			System.out.println(WiFiDiagnosis.getNextPrompt());
			if(!WiFiDiagnosis.doesNextExist()) {
				break;
			}
			if(in.nextLine().equals("yes")) {
				System.out.println(WiFiDiagnosis.getRespectiveResolutionResponse());
				break;
			}
		}
		
		System.out.println("Programmer: Max Chiu");
		System.out.println("Goodbye");
	}

}
