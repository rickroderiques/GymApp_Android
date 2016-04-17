package com.example.rick.gymapp_android.factory;

import com.example.rick.gymapp_android.domain.AccountDetails;

/**
 * Created by Rick on 17-Apr-16.
 */
public interface IAccountDetailsFactory {
    AccountDetails createAccount(String membershipNumber, String paymentDue, String lastPayment, String balance);
}
