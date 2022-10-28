package com.sphere.compentencytool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sphere.compentencytool.model.RoleDesignationMap;

@Repository
public interface RoleDesignationMapRepository extends JpaRepository<RoleDesignationMap, Long> {

}
