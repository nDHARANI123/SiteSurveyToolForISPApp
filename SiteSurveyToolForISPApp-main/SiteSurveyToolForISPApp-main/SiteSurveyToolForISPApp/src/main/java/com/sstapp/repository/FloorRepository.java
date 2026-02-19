package com.sstapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sstapp.entity.Floor;

@Repository
public interface FloorRepository extends JpaRepository<Floor, Integer> {

	// Pending For Future Enhancement 
}
