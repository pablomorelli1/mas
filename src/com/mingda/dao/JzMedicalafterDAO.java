package com.mingda.dao;

import com.mingda.model.JzMedicalafter;
import com.mingda.model.JzMedicalafterExample;
import java.util.List;

public interface JzMedicalafterDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTER
     *
     * @ibatorgenerated Thu Jan 08 10:56:11 CST 2015
     */
    int countByExample(JzMedicalafterExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTER
     *
     * @ibatorgenerated Thu Jan 08 10:56:11 CST 2015
     */
    int deleteByExample(JzMedicalafterExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTER
     *
     * @ibatorgenerated Thu Jan 08 10:56:11 CST 2015
     */
    int deleteByPrimaryKey(Integer bizId);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTER
     *
     * @ibatorgenerated Thu Jan 08 10:56:11 CST 2015
     */
    Integer insert(JzMedicalafter record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTER
     *
     * @ibatorgenerated Thu Jan 08 10:56:11 CST 2015
     */
    Integer insertSelective(JzMedicalafter record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTER
     *
     * @ibatorgenerated Thu Jan 08 10:56:11 CST 2015
     */
    List<JzMedicalafter> selectByExample(JzMedicalafterExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTER
     *
     * @ibatorgenerated Thu Jan 08 10:56:11 CST 2015
     */
    JzMedicalafter selectByPrimaryKey(Integer bizId);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTER
     *
     * @ibatorgenerated Thu Jan 08 10:56:11 CST 2015
     */
    int updateByExampleSelective(JzMedicalafter record, JzMedicalafterExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTER
     *
     * @ibatorgenerated Thu Jan 08 10:56:11 CST 2015
     */
    int updateByExample(JzMedicalafter record, JzMedicalafterExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTER
     *
     * @ibatorgenerated Thu Jan 08 10:56:11 CST 2015
     */
    int updateByPrimaryKeySelective(JzMedicalafter record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_MEDICALAFTER
     *
     * @ibatorgenerated Thu Jan 08 10:56:11 CST 2015
     */
    int updateByPrimaryKey(JzMedicalafter record);
}