package com.technavv.springbootecommerce.controller;

import org.springframework.web.bind.annotation.*;

import com.technavv.springbootecommerce.dto.Purchase;
import com.technavv.springbootecommerce.dto.PurchaseResponse;
import com.technavv.springbootecommerce.service.CheckoutService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }

}
