package cn.edu.nju.software.dao;

import cn.edu.nju.software.entity.CommentLikeRelation;
import cn.edu.nju.software.entity.CommentLikeRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentLikeRelationMapper {
    int countByExample(CommentLikeRelationExample example);

    int deleteByExample(CommentLikeRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CommentLikeRelation record);

    int insertSelective(CommentLikeRelation record);

    List<CommentLikeRelation> selectByExample(CommentLikeRelationExample example);

    CommentLikeRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CommentLikeRelation record, @Param("example") CommentLikeRelationExample example);

    int updateByExample(@Param("record") CommentLikeRelation record, @Param("example") CommentLikeRelationExample example);

    int updateByPrimaryKeySelective(CommentLikeRelation record);

    int updateByPrimaryKey(CommentLikeRelation record);

    List<Integer> getAllLikeByUserId(Integer userId);
}