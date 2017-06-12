package jets;

/**
 * @author Jake Paul 
 * 		
 * 		   This is the abstract class that will allow for all Aircraft in my
 *         Jets program to have shared traits such as a name, land speed, range, 
 *         price, and a Model.
 */
public abstract class Aircraft {

	protected double speed, range, price;
	protected String model;

	public Aircraft(String model, double speed, double range, double price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public double getAirSpeed() {
		double x = speed / 767.269;
		return x;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getRange() {
		return range;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nModel = ");
		builder.append(model);
		builder.append("\nAircraft speed = ");
		builder.append(speed);
		builder.append("MPH\nRange = ");
		builder.append(range);
		builder.append(" linear Miles\nPrice = $");
		builder.append(price);
		return builder.toString();
	}

	public void setRange(double range) {
		this.range = range;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
