package com.xworkz.mock;

public class FormDTO {
		
	    private String slno;
	    private String fname;
		private String lname;
		private String mname;
		private String email;
		private String gender;
		private String contactno;
		private String area;
		private String district;
		private String state;
		private String pincode;
		
		public FormDTO() {
			
		}

		public FormDTO(String slno, String fname, String lname,String mname, String email, String gender,String contactno,  String area, String district,String state, String pincode) {
			super();
			this.slno=slno;
			this.fname = fname;
			this.lname=lname;
			this.mname=mname;
			this.email = email;
			this.gender = gender;
			this.contactno= contactno;
			this.area = area;
			this.district = district;
			this.state=state;
			this.pincode=pincode;
			
		}

		public String getSlno() {
			return slno;
		}

		public void setSlno(String slno) {
			this.slno = slno;
		}

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public String getMname() {
			return mname;
		}

		public void setMname(String mname) {
			this.mname = mname;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getContactno() {
			return contactno;
		}

		public void setContactno(String contactno) {
			this.contactno = contactno;
		}

		public String getArea() {
			return area;
		}

		public void setArea(String area) {
			this.area = area;
		}

		public String getDistrict() {
			return district;
		}

		public void setDistrict(String district) {
			this.district = district;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getPincode() {
			return pincode;
		}

		public void setPincode(String pincode) {
			this.pincode = pincode;
		}

		
}
