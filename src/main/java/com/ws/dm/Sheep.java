package com.ws.dm;

public class Sheep {

	private final long id;
	private final String sheepName;
	private boolean black;
	private String racket;
	
		
	public Sheep(long id, String sheepName) {
        this.id = id;
        this.sheepName = sheepName;
        this.black = false;
        this.racket = "prince";
    }


	public long getId() {
		return id;
	}


	public String getSheepName() {
		return sheepName;
	}


	public boolean isBlack() {
		return black;
	}


	public String getRacket() {
		return racket;
	}
	
	public void eatGrass() {
		System.out.println("Sheep " + id + " eating grass: " + toString());
	}


	@Override
	public String toString() {
		return "Sheep [id=" + id + ", sheepName=" + sheepName + ", black=" + black + ", racket=" + racket + "]";
	}
	
}
