package com.sphere.compentencytool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sphere.compentencytool.model.Designations;


@Repository
public interface DesignationsRepository extends JpaRepository<Designations, Long>{

}
