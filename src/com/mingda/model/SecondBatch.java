package com.mingda.model;

import java.math.BigDecimal;
import java.util.Date;

public class SecondBatch {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column MEDICAL.SECOND_BATCH.BATCH_ID
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	private BigDecimal batchId;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column MEDICAL.SECOND_BATCH.ORGANIZATION_ID
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	private String organizationId;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column MEDICAL.SECOND_BATCH.OPER_TIME
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	private Date operTime;

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column MEDICAL.SECOND_BATCH.BATCH_ID
	 * @return  the value of MEDICAL.SECOND_BATCH.BATCH_ID
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	public BigDecimal getBatchId() {
		return batchId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column MEDICAL.SECOND_BATCH.BATCH_ID
	 * @param batchId  the value for MEDICAL.SECOND_BATCH.BATCH_ID
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	public void setBatchId(BigDecimal batchId) {
		this.batchId = batchId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column MEDICAL.SECOND_BATCH.ORGANIZATION_ID
	 * @return  the value of MEDICAL.SECOND_BATCH.ORGANIZATION_ID
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	public String getOrganizationId() {
		return organizationId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column MEDICAL.SECOND_BATCH.ORGANIZATION_ID
	 * @param organizationId  the value for MEDICAL.SECOND_BATCH.ORGANIZATION_ID
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column MEDICAL.SECOND_BATCH.OPER_TIME
	 * @return  the value of MEDICAL.SECOND_BATCH.OPER_TIME
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	public Date getOperTime() {
		return operTime;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column MEDICAL.SECOND_BATCH.OPER_TIME
	 * @param operTime  the value for MEDICAL.SECOND_BATCH.OPER_TIME
	 * @ibatorgenerated  Tue Sep 20 14:51:08 CST 2011
	 */
	public void setOperTime(Date operTime) {
		this.operTime = operTime;
	}
}