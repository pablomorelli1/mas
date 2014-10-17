package com.mingda.dao.impl;

import com.mingda.dao.JzBizmediaDAO;
import com.mingda.model.JzBizmedia;
import com.mingda.model.JzBizmediaExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class JzBizmediaDAOImpl extends SqlMapClientDaoSupport implements JzBizmediaDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_BIZMEDIA
     *
     * @ibatorgenerated Thu Dec 23 20:32:12 CST 2010
     */
    public JzBizmediaDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_BIZMEDIA
     *
     * @ibatorgenerated Thu Dec 23 20:32:12 CST 2010
     */
    public int countByExample(JzBizmediaExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("JZ_BIZMEDIA.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_BIZMEDIA
     *
     * @ibatorgenerated Thu Dec 23 20:32:12 CST 2010
     */
    public int deleteByExample(JzBizmediaExample example) {
        int rows = getSqlMapClientTemplate().delete("JZ_BIZMEDIA.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_BIZMEDIA
     *
     * @ibatorgenerated Thu Dec 23 20:32:12 CST 2010
     */
    public int deleteByPrimaryKey(Integer bizmediaId) {
        JzBizmedia key = new JzBizmedia();
        key.setBizmediaId(bizmediaId);
        int rows = getSqlMapClientTemplate().delete("JZ_BIZMEDIA.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_BIZMEDIA
     *
     * @ibatorgenerated Thu Dec 23 20:32:12 CST 2010
     */
    public Integer insert(JzBizmedia record) {
        Object newKey = getSqlMapClientTemplate().insert("JZ_BIZMEDIA.ibatorgenerated_insert", record);
        return (Integer) newKey;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_BIZMEDIA
     *
     * @ibatorgenerated Thu Dec 23 20:32:12 CST 2010
     */
    public Integer insertSelective(JzBizmedia record) {
        Object newKey = getSqlMapClientTemplate().insert("JZ_BIZMEDIA.ibatorgenerated_insertSelective", record);
        return (Integer) newKey;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_BIZMEDIA
     *
     * @ibatorgenerated Thu Dec 23 20:32:12 CST 2010
     */
    @SuppressWarnings("unchecked")
    public List<JzBizmedia> selectByExample(JzBizmediaExample example) {
        List<JzBizmedia> list = getSqlMapClientTemplate().queryForList("JZ_BIZMEDIA.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_BIZMEDIA
     *
     * @ibatorgenerated Thu Dec 23 20:32:12 CST 2010
     */
    public JzBizmedia selectByPrimaryKey(Integer bizmediaId) {
        JzBizmedia key = new JzBizmedia();
        key.setBizmediaId(bizmediaId);
        JzBizmedia record = (JzBizmedia) getSqlMapClientTemplate().queryForObject("JZ_BIZMEDIA.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_BIZMEDIA
     *
     * @ibatorgenerated Thu Dec 23 20:32:12 CST 2010
     */
    public int updateByExampleSelective(JzBizmedia record, JzBizmediaExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("JZ_BIZMEDIA.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_BIZMEDIA
     *
     * @ibatorgenerated Thu Dec 23 20:32:12 CST 2010
     */
    public int updateByExample(JzBizmedia record, JzBizmediaExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("JZ_BIZMEDIA.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_BIZMEDIA
     *
     * @ibatorgenerated Thu Dec 23 20:32:12 CST 2010
     */
    public int updateByPrimaryKeySelective(JzBizmedia record) {
        int rows = getSqlMapClientTemplate().update("JZ_BIZMEDIA.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_BIZMEDIA
     *
     * @ibatorgenerated Thu Dec 23 20:32:12 CST 2010
     */
    public int updateByPrimaryKey(JzBizmedia record) {
        int rows = getSqlMapClientTemplate().update("JZ_BIZMEDIA.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table MEDICAL.JZ_BIZMEDIA
     *
     * @ibatorgenerated Thu Dec 23 20:32:12 CST 2010
     */
    private static class UpdateByExampleParms extends JzBizmediaExample {
        private Object record;

        public UpdateByExampleParms(Object record, JzBizmediaExample example) {
            super(example);
            this.record = record;
        }

        @SuppressWarnings("unused")
		public Object getRecord() {
            return record;
        }
    }
}