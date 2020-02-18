package life.majiang.community.community.mapper;

import life.majiang.community.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QuestionMapper {

    @Insert("insert into question (title,description,tag,creator,gmt_create,gmt_modified) values ('${title}','${description}','${tag}','${creator}','${gmtCreate}','${gmtModified}')")
    void create(Question question);

    @Select("select * from question")
    List<Question> list();
}
