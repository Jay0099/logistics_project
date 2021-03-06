package cn.log.pojo;

import java.io.Serializable;
import java.util.Date;

public class LgWaybill implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_waybill.wayBillId
     *
     * @mbggenerated
     */
    private Integer waybillid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_waybill.departureTime
     *
     * @mbggenerated
     */
    private Date departuretime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_waybill.vehicleOperationId
     *
     * @mbggenerated
     */
    private Integer vehicleoperationid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_waybill.viaCompany
     *
     * @mbggenerated
     */
    private String viacompany;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_waybill.carrierCompany
     *
     * @mbggenerated
     */
    private String carriercompany;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_waybill.contentShipment
     *
     * @mbggenerated
     */
    private String contentshipment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_waybill.accountingTotalCost
     *
     * @mbggenerated
     */
    private Double accountingtotalcost;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_waybill.contractFreight
     *
     * @mbggenerated
     */
    private Double contractfreight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_waybill.prepayment
     *
     * @mbggenerated
     */
    private Double prepayment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_waybill.balanceSettlementMethod
     *
     * @mbggenerated
     */
    private Integer balancesettlementmethod;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_waybill.arrivalTime
     *
     * @mbggenerated
     */
    private Date arrivaltime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_waybill.mileage
     *
     * @mbggenerated
     */
    private Double mileage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_waybill.vehicleOrigin
     *
     * @mbggenerated
     */
    private String vehicleorigin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_waybill.vehicleArrival
     *
     * @mbggenerated
     */
    private String vehiclearrival;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_waybill.wayBillStatus
     *
     * @mbggenerated
     */
    private Integer waybillstatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_waybill.remarks
     *
     * @mbggenerated
     */
    private String remarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_waybill.goodsValuation
     *
     * @mbggenerated
     */
    private Double goodsvaluation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_waybill.remarks1
     *
     * @mbggenerated
     */
    private String remarks1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_waybill.remarks2
     *
     * @mbggenerated
     */
    private String remarks2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lg_waybill
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_waybill.wayBillId
     *
     * @return the value of lg_waybill.wayBillId
     *
     * @mbggenerated
     */
    public Integer getWaybillid() {
        return waybillid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_waybill.wayBillId
     *
     * @param waybillid the value for lg_waybill.wayBillId
     *
     * @mbggenerated
     */
    public void setWaybillid(Integer waybillid) {
        this.waybillid = waybillid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_waybill.departureTime
     *
     * @return the value of lg_waybill.departureTime
     *
     * @mbggenerated
     */
    public Date getDeparturetime() {
        return departuretime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_waybill.departureTime
     *
     * @param departuretime the value for lg_waybill.departureTime
     *
     * @mbggenerated
     */
    public void setDeparturetime(Date departuretime) {
        this.departuretime = departuretime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_waybill.vehicleOperationId
     *
     * @return the value of lg_waybill.vehicleOperationId
     *
     * @mbggenerated
     */
    public Integer getVehicleoperationid() {
        return vehicleoperationid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_waybill.vehicleOperationId
     *
     * @param vehicleoperationid the value for lg_waybill.vehicleOperationId
     *
     * @mbggenerated
     */
    public void setVehicleoperationid(Integer vehicleoperationid) {
        this.vehicleoperationid = vehicleoperationid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_waybill.viaCompany
     *
     * @return the value of lg_waybill.viaCompany
     *
     * @mbggenerated
     */
    public String getViacompany() {
        return viacompany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_waybill.viaCompany
     *
     * @param viacompany the value for lg_waybill.viaCompany
     *
     * @mbggenerated
     */
    public void setViacompany(String viacompany) {
        this.viacompany = viacompany == null ? null : viacompany.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_waybill.carrierCompany
     *
     * @return the value of lg_waybill.carrierCompany
     *
     * @mbggenerated
     */
    public String getCarriercompany() {
        return carriercompany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_waybill.carrierCompany
     *
     * @param carriercompany the value for lg_waybill.carrierCompany
     *
     * @mbggenerated
     */
    public void setCarriercompany(String carriercompany) {
        this.carriercompany = carriercompany == null ? null : carriercompany.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_waybill.contentShipment
     *
     * @return the value of lg_waybill.contentShipment
     *
     * @mbggenerated
     */
    public String getContentshipment() {
        return contentshipment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_waybill.contentShipment
     *
     * @param contentshipment the value for lg_waybill.contentShipment
     *
     * @mbggenerated
     */
    public void setContentshipment(String contentshipment) {
        this.contentshipment = contentshipment == null ? null : contentshipment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_waybill.accountingTotalCost
     *
     * @return the value of lg_waybill.accountingTotalCost
     *
     * @mbggenerated
     */
    public Double getAccountingtotalcost() {
        return accountingtotalcost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_waybill.accountingTotalCost
     *
     * @param accountingtotalcost the value for lg_waybill.accountingTotalCost
     *
     * @mbggenerated
     */
    public void setAccountingtotalcost(Double accountingtotalcost) {
        this.accountingtotalcost = accountingtotalcost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_waybill.contractFreight
     *
     * @return the value of lg_waybill.contractFreight
     *
     * @mbggenerated
     */
    public Double getContractfreight() {
        return contractfreight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_waybill.contractFreight
     *
     * @param contractfreight the value for lg_waybill.contractFreight
     *
     * @mbggenerated
     */
    public void setContractfreight(Double contractfreight) {
        this.contractfreight = contractfreight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_waybill.prepayment
     *
     * @return the value of lg_waybill.prepayment
     *
     * @mbggenerated
     */
    public Double getPrepayment() {
        return prepayment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_waybill.prepayment
     *
     * @param prepayment the value for lg_waybill.prepayment
     *
     * @mbggenerated
     */
    public void setPrepayment(Double prepayment) {
        this.prepayment = prepayment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_waybill.balanceSettlementMethod
     *
     * @return the value of lg_waybill.balanceSettlementMethod
     *
     * @mbggenerated
     */
    public Integer getBalancesettlementmethod() {
        return balancesettlementmethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_waybill.balanceSettlementMethod
     *
     * @param balancesettlementmethod the value for lg_waybill.balanceSettlementMethod
     *
     * @mbggenerated
     */
    public void setBalancesettlementmethod(Integer balancesettlementmethod) {
        this.balancesettlementmethod = balancesettlementmethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_waybill.arrivalTime
     *
     * @return the value of lg_waybill.arrivalTime
     *
     * @mbggenerated
     */
    public Date getArrivaltime() {
        return arrivaltime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_waybill.arrivalTime
     *
     * @param arrivaltime the value for lg_waybill.arrivalTime
     *
     * @mbggenerated
     */
    public void setArrivaltime(Date arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_waybill.mileage
     *
     * @return the value of lg_waybill.mileage
     *
     * @mbggenerated
     */
    public Double getMileage() {
        return mileage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_waybill.mileage
     *
     * @param mileage the value for lg_waybill.mileage
     *
     * @mbggenerated
     */
    public void setMileage(Double mileage) {
        this.mileage = mileage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_waybill.vehicleOrigin
     *
     * @return the value of lg_waybill.vehicleOrigin
     *
     * @mbggenerated
     */
    public String getVehicleorigin() {
        return vehicleorigin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_waybill.vehicleOrigin
     *
     * @param vehicleorigin the value for lg_waybill.vehicleOrigin
     *
     * @mbggenerated
     */
    public void setVehicleorigin(String vehicleorigin) {
        this.vehicleorigin = vehicleorigin == null ? null : vehicleorigin.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_waybill.vehicleArrival
     *
     * @return the value of lg_waybill.vehicleArrival
     *
     * @mbggenerated
     */
    public String getVehiclearrival() {
        return vehiclearrival;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_waybill.vehicleArrival
     *
     * @param vehiclearrival the value for lg_waybill.vehicleArrival
     *
     * @mbggenerated
     */
    public void setVehiclearrival(String vehiclearrival) {
        this.vehiclearrival = vehiclearrival == null ? null : vehiclearrival.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_waybill.wayBillStatus
     *
     * @return the value of lg_waybill.wayBillStatus
     *
     * @mbggenerated
     */
    public Integer getWaybillstatus() {
        return waybillstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_waybill.wayBillStatus
     *
     * @param waybillstatus the value for lg_waybill.wayBillStatus
     *
     * @mbggenerated
     */
    public void setWaybillstatus(Integer waybillstatus) {
        this.waybillstatus = waybillstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_waybill.remarks
     *
     * @return the value of lg_waybill.remarks
     *
     * @mbggenerated
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_waybill.remarks
     *
     * @param remarks the value for lg_waybill.remarks
     *
     * @mbggenerated
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_waybill.goodsValuation
     *
     * @return the value of lg_waybill.goodsValuation
     *
     * @mbggenerated
     */
    public Double getGoodsvaluation() {
        return goodsvaluation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_waybill.goodsValuation
     *
     * @param goodsvaluation the value for lg_waybill.goodsValuation
     *
     * @mbggenerated
     */
    public void setGoodsvaluation(Double goodsvaluation) {
        this.goodsvaluation = goodsvaluation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_waybill.remarks1
     *
     * @return the value of lg_waybill.remarks1
     *
     * @mbggenerated
     */
    public String getRemarks1() {
        return remarks1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_waybill.remarks1
     *
     * @param remarks1 the value for lg_waybill.remarks1
     *
     * @mbggenerated
     */
    public void setRemarks1(String remarks1) {
        this.remarks1 = remarks1 == null ? null : remarks1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_waybill.remarks2
     *
     * @return the value of lg_waybill.remarks2
     *
     * @mbggenerated
     */
    public String getRemarks2() {
        return remarks2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_waybill.remarks2
     *
     * @param remarks2 the value for lg_waybill.remarks2
     *
     * @mbggenerated
     */
    public void setRemarks2(String remarks2) {
        this.remarks2 = remarks2 == null ? null : remarks2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_waybill
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", waybillid=").append(waybillid);
        sb.append(", departuretime=").append(departuretime);
        sb.append(", vehicleoperationid=").append(vehicleoperationid);
        sb.append(", viacompany=").append(viacompany);
        sb.append(", carriercompany=").append(carriercompany);
        sb.append(", contentshipment=").append(contentshipment);
        sb.append(", accountingtotalcost=").append(accountingtotalcost);
        sb.append(", contractfreight=").append(contractfreight);
        sb.append(", prepayment=").append(prepayment);
        sb.append(", balancesettlementmethod=").append(balancesettlementmethod);
        sb.append(", arrivaltime=").append(arrivaltime);
        sb.append(", mileage=").append(mileage);
        sb.append(", vehicleorigin=").append(vehicleorigin);
        sb.append(", vehiclearrival=").append(vehiclearrival);
        sb.append(", waybillstatus=").append(waybillstatus);
        sb.append(", remarks=").append(remarks);
        sb.append(", goodsvaluation=").append(goodsvaluation);
        sb.append(", remarks1=").append(remarks1);
        sb.append(", remarks2=").append(remarks2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}