package cn.log.mappers;

import cn.log.pojo.LgVehicledriverrecords;
import java.util.List;

public interface LgVehicledriverrecordsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_vehicledriverrecords
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer vehicledriverrecordsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_vehicledriverrecords
     *
     * @mbggenerated
     */
    int insert(LgVehicledriverrecords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_vehicledriverrecords
     *
     * @mbggenerated
     */
    LgVehicledriverrecords selectByPrimaryKey(Integer vehicledriverrecordsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_vehicledriverrecords
     *
     * @mbggenerated
     */
    List<LgVehicledriverrecords> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_vehicledriverrecords
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(LgVehicledriverrecords record);
}