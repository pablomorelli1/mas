package com.mingda.dao.impl;

import com.mingda.dao.YoufuDAO;
import com.mingda.model.Youfu;
import com.mingda.model.YoufuExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class YoufuDAOImpl extends SqlMapClientDaoSupport implements YoufuDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.YOUFU
	 * @ibatorgenerated  Wed May 25 16:23:00 CST 2011
	 */
	public YoufuDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.YOUFU
	 * @ibatorgenerated  Wed May 25 16:23:00 CST 2011
	 */
	public int countByExample(YoufuExample example) {
		Integer count = (Integer) getSqlMapClientTemplate().queryForObject(
				"YOUFU.ibatorgenerated_countByExample", example);
		return count;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.YOUFU
	 * @ibatorgenerated  Wed May 25 16:23:00 CST 2011
	 */
	public int deleteByExample(YoufuExample example) {
		int rows = getSqlMapClientTemplate().delete(
				"YOUFU.ibatorgenerated_deleteByExample", example);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.YOUFU
	 * @ibatorgenerated  Wed May 25 16:23:00 CST 2011
	 */
	public void insert(Youfu record) {
		getSqlMapClientTemplate()
				.insert("YOUFU.ibatorgenerated_insert", record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.YOUFU
	 * @ibatorgenerated  Wed May 25 16:23:00 CST 2011
	 */
	public void insertSelective(Youfu record) {
		getSqlMapClientTemplate().insert(
				"YOUFU.ibatorgenerated_insertSelective", record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.YOUFU
	 * @ibatorgenerated  Wed May 25 16:23:00 CST 2011
	 */
	@SuppressWarnings("unchecked")
	public List<Youfu> selectByExample(YoufuExample example) {
		List<Youfu> list = getSqlMapClientTemplate().queryForList(
				"YOUFU.ibatorgenerated_selectByExample", example);
		return list;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.YOUFU
	 * @ibatorgenerated  Wed May 25 16:23:00 CST 2011
	 */
	public int updateByExampleSelective(Youfu record, YoufuExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"YOUFU.ibatorgenerated_updateByExampleSelective", parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.YOUFU
	 * @ibatorgenerated  Wed May 25 16:23:00 CST 2011
	 */
	public int updateByExample(Youfu record, YoufuExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"YOUFU.ibatorgenerated_updateByExample", parms);
		return rows;
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table MEDICAL.YOUFU
	 * @ibatorgenerated  Wed May 25 16:23:00 CST 2011
	 */
	private static class UpdateByExampleParms extends YoufuExample {
		private Object record;

		public UpdateByExampleParms(Object record, YoufuExample example) {
			super(example);
			this.record = record;
		}

		public Object getRecord() {
			return record;
		}
	}
}