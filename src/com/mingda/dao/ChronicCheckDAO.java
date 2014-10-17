package com.mingda.dao;

import com.mingda.model.ChronicCheck;
import com.mingda.model.ChronicCheckExample;
import java.util.List;

public interface ChronicCheckDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_CHECK
	 * @ibatorgenerated  Wed Nov 24 13:28:51 CST 2010
	 */
	int countByExample(ChronicCheckExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_CHECK
	 * @ibatorgenerated  Wed Nov 24 13:28:51 CST 2010
	 */
	int deleteByExample(ChronicCheckExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_CHECK
	 * @ibatorgenerated  Wed Nov 24 13:28:51 CST 2010
	 */
	int deleteByPrimaryKey(Integer chroniccheckId);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_CHECK
	 * @ibatorgenerated  Wed Nov 24 13:28:51 CST 2010
	 */
	Integer insert(ChronicCheck record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_CHECK
	 * @ibatorgenerated  Wed Nov 24 13:28:51 CST 2010
	 */
	Integer insertSelective(ChronicCheck record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_CHECK
	 * @ibatorgenerated  Wed Nov 24 13:28:51 CST 2010
	 */
	List<ChronicCheck> selectByExample(ChronicCheckExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_CHECK
	 * @ibatorgenerated  Wed Nov 24 13:28:51 CST 2010
	 */
	ChronicCheck selectByPrimaryKey(Integer chroniccheckId);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_CHECK
	 * @ibatorgenerated  Wed Nov 24 13:28:51 CST 2010
	 */
	int updateByExampleSelective(ChronicCheck record,
			ChronicCheckExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_CHECK
	 * @ibatorgenerated  Wed Nov 24 13:28:51 CST 2010
	 */
	int updateByExample(ChronicCheck record, ChronicCheckExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_CHECK
	 * @ibatorgenerated  Wed Nov 24 13:28:51 CST 2010
	 */
	int updateByPrimaryKeySelective(ChronicCheck record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.CHRONIC_CHECK
	 * @ibatorgenerated  Wed Nov 24 13:28:51 CST 2010
	 */
	int updateByPrimaryKey(ChronicCheck record);
}