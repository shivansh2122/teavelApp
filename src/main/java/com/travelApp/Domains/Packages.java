package com.travelApp.Domains;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@Document(indexName = "packages")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Packages {
	
	@Id  
	private String id;
	private String packageName;
	private String description;
//	private LocalDateTime createdDate;
//	private LocalDateTime validFrom;
//	private LocalDateTime validTill;
//	private Long basePrice;
//	private Long marketPrice;
//	private Long personCount;
//	private String destination;
//	private String origin;
//	private Long noOfDays;
//	private boolean isAccomodationEnabled;
//	private boolean isInternationalTrip;
//	private boolean isConvenceAllowed;
//	private String convenceType;
//	private String noOfNights;
//	private boolean isFoodingAllowed;
//	private boolean isLocalConvenceAllowed;
//	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
//	public LocalDateTime getCreatedDate() {
//		return createdDate;
//	}
//	public void setCreatedDate(LocalDateTime createdDate) {
//		this.createdDate = createdDate;
//	}
//	public LocalDateTime getValidFrom() {
//		return validFrom;
//	}
//	public void setValidFrom(LocalDateTime validFrom) {
//		this.validFrom = validFrom;
//	}
//	public LocalDateTime getValidTill() {
//		return validTill;
//	}
//	public void setValidTill(LocalDateTime validTill) {
//		this.validTill = validTill;
//	}
//	public Long getBasePrice() {
//		return basePrice;
//	}
//	public void setBasePrice(Long basePrice) {
//		this.basePrice = basePrice;
//	}
//	public Long getMarketPrice() {
//		return marketPrice;
//	}
//	public void setMarketPrice(Long marketPrice) {
//		this.marketPrice = marketPrice;
//	}
//	public Long getPersonCount() {
//		return personCount;
//	}
//	public void setPersonCount(Long personCount) {
//		this.personCount = personCount;
//	}
//	public String getDestination() {
//		return destination;
//	}
//	public void setDestination(String destination) {
//		this.destination = destination;
//	}
//	public String getOrigin() {
//		return origin;
//	}
//	public void setOrigin(String origin) {
//		this.origin = origin;
//	}
//	public Long getNoOfDays() {
//		return noOfDays;
//	}
//	public void setNoOfDays(Long noOfDays) {
//		this.noOfDays = noOfDays;
//	}
//	public boolean isAccomodationEnabled() {
//		return isAccomodationEnabled;
//	}
//	public void setAccomodationEnabled(boolean isAccomodationEnabled) {
//		this.isAccomodationEnabled = isAccomodationEnabled;
//	}
//	public boolean isInternationalTrip() {
//		return isInternationalTrip;
//	}
//	public void setInternationalTrip(boolean isInternationalTrip) {
//		this.isInternationalTrip = isInternationalTrip;
//	}
//	public boolean isConvenceAllowed() {
//		return isConvenceAllowed;
//	}
//	public void setConvenceAllowed(boolean isConvenceAllowed) {
//		this.isConvenceAllowed = isConvenceAllowed;
//	}
//	public String getConvenceType() {
//		return convenceType;
//	}
//	public void setConvenceType(String convenceType) {
//		this.convenceType = convenceType;
//	}
//	public String getNoOfNights() {
//		return noOfNights;
//	}
//	public void setNoOfNights(String noOfNights) {
//		this.noOfNights = noOfNights;
//	}
//	public boolean isFoodingAllowed() {
//		return isFoodingAllowed;
//	}
//	public void setFoodingAllowed(boolean isFoodingAllowed) {
//		this.isFoodingAllowed = isFoodingAllowed;
//	}
//	public boolean isLocalConvenceAllowed() {
//		return isLocalConvenceAllowed;
//	}
//	public void setLocalConvenceAllowed(boolean isLocalConvenceAllowed) {
//		this.isLocalConvenceAllowed = isLocalConvenceAllowed;
//	}
	public Packages(String id, String packageName, String description) {
		super();
		this.id = id;
		this.packageName = packageName;
		this.description = description;
	}
	
	
	
	

}
