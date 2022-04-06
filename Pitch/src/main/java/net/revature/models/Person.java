package net.revature.models;

import java.util.Objects;

public class Person {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String first_name;
	private String last_name;
	private String role_id;
	private String role_name;
	private String username;
	private String password;

//	
//	public Person(int id, String first_name, String last_name, String role_id, String role_name, String username, String password) {
//		
//	}

	public String getUsername() {
		return username;
	}

	public Person() {

		first_name = "first_name";
		last_name = "last_name";
		role_id = " role_id";
		role_name = "role_name";
		username = "username";
		password = "password";
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getRole_id() {
		return role_id;
	}

	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(first_name, id, last_name, password, role_id, role_name, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(first_name, other.first_name) && id == other.id
				&& Objects.equals(last_name, other.last_name) && Objects.equals(password, other.password)
				&& Objects.equals(role_id, other.role_id) && Objects.equals(role_name, other.role_name)
				&& Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", role_id=" + role_id
				+ ", role_name=" + role_name + ", username=" + username + ", password=" + password + "]";
	}

}
