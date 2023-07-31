package com.example.springapp3.Entity;




import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="login")
public class model {
	@Id
	
	private String email;
	private String password;
	 
	
	

	public model(String email, String password) {
		super();
		this.email = email;
		this.password = password;
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





	public model() 
	{
	
	}
	

}
