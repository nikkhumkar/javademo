package Dubugginh;

import java.io.Serializable;

public class Vehicle implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4226274886384227752L;
	private String type;
	private int number;
	public Vehicle(String type, int number) {
		
		this.type = type;
		this.number = number;
	}
	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", number=" + number + "]";
	}
	
	
}
