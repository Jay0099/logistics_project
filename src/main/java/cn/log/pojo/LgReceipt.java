package cn.log.pojo;

import java.io.Serializable;
import java.util.Date;

public class LgReceipt implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_receipt.receiptId
     *
     * @mbggenerated
     */
    private Integer receiptid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_receipt.orderId
     *
     * @mbggenerated
     */
    private Integer orderid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_receipt.receiptCount
     *
     * @mbggenerated
     */
    private Integer receiptcount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_receipt.receiptVolume
     *
     * @mbggenerated
     */
    private Double receiptvolume;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_receipt.receiptWeight
     *
     * @mbggenerated
     */
    private Double receiptweight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_receipt.cargoAmount
     *
     * @mbggenerated
     */
    private Integer cargoamount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_receipt.cargoDeduction
     *
     * @mbggenerated
     */
    private Double cargodeduction;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_receipt.serviceDeduction
     *
     * @mbggenerated
     */
    private Double servicededuction;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_receipt.receiptNote
     *
     * @mbggenerated
     */
    private String receiptnote;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_receipt.returnDate
     *
     * @mbggenerated
     */
    private Date returndate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_receipt.remarks1
     *
     * @mbggenerated
     */
    private String remarks1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_receipt.remarks2
     *
     * @mbggenerated
     */
    private String remarks2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lg_receipt
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_receipt.receiptId
     *
     * @return the value of lg_receipt.receiptId
     *
     * @mbggenerated
     */
    public Integer getReceiptid() {
        return receiptid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_receipt.receiptId
     *
     * @param receiptid the value for lg_receipt.receiptId
     *
     * @mbggenerated
     */
    public void setReceiptid(Integer receiptid) {
        this.receiptid = receiptid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_receipt.orderId
     *
     * @return the value of lg_receipt.orderId
     *
     * @mbggenerated
     */
    public Integer getOrderid() {
        return orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_receipt.orderId
     *
     * @param orderid the value for lg_receipt.orderId
     *
     * @mbggenerated
     */
    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_receipt.receiptCount
     *
     * @return the value of lg_receipt.receiptCount
     *
     * @mbggenerated
     */
    public Integer getReceiptcount() {
        return receiptcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_receipt.receiptCount
     *
     * @param receiptcount the value for lg_receipt.receiptCount
     *
     * @mbggenerated
     */
    public void setReceiptcount(Integer receiptcount) {
        this.receiptcount = receiptcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_receipt.receiptVolume
     *
     * @return the value of lg_receipt.receiptVolume
     *
     * @mbggenerated
     */
    public Double getReceiptvolume() {
        return receiptvolume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_receipt.receiptVolume
     *
     * @param receiptvolume the value for lg_receipt.receiptVolume
     *
     * @mbggenerated
     */
    public void setReceiptvolume(Double receiptvolume) {
        this.receiptvolume = receiptvolume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_receipt.receiptWeight
     *
     * @return the value of lg_receipt.receiptWeight
     *
     * @mbggenerated
     */
    public Double getReceiptweight() {
        return receiptweight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_receipt.receiptWeight
     *
     * @param receiptweight the value for lg_receipt.receiptWeight
     *
     * @mbggenerated
     */
    public void setReceiptweight(Double receiptweight) {
        this.receiptweight = receiptweight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_receipt.cargoAmount
     *
     * @return the value of lg_receipt.cargoAmount
     *
     * @mbggenerated
     */
    public Integer getCargoamount() {
        return cargoamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_receipt.cargoAmount
     *
     * @param cargoamount the value for lg_receipt.cargoAmount
     *
     * @mbggenerated
     */
    public void setCargoamount(Integer cargoamount) {
        this.cargoamount = cargoamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_receipt.cargoDeduction
     *
     * @return the value of lg_receipt.cargoDeduction
     *
     * @mbggenerated
     */
    public Double getCargodeduction() {
        return cargodeduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_receipt.cargoDeduction
     *
     * @param cargodeduction the value for lg_receipt.cargoDeduction
     *
     * @mbggenerated
     */
    public void setCargodeduction(Double cargodeduction) {
        this.cargodeduction = cargodeduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_receipt.serviceDeduction
     *
     * @return the value of lg_receipt.serviceDeduction
     *
     * @mbggenerated
     */
    public Double getServicededuction() {
        return servicededuction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_receipt.serviceDeduction
     *
     * @param servicededuction the value for lg_receipt.serviceDeduction
     *
     * @mbggenerated
     */
    public void setServicededuction(Double servicededuction) {
        this.servicededuction = servicededuction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_receipt.receiptNote
     *
     * @return the value of lg_receipt.receiptNote
     *
     * @mbggenerated
     */
    public String getReceiptnote() {
        return receiptnote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_receipt.receiptNote
     *
     * @param receiptnote the value for lg_receipt.receiptNote
     *
     * @mbggenerated
     */
    public void setReceiptnote(String receiptnote) {
        this.receiptnote = receiptnote == null ? null : receiptnote.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_receipt.returnDate
     *
     * @return the value of lg_receipt.returnDate
     *
     * @mbggenerated
     */
    public Date getReturndate() {
        return returndate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_receipt.returnDate
     *
     * @param returndate the value for lg_receipt.returnDate
     *
     * @mbggenerated
     */
    public void setReturndate(Date returndate) {
        this.returndate = returndate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_receipt.remarks1
     *
     * @return the value of lg_receipt.remarks1
     *
     * @mbggenerated
     */
    public String getRemarks1() {
        return remarks1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_receipt.remarks1
     *
     * @param remarks1 the value for lg_receipt.remarks1
     *
     * @mbggenerated
     */
    public void setRemarks1(String remarks1) {
        this.remarks1 = remarks1 == null ? null : remarks1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_receipt.remarks2
     *
     * @return the value of lg_receipt.remarks2
     *
     * @mbggenerated
     */
    public String getRemarks2() {
        return remarks2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_receipt.remarks2
     *
     * @param remarks2 the value for lg_receipt.remarks2
     *
     * @mbggenerated
     */
    public void setRemarks2(String remarks2) {
        this.remarks2 = remarks2 == null ? null : remarks2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_receipt
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", receiptid=").append(receiptid);
        sb.append(", orderid=").append(orderid);
        sb.append(", receiptcount=").append(receiptcount);
        sb.append(", receiptvolume=").append(receiptvolume);
        sb.append(", receiptweight=").append(receiptweight);
        sb.append(", cargoamount=").append(cargoamount);
        sb.append(", cargodeduction=").append(cargodeduction);
        sb.append(", servicededuction=").append(servicededuction);
        sb.append(", receiptnote=").append(receiptnote);
        sb.append(", returndate=").append(returndate);
        sb.append(", remarks1=").append(remarks1);
        sb.append(", remarks2=").append(remarks2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}