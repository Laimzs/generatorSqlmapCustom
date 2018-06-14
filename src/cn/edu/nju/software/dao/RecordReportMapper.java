package cn.edu.nju.software.dao;

import cn.edu.nju.software.entity.RecordReport;
import cn.edu.nju.software.entity.RecordReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecordReportMapper {
    int countByExample(RecordReportExample example);

    int deleteByExample(RecordReportExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RecordReport record);

    int insertSelective(RecordReport record);

    List<RecordReport> selectByExample(RecordReportExample example);

    RecordReport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RecordReport record, @Param("example") RecordReportExample example);

    int updateByExample(@Param("record") RecordReport record, @Param("example") RecordReportExample example);

    int updateByPrimaryKeySelective(RecordReport record);

    int updateByPrimaryKey(RecordReport record);
}