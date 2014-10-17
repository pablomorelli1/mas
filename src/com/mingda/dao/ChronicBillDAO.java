package com.mingda.dao;

import com.mingda.model.ChronicBill;
import com.mingda.model.ChronicBillExample;
import java.util.List;

public interface ChronicBillDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_BILL
	 * @ibatorgenerated  Mon Nov 12 15:03:59 CST 2012
	 */
	int countByExample(ChronicBillExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_BILL
	 * @ibatorgenerated  Mon Nov 12 15:03:59 CST 2012
	 */
	int deleteByExample(ChronicBillExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_BILL
	 * @ibatorgenerated  Mon Nov 12 15:03:59 CST 2012
	 */
	int deleteByPrimaryKey(Integer chronicbillId);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_BILL
	 * @ibatorgenerated  Mon Nov 12 15:03:59 CST 2012
	 */
	Integer insert(ChronicBill record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_BILL
	 * @ibatorgenerated  Mon Nov 12 15:03:59 CST 2012
	 */
	Integer insertSelective(ChronicBill record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_BILL
	 * @ibatorgenerated  Mon Nov 12 15:03:59 CST 2012
	 */
	List<ChronicBill> selectByExample(ChronicBillExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_BILL
	 * @ibatorgenerated  Mon Nov 12 15:03:59 CST 2012
	 */
	ChronicBill selectByPrimaryKey(Integer chronicbillId);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_BILL
	 * @ibatorgenerated  Mon Nov 12 15:03:59 CST 2012
	 */
	int updateByExampleSelective(ChronicBill record, ChronicBillExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_BILL
	 * @ibatorgenerated  Mon Nov 12 15:03:59 CST 2012
	 */
	int updateByExample(ChronicBill record, ChronicBillExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_BILL
	 * @ibatorgenerated  Mon Nov 12 15:03:59 CST 2012
	 */
	int updateByPrimaryKeySelective(ChronicBill record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_BILL
	 * @ibatorgenerated  Mon Nov 12 15:03:59 CST 2012
	 */
	int updateByPrimaryKey(ChronicBill record);
}