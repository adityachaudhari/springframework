package com.ecommercearchitect.aop.example.noaop;

import com.ecommercearchitect.aop.example.noaop.performancelogger.PerformanceLogger;
import com.ecommercearchitect.aop.example.noaop.services.AddProductToCartService;
import com.ecommercearchitect.aop.example.noaop.services.ApplyPromotionsService;
import com.ecommercearchitect.aop.example.noaop.services.ShippingAPISService;
import com.ecommercearchitect.aop.example.noaop.services.TaxAPIsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddToCartService {

    @Autowired
    private PerformanceLogger performanceLogger;

    @Autowired
    private AddProductToCartService addProductToCartService;

    @Autowired
    private ApplyPromotionsService applyPromotionsService;

    @Autowired
    private ShippingAPISService shippingAPISService;

    @Autowired
    private TaxAPIsService taxAPIsService;

    public void addToCart() throws InterruptedException {

        PerformanceLogger.PerformanceLoggerInfo performanceLoggerInfo;

        performanceLoggerInfo = performanceLogger.start("AddToCartService.addProductToCart()");
        addProductToCartService.addProductToCart();
        performanceLogger.stop(performanceLoggerInfo);

        performanceLoggerInfo = performanceLogger.start("AddToCartService.applyPromotions()");
        applyPromotionsService.applyPromotions();
        performanceLogger.stop(performanceLoggerInfo);

        performanceLoggerInfo = performanceLogger.start("AddToCartService.callShippingAPIS()");
        shippingAPISService.callExternalShippingAPI();
        performanceLogger.stop(performanceLoggerInfo);

        performanceLoggerInfo = performanceLogger.start("AddToCartService.callTaxAPIS()");
        taxAPIsService.callExternalTaxAPIS();
        performanceLogger.stop(performanceLoggerInfo);
    }

}
