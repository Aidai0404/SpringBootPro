package com.peaksoft.springbootpro.service;

import com.peaksoft.springbootpro.entity.Company;
import com.peaksoft.springbootpro.entity.Course;
import com.peaksoft.springbootpro.entity.Student;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompany();
    void addCompany(Company company);
    void updateCompany(Long id, Company company);
    Company getById(Long id);
    void deleteCompany(Company company);
    List<Course>getCoursesByCompanyId(Long id);
    List<Student>getStudentsByCompanyId(Long id);
}
