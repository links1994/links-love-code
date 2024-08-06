package org.example.mapper;

import org.example.pojo.Student;
import org.example.pojo.Teacher;

import java.util.List;

public interface TeacherMapper {
    // 依据id查询老师方式1
    Teacher getTeacherByID1(Integer id);
    // 依据id查询老师方式2
    Teacher getTeacherByID2(Integer id);
    // 依据学生id查询老师
    List<Teacher> findTeachers(Integer sid);
}
