package com.credentials.model;

public class Employee {
	private String firstname;
	private String lastname;
	/**
	 * @return - FirstName of the Employee
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param - Set the FirstName of the employee
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return - LastName of employee
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param - Set the LastName the employee
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Employee(String firstname , String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}
	@Override 
	// Get the Employee Details
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname + "]";
	}

}
