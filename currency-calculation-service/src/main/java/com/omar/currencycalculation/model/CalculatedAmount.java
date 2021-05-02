package com.omar.currencycalculation.model;

import java.math.BigDecimal;

public class CalculatedAmount {

	

	
	private long id;
	private String from;
	private String to;
	private BigDecimal multiplicationFactor;
	
	private BigDecimal quantity;
	
	private BigDecimal totalCalculationAmount;
	private int port;


	public CalculatedAmount(long id, String from, String to, BigDecimal multiplicationFactor, BigDecimal quantity,
			BigDecimal totalCalculationAmount) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.multiplicationFactor = multiplicationFactor;
		this.quantity = quantity;
		this.totalCalculationAmount = totalCalculationAmount;
	}
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getMultiplicationFactor() {
		return multiplicationFactor;
	}

	public void setMultiplicationFactor(BigDecimal multiplicationFactor) {
		this.multiplicationFactor = multiplicationFactor;
	}

	public BigDecimal getTotalCalculationAmount() {
		return totalCalculationAmount;
	}

	public void setTotalCalculationAmount(BigDecimal totalCalculationAmount) {
		this.totalCalculationAmount = totalCalculationAmount;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	
	public int getPort() {
		return port;
	}
	
	public void setPort(int port) {
		this.port = port;
	}
	
	
	
	
}
