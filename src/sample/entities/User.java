package sample.entities;

public class User {
	private String id;
	private String firstName;
	private String lastName;
	private String userName;
	private String status;
	private String email;
	private String password;
	private boolean admin;
	
	
	public User () {
	
	}
	public User( String id ,String firstName, String lastName, String userName, String status, String email, String password , boolean admin) {
		
		this.id=id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.status = status;
		this.email = email;
		this.password = password;
		this.admin = admin;
	}
	
	public User(String firstName, String lastName, String userName, String status, String email, String password, boolean admin) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.status = status;
		this.email = email;
		this.password = password;
		this.admin = admin;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public boolean isAdmin() {
		return admin;
	}
	
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
}
