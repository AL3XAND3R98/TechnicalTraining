package com.sqlex.sqlex.Repos;

import java.util.List;

import com.sqlex.sqlex.Entities.College;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CollegeRepo extends JpaRepository<College, Integer> {
    public List<College> findByName(String na);
    public List<College> findByMarks(int num);
}