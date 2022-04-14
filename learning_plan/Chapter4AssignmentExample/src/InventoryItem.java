
/**
 * 
 * Inventory Item Interface to ensure all items behave appropriately
 * 
 * @author Josh Hayden
 *
 */
public interface InventoryItem {

	// Basic get/set functionality
	public String getName();
	public Double getWeight();
	public String getDescription();
	
	// User Interaction
	public void viewItem();
	public int useItem();
	
}
