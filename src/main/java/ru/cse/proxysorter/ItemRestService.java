package ru.cse.proxysorter;

import client.WebServicesNewCSEPortType;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import java.net.MalformedURLException;

/**
 *
 * @powered by Barbarian
 */

public class ItemRestService  {

    private static final String URL = "http://web.cse.ru/cse82_reg/ws/WebServicesNewCSE";


    public static void main(String[] args) throws MalformedURLException {
        testSOAPFromClient();
    }

    private static void testSOAPFromClient() throws MalformedURLException {
        String soapServiceUrl = "http://web.cse.ru/cse82_reg/ws/WebServicesNewCSE";
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(WebServicesNewCSEPortType.class);
        factoryBean.setAddress(soapServiceUrl);
        WebServicesNewCSEPortType webserviceSEI = (WebServicesNewCSEPortType)factoryBean.create();
        String OutData = webserviceSEI.version();
        System.out.print("Program finished " + OutData);
    }

}