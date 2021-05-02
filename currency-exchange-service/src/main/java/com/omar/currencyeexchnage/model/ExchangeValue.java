package com.omar.currencyeexchnage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class ExchangeValue {
	
	@Id
	private long id;
	@Column(name = "currency_from")
	private String from;
	@Column(name = "currency_to")
	private String to;
	
	private long convertionMultibel;
	
	@Transient
	private int port;

	
	public ExchangeValue() {}
	
	
	public ExchangeValue(int id, String form, String to, long convertioMultibel) {
		super();
		this.id = id;
		this.from = form;
		this.to = to;
		this.convertionMultibel = convertioMultibel;
	}


	public long getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFrom() {
		return from;
	}


	public void setFrom(String form) {
		this.from = form;
	}


	public String getTo() {
		return to;
	}


	public void setTo(String to) {
		this.to = to;
	}


	public long getConvertioMultibel() {
		return convertionMultibel;
	}


	public void setConvertioMultibel(long convertioMultibel) {
		this.convertionMultibel = convertioMultibel;
	}


	public int getPort() {
		return port;
	}


	public void setPort(int port) {
		this.port = port;
	}
	
	
	

}
