package com.erp4j.ssm.mapper.device;

import com.erp4j.ssm.pojo.Device;
import com.erp4j.ssm.pojo.DeviceExample;
import java.util.List;

import com.erp4j.ssm.pojo.device.DeviceVo;
import org.apache.ibatis.annotations.Param;

public interface DeviceMapper {

    List<DeviceVo> findDeviceList(DeviceVo deviceVo);


    //逆向工程生成
    long countByExample(DeviceExample example);

    int deleteByExample(DeviceExample example);

    int deleteByPrimaryKey(String deviceId);

    int insert(Device record);

    int insertSelective(Device record);

    List<Device> selectByExample(DeviceExample example);

    Device selectByPrimaryKey(String deviceId);

    int updateByExampleSelective(@Param("record") Device record, @Param("example") DeviceExample example);

    int updateByExample(@Param("record") Device record, @Param("example") DeviceExample example);

    int updateByPrimaryKeySelective(Device record);

    int updateByPrimaryKey(Device record);



}