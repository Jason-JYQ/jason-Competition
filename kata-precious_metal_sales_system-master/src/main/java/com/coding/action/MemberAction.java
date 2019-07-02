package com.coding.action;

import java.io.File;

import net.sf.json.JSONObject;

import com.coding.sales.FileUtils;
import com.coding.sales.input.Member;

public class MemberAction {
	/*String orderCommand = FileUtils.readFromFile(getResourceFilePath("member-command.json"));
	JSONObject mapJSON = JSONObject.fromObject(orderCommand);
	Member member = getMemberByCode("6236609999", mapJSON);*/
	
	
	public static Member getMemberByCode(String code,JSONObject mapJSON){
    	Member member = new Member();
    	member = (Member) JSONObject.toBean(mapJSON.getJSONObject(code),Member.class);
    	return member;
    }
    
    public String getResourceFilePath(String fileName) {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());
        return file.getAbsolutePath();
    }
}
