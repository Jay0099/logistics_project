package cn.log.mappers;

import cn.log.pojo.LgCarrier;
import java.util.List;

public interface LgCarrierMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_carrier
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer carrierid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_carrier
     *
     * @mbggenerated
     */
    int insert(LgCarrier record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_carrier
     *
     * @mbggenerated
     */
    LgCarrier selectByPrimaryKey(Integer carrierid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_carrier
     *
     * @mbggenerated
     */
    List<LgCarrier> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_carrier
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(LgCarrier record);
}