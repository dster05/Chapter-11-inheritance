import java.util.*;
public class SimpleGeometricObject {
	
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	//Construct a default geometric object
	public SimpleGeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	//Construct a geometric object with the specified color and filled value
	public SimpleGeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
		
	}
	public String getColor() {
		return color;
	}
	
	//set a new color
	public void setColor(String color) {
		this.color = color;
	}
	
	//return filled. since filled si boolean its getter method is named isfilled
	public boolean isFilled() {
		return filled;
	}
	
	/** Set a new filled */
	public void setFilled(boolean filled) {
	this.filled = filled;
	 }
	
	//Get dateCreated
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	
	//return a string representation of this object
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color+ " and filled " + filled; 
	}


}
