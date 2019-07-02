package com.coding.action;

import java.io.File;

import net.sf.json.JSONObject;

import com.coding.sales.FileUtils;
import com.coding.sales.input.NobleMetal;

public class NobleMetalAction {
	/*String orderCommand = FileUtils.readFromFile(getResourceFilePath("item-command.json"));
	JSONObject mapJSON = JSONObject.fromObject(orderCommand);
	NobleMetal nobleMetal1 = getMemberByCode("001001", mapJSON);
	NobleMetal nobleMetal2 = getMemberByCode("001002", mapJSON);
	NobleMetal nobleMetal3 = getMemberByCode("002002", mapJSON);
	NobleMetal nobleMetal4 = getMemberByCode("002003", mapJSON);*/
	
	
	public static NobleMetal getMemberByCode(String code,JSONObject mapJSON){
		NobleMetal nobleMetal = new NobleMetal();
		nobleMetal = (NobleMetal) JSONObject.toBean(mapJSON.getJSONObject(code),NobleMetal.class);
    	return nobleMetal;
    }
    
    public String getResourceFilePath(String fileName) {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());
        return file.getAbsolutePath();
    }
}
