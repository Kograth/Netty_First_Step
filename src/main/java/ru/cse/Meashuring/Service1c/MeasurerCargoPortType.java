package ru.cse.Meashuring.Service1c;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2017-12-05T16:19:22.619+03:00
 * Generated source version: 3.1.7
 * 
 */
@WebService(targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo", name = "MeasurerCargoPortType")
@XmlSeeAlso({ObjectFactory.class})
public interface MeasurerCargoPortType {

    @WebMethod(operationName = "Measurement", action = "http://www.cse-cargo.ru/MeasurerCargo#MeasurerCargo:Measurement")
    @RequestWrapper(localName = "Measurement", targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo", className = "ru.cse.Meashuring.Service1c.Measurement")
    @ResponseWrapper(localName = "MeasurementResponse", targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo", className = "ru.cse.Meashuring.Service1c.MeasurementResponse")
    @WebResult(name = "return", targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo")
    public ru.cse.Meashuring.Service1c.ResultString measurement(
        @WebParam(name = "Number", targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo")
        java.lang.String number,
        @WebParam(name = "Length", targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo")
        java.lang.Float length,
        @WebParam(name = "Height", targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo")
        java.lang.Float height,
        @WebParam(name = "Width", targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo")
        java.lang.Float width,
        @WebParam(name = "Weight", targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo")
        java.lang.Float weight
    );

    @WebMethod(operationName = "FotoCargo", action = "http://www.cse-cargo.ru/MeasurerCargo#MeasurerCargo:FotoCargo")
    @RequestWrapper(localName = "FotoCargo", targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo", className = "ru.cse.Meashuring.Service1c.FotoCargo")
    @ResponseWrapper(localName = "FotoCargoResponse", targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo", className = "ru.cse.Meashuring.Service1c.FotoCargoResponse")
    @WebResult(name = "return", targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo")
    public ru.cse.Meashuring.Service1c.ResultString fotoCargo(
        @WebParam(name = "Number", targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo")
        java.lang.String number,
        @WebParam(name = "Foto", targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo")
        java.lang.String foto
    );
}
