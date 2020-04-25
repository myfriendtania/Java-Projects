/* Tania Torres
 * 2606825 | Spring 2020
 * Professor Keith
 * Traffic Lights assignments
 */

public class TrafficLight {

	String lightColor;
	boolean isFlashing;
	
	// Constructor
	TrafficLight(String lightColor, boolean isFlashing) {
		this.lightColor = lightColor;
		this.isFlashing = isFlashing;
	}
	
	public void setLightColor(String lightColor) {
		this.lightColor = lightColor;
	}
	
	public String getLightColor() {
		return this.lightColor;
	}
	
	public void setIsFlashing(boolean isFlashing) {
		this.isFlashing = isFlashing;
	}
	
	public boolean getIsFlashing() {
		return this.isFlashing;
	}

	@Override
	public String toString() {
		return "Light is " + lightColor + " - Flashing = " + isFlashing;
	}
	
}
