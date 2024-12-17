package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.model.Payment;
import com.service.PaymentService;
@RestController
public class PaymentController {
	@Autowired
	PaymentService paymentservice;
	
	@PostMapping("/addpayment")
	public ResponseEntity<?> addItem(@RequestBody Payment payment)
	{
		paymentservice.addPayment(payment);
		return new ResponseEntity<String>("item added successfully",HttpStatus.ACCEPTED);
	}
	@GetMapping("/getallpayments")
	public ResponseEntity<?> getAllPayment()
	{
		List<Payment> itemlist=paymentservice.getAll();
		return new ResponseEntity<List<Payment>>(itemlist,HttpStatus.OK);
		
	}
	
}
