package de.uni.koeln.sse.se;

public class Glass implements HouseholdItem{
	
	String name;
	int lenght;
	int width;
	int height;
	int tickness;
	private float cost;
	
	public Glass(String name, int lenght, int width, int height, int tickness) {
		this.name = name;
		this.lenght = lenght;
		this.width = width;
		this.height = height;
		this.tickness = tickness;
	
	}



//Getters and Setters =

	public int getHeight() {
		return height;}

	public void setHeight(int height) {
		this.height = height;}

	public int getLenght() {
		return lenght;}

	public void setLenght(int lenght) {
		this.lenght = lenght;}

	public int getWidth() {
		return width;}

	public void setWidth(int width) {
		this.width = width;}

	public int getTickness() {
		return tickness;}

	public void setTickness(int tickness) {
		this.tickness = tickness;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public float getCost() {
		if (getTickness() == 1) {
			return cost += (float)getLenght()/100 * 2;
		} else if (getTickness() == 2) {
			return cost += (float)getLenght()/100 * 1.2;
		} else {
			return cost += (float)getLenght()/100 * 0.7;
		}
	}
	
	public void packingInstruction() {
		System.out.println(getName() + "\n > should be wrapped with Bubble wraps "
							+ "and packed in a box with dimension: " + getHeight() + "x" + getLenght()+"x" + getWidth());
		}


}
