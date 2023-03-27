package com.cg.eauction.auth.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Transient;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Generated;

@MappedSuperclass
@Data 
@EqualsAndHashCode(callSuper = false)
@Generated
public abstract class CommonEntity implements Serializable {

	/**
	 * This ID will not be used while serializing and de-serializing the object into and from the Database 
	 */
	@Transient
	private static final long serialVersionUID = -4246787040534790267L;

	@Column(name = "status")
	@JsonProperty("status")
	private Integer status;
	
	@Column(name = "created_date")
	@JsonProperty("createdDate")
	private String createdDate;
	
	@Column(name = "created_by")
	@JsonProperty("createdBy")
	private Long createdBy;
	
	@Column(name = "modified_date")
	@JsonProperty("modifiedDate")
	private String modifiedDate;
	
	@Column(name = "modified_by")
	@JsonProperty("modifiedBy")
	private Long modifiedBy;

}