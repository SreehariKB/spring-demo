package com.ust.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@GetMapping("/order")
	public String customerOrderDetails() {
		return "order detail for customer";
	}
	
	@GetMapping("/orderpage")
	public String getOrderPage() {
		return "Order Page";
	}
}
