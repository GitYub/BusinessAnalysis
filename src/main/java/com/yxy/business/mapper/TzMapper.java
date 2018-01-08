package com.yxy.business.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TzMapper {

    @Insert("insert into tz values(#{timestamp}, #{mac})")
    void addData(@Param("timestamp") String timestamp, @Param("mac") String mac);
}
