package cn.edu.nju.software.dao;

import cn.edu.nju.software.entity.RecordGroup;
import cn.edu.nju.software.entity.RecordGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecordGroupMapper {
    int countByExample(RecordGroupExample example);

    int deleteByExample(RecordGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RecordGroup record);

    int insertSelective(RecordGroup record);

    List<RecordGroup> selectByExample(RecordGroupExample example);

    RecordGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RecordGroup record, @Param("example") RecordGroupExample example);

    int updateByExample(@Param("record") RecordGroup record, @Param("example") RecordGroupExample example);

    int updateByPrimaryKeySelective(RecordGroup record);

    int updateByPrimaryKey(RecordGroup record);
}