package com.cx.spider.bean;

public class Office {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column java_recruitment_msg.id
     *
     * @mbg.generated Tue Jun 20 12:10:00 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column java_recruitment_msg.office_name
     *
     * @mbg.generated Tue Jun 20 12:10:00 CST 2017
     */
    private String officeName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column java_recruitment_msg.company_name
     *
     * @mbg.generated Tue Jun 20 12:10:00 CST 2017
     */
    private String companyName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column java_recruitment_msg.salary
     *
     * @mbg.generated Tue Jun 20 12:10:00 CST 2017
     */
    private String salary;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column java_recruitment_msg.location
     *
     * @mbg.generated Tue Jun 20 12:10:00 CST 2017
     */
    private String location;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column java_recruitment_msg.release_date
     *
     * @mbg.generated Tue Jun 20 12:10:00 CST 2017
     */
    private String releaseDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column java_recruitment_msg.office_url
     *
     * @mbg.generated Tue Jun 20 12:10:00 CST 2017
     */
    private String officeUrl;
    
    
    

    public Office() {
		super();
	}

	public Office(String officeName, String companyName, String salary, String location, String releaseDate,
			String officeUrl) {
		super();
		this.officeName = officeName;
		this.companyName = companyName;
		this.salary = salary;
		this.location = location;
		this.releaseDate = releaseDate;
		this.officeUrl = officeUrl;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column java_recruitment_msg.id
     *
     * @return the value of java_recruitment_msg.id
     *
     * @mbg.generated Tue Jun 20 12:10:00 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column java_recruitment_msg.id
     *
     * @param id the value for java_recruitment_msg.id
     *
     * @mbg.generated Tue Jun 20 12:10:00 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column java_recruitment_msg.office_name
     *
     * @return the value of java_recruitment_msg.office_name
     *
     * @mbg.generated Tue Jun 20 12:10:00 CST 2017
     */
    public String getOfficeName() {
        return officeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column java_recruitment_msg.office_name
     *
     * @param officeName the value for java_recruitment_msg.office_name
     *
     * @mbg.generated Tue Jun 20 12:10:00 CST 2017
     */
    public void setOfficeName(String officeName) {
        this.officeName = officeName == null ? null : officeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column java_recruitment_msg.company_name
     *
     * @return the value of java_recruitment_msg.company_name
     *
     * @mbg.generated Tue Jun 20 12:10:00 CST 2017
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column java_recruitment_msg.company_name
     *
     * @param companyName the value for java_recruitment_msg.company_name
     *
     * @mbg.generated Tue Jun 20 12:10:00 CST 2017
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column java_recruitment_msg.salary
     *
     * @return the value of java_recruitment_msg.salary
     *
     * @mbg.generated Tue Jun 20 12:10:00 CST 2017
     */
    public String getSalary() {
        return salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column java_recruitment_msg.salary
     *
     * @param salary the value for java_recruitment_msg.salary
     *
     * @mbg.generated Tue Jun 20 12:10:00 CST 2017
     */
    public void setSalary(String salary) {
        this.salary = salary == null ? null : salary.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column java_recruitment_msg.location
     *
     * @return the value of java_recruitment_msg.location
     *
     * @mbg.generated Tue Jun 20 12:10:00 CST 2017
     */
    public String getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column java_recruitment_msg.location
     *
     * @param location the value for java_recruitment_msg.location
     *
     * @mbg.generated Tue Jun 20 12:10:00 CST 2017
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column java_recruitment_msg.release_date
     *
     * @return the value of java_recruitment_msg.release_date
     *
     * @mbg.generated Tue Jun 20 12:10:00 CST 2017
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column java_recruitment_msg.release_date
     *
     * @param releaseDate the value for java_recruitment_msg.release_date
     *
     * @mbg.generated Tue Jun 20 12:10:00 CST 2017
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate == null ? null : releaseDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column java_recruitment_msg.office_url
     *
     * @return the value of java_recruitment_msg.office_url
     *
     * @mbg.generated Tue Jun 20 12:10:00 CST 2017
     */
    public String getOfficeUrl() {
        return officeUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column java_recruitment_msg.office_url
     *
     * @param officeUrl the value for java_recruitment_msg.office_url
     *
     * @mbg.generated Tue Jun 20 12:10:00 CST 2017
     */
    public void setOfficeUrl(String officeUrl) {
        this.officeUrl = officeUrl == null ? null : officeUrl.trim();
    }

	@Override
	public String toString() {
		return "Office [id=" + id + ", officeName=" + officeName + ", companyName=" + companyName + ", salary=" + salary
				+ ", location=" + location + ", releaseDate=" + releaseDate + ", officeUrl=" + officeUrl + "]";
	}
    
    
}