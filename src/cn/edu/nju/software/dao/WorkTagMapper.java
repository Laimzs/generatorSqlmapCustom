package cn.edu.nju.software.dao;

import cn.edu.nju.software.entity.WorkTag;
import cn.edu.nju.software.entity.WorkTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkTagMapper {
    int countByExample(WorkTagExample example);

    int deleteByExample(WorkTagExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WorkTag record);

    int insertSelective(WorkTag record);

    List<WorkTag> selectByExample(WorkTagExample example);

    WorkTag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WorkTag record, @Param("example") WorkTagExample example);

    int updateByExample(@Param("record") WorkTag record, @Param("example") WorkTagExample example);

    int updateByPrimaryKeySelective(WorkTag record);

    int updateByPrimaryKey(WorkTag record);
}