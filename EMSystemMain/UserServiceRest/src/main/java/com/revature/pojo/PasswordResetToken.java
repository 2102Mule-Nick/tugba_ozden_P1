package com.revature.pojo;

import java.util.Calendar;
import java.util.Date;

public class PasswordResetToken {
	
	private final int EXPIRY_DATE=24*60;
	
	private Long id;
	
	private String token;
	private User user;
	
	private Date expiryDate;

	public PasswordResetToken() {
		this.expiryDate=calculateExpiryDate(EXPIRY_DATE);
	}
	
	

	public PasswordResetToken(String token,User user) {
		
		this.token = token;
		this.user = user;
		this.expiryDate=calculateExpiryDate(EXPIRY_DATE);
	}



	private Date calculateExpiryDate(int eXPIRY_DATE2) {
		// TODO Auto-generated method stub
		
		Calendar calendar=Calendar.getInstance();
		calendar.setTimeInMillis(new Date().getTime());
		calendar.add(Calendar.MINUTE, eXPIRY_DATE2);
		
		return new Date(calendar.getTime().getTime());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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
		PasswordResetToken other = (PasswordResetToken) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
	
	

}
