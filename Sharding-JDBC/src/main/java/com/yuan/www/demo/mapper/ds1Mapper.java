package com.yuan.www.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ds1Mapper {

    @Insert("insert into t_order_item (order_id,item_id) values (#{orderId},#{itemId})")
    void add(@Param("orderId") Long orderId,@Param("itemId") Long itemId);
}
