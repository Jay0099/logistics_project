package cn.log.pojo;

import java.io.Serializable;

public class LgCompany implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_company.companyId
     *
     * @mbggenerated
     */
    private Integer companyid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_company.companyName
     *
     * @mbggenerated
     */
    private String companyname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_company.corporateRepresentative
     *
     * @mbggenerated
     */
    private String corporaterepresentative;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_company.businessLicense
     *
     * @mbggenerated
     */
    private String businesslicense;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_company.taxRegistrationNumber
     *
     * @mbggenerated
     */
    private String taxregistrationnumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_company.affiliatedGroup
     *
     * @mbggenerated
     */
    private String affiliatedgroup;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_company.registeredCapital
     *
     * @mbggenerated
     */
    private Double registeredcapital;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_company.remarks1
     *
     * @mbggenerated
     */
    private String remarks1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_company.remarks2
     *
     * @mbggenerated
     */
    private String remarks2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lg_company
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_company.companyId
     *
     * @return the value of lg_company.companyId
     *
     * @mbggenerated
     */
    public Integer getCompanyid() {
        return companyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_company.companyId
     *
     * @param companyid the value for lg_company.companyId
     *
     * @mbggenerated
     */
    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_company.companyName
     *
     * @return the value of lg_company.companyName
     *
     * @mbggenerated
     */
    public String getCompanyname() {
        return companyname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_company.companyName
     *
     * @param companyname the value for lg_company.companyName
     *
     * @mbggenerated
     */
    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_company.corporateRepresentative
     *
     * @return the value of lg_company.corporateRepresentative
     *
     * @mbggenerated
     */
    public String getCorporaterepresentative() {
        return corporaterepresentative;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_company.corporateRepresentative
     *
     * @param corporaterepresentative the value for lg_company.corporateRepresentative
     *
     * @mbggenerated
     */
    public void setCorporaterepresentative(String corporaterepresentative) {
        this.corporaterepresentative = corporaterepresentative == null ? null : corporaterepresentative.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_company.businessLicense
     *
     * @return the value of lg_company.businessLicense
     *
     * @mbggenerated
     */
    public String getBusinesslicense() {
        return businesslicense;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_company.businessLicense
     *
     * @param businesslicense the value for lg_company.businessLicense
     *
     * @mbggenerated
     */
    public void setBusinesslicense(String businesslicense) {
        this.businesslicense = businesslicense == null ? null : businesslicense.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_company.taxRegistrationNumber
     *
     * @return the value of lg_company.taxRegistrationNumber
     *
     * @mbggenerated
     */
    public String getTaxregistrationnumber() {
        return taxregistrationnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_company.taxRegistrationNumber
     *
     * @param taxregistrationnumber the value for lg_company.taxRegistrationNumber
     *
     * @mbggenerated
     */
    public void setTaxregistrationnumber(String taxregistrationnumber) {
        this.taxregistrationnumber = taxregistrationnumber == null ? null : taxregistrationnumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_company.affiliatedGroup
     *
     * @return the value of lg_company.affiliatedGroup
     *
     * @mbggenerated
     */
    public String getAffiliatedgroup() {
        return affiliatedgroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_company.affiliatedGroup
     *
     * @param affiliatedgroup the value for lg_company.affiliatedGroup
     *
     * @mbggenerated
     */
    public void setAffiliatedgroup(String affiliatedgroup) {
        this.affiliatedgroup = affiliatedgroup == null ? null : affiliatedgroup.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_company.registeredCapital
     *
     * @return the value of lg_company.registeredCapital
     *
     * @mbggenerated
     */
    public Double getRegisteredcapital() {
        return registeredcapital;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_company.registeredCapital
     *
     * @param registeredcapital the value for lg_company.registeredCapital
     *
     * @mbggenerated
     */
    public void setRegisteredcapital(Double registeredcapital) {
        this.registeredcapital = registeredcapital;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_company.remarks1
     *
     * @return the value of lg_company.remarks1
     *
     * @mbggenerated
     */
    public String getRemarks1() {
        return remarks1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_company.remarks1
     *
     * @param remarks1 the value for lg_company.remarks1
     *
     * @mbggenerated
     */
    public void setRemarks1(String remarks1) {
        this.remarks1 = remarks1 == null ? null : remarks1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_company.remarks2
     *
     * @return the value of lg_company.remarks2
     *
     * @mbggenerated
     */
    public String getRemarks2() {
        return remarks2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_company.remarks2
     *
     * @param remarks2 the value for lg_company.remarks2
     *
     * @mbggenerated
     */
    public void setRemarks2(String remarks2) {
        this.remarks2 = remarks2 == null ? null : remarks2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_company
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", companyid=").append(companyid);
        sb.append(", companyname=").append(companyname);
        sb.append(", corporaterepresentative=").append(corporaterepresentative);
        sb.append(", businesslicense=").append(businesslicense);
        sb.append(", taxregistrationnumber=").append(taxregistrationnumber);
        sb.append(", affiliatedgroup=").append(affiliatedgroup);
        sb.append(", registeredcapital=").append(registeredcapital);
        sb.append(", remarks1=").append(remarks1);
        sb.append(", remarks2=").append(remarks2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}