package com.example.rick.gymapp_android.factory.Impl;

import com.example.rick.gymapp_android.domain.AccountDetails;
import com.example.rick.gymapp_android.factory.IAccountDetailsFactory;

/**
 * Created by Rick on 17-Apr-16.
 */
public class AccountDetailsFactory implements IAccountDetailsFactory {
    public static AccountDetailsFactory factory = null;

    public static AccountDetailsFactory getFactoryInstance()
    {
        if(factory == null)
        {
            factory = new AccountDetailsFactory();
        }
        return factory;
    }

    public AccountDetails createAccount(String membershipNumber, String paymentDue, String lastPayment, String balance)
    {
        AccountDetails accountDetails = new AccountDetails
                .Builder()
                .setMembershipNumber(membershipNumber)
                .setPaymentDue(paymentDue)
                .setLastPayment(lastPayment)
                .setBalance(balance)
                .build();
        return accountDetails;
    }

}
