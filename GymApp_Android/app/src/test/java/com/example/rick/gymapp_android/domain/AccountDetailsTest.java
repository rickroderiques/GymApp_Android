package com.example.rick.gymapp_android.domain;

import com.example.rick.gymapp_android.factory.IAccountDetailsFactory;
import com.example.rick.gymapp_android.factory.Impl.AccountDetailsFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rick on 17-Apr-16.
 */
public class AccountDetailsTest {

    private static IAccountDetailsFactory factory;
    @Before
    public void setUp() throws Exception {
        factory = AccountDetailsFactory.getFactoryInstance();
    }

    @Test
    public void testAccountCreation() throws Exception
    {
        AccountDetails accountDetails = factory.createAccount("M220592", "22.50", "150.00", "1500.00");
        Assert.assertEquals("M220592", accountDetails.getMembershipNumber());
        Assert.assertEquals("22.50", accountDetails.getPaymentDue());
        Assert.assertEquals("150.00", accountDetails.getLastPayment());
        Assert.assertEquals("1500.00", accountDetails.getBalance());
        Assert.assertNotNull(accountDetails.getMembershipNumber());
    }

    @Test
    public void testAccountUpdate() throws Exception{
        AccountDetails accountDetails = factory.createAccount("M220592", "20.50", "150.00", "1500.00");
        Assert.assertEquals("M220592", accountDetails.getMembershipNumber());
        Assert.assertEquals("20.50", accountDetails.getPaymentDue());
        Assert.assertEquals("150.00", accountDetails.getLastPayment());
        Assert.assertEquals("1500.00", accountDetails.getBalance());
        Assert.assertNotNull(accountDetails.getMembershipNumber());

        AccountDetails updateAccountDetails = new AccountDetails.Builder()
                .copy(accountDetails)
                .setBalance("1455.00")
                .build();
        Assert.assertEquals("1455.00", updateAccountDetails.getBalance());

    }
}