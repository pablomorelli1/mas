package com.mingda.dao.impl;

import com.mingda.dao.OrgPolicyDAO;
import com.mingda.model.OrgPolicy;
import com.mingda.model.OrgPolicyExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class OrgPolicyDAOImpl extends SqlMapClientDaoSupport implements OrgPolicyDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.ORG_POLICY
     *
     * @ibatorgenerated Sat Mar 21 20:19:29 CST 2015
     */
    public OrgPolicyDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.ORG_POLICY
     *
     * @ibatorgenerated Sat Mar 21 20:19:29 CST 2015
     */
    public int countByExample(OrgPolicyExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("ORG_POLICY.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.ORG_POLICY
     *
     * @ibatorgenerated Sat Mar 21 20:19:29 CST 2015
     */
    public int deleteByExample(OrgPolicyExample example) {
        int rows = getSqlMapClientTemplate().delete("ORG_POLICY.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.ORG_POLICY
     *
     * @ibatorgenerated Sat Mar 21 20:19:29 CST 2015
     */
    public int deleteByPrimaryKey(Integer pId) {
        OrgPolicy key = new OrgPolicy();
        key.setpId(pId);
        int rows = getSqlMapClientTemplate().delete("ORG_POLICY.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.ORG_POLICY
     *
     * @ibatorgenerated Sat Mar 21 20:19:29 CST 2015
     */
    public Integer insert(OrgPolicy record) {
        Object newKey = getSqlMapClientTemplate().insert("ORG_POLICY.ibatorgenerated_insert", record);
        return (Integer) newKey;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.ORG_POLICY
     *
     * @ibatorgenerated Sat Mar 21 20:19:29 CST 2015
     */
    public Integer insertSelective(OrgPolicy record) {
        Object newKey = getSqlMapClientTemplate().insert("ORG_POLICY.ibatorgenerated_insertSelective", record);
        return (Integer) newKey;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.ORG_POLICY
     *
     * @ibatorgenerated Sat Mar 21 20:19:29 CST 2015
     */
    @SuppressWarnings("unchecked")
    public List<OrgPolicy> selectByExample(OrgPolicyExample example) {
        List<OrgPolicy> list = getSqlMapClientTemplate().queryForList("ORG_POLICY.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.ORG_POLICY
     *
     * @ibatorgenerated Sat Mar 21 20:19:29 CST 2015
     */
    public OrgPolicy selectByPrimaryKey(Integer pId) {
        OrgPolicy key = new OrgPolicy();
        key.setpId(pId);
        OrgPolicy record = (OrgPolicy) getSqlMapClientTemplate().queryForObject("ORG_POLICY.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.ORG_POLICY
     *
     * @ibatorgenerated Sat Mar 21 20:19:29 CST 2015
     */
    public int updateByExampleSelective(OrgPolicy record, OrgPolicyExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("ORG_POLICY.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.ORG_POLICY
     *
     * @ibatorgenerated Sat Mar 21 20:19:29 CST 2015
     */
    public int updateByExample(OrgPolicy record, OrgPolicyExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("ORG_POLICY.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.ORG_POLICY
     *
     * @ibatorgenerated Sat Mar 21 20:19:29 CST 2015
     */
    public int updateByPrimaryKeySelective(OrgPolicy record) {
        int rows = getSqlMapClientTemplate().update("ORG_POLICY.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.ORG_POLICY
     *
     * @ibatorgenerated Sat Mar 21 20:19:29 CST 2015
     */
    public int updateByPrimaryKey(OrgPolicy record) {
        int rows = getSqlMapClientTemplate().update("ORG_POLICY.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table MEDICAL.ORG_POLICY
     *
     * @ibatorgenerated Sat Mar 21 20:19:29 CST 2015
     */
    private static class UpdateByExampleParms extends OrgPolicyExample {
        private Object record;

        public UpdateByExampleParms(Object record, OrgPolicyExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}