public class User {


	private String username;
	private String email;
	private String  number;
	private String birtday;
	private String gender;
	private String passwordHash;
	private String name;
	private String lrn;
	private String addrress;
	public String getAddrress() {
		return addrress;
	}
	public void setAddrress(String addrress) {
		this.addrress = addrress;
	}
	public String getLrn() {
		return lrn;
	}
	public void setLrn(String lrn) {
		this.lrn = lrn;
	}

	private int status;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getBirtday() {
		return birtday;
	}
	public void setBirtday(String birtday) {
		this.birtday = birtday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPasswordHash() {
		return passwordHash;
	}
	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", number=" + number + ", birtday=" + birtday
				+ ", gender=" + gender + ", passwordHash=" + passwordHash + "]";
	}
	
}