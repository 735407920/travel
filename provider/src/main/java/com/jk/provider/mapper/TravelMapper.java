package com.jk.provider.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TravelMapper {

    @Select("select count(1) from t_user")
    Integer findCount();

}
