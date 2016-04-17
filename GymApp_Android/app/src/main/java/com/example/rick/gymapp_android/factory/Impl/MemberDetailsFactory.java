package com.example.rick.gymapp_android.factory.Impl;

import com.example.rick.gymapp_android.domain.MemberDetails;
import com.example.rick.gymapp_android.factory.IMemberDetailsFactory;

import java.util.UUID;

/**
 * Created by Rick on 17-Apr-16.
 */
public class MemberDetailsFactory implements IMemberDetailsFactory {

    private static MemberDetailsFactory memberDetailsFactory = null;

    private MemberDetailsFactory(){

    }

    /**creating the instance of the class*/
    public static MemberDetailsFactory getFactoryInstance() {
        if(memberDetailsFactory == null)
        {
            memberDetailsFactory = new MemberDetailsFactory();
        }
        return memberDetailsFactory;
    }

    public MemberDetails createMember(String membershipNumber, String name, String surname, String user_email, String contactNumber, String membershipType)
    {
        MemberDetails memberDetails = new MemberDetails
                .Builder()
                .id(UUID.randomUUID().toString())
                .membershipNumber(membershipNumber)
                .name(name)
                .surname(surname)
                .user_email(user_email)
                .contactNumber(contactNumber)
                .membershipType(membershipType)
                .build();
        return memberDetails;
    }
}
