package oit.is.z1649.sato.janken.model;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MatchMapper {
    @Select("SELECT * FROM matches");
    ArrayList<Match> selectAll;
}
