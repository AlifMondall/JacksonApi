package com.ip.model;

/**
 * The Stack class represents a last-in-first-out stack of objects.
 *
 * @author  Joseph Bergin
 * @version 1.0, May 2000
 * Note that this version is not thread safe.
 */
public class Employee {
	private String firstname;
	private String lastname;
	private String dateofbirth;
	private String address;
	private String city;
	private String state;

	 public final String getFirstname() {
		return firstname;
	}

	 public final void setFirstname(final String firstname) {
		this.firstname = firstname;
	}	
	 public final String getLastname() {
		return lastname;
	}

	 public final void setLastname(final String lastname) {
		this.lastname = lastname;
	}

	 public final String getDateOfBirth() {
		return dateofbirth;
	}

	public final void setDateOfBirth(final String dateOfBirth) {
		dateofbirth = dateOfBirth;
	}

	 public final String getAddress() {
		return address;
	}

	 public final void setAddress(final String address) {
		this.address = address;
	}

	 public final String getCity() {
		return city;
	}

	 public final void setCity(final String city) {
		this.city = city;
	}

	public final String getState() {
		return state;
	}

	 public final void setState(final String state) {
		this.state = state;
	}

	public String toString() {

		return "Employee [firstname: " + firstname + ",lastname:" + lastname + ",dateofbirth: " + dateofbirth + ","
				+ "address:" + address + ", city: " + city + ",state:" + state + " ]";
	}
}
