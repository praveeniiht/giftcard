package com.examples.projects.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "GiftCardOrderDetails")
public class GiftCardOrderDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "orderId")
	private int orderId;

	
	@Column(name = "buyerFirstName")
	private String buyerFirstName;

	
	@Column(name = "buyerLastName")
	private String buyerLastName;

	
	@Column(name = "recipientFirstName")
	private String recipientFirstName;

	
	@Column(name = "recipientLastName")
	private String recipienLastName;

	
	@Column(name = "giftAmount")
	private Long giftAmount;
	
	
	@Column(name = "phoneNumber")
	private String phoneNumber;
	
	
	@Column(name = "email")
	private String email;

	@Column(name="address")
	private String address;
	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getBuyerFirstName() {
		return buyerFirstName;
	}

	public void setBuyerFirstName(String buyerFirstName) {

		this.buyerFirstName = buyerFirstName;
	}

	public String getBuyerLastName() {
		return buyerLastName;
	}

	public void setBuyerLastName(String buyerLastName) {

		this.buyerLastName = buyerLastName;
	}

	public String getRecipientFirstName() {
		return recipientFirstName;
	}

	public void setRecipientFirstName(String recipientFirstName) {

		this.recipientFirstName = recipientFirstName;
	}

	public String getRecipienLastName() {
		return recipienLastName;
	}

	public void setRecipienLastName(String recipienLastName) {
		this.recipienLastName = recipienLastName;
	}

	public Long getGiftAmount() {
		return giftAmount;
	}

	public void setGiftAmount(Long giftAmount) {
		this.giftAmount = giftAmount;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address=address;
	}

	

}
