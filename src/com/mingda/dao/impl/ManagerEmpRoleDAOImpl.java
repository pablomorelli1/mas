package com.mingda.dao.impl;

import com.mingda.dao.ManagerEmpRoleDAO;
import com.mingda.model.ManagerEmpRole;
import com.mingda.model.ManagerEmpRoleExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class ManagerEmpRoleDAOImpl extends SqlMapClientDaoSupport implements ManagerEmpRoleDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.MANAGER_EMP_ROLE
	 * @ibatorgenerated  Mon Jan 10 15:32:19 CST 2011
	 */
	public ManagerEmpRoleDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.MANAGER_EMP_ROLE
	 * @ibatorgenerated  Mon Jan 10 15:32:19 CST 2011
	 */
	public int countByExample(ManagerEmpRoleExample example) {
		Integer count = (Integer) getSqlMapClientTemplate().queryForObject(
				"MANAGER_EMP_ROLE.ibatorgenerated_countByExample", example);
		return count;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.MANAGER_EMP_ROLE
	 * @ibatorgenerated  Mon Jan 10 15:32:19 CST 2011
	 */
	public int deleteByExample(ManagerEmpRoleExample example) {
		int rows = getSqlMapClientTemplate().delete(
				"MANAGER_EMP_ROLE.ibatorgenerated_deleteByExample", example);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.MANAGER_EMP_ROLE
	 * @ibatorgenerated  Mon Jan 10 15:32:19 CST 2011
	 */
	public void insert(ManagerEmpRole record) {
		getSqlMapClientTemplate().insert(
				"MANAGER_EMP_ROLE.ibatorgenerated_insert", record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.MANAGER_EMP_ROLE
	 * @ibatorgenerated  Mon Jan 10 15:32:19 CST 2011
	 */
	public void insertSelective(ManagerEmpRole record) {
		getSqlMapClientTemplate().insert(
				"MANAGER_EMP_ROLE.ibatorgenerated_insertSelective", record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.MANAGER_EMP_ROLE
	 * @ibatorgenerated  Mon Jan 10 15:32:19 CST 2011
	 */
	@SuppressWarnings("unchecked")
	public List<ManagerEmpRole> selectByExample(ManagerEmpRoleExample example) {
		List<ManagerEmpRole> list = getSqlMapClientTemplate().queryForList(
				"MANAGER_EMP_ROLE.ibatorgenerated_selectByExample", example);
		return list;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.MANAGER_EMP_ROLE
	 * @ibatorgenerated  Mon Jan 10 15:32:19 CST 2011
	 */
	public int updateByExampleSelective(ManagerEmpRole record,
			ManagerEmpRoleExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"MANAGER_EMP_ROLE.ibatorgenerated_updateByExampleSelective",
				parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.MANAGER_EMP_ROLE
	 * @ibatorgenerated  Mon Jan 10 15:32:19 CST 2011
	 */
	public int updateByExample(ManagerEmpRole record,
			ManagerEmpRoleExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"MANAGER_EMP_ROLE.ibatorgenerated_updateByExample", parms);
		return rows;
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table MEDICAL.MANAGER_EMP_ROLE
	 * @ibatorgenerated  Mon Jan 10 15:32:19 CST 2011
	 */
	private static class UpdateByExampleParms extends ManagerEmpRoleExample {
		private Object record;

		public UpdateByExampleParms(Object record, ManagerEmpRoleExample example) {
			super(example);
			this.record = record;
		}

		@SuppressWarnings("unused")
		public Object getRecord() {
			return record;
		}
	}
}