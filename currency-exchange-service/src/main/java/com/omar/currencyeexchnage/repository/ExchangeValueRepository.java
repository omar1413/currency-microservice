package com.omar.currencyeexchnage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omar.currencyeexchnage.model.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	ExchangeValue findByFromAndTo(String from, String to);
}
