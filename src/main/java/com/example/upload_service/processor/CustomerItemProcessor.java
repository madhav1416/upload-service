package com.example.upload_service.processor;

import com.example.upload_service.model.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerItemProcessor implements ItemProcessor<Customer, Customer> {

    @Override
    public Customer process(final Customer customer) throws Exception {
        return customer;
    }
}
