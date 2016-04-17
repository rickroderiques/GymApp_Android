package com.example.rick.gymapp_android.domain;

import com.example.rick.gymapp_android.factory.IMemberDetailsFactory;
import com.example.rick.gymapp_android.factory.Impl.MemberDetailsFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rick on 17-Apr-16.
 */
public class MemberDetailsTest {

    private IMemberDetailsFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = MemberDetailsFactory.getFactoryInstance();
    }

    @Test
    public void testMemberCreation() throws Exception {
        MemberDetails memberDetails = factory.createMember("M920522", "Rick", "Roderiques", "213066521@mycput.ac.za", "0789187468", "vip");
        Assert.assertEquals("M920522", memberDetails.getMembershipNumber());
        Assert.assertEquals("213066521@mycput.ac.za", memberDetails.getUser_email());
        Assert.assertNotNull(memberDetails.getMembershipNumber());
    }

    @Test
    public void testMemberUpdate() throws Exception{
        MemberDetails memberDetails = factory.createMember("M920522", "Rick", "Roderiques", "213066521@mycput.ac.za", "0789187468", "vip");
        Assert.assertEquals("M920522", memberDetails.getMembershipNumber());
        Assert.assertEquals("213066521@mycput.ac.za", memberDetails.getUser_email());
        Assert.assertNotNull(memberDetails.getMembershipNumber());
        Assert.assertNotNull(memberDetails.getId());

        MemberDetails updateMember = new MemberDetails.Builder()
                .copy(memberDetails)
                .user_email("rroderiques22@gmail.com")
                .build();

        Assert.assertEquals("rroderiques22@gmail.com", updateMember.getUser_email());
        Assert.assertEquals("Roderiques", updateMember.getSurname());
    }
}