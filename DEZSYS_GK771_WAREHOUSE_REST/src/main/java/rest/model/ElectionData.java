package rest.model;

import rest.warehouse.Party;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ElectionData {

	private String regionID;
	private String regionName;
	private String timestamp;
	private String regionAddress;
	private String regionPostalCode;
	private String federalState;
	private List<Party> countingData;

	/**
	 * Constructor
	 */
	public ElectionData() {

		this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());

	}

	/**
	 * Setter and Getter Methods
	 */
	public String getRegionID() {
		return regionID;
	}

	public void setRegionID(String regionID) {
		this.regionID = regionID;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}


	public String getRegionAddress() {
		return regionAddress;
	}

	public void setRegionAddress(String regionAddress) {
		this.regionAddress = regionAddress;
	}

	public String getRegionPostalCode() {
		return regionPostalCode;
	}

	public void setRegionPostalCode(String regionPostalCode) {
		this.regionPostalCode = regionPostalCode;
	}

	public String getFederalState() {
		return federalState;
	}

	public void setFederalState(String federalState) {
		this.federalState = federalState;
	}

	/**
	 * Methods
	 */
	@Override
	public String toString() {
		String info = String.format("Election Info: ID = %s, timestamp = %s", regionID, timestamp );
		return info;
	}

	public List<Party> getCountingData() {
		return countingData;
	}

	public void setCountingData(List<Party> countingData) {
		this.countingData = countingData;
	}
}
