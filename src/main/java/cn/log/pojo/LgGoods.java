package cn.log.pojo;

import java.io.Serializable;

public class LgGoods implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_goods.goodsId
     *
     * @mbggenerated
     */
    private Integer goodsid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_goods.goodsName
     *
     * @mbggenerated
     */
    private String goodsname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_goods.amount
     *
     * @mbggenerated
     */
    private Integer amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_goods.weight
     *
     * @mbggenerated
     */
    private Double weight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_goods.volume
     *
     * @mbggenerated
     */
    private Double volume;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_goods.specificationType
     *
     * @mbggenerated
     */
    private String specificationtype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_goods.itemTypeId
     *
     * @mbggenerated
     */
    private Integer itemtypeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_goods.remarks
     *
     * @mbggenerated
     */
    private String remarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_goods.remarks1
     *
     * @mbggenerated
     */
    private String remarks1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_goods.remarks2
     *
     * @mbggenerated
     */
    private String remarks2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lg_goods
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_goods.goodsId
     *
     * @return the value of lg_goods.goodsId
     *
     * @mbggenerated
     */
    public Integer getGoodsid() {
        return goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_goods.goodsId
     *
     * @param goodsid the value for lg_goods.goodsId
     *
     * @mbggenerated
     */
    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_goods.goodsName
     *
     * @return the value of lg_goods.goodsName
     *
     * @mbggenerated
     */
    public String getGoodsname() {
        return goodsname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_goods.goodsName
     *
     * @param goodsname the value for lg_goods.goodsName
     *
     * @mbggenerated
     */
    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_goods.amount
     *
     * @return the value of lg_goods.amount
     *
     * @mbggenerated
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_goods.amount
     *
     * @param amount the value for lg_goods.amount
     *
     * @mbggenerated
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_goods.weight
     *
     * @return the value of lg_goods.weight
     *
     * @mbggenerated
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_goods.weight
     *
     * @param weight the value for lg_goods.weight
     *
     * @mbggenerated
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_goods.volume
     *
     * @return the value of lg_goods.volume
     *
     * @mbggenerated
     */
    public Double getVolume() {
        return volume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_goods.volume
     *
     * @param volume the value for lg_goods.volume
     *
     * @mbggenerated
     */
    public void setVolume(Double volume) {
        this.volume = volume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_goods.specificationType
     *
     * @return the value of lg_goods.specificationType
     *
     * @mbggenerated
     */
    public String getSpecificationtype() {
        return specificationtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_goods.specificationType
     *
     * @param specificationtype the value for lg_goods.specificationType
     *
     * @mbggenerated
     */
    public void setSpecificationtype(String specificationtype) {
        this.specificationtype = specificationtype == null ? null : specificationtype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_goods.itemTypeId
     *
     * @return the value of lg_goods.itemTypeId
     *
     * @mbggenerated
     */
    public Integer getItemtypeid() {
        return itemtypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_goods.itemTypeId
     *
     * @param itemtypeid the value for lg_goods.itemTypeId
     *
     * @mbggenerated
     */
    public void setItemtypeid(Integer itemtypeid) {
        this.itemtypeid = itemtypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_goods.remarks
     *
     * @return the value of lg_goods.remarks
     *
     * @mbggenerated
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_goods.remarks
     *
     * @param remarks the value for lg_goods.remarks
     *
     * @mbggenerated
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_goods.remarks1
     *
     * @return the value of lg_goods.remarks1
     *
     * @mbggenerated
     */
    public String getRemarks1() {
        return remarks1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_goods.remarks1
     *
     * @param remarks1 the value for lg_goods.remarks1
     *
     * @mbggenerated
     */
    public void setRemarks1(String remarks1) {
        this.remarks1 = remarks1 == null ? null : remarks1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_goods.remarks2
     *
     * @return the value of lg_goods.remarks2
     *
     * @mbggenerated
     */
    public String getRemarks2() {
        return remarks2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_goods.remarks2
     *
     * @param remarks2 the value for lg_goods.remarks2
     *
     * @mbggenerated
     */
    public void setRemarks2(String remarks2) {
        this.remarks2 = remarks2 == null ? null : remarks2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_goods
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsid=").append(goodsid);
        sb.append(", goodsname=").append(goodsname);
        sb.append(", amount=").append(amount);
        sb.append(", weight=").append(weight);
        sb.append(", volume=").append(volume);
        sb.append(", specificationtype=").append(specificationtype);
        sb.append(", itemtypeid=").append(itemtypeid);
        sb.append(", remarks=").append(remarks);
        sb.append(", remarks1=").append(remarks1);
        sb.append(", remarks2=").append(remarks2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}