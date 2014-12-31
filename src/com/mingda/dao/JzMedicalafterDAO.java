package com.mingda.dao;

import com.mingda.model.JzMedicalafter;
import com.mingda.model.JzMedicalafterExample;
import java.util.List;

public interface JzMedicalafterDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTER
     *
     * @ibatorgenerated Wed Dec 31 09:30:32 CST 2014
     */
    int countByExample(JzMedicalafterExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTER
     *
     * @ibatorgenerated Wed Dec 31 09:30:32 CST 2014
     */
    int deleteByExample(JzMedicalafterExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTER
     *
     * @ibatorgenerated Wed Dec 31 09:30:32 CST 2014
     */
    int deleteByPrimaryKey(Integer bizId);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTER
     *
     * @ibatorgenerated Wed Dec 31 09:30:32 CST 2014
     */
    Integer insert(JzMedicalafter record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTER
     *
     * @ibatorgenerated Wed Dec 31 09:30:32 CST 2014
     */
    Integer insertSelective(JzMedicalafter record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTER
     *
     * @ibatorgenerated Wed Dec 31 09:30:32 CST 2014
     */
    List<JzMedicalafter> selectByExample(JzMedicalafterExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTER
     *
     * @ibatorgenerated Wed Dec 31 09:30:32 CST 2014
     */
    JzMedicalafter selectByPrimaryKey(Integer bizId);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTER
     *
     * @ibatorgenerated Wed Dec 31 09:30:32 CST 2014
     */
    int updateByExampleSelective(JzMedicalafter record, JzMedicalafterExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTER
     *
     * @ibatorgenerated Wed Dec 31 09:30:32 CST 2014
     */
    int updateByExample(JzMedicalafter record, JzMedicalafterExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTER
     *
     * @ibatorgenerated Wed Dec 31 09:30:32 CST 2014
     */
    int updateByPrimaryKeySelective(JzMedicalafter record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTER
     *
     * @ibatorgenerated Wed Dec 31 09:30:32 CST 2014
     */
    int updateByPrimaryKey(JzMedicalafter record);
}