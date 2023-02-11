package com.peaksoft.springbootpro.service;

import com.peaksoft.springbootpro.entity.Course;
import com.peaksoft.springbootpro.entity.Group;
import com.peaksoft.springbootpro.entity.Teacher;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourse();
    void addCourse(Course course, Long companyId);
    void updateCourse(Long id, Course course,Long companyId);
    Course getById(Long id);
    void deleteCourse(Course course);
    List<Teacher>getTeachersByCourseId(Long id);
    List<Group>getGroupsByCourseId(Long id);

}
