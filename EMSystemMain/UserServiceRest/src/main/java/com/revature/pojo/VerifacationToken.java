package com.revature.pojo;

import java.util.Calendar;
import java.util.Date;

public class VerifacationToken {
	
	private final int EXPIRY_DATE=60*24;
	
	private Long id;
	
	private User user;
	
	private String token;
	
	private Date expiryDate;
	
	

	public VerifacationToken() {
		this.expiryDate=calculateExpiryDate(EXPIRY_DATE);
	}
	
	

	public VerifacationToken(User user, String token) {
	
		this.user = user;
		this.token = token;
		this.expiryDate=calculateExpiryDate(EXPIRY_DATE);
	}



	private Date calculateExpiryDate(int eXPIRY_DATE2) {//send token for control
		// TODO Auto-generated method stub
		
		Calendar calendar =Calendar.getInstance();
		
		calendar.setTimeInMillis(new Date().getTime());
		
		calendar.add(Calendar.DATE, eXPIRY_DATE2);
		
		return new Date(calendar.getTime().getTime());
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public String getToken() {
		return token;
	}



	public void setToken(String token) {
		this.token = token;
	}



	public Date getExpiryDate() {
		return expiryDate;
	}



	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}



	public int getEXPIRY_DATE() {
		return EXPIRY_DATE;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		VerifacationToken other = (VerifacationToken) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	

}
