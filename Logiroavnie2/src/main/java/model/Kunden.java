package model;

public class Kunden {

	private int id;
	private String fname, lname, email, gender, ipAddress;

	public Kunden(int id, String fname, String lname, String email, String gender, String ipAddress) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.gender = gender;
		this.ipAddress = ipAddress;
	} 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	@Override
	public String toString() {
		return "Kunden [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", gender=" + gender
				+ ", ipAddress=" + ipAddress + "]";
	}

}
