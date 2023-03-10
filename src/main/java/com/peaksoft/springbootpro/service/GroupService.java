package com.peaksoft.springbootpro.service;

import com.peaksoft.springbootpro.entity.Course;
import com.peaksoft.springbootpro.entity.Group;
import com.peaksoft.springbootpro.entity.Student;

import java.util.List;

public interface GroupService {
    List<Group> getAllGroups();
    void addGroup(Group group,Long courseId);
    void updateGroup(Long id, Group group, Long courseId);
    Group getById(Long id);
    void deleteGroup(Group group);
    List<Student>getStudentsByGroupId(Long id);
    List<Course>getCoursesByGroupId(Long id);
    List<Student> search(String studentName,Long groupId);
}
