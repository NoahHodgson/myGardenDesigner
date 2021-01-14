
/***
 * This is a plant. Its name corresponds with an image so we can make lots of
 * happy little plants. Has the attributes needed for a good garden.
 * @author Noah Hodgson, Raj Trivedi, Luis Figueroa
 *
 */
public class Plant implements java.io.Serializable {
	private String name;
	private double xLoc;
	private double yLoc;
	private String plantLight;
	private String plantSoil;
	private String plantSize;
	private int id;
	
	/***
	 * Initializes the instance variables of Plant with the given parameters
	 * 
	 * @param name the name of plant
	 * @param xLoc the x coordinate of plant
	 * @param yLoc the y coordinate of plant
	 * @param pLight the amount of light for plant
	 * @param pSoil the amount of soil for plant
	 * @param pSize the size of plant
	 */
	public Plant(String name, double xLoc, double yLoc, String pLight, String pSoil, String pSize){
		this.name = name;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		this.plantLight = pLight;
		this.plantSoil = pSoil;
		this.plantSize = pSize;
	}
	

	/***
	 * Returns x coordinate of plant
	 * @return the current x coordinate
	 */
	public double getXLoc() {
		return this.xLoc;
	}

	/***
	 * Returns y coordinate of plant
	 * @return the current y coordinate
	 */
	public double getYLoc() {
		return this.yLoc;
	}
	
	/***
	 * Sets the x coordinate from the given value
	 * @param d the x coordinate to set
	 */
	public void setXLoc(double d) {
		this.xLoc = d;
	}
	
	/***
	 * Sets the y coordinate from the given value
	 * @param d the y coordinate to set
	 */
	public void setYLoc(double d) {
		this.yLoc = d;
	}
	
	/***
	 * Returns the name of plant
	 */
	public String toString() {
		return name;
	}

	/***
	 * Getter for the plant's ID
	 * @return the plant's ID
	 */
	public int getID() {
		return id;
	}
	
	/***
	 * Getter for the plant's size
	 * @return the plant's size
	 */
	public String getPlantSize() {
		return plantSize;
	}

	/***
	 * Setter for the plant's ID
	 * @param identifier the ID the plant is being assigned
	 */
	public void setID(int identifier) {
		this.id = identifier;
	}

	/***
	 * Getter for the plant's light type
	 * @return the plant's light type
	 */
	public String getPlantLight() {
		return plantLight;
	}
	
	/***
	 * Getter for the plant's soil type
	 * @return the plant's soil type
	 */
	public String getPlantSoil() {
		return plantSoil;
	}
	
	/***
	 * Getter for the plant's name
	 * @return the plant's name
	 */
	public String getName() {
		return name;
	}
}
