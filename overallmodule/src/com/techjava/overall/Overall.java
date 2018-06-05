package com.techjava.overall;

import com.techjava.bank.BankDetails;
import com.techjava.insurance.InsuranceDetails;

public class Overall {

    public static void main(String[] args) {
        BankDetails bankDetails = new BankDetails();
        bankDetails.view();

        InsuranceDetails insuranceDetails = new InsuranceDetails();
        insuranceDetails.view();
    }
}
