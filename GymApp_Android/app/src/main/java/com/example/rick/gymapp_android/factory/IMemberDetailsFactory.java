package com.example.rick.gymapp_android.factory;

import com.example.rick.gymapp_android.domain.MemberDetails;

/**
 * Created by Rick on 17-Apr-16.
 */
public interface IMemberDetailsFactory {
    MemberDetails createMember(String membershipNumber, String name, String surname, String user_email, String contactNumber, String membershipType);
}
