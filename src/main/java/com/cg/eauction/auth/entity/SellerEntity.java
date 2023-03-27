package com.cg.eauction.auth.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Generated;

@Entity
@Table(name = "master_seller")
@Data 
@EqualsAndHashCode(callSuper = false)
@Generated
public class SellerEntity extends CommonEntity {

	private static final long serialVersionUID = 4463311477244274569L;

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "seller_id")
	@JsonProperty("sellerId")
	private Long sellerId;
	
	@JsonProperty("password")
    private String password;

	@Column(name = "first_name", nullable = false, length = 30)
	@JsonProperty("firstName")
	private String firstName;

	@Column(name = "last_name", nullable = false, length = 25)
	@JsonProperty("lastName")
	private String lastName;
	
	@Column(name = "address", nullable = false, length = 250)
    @JsonProperty("address")
    private String address;
	
	@Column(name = "city", nullable = false, length = 20)
    @JsonProperty("city")
    private String city;
	
	@Column(name = "state", nullable = false, length = 20)
    @JsonProperty("state")
    private String state;

    @Column(name = "pin", nullable = false, length = 6)
    @JsonProperty("pin")
    private String pin;

	@Column(name = "mobile_no", unique = true, nullable = false, length = 10)
	@JsonProperty("mobileNo")
	private String mobileNo;

	@Column(name = "email_id", unique = true, nullable = false, length = 50)
	@JsonProperty("emailId")
	private String emailId;

	@Override
	public String toString() {
		return Long.toString(sellerId);
	}
}
