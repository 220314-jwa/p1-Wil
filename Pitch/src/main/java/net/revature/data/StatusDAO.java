package net.revature.data;

import net.revature.models.Status;

public interface StatusDAO extends GenericDAO <Status> {

	public Status getByName(int status_name);
}
