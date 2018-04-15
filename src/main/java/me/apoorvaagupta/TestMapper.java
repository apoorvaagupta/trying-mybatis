package me.apoorvaagupta;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

   @Component
    public interface TestMapper {

        @Select("SELECT * FROM Test")
        public List<Test> selectAllPerson();

        @Select("SELECT * FROM Test WHERE testId = #{testId}")
        public Test selectPerson(@Param("testId") int testId);

        @Insert("INSERT INTO Test (testId, testName) VALUES (#{testId},#{testName});")
        public int insertPerson(Test p);

        @Insert({"<script>",
                "INSERT INTO  Test (testId,testName) VALUES ",
                "<foreach collection='collection' item='p' index='index' separator = ',' >(#{p.testId},#{p.testName})</foreach>",
                "</script>"})
        public int insertAllPerson(@Param("collection") List<Test> collection);
    }

