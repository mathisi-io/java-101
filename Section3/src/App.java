
public class App {

	public static void main(String[] args) {
		String trafficLight;
		String action = "";
		
		trafficLight = "RED";
		
		if (trafficLight.equals("GREEN")) {
			action = "GO ON...";
		} else if (trafficLight.equals("RED")){
		  action = "STOP NOW";
		} else {
			action = "PAY ATTENTION!!!!";
		}
		
		
		System.out.println(action);

	}

}
