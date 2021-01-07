package com.yamamoto.yuta.david.infrastructure.repository.mapper;

import com.yamamoto.yuta.david.infrastructure.repository.entity.Sample;
import com.yamamoto.yuta.david.infrastructure.repository.entity.SampleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SampleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAMPLE
     *
     * @mbg.generated
     */
    long countByExample(SampleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAMPLE
     *
     * @mbg.generated
     */
    int deleteByExample(SampleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAMPLE
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAMPLE
     *
     * @mbg.generated
     */
    int insert(Sample record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAMPLE
     *
     * @mbg.generated
     */
    int insertSelective(Sample record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAMPLE
     *
     * @mbg.generated
     */
    List<Sample> selectByExample(SampleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAMPLE
     *
     * @mbg.generated
     */
    java.util.Optional<Sample> selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAMPLE
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Sample record, @Param("example") SampleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAMPLE
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Sample record, @Param("example") SampleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAMPLE
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Sample record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SAMPLE
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Sample record);
}