package com.mingda.dao;

import com.mingda.model.JzMedicalafterfile;
import com.mingda.model.JzMedicalafterfileExample;
import java.math.BigDecimal;
import java.util.List;

public interface JzMedicalafterfileDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTERFILE
     *
     * @ibatorgenerated Thu Nov 22 20:45:30 CST 2012
     */
    int countByExample(JzMedicalafterfileExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTERFILE
     *
     * @ibatorgenerated Thu Nov 22 20:45:30 CST 2012
     */
    int deleteByExample(JzMedicalafterfileExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTERFILE
     *
     * @ibatorgenerated Thu Nov 22 20:45:30 CST 2012
     */
    int deleteByPrimaryKey(BigDecimal fileId);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTERFILE
     *
     * @ibatorgenerated Thu Nov 22 20:45:30 CST 2012
     */
    BigDecimal insert(JzMedicalafterfile record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTERFILE
     *
     * @ibatorgenerated Thu Nov 22 20:45:30 CST 2012
     */
    BigDecimal insertSelective(JzMedicalafterfile record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTERFILE
     *
     * @ibatorgenerated Thu Nov 22 20:45:30 CST 2012
     */
    List<JzMedicalafterfile> selectByExample(JzMedicalafterfileExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTERFILE
     *
     * @ibatorgenerated Thu Nov 22 20:45:30 CST 2012
     */
    JzMedicalafterfile selectByPrimaryKey(BigDecimal fileId);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTERFILE
     *
     * @ibatorgenerated Thu Nov 22 20:45:30 CST 2012
     */
    int updateByExampleSelective(JzMedicalafterfile record, JzMedicalafterfileExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTERFILE
     *
     * @ibatorgenerated Thu Nov 22 20:45:30 CST 2012
     */
    int updateByExample(JzMedicalafterfile record, JzMedicalafterfileExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTERFILE
     *
     * @ibatorgenerated Thu Nov 22 20:45:30 CST 2012
     */
    int updateByPrimaryKeySelective(JzMedicalafterfile record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTERFILE
     *
     * @ibatorgenerated Thu Nov 22 20:45:30 CST 2012
     */
    int updateByPrimaryKey(JzMedicalafterfile record);
}