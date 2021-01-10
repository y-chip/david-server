package com.yamamoto.yuta.david.infrastructure.repository.entity;

import io.swagger.v3.oas.annotations.media.Schema;

public class Sample {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SAMPLE.ID
     *
     * @mbg.generated
     */
    @Schema(required = true, nullable = true)
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SAMPLE.TEXT
     *
     * @mbg.generated
     */
    @Schema(required = true, nullable = true)
    private String text;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SAMPLE.LONG_TEXT
     *
     * @mbg.generated
     */
    @Schema(required = true, nullable = true)
    private String longText;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SAMPLE.NUMBER
     *
     * @mbg.generated
     */
    @Schema(required = true, nullable = true)
    private Integer number;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SAMPLE.ID
     *
     * @return the value of SAMPLE.ID
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SAMPLE.ID
     *
     * @param id the value for SAMPLE.ID
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SAMPLE.TEXT
     *
     * @return the value of SAMPLE.TEXT
     *
     * @mbg.generated
     */
    public String getText() {
        return text;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SAMPLE.TEXT
     *
     * @param text the value for SAMPLE.TEXT
     *
     * @mbg.generated
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SAMPLE.LONG_TEXT
     *
     * @return the value of SAMPLE.LONG_TEXT
     *
     * @mbg.generated
     */
    public String getLongText() {
        return longText;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SAMPLE.LONG_TEXT
     *
     * @param longText the value for SAMPLE.LONG_TEXT
     *
     * @mbg.generated
     */
    public void setLongText(String longText) {
        this.longText = longText;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SAMPLE.NUMBER
     *
     * @return the value of SAMPLE.NUMBER
     *
     * @mbg.generated
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SAMPLE.NUMBER
     *
     * @param number the value for SAMPLE.NUMBER
     *
     * @mbg.generated
     */
    public void setNumber(Integer number) {
        this.number = number;
    }
}