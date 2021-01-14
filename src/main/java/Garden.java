import java.util.*;

/***
 * Holds info relative to the garden such as its attributes, as well as a list of plants.
 * @author Noah Hodgson, Raj Trivedi, Luis Figueroa
 *
 */
public class Garden implements java.io.Serializable{
	private ArrayList<Plant> gardensPlants = new ArrayList<>();
	private String gardenLight;
	private String gardenSoil;
	private int gardenHeight;
	private int gardenWidth;
	private String bg;
	
	/***
	 * Adds the given Plant to a specified x and y coordinates
	 * @param p the Plant to be added
	 * @param x the x coordinate
	 * @param y the y coordinate
	 */
	public void addPlant(Plant p, double x, double y) {
		this.gardensPlants.add(new Plant(p.getName(), x, y, p.getPlantLight(), p.getPlantSoil(), p.getPlantSize()));
	}

	/***
	 * Returns the most recent Background Image file
	 * @return the File with the Background Image
	 */
	public String getBg() {
		return bg;
	}

	/***
	 * Sets the current Background Image file with the given Background Image File
	 * @param bg the File to set as a Background Image for a Garden
	 */
	public void setBg(String bg) {
		this.bg = bg;
	}
	
	/***
	 * Sets the current List of plants with the given List of plants 
	 * @param plants the List of plants to be initialized 
	 */
	public void setGardensPlants(ArrayList<Plant> plants) {
		this.gardensPlants = plants;
	}
	
	/***
	 * Getter for the plants in this garden
	 * @return the garden's plants
	 */
	public ArrayList<Plant> getGardensPlants() {
		return gardensPlants;
	}
	
	/***
	 * Setter for the garden's soil type
	 * @param string that represents the garden's soil type
	 */
	public void setGardensSoil(String string) {
		gardenSoil = string;
	}

	/***
	 * Setter for the garden's light type
	 * @param string that represents that garden's light type
	 */
	public void setGardensLight(String string) {
		gardenLight = string;
	}
	
	/***
	 * Getter for the garden's light type
	 * @return garden's light type
	 */
	public String getGardensLight() {
		return gardenLight;
	}
	
	/***
	 * Getter for the garden's soil type
	 * @return the garden's soil type
	 */
	public String getGardensSoil() {
		return gardenSoil;
	}

	/***
	 * Getter for the garden's height
	 * @return garden's height
	 */
	public int getHeight() {
		return gardenHeight;
	}
	
	/***
	 * Getter for the garden's width
	 * @return garden's widths
	 */
	public int getWidth() {
		return gardenWidth;
	}

	/***
	 * Setter for the garden's height
	 * @param h garden's new height
	 */
	public void setHeight(int h) {
		gardenHeight = h;
		
	}
	
	/***
	 * Setter for the garden's width.
	 * @param w garden's new width
	 */
	public void setWidth(int w) {
		gardenWidth = w;
	}
}