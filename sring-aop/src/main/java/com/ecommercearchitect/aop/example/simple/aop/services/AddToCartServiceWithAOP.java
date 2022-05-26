package com.ecommercearchitect.aop.example.simple.aop.services;

import com.ecommercearchitect.aop.example.noaop.services.AddProductToCartService;
import com.ecommercearchitect.aop.example.noaop.services.ApplyPromotionsService;
import com.ecommercearchitect.aop.example.noaop.services.ShippingAPISService;
import com.ecommercearchitect.aop.example.noaop.services.TaxAPIsService;
import com.ecommercearchitect.aop.example.simple.aop.annotations.PerformanceLoggerAOP;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class AddToCartServiceWithAOP {


    @Autowired
    private AddProductToCartServiceAOP addProductToCartServiceAOP;

    @Autowired
    private ApplyPromotionsServiceAOP applyPromotionsServiceAOP;

    @Autowired
    private ShippingAPISServiceAOP shippingAPISServiceAOP;

    @Autowired
    private TaxAPIsServiceAOP taxAPIsServiceAOP;

    //@PerformanceLoggerAOP
    public void addToCart() throws InterruptedException {
        addProductToCartServiceAOP.addProductToCart();
        applyPromotionsServiceAOP.applyPromotions();
        shippingAPISServiceAOP.callExternalShippingAPI();
        taxAPIsServiceAOP.callExternalTaxAPIS();
    }

}
