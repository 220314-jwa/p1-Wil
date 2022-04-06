package net.revature.models;

import java.util.Objects;

public class Role {
private long role_id;
private String role_name;

public Role() {
	role_id =12345;
	role_name="My role_name";
	
}

public long getRole_id() {
	return role_id;
}

public void setRole_id(long role_id) {
	this.role_id = role_id;
}

public String getRole_name() {
	return role_name;
}

public void setRole_name(String role_name) {
	this.role_name = role_name;
}

@Override
public int hashCode() {
	return Objects.hash(role_id, role_name);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Role other = (Role) obj;
	return role_id == other.role_id && Objects.equals(role_name, other.role_name);
}

@Override
public String toString() {
	return "User [role_id=" + role_id + ", role_name=" + role_name + "]";
}

		
		
	}


