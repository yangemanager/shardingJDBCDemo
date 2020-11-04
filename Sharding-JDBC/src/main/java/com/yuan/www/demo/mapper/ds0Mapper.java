package com.yuan.www.demo.mapper;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ds0Mapper {

    @Insert("insert into t_order (order_no,order_id) values (#{orderNo},#{orderId}) RETURNING order_id")
    Long add(@Param("orderNo") String orderNo,@Param("orderId")Long orderId);

    @Select("select concat(order_id,',',order_no) from t_order where order_id = #{orderId}")
    String getAllByOrderId(@Param("orderId") Long orderId);

    @Select("select concat(order_id,',',order_no) from t_order")
    List<String> getAll();
}
