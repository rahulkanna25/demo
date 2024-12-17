package com.service;
 
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import com.dao.*;
import com.model.*;
import java.util.*;
@Service
public class PaymentService {
	@Autowired
	PaymentDao paymentDAO;
	public void addPayment(Payment payment) {
		paymentDAO.save(payment);
	}
	public List<Payment> getAll(){
		List<Payment> itemList = paymentDAO.findAll();
		return itemList;
	}
}