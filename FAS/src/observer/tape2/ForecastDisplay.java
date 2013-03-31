package observer.tape2;

public class ForecastDisplay implements Observer, DisplayElement{
	
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
		}

	@Override
	public void display() {
		//System.out.println("Current conditions: "+ temperature + "C degrees and "+ humidity+ "% humidity");
		
	}

		
		/**
		 */
		public ForecastDisplay(Subject weatherData){
			this.weatherData = weatherData;
			weatherData.registerObserver(this);
		}
}
