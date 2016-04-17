package com.example.rick.gymapp_android.domain;

import java.io.Serializable;

/**
 * Created by Rick on 17-Apr-16.
 */
public class AccountDetails implements Serializable {
    private String membershipNumber; //from memberDetails class / table
    private String paymentDue;
    private String lastPayment;
    private String balance;

    public String getMembershipNumber() {
        return membershipNumber;
    }

    public String getPaymentDue() {
        return paymentDue;
    }

    public String getLastPayment() {
        return lastPayment;
    }

    public String getBalance() {
        return balance;
    }

    public AccountDetails(){}

    public AccountDetails(Builder builder)
    {
        this.membershipNumber = builder.membershipNumber;
        this.paymentDue = builder.paymentDue;
        this.lastPayment = builder.lastPayment;
        this.balance = builder.balance;
    }

    public static class Builder
    {
        private String membershipNumber; //from memberDetails class / table
        private String paymentDue;
        private String lastPayment;
        private String balance;

        public Builder setMembershipNumber(String value) {
            this.membershipNumber = value;
            return this;
        }

        public Builder setPaymentDue(String value) {
            this.paymentDue = value;
            return this;
        }

        public Builder setLastPayment(String value) {
            this.lastPayment = value;
            return this;
        }

        public Builder setBalance(String value) {
            this.balance = value;
            return this;
        }

        public Builder copy(AccountDetails value)
        {
            this.membershipNumber = value.membershipNumber;
            this.paymentDue = value.paymentDue;
            this.lastPayment = value.lastPayment;
            this.balance = value.balance;

            return this;
        }

        public AccountDetails build() {
            return new AccountDetails(this);
        }
    }
}
