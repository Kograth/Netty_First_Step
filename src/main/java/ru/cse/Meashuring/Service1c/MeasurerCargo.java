package ru.cse.Meashuring.Service1c;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2017-11-01T10:10:57.960+03:00
 * Generated source version: 3.1.7
 * 
 */
@WebServiceClient(name = "MeasurerCargo", 
                  wsdlLocation = "http://web.cse.ru/cse8_bsp/ws/MeasurerCargo?wsdl",
                  targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo") 
public class MeasurerCargo extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.cse-cargo.ru/MeasurerCargo", "MeasurerCargo");
    public final static QName MeasurerCargoSoap = new QName("http://www.cse-cargo.ru/MeasurerCargo", "MeasurerCargoSoap");
    public final static QName MeasurerCargoSoap12 = new QName("http://www.cse-cargo.ru/MeasurerCargo", "MeasurerCargoSoap12");
    static {
        URL url = null;
        try {
            url = new URL("http://web.cse.ru/cse8_bsp/ws/MeasurerCargo?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MeasurerCargo.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://web.cse.ru/cse8_bsp/ws/MeasurerCargo?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MeasurerCargo(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MeasurerCargo(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MeasurerCargo() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public MeasurerCargo(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public MeasurerCargo(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public MeasurerCargo(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     * 
     * 				
     * 			
     *
     * @return
     *     returns MeasurerCargoPortType
     */
    @WebEndpoint(name = "MeasurerCargoSoap")
    public MeasurerCargoPortType getMeasurerCargoSoap() {
        return super.getPort(MeasurerCargoSoap, MeasurerCargoPortType.class);
    }

    /**
     * 
     * 				
     * 			
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MeasurerCargoPortType
     */
    @WebEndpoint(name = "MeasurerCargoSoap")
    public MeasurerCargoPortType getMeasurerCargoSoap(WebServiceFeature... features) {
        return super.getPort(MeasurerCargoSoap, MeasurerCargoPortType.class, features);
    }


    /**
     *
     * @return
     *     returns MeasurerCargoPortType
     */
    @WebEndpoint(name = "MeasurerCargoSoap12")
    public MeasurerCargoPortType getMeasurerCargoSoap12() {
        return super.getPort(MeasurerCargoSoap12, MeasurerCargoPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MeasurerCargoPortType
     */
    @WebEndpoint(name = "MeasurerCargoSoap12")
    public MeasurerCargoPortType getMeasurerCargoSoap12(WebServiceFeature... features) {
        return super.getPort(MeasurerCargoSoap12, MeasurerCargoPortType.class, features);
    }

}