package com.abc.service.doccollection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public  class EDocRule {
	
	private String beanName; 
	private String propName;
	private String expectedResult;
	private String packageCode;
	private String notificationConfiguration;
	private String companyName;
	private String companyCode; 
	
	public String getCompanyName() {
		return companyName;
	}
	@XmlElement
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyCode() {
		return companyCode;
	}
	@XmlElement
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	
	

	/**
	 * returns the mapping name used to retrieve result
	 * @return
	 */
	public String getBeanName() {
		return beanName;
	} 

	/**
	 * sets the mapping name to use when retrieving a result. 
	 * @param beanName
	 */
	@XmlElement
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	/**
	 * returns the expected result that we need to match up against
	 * @return
	 */
	public String getExpectedResult() {
		return expectedResult;
	}

	/**
	 * sets the expected results for the eDoc rule.
	 * 
	 * @param excpectedResult
	 */
	@XmlElement
	public void setExpectedResult(String expectedResult) {
		this.expectedResult = expectedResult;
	}

	/**
	 * returns property name to use when looking for an expected result.
	 * @return
	 */
	public String getPropName() {
		return propName;
	}

	/**
	 * sets the property to use from the bean specified in beanName
	 * @param propName
	 */
	@XmlElement
	public void setPropName(String propName) {
		this.propName = propName;
	}
	
	/**
	 * returns package code to use for eDocRule
	 * @return
	 */
	public String getPackageCode() {
		return packageCode;
	}

	/**
	 * sets package code to use for eDocRule
	 * @param packageCode	 
	 */
	@XmlElement
	public void setPackageCode(String packageCode) {
		this.packageCode = packageCode;
	}
	
	public String getNotificationConfiguration() {
		return notificationConfiguration;
	}
	@XmlElement
	public void setNotificationConfiguration(String notificationConfiguration) {
		this.notificationConfiguration = notificationConfiguration;
	}
	
	@Override
	public String toString() {
		return "EDocRule [beanName=" + beanName + ", propName=" + propName
				+ ", expectedResult=" + expectedResult + "]";
	}

	
	 
}