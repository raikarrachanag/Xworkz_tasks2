package com.xworkz.map.dto;

public class CompanyDTO {

	String name;
	String location;
	long gstNo;
	
	public CompanyDTO(String name, String location, long gstNo) {
		super();
		this.name = name;
		this.location = location;
		this.gstNo = gstNo;
	}

	@Override
	public String toString() {
		return "CompanyDTO [name=" + name + ", location=" + location + ", gstNo=" + gstNo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (gstNo ^ (gstNo >>> 32));
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		CompanyDTO other = (CompanyDTO) obj;
		if (gstNo != other.gstNo)
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
		return true;
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

	public long getGstNo() {
		return gstNo;
	}

	public void setGstNo(long gstNo) {
		this.gstNo = gstNo;
	}
	
}
