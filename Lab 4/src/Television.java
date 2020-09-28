/**
 * The purpose of this class is to model a television Max Chiu and 09/20/2020
 * date
 */

public class Television {
	// The manufacturer attribute will hold the brand name. This cannot change once
	// the television is created, so will be a named constant.
	private final String MANUFACTURER;
	// The screenSize attribute will hold the size of the television screen.
	private final int SCREEN_SIZE;
	// The powerOn attribute will hold the value true if the power is on, and false
	// if the power is off.
	boolean powerOn = false;
	// The channel attribute will hold the value of the station that the television
	// is showing.
	int channel = 2;
	// The volume attribute will hold a number value representing the loudness (0
	// being no sound).
	int volume = 20;


	// Television() initializes the tv manufacturer and screen size of the tv
	public Television(String brand, int size) {
		MANUFACTURER = brand;
		SCREEN_SIZE = size;
	}

	/**
	* Sets the channel of the tv based on station 
	*
	* @param  channel number
	*/
	public void setChannel(int station) {
		channel = station;
	}
	
	/**
	* Toggles the power from on to off, from off to on
	*/
	public void power() {
		powerOn = !powerOn;
	}

	/**
	* Increases the volume by 1 
	*/
	public void increaseVolume() {
		volume += 1;
	}
	
	/**
	* Decreases the volume by 1
	*/
	public void decreaseVolume() {
		volume -= 1;
	}

	/**
	* returns channel
	* @return channel
	*/
	public int getChannel() {
		return channel;
	}

	/**
	* Returns volume
	* @return      the image at the specified 
	*/
	public int getVolume() {
		return volume;
	}

	/**
	* Returns manufacturer
	* 
	* @return manufacturer
	*/
	public String getManufacturer() {
		return MANUFACTURER;
	}
	
	/**
	* Returns screen size
	*
	* @return screen size
	*/
	public int getScreenSize() {
		return SCREEN_SIZE;
	}

}
