import java.io.File;

import java.io.IOException;
import java.util.*;

/***
 * Holds all of the data for our garden (mainly via the garden)
 * that is in our program. Also how we load in the csv.
 * @author Noah Hodgson, Raj Trivedi, Luis Figueroa
 *
 */
public class ModelTwo { 
	static final int NAMESPOT = 0;
	static final int SUNSPOT = 1;
	static final int SOILSPOT = 2;
	static final int SIZESPOT = 3;
	Garden garden;
	ArrayList<Plant> trashBin;
	ArrayList<Plant> hotBarPlants;

	/***
	 * Initializes the instance variables for this class
	 */
	public ModelTwo(){
		this.garden = new Garden();
		this.trashBin = new ArrayList<>();
		try {
			this.hotBarPlants = getPlantsListFromFile("plants.csv");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/***
	 * Retrieves the List of plants from text file and returns it at the end
	 * @param filename the name of file to retrieve List of plants
	 * @return the List of plants after retrieving from File
	 * @throws IOException
	 */
	public ArrayList<Plant> getPlantsListFromFile(String filename) throws IOException {
		Scanner sc = new Scanner(new File(filename));
		ArrayList<Plant> plantsList = new ArrayList<>();
		while(sc.hasNextLine()) {
			String currLine = sc.nextLine();
			String[] parts = currLine.split(",");
			plantsList.add(new Plant(parts[NAMESPOT],0,0,parts[SUNSPOT],parts[SOILSPOT],parts[SIZESPOT]));
		}
		return plantsList;
	}

	/***
	 * Adds the plant with specified x and y coordinates into the Garden
	 * @param gX the x coordinate for plant
	 * @param gY the y coordinate for plant
	 * @param tba the plant to be added
	 */
	public void addToGarden(double gX, double gY, Plant tba) {
		garden.addPlant(tba, gX, gY);
	}

	/***
	 * Sets the current List of plants in the SideView with the given List of plants
	 * @param plants the List of plants to be set for
	 */
	public void setHotBar(ArrayList<Plant> plants) {
		this.hotBarPlants = plants;
	}

	/***
	 * Returns the most recent state of List of plants in the SideView
	 * @return the current instance for the List of plants in the SideView
	 */
	public ArrayList<Plant> getHotBarPlants() {
		return this.hotBarPlants;
	}

	/***
	 * Returns the most recent state of Garden
	 * @return the current instance of Garden
	 */
	public Garden getGarden() {
		return this.garden;
	}
	
	/***
	 * Setter for the garden. Used on loads.
	 * @param userSavedGarden Garden the user is loading in.
	 */
	public void setGarden(Garden userSavedGarden) {
		garden = userSavedGarden;
	}
}