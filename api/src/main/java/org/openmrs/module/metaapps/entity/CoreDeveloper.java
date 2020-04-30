package org.openmrs.module.metaapps.entity;

public class CoreDeveloper {
	
	private Integer id;
	
	private String coreDeveloperName;
	
	private int idNo;
	
	private String emailId;
	
	public CoreDeveloper() {
	}
	
	public CoreDeveloper(String coreDeveloperName, int idNo, String emailId) {
		this.coreDeveloperName = coreDeveloperName;
		this.idNo = idNo;
		this.emailId = emailId;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getCoreDeveloperName() {
		return coreDeveloperName;
	}
	
	public void setCoreDeveloperName(String coreDeveloperName) {
		this.coreDeveloperName = coreDeveloperName;
	}
	
	public int getIdNo() {
		return idNo;
	}
	
	public void setIdNo(int idNo) {
		this.idNo = idNo;
	}
	
	public String getEmailId() {
		return emailId;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
