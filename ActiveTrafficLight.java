/* Tania Torres
 * 2606825 | Spring 2020
 * Professor Keith
 * Traffic Lights assignments
 */
public class ActiveTrafficLight {

	public static void main(String[] args) {
		String lightColor = "Red";
		boolean isFlashing = false;
		
		TrafficLight myTrafficLight = new TrafficLight(lightColor, isFlashing);
		
		myTrafficLight.setLightColor("Green");
		System.out.println(myTrafficLight);
		
		myTrafficLight.setLightColor("Yellow");
		System.out.println(myTrafficLight);
		
		myTrafficLight.setIsFlashing(true);
		System.out.println(myTrafficLight);
	}

}