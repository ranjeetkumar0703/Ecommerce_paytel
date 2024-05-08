package com.Ecommerce.paytel.repository;


import com.Ecommerce.paytel.entity.SubAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubAdminRepository extends JpaRepository<SubAdmin, Long> {
}
