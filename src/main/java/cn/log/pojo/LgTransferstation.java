package cn.log.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class LgTransferstation implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_transferstation.transferStationId
     *
     * @mbggenerated
     */
    private Integer transferstationid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_transferstation.stationName
     *
     * @mbggenerated
     */
    private String stationname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_transferstation.longitude
     *
     * @mbggenerated
     */
    private BigDecimal longitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_transferstation.latitude
     *
     * @mbggenerated
     */
    private BigDecimal latitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_transferstation.remarks1
     *
     * @mbggenerated
     */
    private String remarks1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_transferstation.remarks2
     *
     * @mbggenerated
     */
    private String remarks2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lg_transferstation
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_transferstation.transferStationId
     *
     * @return the value of lg_transferstation.transferStationId
     *
     * @mbggenerated
     */
    public Integer getTransferstationid() {
        return transferstationid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_transferstation.transferStationId
     *
     * @param transferstationid the value for lg_transferstation.transferStationId
     *
     * @mbggenerated
     */
    public void setTransferstationid(Integer transferstationid) {
        this.transferstationid = transferstationid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_transferstation.stationName
     *
     * @return the value of lg_transferstation.stationName
     *
     * @mbggenerated
     */
    public String getStationname() {
        return stationname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_transferstation.stationName
     *
     * @param stationname the value for lg_transferstation.stationName
     *
     * @mbggenerated
     */
    public void setStationname(String stationname) {
        this.stationname = stationname == null ? null : stationname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_transferstation.longitude
     *
     * @return the value of lg_transferstation.longitude
     *
     * @mbggenerated
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_transferstation.longitude
     *
     * @param longitude the value for lg_transferstation.longitude
     *
     * @mbggenerated
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_transferstation.latitude
     *
     * @return the value of lg_transferstation.latitude
     *
     * @mbggenerated
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_transferstation.latitude
     *
     * @param latitude the value for lg_transferstation.latitude
     *
     * @mbggenerated
     */
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_transferstation.remarks1
     *
     * @return the value of lg_transferstation.remarks1
     *
     * @mbggenerated
     */
    public String getRemarks1() {
        return remarks1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_transferstation.remarks1
     *
     * @param remarks1 the value for lg_transferstation.remarks1
     *
     * @mbggenerated
     */
    public void setRemarks1(String remarks1) {
        this.remarks1 = remarks1 == null ? null : remarks1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_transferstation.remarks2
     *
     * @return the value of lg_transferstation.remarks2
     *
     * @mbggenerated
     */
    public String getRemarks2() {
        return remarks2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_transferstation.remarks2
     *
     * @param remarks2 the value for lg_transferstation.remarks2
     *
     * @mbggenerated
     */
    public void setRemarks2(String remarks2) {
        this.remarks2 = remarks2 == null ? null : remarks2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_transferstation
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", transferstationid=").append(transferstationid);
        sb.append(", stationname=").append(stationname);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", remarks1=").append(remarks1);
        sb.append(", remarks2=").append(remarks2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}