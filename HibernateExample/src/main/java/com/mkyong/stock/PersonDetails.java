package com.mkyong.stock;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PersonDetails {

	private int pdetailsID;
	private int dob;
	private String address;
	/**
	 * @return the pdetailsID
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name="pDid")
	public int getPdetailsID() {
		return pdetailsID;
	}
	/**
	 * @param pdetailsID the pdetailsID to set
	 */
	public void setPdetailsID(int pdetailsID) {
		this.pdetailsID = pdetailsID;
	}
	/**
	 * @return the dob
	 */
	public int getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(int dob) {
		this.dob = dob;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
