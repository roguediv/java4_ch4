/**
 * Generic Helmet Inventory Item
 * 
 * @author Josh Hayden
 *
 */
public class Helmet implements InventoryItem {
	
	private String name;
	private Double weight;
	private String description;
	private boolean fireResistant;
	private boolean iceResistant;

	@Override
	public String getName() { return name; }

	@Override
	public Double getWeight() { return weight; }

	@Override
	public String getDescription() { return description; }
	
	@Override
	public void viewItem() {
		// TODO Auto-generated method stub
	}

	@Override
	public int useItem() {
		return 0;
	}
	
	@Override
	public String toString() {
		return this.name + ". Weight: " + this.weight;
	}
	
	public boolean isFireResistant() { return fireResistant; }
	public boolean isIceResistant() { return iceResistant; }
	
	public Helmet(String name, Double weight, String description, boolean fireResistant, boolean iceResistant) {
		this.name = name;
		this.weight = weight;
		this.description = description;
		this.fireResistant = fireResistant;
		this.iceResistant = iceResistant;
	}


}
