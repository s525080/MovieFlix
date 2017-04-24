package io.EGEN.Movieflix.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table
@NamedQueries({
		@NamedQuery(name="User.findByEmail",query="SELECT u from User u where u.email =:pemail")
})
public class User {
	
	@Id
	@GenericGenerator(name="customUUID", strategy = "uuid2")
	@GeneratedValue(generator="customUUID")
	private String id;
	private String firstname;//255 chars
	private String lastname;
	@Column(unique=true)
	private String email;
	@OneToOne(cascade=CascadeType.ALL)
	private LoginDetails login;
	private String phone;
	@JsonProperty
	private boolean isAdmin;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public LoginDetails getLogin() {
		return login;
	}
	public void setLogin(LoginDetails login) {
		this.login = login;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", login=" + login + ", phone=" + phone + ", isAdmin=" + isAdmin + "]";
	}

	
	
	
	
	
	

}
