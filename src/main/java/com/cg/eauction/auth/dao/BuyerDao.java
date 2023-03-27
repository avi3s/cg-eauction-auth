package com.cg.eauction.auth.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.eauction.auth.entity.BuyerEntity;

public interface BuyerDao extends JpaRepository<BuyerEntity, Long> {

    BuyerEntity findByEmailId(String emailId);

    BuyerEntity findByMobileNo(String mobileNo);
}
