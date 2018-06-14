package cn.edu.nju.software.dao;

import cn.edu.nju.software.entity.InvitationCodeRelation;
import cn.edu.nju.software.entity.InvitationCodeRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvitationCodeRelationMapper {
    int countByExample(InvitationCodeRelationExample example);

    int deleteByExample(InvitationCodeRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InvitationCodeRelation record);

    int insertSelective(InvitationCodeRelation record);

    List<InvitationCodeRelation> selectByExample(InvitationCodeRelationExample example);

    InvitationCodeRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InvitationCodeRelation record, @Param("example") InvitationCodeRelationExample example);

    int updateByExample(@Param("record") InvitationCodeRelation record, @Param("example") InvitationCodeRelationExample example);

    int updateByPrimaryKeySelective(InvitationCodeRelation record);

    int updateByPrimaryKey(InvitationCodeRelation record);
}