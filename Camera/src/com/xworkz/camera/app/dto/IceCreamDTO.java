package com.xworkz.camera.app.dto;

import java.io.Serializable;
import java.time.LocalDate;

	public class IceCreamDTO implements Serializable{
		
		private String flavours;
		private String type;
		private float price;
		private LocalDate manufactureDate;
		private String color;
		
		public IceCreamDTO(String flavours, String type, float price, LocalDate manufactureDate, String color) {
			super();
			this.flavours = flavours;
			this.type = type;
			this.price = price;
			this.manufactureDate = manufactureDate;
			this.color = color;
			
			
		}

		public String getFlavours() {
			return flavours;
		}

		public void setFlavours(String flavours) {
			this.flavours = flavours;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
		}

		public LocalDate getManufactureDate() {
			return manufactureDate;
		}

		public void setManufactureDate(LocalDate manufactureDate) {
			this.manufactureDate = manufactureDate;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		@Override
		public String toString() {
			return "IceCreamDTO [flavours=" + flavours + ", type=" + type + ", price=" + price + ", manufactureDate="
					+ manufactureDate + ", color=" + color + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((color == null) ? 0 : color.hashCode());
			result = prime * result + ((flavours == null) ? 0 : flavours.hashCode());
			result = prime * result + ((manufactureDate == null) ? 0 : manufactureDate.hashCode());
			result = prime * result + Float.floatToIntBits(price);
			result = prime * result + ((type == null) ? 0 : type.hashCode());
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
			IceCreamDTO other = (IceCreamDTO) obj;
			if (color == null) {
				if (other.color != null)
					return false;
			} else if (!color.equals(other.color))
				return false;
			if (flavours == null) {
				if (other.flavours != null)
					return false;
			} else if (!flavours.equals(other.flavours))
				return false;
			if (manufactureDate == null) {
				if (other.manufactureDate != null)
					return false;
			} else if (!manufactureDate.equals(other.manufactureDate))
				return false;
			if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
				return false;
			if (type == null) {
				if (other.type != null)
					return false;
			} else if (!type.equals(other.type))
				return false;
			return true;
		}
		
		
		
	}

