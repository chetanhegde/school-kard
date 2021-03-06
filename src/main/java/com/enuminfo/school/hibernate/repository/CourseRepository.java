/**
 * 
 */
package com.enuminfo.school.hibernate.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.enuminfo.school.hibernate.model.Course;

/**
 * @author Kumar
 */
public interface CourseRepository extends PagingAndSortingRepository<Course, Integer>{

}
