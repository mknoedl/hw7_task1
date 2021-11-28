package de.uni.koeln.sse.se;

public class Electronic implements HouseholdItem {

    String name;

    int lenght;
    int width;
    int height;
    int weight;
    private float cost;

    Boolean fragile;


    public Electronic(String name, int lenght, int width, int height, int weight, Boolean fragile) {
        this.name = name;
        this.lenght = lenght;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.fragile = fragile;
    }


//Getters and Setters

    public int getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(Integer lenght) {
        this.lenght = lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getFragile() {
        return fragile;
    }

    public void setFragile(Boolean fragile) {
        this.fragile = fragile;
    }
	
	public float getCost() {
		if (getFragile() == true) {
			return cost = (float) getWeight() / 10 * 5;
		} else {
			return cost = (float) getWeight() / 15 * 5;
		}
	}

	public void packingInstruction() {
		System.out.println(getName() + "\n > should be covered in Polyethylene foam film "
				+ "and packed in a box with dimension: " + getWeight() + "x" + getLenght()+"x" + getWidth());
		}
}
