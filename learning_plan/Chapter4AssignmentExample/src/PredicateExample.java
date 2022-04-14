import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Example of a proper use of a predicate functional interface
 * 
 * @author Josh Hayden
 *
 */
public class PredicateExample {
	
	// Predicate Example
	public static Predicate<Helmet> isFireResistant(){
		return p -> p.isFireResistant();
	}
	
	// Filter Method to better sort inventory
	public static List<Helmet> filterHelmets(List<Helmet> helmetInventory,
											 Predicate<Helmet> predicate){
		return helmetInventory.stream()
							  .filter(predicate)
							  .collect(Collectors.<Helmet>toList());
	}
	
	public static void main(String[] args) {
		
		// Create Helmets to store in Inventory
		Helmet cheapHelmet = new Helmet("Cheap Helmet", 15.00,
										"This is a cheap helmet that is rusting away.",
										false, false);
		
		Helmet iceHelmet = new Helmet("Ice Helmet", 35.00, 
							"This is a specially insulated helmet to protect against harsh weather.",
							false, true);
		
		Helmet fireHelmet = new Helmet("Fire Helmet", 25.22, 
									   "This is a specially shielded helmet to protect against dragons.",
									   true, false);
		
		Helmet titaniumHelmet = new Helmet("Titanium Helmet", 55.55,
									       "An heavy, but well-made helmet to protect against the elements.",
									       true, true);
		
		//  Create Helmet Array List
		List<Helmet> helmetInventory = new ArrayList<Helmet>();
		helmetInventory.add(cheapHelmet);
		helmetInventory.add(iceHelmet);
		helmetInventory.add(fireHelmet);
		helmetInventory.add(titaniumHelmet);
		
		System.out.println("You are heading into the lava level! These are your recommended helmets:");
		System.out.println(filterHelmets(helmetInventory, isFireResistant()));
		
		
		
	}

}
