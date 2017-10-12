package ru.cse.APILk.Service1c;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2017-10-12T16:31:44.549+03:00
 * Generated source version: 3.1.7
 * 
 */
@WebServiceClient(name = "SorterExchange", 
                  wsdlLocation = "http://web.cse.ru/cse82_AlexSt/ws/SorterExchange?wsdl",
                  targetNamespace = "http://www.cse-cargo.ru/client") 
public class SorterExchange extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.cse-cargo.ru/client", "SorterExchange");
    public final static QName SorterExchangeSoap12 = new QName("http://www.cse-cargo.ru/client", "SorterExchangeSoap12");
    public final static QName SorterExchangeSoap = new QName("http://www.cse-cargo.ru/client", "SorterExchangeSoap");
    static {
        URL url = null;
        try {
            url = new URL("http://web.cse.ru/cse82_AlexSt/ws/SorterExchange?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SorterExchange.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://web.cse.ru/cse82_AlexSt/ws/SorterExchange?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SorterExchange(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SorterExchange(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SorterExchange() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public SorterExchange(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SorterExchange(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SorterExchange(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns SorterExchangePortType
     */
    @WebEndpoint(name = "SorterExchangeSoap12")
    public SorterExchangePortType getSorterExchangeSoap12() {
        return super.getPort(SorterExchangeSoap12, SorterExchangePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SorterExchangePortType
     */
    @WebEndpoint(name = "SorterExchangeSoap12")
    public SorterExchangePortType getSorterExchangeSoap12(WebServiceFeature... features) {
        return super.getPort(SorterExchangeSoap12, SorterExchangePortType.class, features);
    }


    /**
     * 
     * 				
     * 			
     *
     * @return
     *     returns SorterExchangePortType
     */
    @WebEndpoint(name = "SorterExchangeSoap")
    public SorterExchangePortType getSorterExchangeSoap() {
        return super.getPort(SorterExchangeSoap, SorterExchangePortType.class);
    }

    /**
     * 
     * 				
     * 			
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SorterExchangePortType
     */
    @WebEndpoint(name = "SorterExchangeSoap")
    public SorterExchangePortType getSorterExchangeSoap(WebServiceFeature... features) {
        return super.getPort(SorterExchangeSoap, SorterExchangePortType.class, features);
    }

}
