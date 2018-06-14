package cn.edu.nju.software.dao;

import cn.edu.nju.software.entity.UserRecordAudio;
import cn.edu.nju.software.entity.UserRecordAudioExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRecordAudioMapper {
    int countByExample(UserRecordAudioExample example);

    int deleteByExample(UserRecordAudioExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserRecordAudio record);

    int insertSelective(UserRecordAudio record);

    List<UserRecordAudio> selectByExample(UserRecordAudioExample example);

    UserRecordAudio selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserRecordAudio record, @Param("example") UserRecordAudioExample example);

    int updateByExample(@Param("record") UserRecordAudio record, @Param("example") UserRecordAudioExample example);

    int updateByPrimaryKeySelective(UserRecordAudio record);

    int updateByPrimaryKey(UserRecordAudio record);
}