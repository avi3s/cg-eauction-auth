package com.cg.eauction.auth.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.eauction.auth.entity.SellerEntity;

public interface SellerDao extends JpaRepository<SellerEntity, Long> {

    SellerEntity findByEmailId(String emailId);

    SellerEntity findByMobileNo(String mobileNo);
}
