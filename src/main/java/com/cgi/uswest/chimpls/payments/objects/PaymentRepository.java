package com.cgi.uswest.chimpls.payments.objects;

import java.util.Set;
import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "payments", path = "payments")
public interface PaymentRepository extends PagingAndSortingRepository<Payment, UUID> {

	Set<Payment> findAllByIdprvdorgOrderByDtpaymentDesc(@Param("idprvdorg") String idprvdorg);
	
	Set<Payment> findAllByIdprsnOrderByDtpaymentDesc(@Param("idprsn") String idprsn);
	
}
