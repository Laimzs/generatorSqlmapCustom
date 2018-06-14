package cn.edu.nju.software.dao;

import cn.edu.nju.software.entity.WebShareInfo;
import cn.edu.nju.software.entity.WebShareInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebShareInfoMapper {
    int countByExample(WebShareInfoExample example);

    int deleteByExample(WebShareInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WebShareInfo record);

    int insertSelective(WebShareInfo record);

    List<WebShareInfo> selectByExample(WebShareInfoExample example);

    WebShareInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WebShareInfo record, @Param("example") WebShareInfoExample example);

    int updateByExample(@Param("record") WebShareInfo record, @Param("example") WebShareInfoExample example);

    int updateByPrimaryKeySelective(WebShareInfo record);

    int updateByPrimaryKey(WebShareInfo record);
}