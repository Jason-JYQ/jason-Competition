package com.coding.sales;

import net.sf.json.JSONObject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.coding.sales.input.Member;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class MemberTest {
    @Test
    public void  checkoutTest() {
		String orderCommand = FileUtils.readFromFile(getResourceFilePath("member-command.json"));
		JSONObject mapJSON = JSONObject.fromObject(orderCommand);
		//JSONObject.toBean(mapJSON, Member.class);
		Member member = getMemberByCode("6236609999", mapJSON);
		/* OrderApp app = new OrderApp();
        String actualResult = app.checkout(orderCommand);

        String expectedResult = FileUtils.readFromFile(getResourceFilePath(expectedResultFileName));

        assertEquals(expectedResult, actualResult);*/
//		Member newMember = new Member();
//		newMember.setVipCode("6236609999");
//		newMember.setVipName("马丁");
//		newMember.setVipLevel("普卡");
//		newMember.setVipPoints(9860);
//		assertEquals(member,newMember);
    }

    public static Member getMemberByCode(String code,JSONObject mapJSON){
    	Member member = new Member();
    	member = (Member) JSONObject.toBean(mapJSON.getJSONObject(code),Member.class);
    	return member;
    }
    
    private String getResourceFilePath(String fileName) {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());
        return file.getAbsolutePath();
    }

}
