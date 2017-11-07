package com.MyJSONProject;
import java.util.Date;
import java.util.List;

import lombok.Data;

//@Data
public class Customer {

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", dateOfBirth=" + dateOfBirth
				+ ", annualSalary=" + annualSalary + ", addresses=" + addresses + ", paymentMethods=" + paymentMethods
				+ "]";
	}
	int customerId;
	String name;
	Date dateOfBirth;
	float annualSalary;
	List<Address> addresses;
	List<PaymentMethod> paymentMethods;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public float getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(float annualSalary) {
		this.annualSalary = annualSalary;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	public List<PaymentMethod> getPaymentMethods() {
		return paymentMethods;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addresses == null) ? 0 : addresses.hashCode());
		result = prime * result + Float.floatToIntBits(annualSalary);
		result = prime * result + customerId;
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((paymentMethods == null) ? 0 : paymentMethods.hashCode());
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
		Customer other = (Customer) obj;
		if (addresses == null) {
			if (other.addresses != null)
				return false;
		} else if (!addresses.equals(other.addresses))
			return false;
		if (Float.floatToIntBits(annualSalary) != Float.floatToIntBits(other.annualSalary))
			return false;
		if (customerId != other.customerId)
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (paymentMethods == null) {
			if (other.paymentMethods != null)
				return false;
		} else if (!paymentMethods.equals(other.paymentMethods))
			return false;
		return true;
	}
	public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
		this.paymentMethods = paymentMethods;
	}
	
	
}
