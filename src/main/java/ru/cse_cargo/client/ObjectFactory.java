
package ru.cse_cargo.client;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.cse_cargo.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.cse_cargo.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDataPushExit }
     * 
     */
    public GetDataPushExit createGetDataPushExit() {
        return new GetDataPushExit();
    }

    /**
     * Create an instance of {@link GetDataPushExitResponse }
     * 
     */
    public GetDataPushExitResponse createGetDataPushExitResponse() {
        return new GetDataPushExitResponse();
    }

    /**
     * Create an instance of {@link ProductDelivery }
     * 
     */
    public ProductDelivery createProductDelivery() {
        return new ProductDelivery();
    }

    /**
     * Create an instance of {@link ProductDeliveryResponse }
     * 
     */
    public ProductDeliveryResponse createProductDeliveryResponse() {
        return new ProductDeliveryResponse();
    }

    /**
     * Create an instance of {@link ProductPurposeManualLoading }
     * 
     */
    public ProductPurposeManualLoading createProductPurposeManualLoading() {
        return new ProductPurposeManualLoading();
    }

    /**
     * Create an instance of {@link ProductPurposeManualLoadingResponse }
     * 
     */
    public ProductPurposeManualLoadingResponse createProductPurposeManualLoadingResponse() {
        return new ProductPurposeManualLoadingResponse();
    }

    /**
     * Create an instance of {@link ReplacingTheBag }
     * 
     */
    public ReplacingTheBag createReplacingTheBag() {
        return new ReplacingTheBag();
    }

    /**
     * Create an instance of {@link ReplacingTheBagResponse }
     * 
     */
    public ReplacingTheBagResponse createReplacingTheBagResponse() {
        return new ReplacingTheBagResponse();
    }

}
