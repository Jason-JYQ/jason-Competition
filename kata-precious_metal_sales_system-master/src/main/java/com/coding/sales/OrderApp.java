package com.coding.sales;

import net.sf.json.JSONObject;

import com.coding.action.MemberAction;
import com.coding.action.NobleMetalAction;
import com.coding.sales.input.Member;
import com.coding.sales.input.NobleMetal;
import com.coding.sales.input.OrderCommand;
import com.coding.sales.output.OrderRepresentation;

/**
 * 销售系统的主入口
 * 用于打印销售凭证
 */
public class OrderApp {

    public static void main(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException("参数不正确。参数1为销售订单的JSON文件名，参数2为待打印销售凭证的文本文件名.");
        }

        String jsonFileName = args[0];
        String txtFileName = args[1];

        String orderCommand = FileUtils.readFromFile(jsonFileName);
        OrderApp app = new OrderApp();
        String result = app.checkout(orderCommand);
        FileUtils.writeToFile(result, txtFileName);
    }

    public String checkout(String orderCommand) {
        OrderCommand command = OrderCommand.from(orderCommand);
        OrderRepresentation result = checkout(command);
        
        return result.toString();
    }

    OrderRepresentation checkout(OrderCommand command) {
        OrderRepresentation result = null;

        //TODO: 请完成需求指定的功能
        //获取客户
        MemberAction memberAction = new MemberAction();
        String memberCommand = FileUtils.readFromFile(memberAction.getResourceFilePath("member-command.json"));
    	JSONObject memberJSON = JSONObject.fromObject(memberCommand);
    	Member member = memberAction.getMemberByCode("6236609999", memberJSON);
    	
    	//获取商品信息
    	NobleMetalAction nobleMetalAction = new NobleMetalAction();
         String nobleMetalCommand = FileUtils.readFromFile(nobleMetalAction.getResourceFilePath("item-command.json"));
     	JSONObject nobleMetalJSON = JSONObject.fromObject(nobleMetalCommand);
     	NobleMetal nobleMetal1 = nobleMetalAction.getMemberByCode("001001", nobleMetalJSON);
     	NobleMetal nobleMetal2 = nobleMetalAction.getMemberByCode("001002", nobleMetalJSON);
     	NobleMetal nobleMetal3 = nobleMetalAction.getMemberByCode("002002", nobleMetalJSON);
     	NobleMetal nobleMetal4 = nobleMetalAction.getMemberByCode("002003", nobleMetalJSON);
     	
     	

        return result;
    }
}
