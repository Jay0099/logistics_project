package cn.log.mappers;

import cn.log.pojo.LgCompensationgoodsorder;
import java.util.List;

public interface LgCompensationgoodsorderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_compensationgoodsorder
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer compensationid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_compensationgoodsorder
     *
     * @mbggenerated
     */
    int insert(LgCompensationgoodsorder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_compensationgoodsorder
     *
     * @mbggenerated
     */
    LgCompensationgoodsorder selectByPrimaryKey(Integer compensationid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_compensationgoodsorder
     *
     * @mbggenerated
     */
    List<LgCompensationgoodsorder> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_compensationgoodsorder
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(LgCompensationgoodsorder record);
}