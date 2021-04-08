package com.revature.pojo;

public class User {

	
	private int id;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String email;
	private boolean enabled;
	private boolean accountNonExpired;
	private boolean credentialNonExpried;
	private boolean accountNonLocked;
	private Role role;
	private int roleId;

	public User() {
		super();
		this.enabled=false;
		this.accountNonExpired=true;
		this.accountNonLocked=true;
		this.credentialNonExpried=true;
	}
	public User(String firstName, String lastName, String userName, String password, String email, int roleId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.email=email;
		this.roleId = roleId;
		this.enabled=false;
		this.accountNonExpired=true;
		this.accountNonLocked=true;
		this.credentialNonExpried=true;
	}
	
	
	//just creating from 2 roleId users
	public User(String firstName, String lastName, String userName, String password, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.email=email;
		//this.roleId=2;
		this.enabled=false;
		this.accountNonExpired=true;
		this.accountNonLocked=true;
		this.credentialNonExpried=true;
	}
		
	
	public User(String firstName, String lastName,String email, int roleId ) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email=email;
		this.roleId=roleId;
		this.enabled=false;
		this.accountNonExpired=true;
		this.accountNonLocked=true;
		this.credentialNonExpried=true;
		
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public boolean isAccountNonExpired() {
		return accountNonExpired;
	}
	public void setAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}
	public boolean isCredentialNonExpried() {
		return credentialNonExpried;
	}
	public void setCredentialNonExpried(boolean credentialNonExpried) {
		this.credentialNonExpried = credentialNonExpried;
	}
	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}
	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
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
		User other = (User) obj;
		if (id != other.id)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
				+ ", password=" + password + ", email=" + email + ", roleId=" + roleId + "]";
	}
	
	
	
}
