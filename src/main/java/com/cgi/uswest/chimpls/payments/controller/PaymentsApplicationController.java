package com.cgi.uswest.chimpls.payments.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.uswest.chimpls.payments.objects.Payment;
import com.cgi.uswest.chimpls.payments.objects.PaymentRepository;

@RefreshScope
@RestController
public class PaymentsApplicationController {

	  @Autowired
	  private PaymentRepository repository;
	  
	  @RequestMapping("/paymentsByProvider/{idprvdorg}")
	  public Set<Payment> findPaymentsByProvider(@PathVariable("idprvdorg") String idprvdorg) {
		  return repository.findAllByIdprvdorgOrderByDtpaymentDesc(idprvdorg);
	  }
	  
	  @RequestMapping("/paymentsByPerson/{idprsn}")
	  public Set<Payment> findPaymentsByPerson(@PathVariable("idprsn") String idprsn) {
		  return repository.findAllByIdprsnOrderByDtpaymentDesc(idprsn);
	  }
	
}
