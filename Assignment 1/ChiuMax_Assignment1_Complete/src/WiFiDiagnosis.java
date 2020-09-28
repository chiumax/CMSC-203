
public final class WiFiDiagnosis {
	private static String[] diagnosePrompts = {
			"First step: reboot your computer",
			"Second step: reboot your router",
			"Third step: make sure the cables to your router are plugged in firmly and your router is getting power",
			"Fourth step: move your computer closer to your router",
			"Fifth step: contact your ISP\nMake sure your ISP is hooked up to your router"
	};
	
	private static String[] respectiveResolutionResponse = {
			"Rebooting your computer seemed to work",
			"Rebooting your router seemed to work",
			"Checking the router's cables seemed to work",
			"Moving your computer closer to your router seemed to work"
	};
	
	private static String firstFixPrompt = "\nAre you able to connect with the internet? (yes or no)";
	private static String fixPrompt = "\nNow are you able to connect with the internet? (yes or no)";
	
	private static int diagnosisIndex = 0;
	
	private WiFiDiagnosis() {
	}
	
	/**
	* Returns the next diagnose prompt along with the fix prompt question
	* @return      String of diagnosePrompt
	*/
	public static String getNextPrompt() {
		String returnText = diagnosePrompts[diagnosisIndex++];
		
		if(diagnosisIndex == 1) {
			return returnText+firstFixPrompt;
		} else if(diagnosisIndex == 5) {
			return returnText;
		}
		return returnText+fixPrompt;
	}
	
	/**
	* Returns the respective resolution response for the current diagnosis index
	* @return      String of respective resolution response
	*/
	public static String getRespectiveResolutionResponse() {
		return respectiveResolutionResponse[diagnosisIndex-1];
	}

	/**
	* Checks if there is another diagnose prompt available
	* @return      boolean if there is another diagnose prompt
	*/
	public static boolean doesNextExist() {
		return diagnosePrompts.length > diagnosisIndex;
	}
}
