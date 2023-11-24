package com.xworkz.camera.app.dto;

import java.io.Serializable;

public class TheaterDTO implements Serializable{

	private String name;
	private String location;
	private int ticketPrice;
	private int floors;
	private boolean isClean;
	
	public TheaterDTO(String name, String location, int ticketPrice, int floors, boolean isClean) {
		super();
		this.name = name;
		this.location = location;
		this.ticketPrice = ticketPrice;
		this.floors = floors;
		this.isClean = isClean;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public boolean isClean() {
		return isClean;
	}

	public void setClean(boolean isClean) {
		this.isClean = isClean;
	}

	
	@Override
	public String toString() {
		return "TheaterDTO [name=" + name + ", location=" + location + ", ticketPrice=" + ticketPrice + ", floors="
				+ floors + ", isClean=" + isClean + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + floors;
		result = prime * result + (isClean ? 1231 : 1237);
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ticketPrice;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TheaterDTO other = (TheaterDTO) obj;
		if (floors != other.floors)
			return false;
		if (isClean != other.isClean)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (ticketPrice != other.ticketPrice)
			return false;
		return true;
	}
	
	
}
