package cn.log.pojo;

import java.io.Serializable;
import java.util.Date;

public class LgVehicleoperation implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_vehicleoperation.vehicleOperationId
     *
     * @mbggenerated
     */
    private Integer vehicleoperationid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_vehicleoperation.licenseNumber
     *
     * @mbggenerated
     */
    private String licensenumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_vehicleoperation.useCompanyId
     *
     * @mbggenerated
     */
    private Integer usecompanyid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_vehicleoperation.carrierId
     *
     * @mbggenerated
     */
    private Integer carrierid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_vehicleoperation.companyVehicleModelId
     *
     * @mbggenerated
     */
    private Integer companyvehiclemodelid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_vehicleoperation.deadWeight
     *
     * @mbggenerated
     */
    private Double deadweight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_vehicleoperation.authorizeDvolume
     *
     * @mbggenerated
     */
    private Double authorizedvolume;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_vehicleoperation.purchaseDate
     *
     * @mbggenerated
     */
    private Date purchasedate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_vehicleoperation.originalPrice
     *
     * @mbggenerated
     */
    private Double originalprice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_vehicleoperation.certificateOperation
     *
     * @mbggenerated
     */
    private String certificateoperation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_vehicleoperation.state
     *
     * @mbggenerated
     */
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_vehicleoperation.remarks
     *
     * @mbggenerated
     */
    private String remarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_vehicleoperation.vehicleType
     *
     * @mbggenerated
     */
    private String vehicletype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_vehicleoperation.vehicleModel
     *
     * @mbggenerated
     */
    private String vehiclemodel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_vehicleoperation.drivingForm
     *
     * @mbggenerated
     */
    private String drivingform;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_vehicleoperation.chassisModel
     *
     * @mbggenerated
     */
    private String chassismodel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_vehicleoperation.engineNumber
     *
     * @mbggenerated
     */
    private String enginenumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_vehicleoperation.frameNumber
     *
     * @mbggenerated
     */
    private String framenumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_vehicleoperation.engineModel
     *
     * @mbggenerated
     */
    private String enginemodel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_vehicleoperation.enginePower
     *
     * @mbggenerated
     */
    private String enginepower;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_vehicleoperation.emissionStandard
     *
     * @mbggenerated
     */
    private String emissionstandard;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_vehicleoperation.transmissionForm
     *
     * @mbggenerated
     */
    private String transmissionform;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_vehicleoperation.vehicleDriverRecordsId
     *
     * @mbggenerated
     */
    private Integer vehicledriverrecordsid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_vehicleoperation.fleetId
     *
     * @mbggenerated
     */
    private Integer fleetid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_vehicleoperation.remarks1
     *
     * @mbggenerated
     */
    private String remarks1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_vehicleoperation.remarks2
     *
     * @mbggenerated
     */
    private String remarks2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lg_vehicleoperation
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_vehicleoperation.vehicleOperationId
     *
     * @return the value of lg_vehicleoperation.vehicleOperationId
     *
     * @mbggenerated
     */
    public Integer getVehicleoperationid() {
        return vehicleoperationid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_vehicleoperation.vehicleOperationId
     *
     * @param vehicleoperationid the value for lg_vehicleoperation.vehicleOperationId
     *
     * @mbggenerated
     */
    public void setVehicleoperationid(Integer vehicleoperationid) {
        this.vehicleoperationid = vehicleoperationid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_vehicleoperation.licenseNumber
     *
     * @return the value of lg_vehicleoperation.licenseNumber
     *
     * @mbggenerated
     */
    public String getLicensenumber() {
        return licensenumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_vehicleoperation.licenseNumber
     *
     * @param licensenumber the value for lg_vehicleoperation.licenseNumber
     *
     * @mbggenerated
     */
    public void setLicensenumber(String licensenumber) {
        this.licensenumber = licensenumber == null ? null : licensenumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_vehicleoperation.useCompanyId
     *
     * @return the value of lg_vehicleoperation.useCompanyId
     *
     * @mbggenerated
     */
    public Integer getUsecompanyid() {
        return usecompanyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_vehicleoperation.useCompanyId
     *
     * @param usecompanyid the value for lg_vehicleoperation.useCompanyId
     *
     * @mbggenerated
     */
    public void setUsecompanyid(Integer usecompanyid) {
        this.usecompanyid = usecompanyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_vehicleoperation.carrierId
     *
     * @return the value of lg_vehicleoperation.carrierId
     *
     * @mbggenerated
     */
    public Integer getCarrierid() {
        return carrierid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_vehicleoperation.carrierId
     *
     * @param carrierid the value for lg_vehicleoperation.carrierId
     *
     * @mbggenerated
     */
    public void setCarrierid(Integer carrierid) {
        this.carrierid = carrierid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_vehicleoperation.companyVehicleModelId
     *
     * @return the value of lg_vehicleoperation.companyVehicleModelId
     *
     * @mbggenerated
     */
    public Integer getCompanyvehiclemodelid() {
        return companyvehiclemodelid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_vehicleoperation.companyVehicleModelId
     *
     * @param companyvehiclemodelid the value for lg_vehicleoperation.companyVehicleModelId
     *
     * @mbggenerated
     */
    public void setCompanyvehiclemodelid(Integer companyvehiclemodelid) {
        this.companyvehiclemodelid = companyvehiclemodelid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_vehicleoperation.deadWeight
     *
     * @return the value of lg_vehicleoperation.deadWeight
     *
     * @mbggenerated
     */
    public Double getDeadweight() {
        return deadweight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_vehicleoperation.deadWeight
     *
     * @param deadweight the value for lg_vehicleoperation.deadWeight
     *
     * @mbggenerated
     */
    public void setDeadweight(Double deadweight) {
        this.deadweight = deadweight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_vehicleoperation.authorizeDvolume
     *
     * @return the value of lg_vehicleoperation.authorizeDvolume
     *
     * @mbggenerated
     */
    public Double getAuthorizedvolume() {
        return authorizedvolume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_vehicleoperation.authorizeDvolume
     *
     * @param authorizedvolume the value for lg_vehicleoperation.authorizeDvolume
     *
     * @mbggenerated
     */
    public void setAuthorizedvolume(Double authorizedvolume) {
        this.authorizedvolume = authorizedvolume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_vehicleoperation.purchaseDate
     *
     * @return the value of lg_vehicleoperation.purchaseDate
     *
     * @mbggenerated
     */
    public Date getPurchasedate() {
        return purchasedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_vehicleoperation.purchaseDate
     *
     * @param purchasedate the value for lg_vehicleoperation.purchaseDate
     *
     * @mbggenerated
     */
    public void setPurchasedate(Date purchasedate) {
        this.purchasedate = purchasedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_vehicleoperation.originalPrice
     *
     * @return the value of lg_vehicleoperation.originalPrice
     *
     * @mbggenerated
     */
    public Double getOriginalprice() {
        return originalprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_vehicleoperation.originalPrice
     *
     * @param originalprice the value for lg_vehicleoperation.originalPrice
     *
     * @mbggenerated
     */
    public void setOriginalprice(Double originalprice) {
        this.originalprice = originalprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_vehicleoperation.certificateOperation
     *
     * @return the value of lg_vehicleoperation.certificateOperation
     *
     * @mbggenerated
     */
    public String getCertificateoperation() {
        return certificateoperation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_vehicleoperation.certificateOperation
     *
     * @param certificateoperation the value for lg_vehicleoperation.certificateOperation
     *
     * @mbggenerated
     */
    public void setCertificateoperation(String certificateoperation) {
        this.certificateoperation = certificateoperation == null ? null : certificateoperation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_vehicleoperation.state
     *
     * @return the value of lg_vehicleoperation.state
     *
     * @mbggenerated
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_vehicleoperation.state
     *
     * @param state the value for lg_vehicleoperation.state
     *
     * @mbggenerated
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_vehicleoperation.remarks
     *
     * @return the value of lg_vehicleoperation.remarks
     *
     * @mbggenerated
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_vehicleoperation.remarks
     *
     * @param remarks the value for lg_vehicleoperation.remarks
     *
     * @mbggenerated
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_vehicleoperation.vehicleType
     *
     * @return the value of lg_vehicleoperation.vehicleType
     *
     * @mbggenerated
     */
    public String getVehicletype() {
        return vehicletype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_vehicleoperation.vehicleType
     *
     * @param vehicletype the value for lg_vehicleoperation.vehicleType
     *
     * @mbggenerated
     */
    public void setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype == null ? null : vehicletype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_vehicleoperation.vehicleModel
     *
     * @return the value of lg_vehicleoperation.vehicleModel
     *
     * @mbggenerated
     */
    public String getVehiclemodel() {
        return vehiclemodel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_vehicleoperation.vehicleModel
     *
     * @param vehiclemodel the value for lg_vehicleoperation.vehicleModel
     *
     * @mbggenerated
     */
    public void setVehiclemodel(String vehiclemodel) {
        this.vehiclemodel = vehiclemodel == null ? null : vehiclemodel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_vehicleoperation.drivingForm
     *
     * @return the value of lg_vehicleoperation.drivingForm
     *
     * @mbggenerated
     */
    public String getDrivingform() {
        return drivingform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_vehicleoperation.drivingForm
     *
     * @param drivingform the value for lg_vehicleoperation.drivingForm
     *
     * @mbggenerated
     */
    public void setDrivingform(String drivingform) {
        this.drivingform = drivingform == null ? null : drivingform.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_vehicleoperation.chassisModel
     *
     * @return the value of lg_vehicleoperation.chassisModel
     *
     * @mbggenerated
     */
    public String getChassismodel() {
        return chassismodel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_vehicleoperation.chassisModel
     *
     * @param chassismodel the value for lg_vehicleoperation.chassisModel
     *
     * @mbggenerated
     */
    public void setChassismodel(String chassismodel) {
        this.chassismodel = chassismodel == null ? null : chassismodel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_vehicleoperation.engineNumber
     *
     * @return the value of lg_vehicleoperation.engineNumber
     *
     * @mbggenerated
     */
    public String getEnginenumber() {
        return enginenumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_vehicleoperation.engineNumber
     *
     * @param enginenumber the value for lg_vehicleoperation.engineNumber
     *
     * @mbggenerated
     */
    public void setEnginenumber(String enginenumber) {
        this.enginenumber = enginenumber == null ? null : enginenumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_vehicleoperation.frameNumber
     *
     * @return the value of lg_vehicleoperation.frameNumber
     *
     * @mbggenerated
     */
    public String getFramenumber() {
        return framenumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_vehicleoperation.frameNumber
     *
     * @param framenumber the value for lg_vehicleoperation.frameNumber
     *
     * @mbggenerated
     */
    public void setFramenumber(String framenumber) {
        this.framenumber = framenumber == null ? null : framenumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_vehicleoperation.engineModel
     *
     * @return the value of lg_vehicleoperation.engineModel
     *
     * @mbggenerated
     */
    public String getEnginemodel() {
        return enginemodel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_vehicleoperation.engineModel
     *
     * @param enginemodel the value for lg_vehicleoperation.engineModel
     *
     * @mbggenerated
     */
    public void setEnginemodel(String enginemodel) {
        this.enginemodel = enginemodel == null ? null : enginemodel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_vehicleoperation.enginePower
     *
     * @return the value of lg_vehicleoperation.enginePower
     *
     * @mbggenerated
     */
    public String getEnginepower() {
        return enginepower;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_vehicleoperation.enginePower
     *
     * @param enginepower the value for lg_vehicleoperation.enginePower
     *
     * @mbggenerated
     */
    public void setEnginepower(String enginepower) {
        this.enginepower = enginepower == null ? null : enginepower.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_vehicleoperation.emissionStandard
     *
     * @return the value of lg_vehicleoperation.emissionStandard
     *
     * @mbggenerated
     */
    public String getEmissionstandard() {
        return emissionstandard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_vehicleoperation.emissionStandard
     *
     * @param emissionstandard the value for lg_vehicleoperation.emissionStandard
     *
     * @mbggenerated
     */
    public void setEmissionstandard(String emissionstandard) {
        this.emissionstandard = emissionstandard == null ? null : emissionstandard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_vehicleoperation.transmissionForm
     *
     * @return the value of lg_vehicleoperation.transmissionForm
     *
     * @mbggenerated
     */
    public String getTransmissionform() {
        return transmissionform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_vehicleoperation.transmissionForm
     *
     * @param transmissionform the value for lg_vehicleoperation.transmissionForm
     *
     * @mbggenerated
     */
    public void setTransmissionform(String transmissionform) {
        this.transmissionform = transmissionform == null ? null : transmissionform.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_vehicleoperation.vehicleDriverRecordsId
     *
     * @return the value of lg_vehicleoperation.vehicleDriverRecordsId
     *
     * @mbggenerated
     */
    public Integer getVehicledriverrecordsid() {
        return vehicledriverrecordsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_vehicleoperation.vehicleDriverRecordsId
     *
     * @param vehicledriverrecordsid the value for lg_vehicleoperation.vehicleDriverRecordsId
     *
     * @mbggenerated
     */
    public void setVehicledriverrecordsid(Integer vehicledriverrecordsid) {
        this.vehicledriverrecordsid = vehicledriverrecordsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_vehicleoperation.fleetId
     *
     * @return the value of lg_vehicleoperation.fleetId
     *
     * @mbggenerated
     */
    public Integer getFleetid() {
        return fleetid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_vehicleoperation.fleetId
     *
     * @param fleetid the value for lg_vehicleoperation.fleetId
     *
     * @mbggenerated
     */
    public void setFleetid(Integer fleetid) {
        this.fleetid = fleetid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_vehicleoperation.remarks1
     *
     * @return the value of lg_vehicleoperation.remarks1
     *
     * @mbggenerated
     */
    public String getRemarks1() {
        return remarks1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_vehicleoperation.remarks1
     *
     * @param remarks1 the value for lg_vehicleoperation.remarks1
     *
     * @mbggenerated
     */
    public void setRemarks1(String remarks1) {
        this.remarks1 = remarks1 == null ? null : remarks1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_vehicleoperation.remarks2
     *
     * @return the value of lg_vehicleoperation.remarks2
     *
     * @mbggenerated
     */
    public String getRemarks2() {
        return remarks2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_vehicleoperation.remarks2
     *
     * @param remarks2 the value for lg_vehicleoperation.remarks2
     *
     * @mbggenerated
     */
    public void setRemarks2(String remarks2) {
        this.remarks2 = remarks2 == null ? null : remarks2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_vehicleoperation
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", vehicleoperationid=").append(vehicleoperationid);
        sb.append(", licensenumber=").append(licensenumber);
        sb.append(", usecompanyid=").append(usecompanyid);
        sb.append(", carrierid=").append(carrierid);
        sb.append(", companyvehiclemodelid=").append(companyvehiclemodelid);
        sb.append(", deadweight=").append(deadweight);
        sb.append(", authorizedvolume=").append(authorizedvolume);
        sb.append(", purchasedate=").append(purchasedate);
        sb.append(", originalprice=").append(originalprice);
        sb.append(", certificateoperation=").append(certificateoperation);
        sb.append(", state=").append(state);
        sb.append(", remarks=").append(remarks);
        sb.append(", vehicletype=").append(vehicletype);
        sb.append(", vehiclemodel=").append(vehiclemodel);
        sb.append(", drivingform=").append(drivingform);
        sb.append(", chassismodel=").append(chassismodel);
        sb.append(", enginenumber=").append(enginenumber);
        sb.append(", framenumber=").append(framenumber);
        sb.append(", enginemodel=").append(enginemodel);
        sb.append(", enginepower=").append(enginepower);
        sb.append(", emissionstandard=").append(emissionstandard);
        sb.append(", transmissionform=").append(transmissionform);
        sb.append(", vehicledriverrecordsid=").append(vehicledriverrecordsid);
        sb.append(", fleetid=").append(fleetid);
        sb.append(", remarks1=").append(remarks1);
        sb.append(", remarks2=").append(remarks2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}