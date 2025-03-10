package com.hiremap.hiremap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hiremap.hiremap.dto.hiremapdto;


@Repository
public interface HiremapRepository extends JpaRepository<hiremapdto, Integer> {

}
