
public class Property {
	private String city;
	private String owner;
	private String propertyName;
	private double rentAmount;
	private Plot plot;

	public Property() {
		city = "";
		owner = "";
		propertyName = "";
		rentAmount = 0;
		plot = new Plot();
	}

	public Property(Property p) {
		city = p.city;
		owner = p.owner;
		propertyName = p.propertyName;
		rentAmount = p.rentAmount;
		plot = new Plot(p.plot);
	}

	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.propertyName = propertyName;
		this.owner = owner;
		this.city = city;
		this.rentAmount = rentAmount;
		this.plot = new Plot();
	}

	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width,
			int depth) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot(x, y, width, depth);
	}

	public String getCity() {
		return city;
	}

	public String getOwner() {
		return owner;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public double getRentAmount() {
		return rentAmount;
	}

	public Plot setPlot(int x, int y, int width, int depth) {
		plot.setX(x);
		plot.setY(y);
		plot.setWidth(width);
		plot.setDepth(depth);
		return plot;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}

	public String toString() {
		return "Property Name: " + propertyName + "\n Located in " + city + "\nBelonging to: " + owner
				+ "\nRent Amount: " + String.format("%.1f", rentAmount);
	}

	public Plot getPlot() {
		return plot;
	}
}
