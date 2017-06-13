package com.cx.spider.bean;

public class Office {

	private Integer id;

	private String officeName;

	private String companyName;

	private String salary;

	private String location;

	private String releaseDate;

	public Office() {
		super();
	}

	public Office(String officeName, String companyName, String salary, String location, String releaseDate) {
		super();
		this.officeName = officeName;
		this.companyName = companyName;
		this.salary = salary;
		this.location = location;
		this.releaseDate = releaseDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName == null ? null : officeName.trim();
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName == null ? null : companyName.trim();
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary == null ? null : salary.trim();
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location == null ? null : location.trim();
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate == null ? null : releaseDate.trim();
	}

	@Override
	public String toString() {
		return "Office [officeName=" + officeName + ", companyName=" + companyName + ", salary=" + salary
				+ ", location=" + location + ", releaseDate=" + releaseDate + "]";
	}
	
	
}