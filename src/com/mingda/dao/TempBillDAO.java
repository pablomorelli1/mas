package com.mingda.dao;

import com.mingda.model.TempBill;
import com.mingda.model.TempBillExample;
import java.util.List;

public interface TempBillDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.TEMP_BILL
	 * @ibatorgenerated  Thu Aug 11 13:36:30 CST 2011
	 */
	int countByExample(TempBillExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.TEMP_BILL
	 * @ibatorgenerated  Thu Aug 11 13:36:30 CST 2011
	 */
	int deleteByExample(TempBillExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.TEMP_BILL
	 * @ibatorgenerated  Thu Aug 11 13:36:30 CST 2011
	 */
	int deleteByPrimaryKey(Long billId);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.TEMP_BILL
	 * @ibatorgenerated  Thu Aug 11 13:36:30 CST 2011
	 */
	Long insert(TempBill record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.TEMP_BILL
	 * @ibatorgenerated  Thu Aug 11 13:36:30 CST 2011
	 */
	Long insertSelective(TempBill record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.TEMP_BILL
	 * @ibatorgenerated  Thu Aug 11 13:36:30 CST 2011
	 */
	List<TempBill> selectByExample(TempBillExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.TEMP_BILL
	 * @ibatorgenerated  Thu Aug 11 13:36:30 CST 2011
	 */
	TempBill selectByPrimaryKey(Long billId);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.TEMP_BILL
	 * @ibatorgenerated  Thu Aug 11 13:36:30 CST 2011
	 */
	int updateByExampleSelective(TempBill record, TempBillExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.TEMP_BILL
	 * @ibatorgenerated  Thu Aug 11 13:36:30 CST 2011
	 */
	int updateByExample(TempBill record, TempBillExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.TEMP_BILL
	 * @ibatorgenerated  Thu Aug 11 13:36:30 CST 2011
	 */
	int updateByPrimaryKeySelective(TempBill record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.TEMP_BILL
	 * @ibatorgenerated  Thu Aug 11 13:36:30 CST 2011
	 */
	int updateByPrimaryKey(TempBill record);
}