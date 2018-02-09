package com.sms.webservice.soap.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.sms.webservice.soap.group.policy.ResponseInfo;
import com.sms.webservice.soap.group.policy.StrategyManagementPlatformService;

public class GWebServiceClient {

	public static void main(String[] args) {
		JaxWsProxyFactoryBean jwpfb = new JaxWsProxyFactoryBean();  
        jwpfb.setServiceClass(StrategyManagementPlatformService.class);  
        jwpfb.setAddress("http://localhost:8080/GWebServiceServer/StrategyManagementPlatformService"); 
        StrategyManagementPlatformService service = (StrategyManagementPlatformService) jwpfb.create();
        ResponseInfo resp = service.getEffectiveStrategyResult("a001","b001");
        System.out.println("Result is "+resp.getResult());
        System.out.println("Resultdesc is "+resp.getResultdesc());
        System.out.println("----------------------------------------");
	}

}
