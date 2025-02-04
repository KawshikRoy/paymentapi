package com.itcbd.paymentapi.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer {
    private String customerId;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
}
