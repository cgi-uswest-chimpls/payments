package com.cgi.uswest.chimpls.payments.objects;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Payment {

	@Id
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@GeneratedValue(generator = "uuid2")
	@Column(columnDefinition = "BINARY(16)")
	private UUID id;
	
	private String idpayment;
	private Timestamp dtpayment;
	private String idprsn;
	private BigDecimal amount;
	private String idprvdorg;
	private String txpersonname;
	
	Payment() {}
	
	public Payment(String idpayment, Timestamp dtpayment, String idprsn, BigDecimal amount,
			String idprvdorg, String txpersonname) {
		
		super();
		this.idpayment = idpayment;
		this.dtpayment = dtpayment;
		this.idprsn = idprsn;
		this.amount = amount;
		this.idprvdorg = idprvdorg;
		this.txpersonname = txpersonname;
	}

	public String getIdpayment() {
		return idpayment;
	}

	public void setIdpayment(String idpayment) {
		this.idpayment = idpayment;
	}

	public Timestamp getDtpayment() {
		return dtpayment;
	}

	public void setDtpayment(Timestamp dtpayment) {
		this.dtpayment = dtpayment;
	}

	public String getIdprsn() {
		return idprsn;
	}

	public void setIdprsn(String idprsn) {
		this.idprsn = idprsn;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getIdprvdorg() {
		return idprvdorg;
	}

	public void setIdprvdorg(String idprvdorg) {
		this.idprvdorg = idprvdorg;
	}

	public String getTxpersonname() {
		return txpersonname;
	}

	public void setTxpersonname(String txpersonname) {
		this.txpersonname = txpersonname;
	}
	
}
