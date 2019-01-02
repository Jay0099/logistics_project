package cn.log.mappers;

import cn.log.pojo.LgShipper;
import java.util.List;

public interface LgShipperMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_shipper
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer shipperid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_shipper
     *
     * @mbggenerated
     */
    int insert(LgShipper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_shipper
     *
     * @mbggenerated
     */
    LgShipper selectByPrimaryKey(Integer shipperid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_shipper
     *
     * @mbggenerated
     */
    List<LgShipper> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_shipper
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(LgShipper record);
}