package com.sstapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sstapp.entity.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Integer> {

	// Pending for Future Enhancement
}
