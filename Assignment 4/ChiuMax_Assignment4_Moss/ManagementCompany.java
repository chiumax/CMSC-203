import java.util.ArrayList;

public class ManagementCompany {
	private int MAX_PROPERTY = 5;
	private double mgmFeePer;
	private String name;
	private ArrayList<Property> properties;
	private String taxID;
	private int MGMT_WIDTH = 10;
	private int MGMT_DEPTH = 10;
	private Plot plot;

	// constructors
	public ManagementCompany() {
		name = "";
		taxID = "";
		mgmFeePer = 0;

		plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		properties = new ArrayList<Property>(MAX_PROPERTY);
	}

	public ManagementCompany(String name, String taxID, double mgmFee) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFee;

		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		properties = new ArrayList<Property>(MAX_PROPERTY);
	}

	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFee;

		plot = new Plot(x, y, width, depth);
		properties = new ArrayList<Property>(MAX_PROPERTY);
	}

	public ManagementCompany(ManagementCompany otherCompany) {
		name = otherCompany.getName();
		taxID = otherCompany.getTaxID();
		mgmFeePer = otherCompany.getMgmFeePer();

		plot = new Plot(otherCompany.getPlot());
		properties = new ArrayList<Property>(MAX_PROPERTY);

		for (Property property : otherCompany.getProperties()) {
			properties.add(new Property(property));
		}
	}

	// methods
	public int addProperty(Property property) {
		if (properties.size() == MAX_PROPERTY) {
			return -1;
		}
		if (property == null) {
			return -2;
		}
		if (!plot.encompasses(property.getPlot())) {
			return -3;
		}
		for (Property curr_prop : properties) {
			if (curr_prop.getPlot().overlaps(property.getPlot())) {
				return -4;
			}
		}
		Property p = new Property(property);
		properties.add(p);
		return properties.indexOf(p);
	}

	public int addProperty(String name, String city, double rent, String owner) {
		return addProperty(new Property(name, city, rent, owner));
	}

	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
		return addProperty(name, city, rent, owner, x, y, width, depth);
	}

	public String displayPropertyIndex(int i) {
		// assuming that a property exists at i or if i is valid
		return properties.get(i).toString();
	}

	public double maxRentProp() {
		double maxRent = properties.get(0).getRentAmount();
		for (Property property : properties) {
			if (property.getRentAmount() > maxRent) {
				maxRent = property.getRentAmount();
			}
		}
		return maxRent;
	}

	public int maxRentPropertyIndex() {
		int index = 0;
		double maxRent = properties.get(0).getRentAmount();
		for (int i = 0; i < properties.size(); i++) {
			if (maxRent < properties.get(i).getRentAmount()) {
				maxRent = properties.get(i).getRentAmount();
				index = i;
			}
		}
		return index;
	}

	public double totalRent() {
		double total = 0;
		for (Property property : properties) {
			total += property.getRentAmount();
		}
		return total;
	}

	public String toString() {
		String returnString = "";
		double totalFee = 0;
		returnString += "List of the properties for " + name + ", taxID: " + taxID
				+ "\n ______________________________________________________\n";
		for (Property property : properties) {
			returnString += property.toString() + "\n";
			totalFee += mgmFeePer * 0.01 * property.getRentAmount();
		}
		returnString += " \n______________________________________________________";
		returnString += "\ntotal management Fee: " + String.format("%.1f", totalFee);
		return returnString;
	}

	// getters
	public Plot getPlot() {
		return plot;
	}

	public int getMAX_PROPERTY() {
		return MAX_PROPERTY;
	}

	public ArrayList<Property> getProperties() {
		return properties;
	}

	public double getMgmFeePer() {
		return mgmFeePer;
	}

	public String getName() {
		return name;
	}

	public String getTaxID() {
		return taxID;
	}
}
