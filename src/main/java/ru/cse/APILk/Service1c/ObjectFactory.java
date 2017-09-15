
package ru.cse.APILk.Service1c;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.cse.APILk.Service1c package. 
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

    private final static QName _WaybillOrderNumber_QNAME = new QName("http://www.cse-cargo.ru/client", "OrderNumber");
    private final static QName _WaybillWaybillNumber_QNAME = new QName("http://www.cse-cargo.ru/client", "WaybillNumber");
    private final static QName _WaybillClientNumber_QNAME = new QName("http://www.cse-cargo.ru/client", "ClientNumber");
    private final static QName _WaybillCreateDate_QNAME = new QName("http://www.cse-cargo.ru/client", "CreateDate");
    private final static QName _WaybillState_QNAME = new QName("http://www.cse-cargo.ru/client", "State");
    private final static QName _WaybillDeliveryDate_QNAME = new QName("http://www.cse-cargo.ru/client", "DeliveryDate");
    private final static QName _WaybillSender_QNAME = new QName("http://www.cse-cargo.ru/client", "Sender");
    private final static QName _WaybillSenderGeography_QNAME = new QName("http://www.cse-cargo.ru/client", "SenderGeography");
    private final static QName _WaybillRecipient_QNAME = new QName("http://www.cse-cargo.ru/client", "Recipient");
    private final static QName _WaybillRecipientGeography_QNAME = new QName("http://www.cse-cargo.ru/client", "RecipientGeography");
    private final static QName _WaybillRecipientAddress_QNAME = new QName("http://www.cse-cargo.ru/client", "RecipientAddress");
    private final static QName _WaybillSendDate_QNAME = new QName("http://www.cse-cargo.ru/client", "SendDate");
    private final static QName _WaybillPayer_QNAME = new QName("http://www.cse-cargo.ru/client", "Payer");
    private final static QName _WaybillCargoQty_QNAME = new QName("http://www.cse-cargo.ru/client", "CargoQty");
    private final static QName _WaybillNetWeight_QNAME = new QName("http://www.cse-cargo.ru/client", "NetWeight");
    private final static QName _WaybillGrossWeight_QNAME = new QName("http://www.cse-cargo.ru/client", "GrossWeight");
    private final static QName _WaybillConsolidationNumber_QNAME = new QName("http://www.cse-cargo.ru/client", "ConsolidationNumber");
    private final static QName _WaybillInventoryWaybillNumber_QNAME = new QName("http://www.cse-cargo.ru/client", "InventoryWaybillNumber");
    private final static QName _WaybillDeliveryMethod_QNAME = new QName("http://www.cse-cargo.ru/client", "DeliveryMethod");
    private final static QName _WaybillVolume_QNAME = new QName("http://www.cse-cargo.ru/client", "Volume");
    private final static QName _WaybillRequirePaymentInCash_QNAME = new QName("http://www.cse-cargo.ru/client", "RequirePaymentInCash");
    private final static QName _WaybillPaymentInCash_QNAME = new QName("http://www.cse-cargo.ru/client", "PaymentInCash");
    private final static QName _WaybillPaymentInCashCurrency_QNAME = new QName("http://www.cse-cargo.ru/client", "PaymentInCashCurrency");
    private final static QName _WaybillRecipientOfficial_QNAME = new QName("http://www.cse-cargo.ru/client", "RecipientOfficial");
    private final static QName _WaybillValueForCustomsPurposes_QNAME = new QName("http://www.cse-cargo.ru/client", "ValueForCustomsPurposes");
    private final static QName _WaybillValueForCustomsPurposesCurrency_QNAME = new QName("http://www.cse-cargo.ru/client", "ValueForCustomsPurposesCurrency");
    private final static QName _WaybillComment_QNAME = new QName("http://www.cse-cargo.ru/client", "Comment");
    private final static QName _WaybillWithReturn_QNAME = new QName("http://www.cse-cargo.ru/client", "WithReturn");
    private final static QName _WaybillTotal_QNAME = new QName("http://www.cse-cargo.ru/client", "Total");
    private final static QName _WaybillTypeOfOrder_QNAME = new QName("http://www.cse-cargo.ru/client", "TypeOfOrder");
    private final static QName _WaybillTypeOfCargo_QNAME = new QName("http://www.cse-cargo.ru/client", "TypeOfCargo");
    private final static QName _WaybillCargoDescription_QNAME = new QName("http://www.cse-cargo.ru/client", "CargoDescription");
    private final static QName _WaybillClientContact_QNAME = new QName("http://www.cse-cargo.ru/client", "ClientContact");
    private final static QName _WaybillRecipientContact_QNAME = new QName("http://www.cse-cargo.ru/client", "RecipientContact");
    private final static QName _WaybillTakeDate_QNAME = new QName("http://www.cse-cargo.ru/client", "TakeDate");
    private final static QName _UserDataAddressBook_QNAME = new QName("http://www.cse-cargo.ru/client", "AddressBook");
    private final static QName _UserDataCargoDescriptions_QNAME = new QName("http://www.cse-cargo.ru/client", "CargoDescriptions");
    private final static QName _UserDataCompanies_QNAME = new QName("http://www.cse-cargo.ru/client", "Companies");
    private final static QName _UserDataDeliveryMethods_QNAME = new QName("http://www.cse-cargo.ru/client", "DeliveryMethods");
    private final static QName _UserDataDepartmentOnlyFromPredefinedList_QNAME = new QName("http://www.cse-cargo.ru/client", "DepartmentOnlyFromPredefinedList");
    private final static QName _UserDataDepartmentRequired_QNAME = new QName("http://www.cse-cargo.ru/client", "DepartmentRequired");
    private final static QName _UserDataDepartments_QNAME = new QName("http://www.cse-cargo.ru/client", "Departments");
    private final static QName _UserDataPackageTypes_QNAME = new QName("http://www.cse-cargo.ru/client", "PackageTypes");
    private final static QName _UserDataServices_QNAME = new QName("http://www.cse-cargo.ru/client", "Services");
    private final static QName _UserDataTrackingDocuments_QNAME = new QName("http://www.cse-cargo.ru/client", "TrackingDocuments");
    private final static QName _UserDataTypesOfCargo_QNAME = new QName("http://www.cse-cargo.ru/client", "TypesOfCargo");
    private final static QName _UserDataTypesOfPayers_QNAME = new QName("http://www.cse-cargo.ru/client", "TypesOfPayers");
    private final static QName _UserDataUrgencies_QNAME = new QName("http://www.cse-cargo.ru/client", "Urgencies");
    private final static QName _UserDataWaysOfPayment_QNAME = new QName("http://www.cse-cargo.ru/client", "WaysOfPayment");
    private final static QName _UserDataStore_QNAME = new QName("http://www.cse-cargo.ru/client", "Store");
    private final static QName _UserDataPriceInOrderForStore_QNAME = new QName("http://www.cse-cargo.ru/client", "PriceInOrderForStore");
    private final static QName _UserDataCoefficientOfVolumeWeight_QNAME = new QName("http://www.cse-cargo.ru/client", "CoefficientOfVolumeWeight");
    private final static QName _UserDataWeightLimit_QNAME = new QName("http://www.cse-cargo.ru/client", "WeightLimit");
    private final static QName _UserDataPrintProject_QNAME = new QName("http://www.cse-cargo.ru/client", "PrintProject");
    private final static QName _UserDataPrintDepartment_QNAME = new QName("http://www.cse-cargo.ru/client", "PrintDepartment");
    private final static QName _UserDataCargoPackagesRequired_QNAME = new QName("http://www.cse-cargo.ru/client", "CargoPackagesRequired");
    private final static QName _UserDataCargoDiscriptionRequired_QNAME = new QName("http://www.cse-cargo.ru/client", "CargoDiscriptionRequired");
    private final static QName _UserDataRecipientOfficialRequired_QNAME = new QName("http://www.cse-cargo.ru/client", "RecipientOfficialRequired");
    private final static QName _UserDataSenderOfficialRequired_QNAME = new QName("http://www.cse-cargo.ru/client", "SenderOfficialRequired");
    private final static QName _UserDataClientOfficialRequired_QNAME = new QName("http://www.cse-cargo.ru/client", "ClientOfficialRequired");
    private final static QName _UserDataWriteInsuranceCost_QNAME = new QName("http://www.cse-cargo.ru/client", "WriteInsuranceCost");
    private final static QName _UserDataWriteDeclaredCost_QNAME = new QName("http://www.cse-cargo.ru/client", "WriteDeclaredCost");
    private final static QName _UserDataCommentWaybill_QNAME = new QName("http://www.cse-cargo.ru/client", "CommentWaybill");
    private final static QName _UserDataCommentOrder_QNAME = new QName("http://www.cse-cargo.ru/client", "CommentOrder");
    private final static QName _UserDataMainTypeOfDelivery_QNAME = new QName("http://www.cse-cargo.ru/client", "MainTypeOfDelivery");
    private final static QName _UserDataMainPayer_QNAME = new QName("http://www.cse-cargo.ru/client", "MainPayer");
    private final static QName _UserDataMainDocument_QNAME = new QName("http://www.cse-cargo.ru/client", "MainDocument");
    private final static QName _UserDataMainTypeOfCargo_QNAME = new QName("http://www.cse-cargo.ru/client", "MainTypeOfCargo");
    private final static QName _UserDataMainEmailRecipient_QNAME = new QName("http://www.cse-cargo.ru/client", "MainEmailRecipient");
    private final static QName _UserDataMainPhonelRecipient_QNAME = new QName("http://www.cse-cargo.ru/client", "MainPhonelRecipient");
    private final static QName _UserDataMainAddressRecipient_QNAME = new QName("http://www.cse-cargo.ru/client", "MainAddressRecipient");
    private final static QName _UserDataMainCommentRecipient_QNAME = new QName("http://www.cse-cargo.ru/client", "MainCommentRecipient");
    private final static QName _UserDataMainRecipient_QNAME = new QName("http://www.cse-cargo.ru/client", "MainRecipient");
    private final static QName _UserDataMainOfficialRecipient_QNAME = new QName("http://www.cse-cargo.ru/client", "MainOfficialRecipient");
    private final static QName _UserDataMainGeographyRecipient_QNAME = new QName("http://www.cse-cargo.ru/client", "MainGeographyRecipient");
    private final static QName _UserDataMainEmailSender_QNAME = new QName("http://www.cse-cargo.ru/client", "MainEmailSender");
    private final static QName _UserDataMainPhonelSender_QNAME = new QName("http://www.cse-cargo.ru/client", "MainPhonelSender");
    private final static QName _UserDataMainSender_QNAME = new QName("http://www.cse-cargo.ru/client", "MainSender");
    private final static QName _UserDataMainCommentSender_QNAME = new QName("http://www.cse-cargo.ru/client", "MainCommentSender");
    private final static QName _UserDataMainAddressSender_QNAME = new QName("http://www.cse-cargo.ru/client", "MainAddressSender");
    private final static QName _UserDataMainOfficialSender_QNAME = new QName("http://www.cse-cargo.ru/client", "MainOfficialSender");
    private final static QName _UserDataMainGeographySender_QNAME = new QName("http://www.cse-cargo.ru/client", "MainGeographySender");
    private final static QName _UserDataProjectRequired_QNAME = new QName("http://www.cse-cargo.ru/client", "ProjectRequired");
    private final static QName _UserDataDetermineIntakeOffice_QNAME = new QName("http://www.cse-cargo.ru/client", "DetermineIntakeOffice");
    private final static QName _UserDataEnebleCOD_QNAME = new QName("http://www.cse-cargo.ru/client", "EnebleCOD");
    private final static QName _UserDataEnebleDateTimeDepart_QNAME = new QName("http://www.cse-cargo.ru/client", "EnebleDateTimeDepart");
    private final static QName _UserDataContacts_QNAME = new QName("http://www.cse-cargo.ru/client", "Contacts");
    private final static QName _UserDataTypeOfDeliveryOfCargo_QNAME = new QName("http://www.cse-cargo.ru/client", "TypeOfDeliveryOfCargo");
    private final static QName _UserDataUseOptionallyAnalytics_QNAME = new QName("http://www.cse-cargo.ru/client", "UseOptionallyAnalytics");
    private final static QName _UserDataOrganization_QNAME = new QName("http://www.cse-cargo.ru/client", "Organization");
    private final static QName _UserDataDeclaredLimit_QNAME = new QName("http://www.cse-cargo.ru/client", "DeclaredLimit");
    private final static QName _UserDataInsuranceLimit_QNAME = new QName("http://www.cse-cargo.ru/client", "InsuranceLimit");
    private final static QName _UserDataRestrictions_QNAME = new QName("http://www.cse-cargo.ru/client", "Restrictions");
    private final static QName _UserDataPreliminaryCost_QNAME = new QName("http://www.cse-cargo.ru/client", "PreliminaryCost");
    private final static QName _UserDataAvailableFunctionalCategory_QNAME = new QName("http://www.cse-cargo.ru/client", "AvailableFunctionalCategory");
    private final static QName _UserDataChangeCustomerGoods_QNAME = new QName("http://www.cse-cargo.ru/client", "ChangeCustomerGoods");
    private final static QName _UserDataCreateCustomerGoods_QNAME = new QName("http://www.cse-cargo.ru/client", "CreateCustomerGoods");
    private final static QName _UserDataChangeCustomerGoodsPhoto_QNAME = new QName("http://www.cse-cargo.ru/client", "ChangeCustomerGoodsPhoto");
    private final static QName _UserDataCreateCustomerGoodsPhoto_QNAME = new QName("http://www.cse-cargo.ru/client", "CreateCustomerGoodsPhoto");
    private final static QName _UserDataFieldsProjectCustomerGoods_QNAME = new QName("http://www.cse-cargo.ru/client", "FieldsProjectCustomerGoods");
    private final static QName _UserDataEditRecipientInOrderForApproval_QNAME = new QName("http://www.cse-cargo.ru/client", "EditRecipientInOrderForApproval");
    private final static QName _UserDataRequiresOrderConfirmationWarehouse_QNAME = new QName("http://www.cse-cargo.ru/client", "RequiresOrderConfirmationWarehouse");
    private final static QName _UserDataCreateProjects_QNAME = new QName("http://www.cse-cargo.ru/client", "CreateProjects");
    private final static QName _UserDataCreateDepartments_QNAME = new QName("http://www.cse-cargo.ru/client", "CreateDepartments");
    private final static QName _UserDataCreateOfficials_QNAME = new QName("http://www.cse-cargo.ru/client", "CreateOfficials");
    private final static QName _UserDataRecipientEmailRequired_QNAME = new QName("http://www.cse-cargo.ru/client", "RecipientEmailRequired");
    private final static QName _UserDataSenderEmailRequired_QNAME = new QName("http://www.cse-cargo.ru/client", "SenderEmailRequired");
    private final static QName _UserDataSplitAnAddressBook_QNAME = new QName("http://www.cse-cargo.ru/client", "SplitAnAddressBook");
    private final static QName _UserDataUseOwnAddressBook_QNAME = new QName("http://www.cse-cargo.ru/client", "UseOwnAddressBook");
    private final static QName _TrackingInfoType_QNAME = new QName("http://www.cse-cargo.ru/client", "Type");
    private final static QName _TrackingInfoNumber_QNAME = new QName("http://www.cse-cargo.ru/client", "Number");
    private final static QName _TrackingInfoInfo_QNAME = new QName("http://www.cse-cargo.ru/client", "Info");
    private final static QName _TrackingInfoAgentURL_QNAME = new QName("http://www.cse-cargo.ru/client", "AgentURL");
    private final static QName _TrackingInfoDeliveryInfo_QNAME = new QName("http://www.cse-cargo.ru/client", "DeliveryInfo");
    private final static QName _TrackingInfoPlannedDeliveryPeriodMin_QNAME = new QName("http://www.cse-cargo.ru/client", "PlannedDeliveryPeriodMin");
    private final static QName _TrackingInfoPlannedDeliveryPeriodMax_QNAME = new QName("http://www.cse-cargo.ru/client", "PlannedDeliveryPeriodMax");
    private final static QName _TrackingInfoPlannedDeliveryDate_QNAME = new QName("http://www.cse-cargo.ru/client", "PlannedDeliveryDate");
    private final static QName _TrackingEventEventDate_QNAME = new QName("http://www.cse-cargo.ru/client", "EventDate");
    private final static QName _TrackingEventEventName_QNAME = new QName("http://www.cse-cargo.ru/client", "EventName");
    private final static QName _TrackingEventEventInfo_QNAME = new QName("http://www.cse-cargo.ru/client", "EventInfo");
    private final static QName _SructTypeGUID_QNAME = new QName("http://www.cse-cargo.ru/client", "GUID");
    private final static QName _SructTypeParentGUID_QNAME = new QName("http://www.cse-cargo.ru/client", "ParentGUID");
    private final static QName _SructTypeIsFolder_QNAME = new QName("http://www.cse-cargo.ru/client", "IsFolder");
    private final static QName _SructTypeDefault_QNAME = new QName("http://www.cse-cargo.ru/client", "Default");
    private final static QName _ResultArrayPhotoError_QNAME = new QName("http://www.cse-cargo.ru/client", "Error");
    private final static QName _ResultArrayPhotoErrorInfo_QNAME = new QName("http://www.cse-cargo.ru/client", "ErrorInfo");
    private final static QName _ReestrWaybillOfficial_QNAME = new QName("http://www.cse-cargo.ru/client", "Official");
    private final static QName _ProductsArticle_QNAME = new QName("http://www.cse-cargo.ru/client", "Article");
    private final static QName _ProductsName_QNAME = new QName("http://www.cse-cargo.ru/client", "Name");
    private final static QName _ProductsBCProduct_QNAME = new QName("http://www.cse-cargo.ru/client", "BCProduct");
    private final static QName _ProductsParty_QNAME = new QName("http://www.cse-cargo.ru/client", "Party");
    private final static QName _ProductsDayOfParty_QNAME = new QName("http://www.cse-cargo.ru/client", "DayOfParty");
    private final static QName _ProductsExpirationDate_QNAME = new QName("http://www.cse-cargo.ru/client", "ExpirationDate");
    private final static QName _ProductsSerialNumber_QNAME = new QName("http://www.cse-cargo.ru/client", "SerialNumber");
    private final static QName _ProductsPrice_QNAME = new QName("http://www.cse-cargo.ru/client", "Price");
    private final static QName _ProductsPackage_QNAME = new QName("http://www.cse-cargo.ru/client", "Package");
    private final static QName _ProductsPackageQty_QNAME = new QName("http://www.cse-cargo.ru/client", "PackageQty");
    private final static QName _ProductsQty_QNAME = new QName("http://www.cse-cargo.ru/client", "Qty");
    private final static QName _ProductsVATRate_QNAME = new QName("http://www.cse-cargo.ru/client", "VATRate");
    private final static QName _ProductsCodeFromOrder_QNAME = new QName("http://www.cse-cargo.ru/client", "CodeFromOrder");
    private final static QName _ProductsAssessedValue_QNAME = new QName("http://www.cse-cargo.ru/client", "AssessedValue");
    private final static QName _ProductSerialNumberGuid_QNAME = new QName("http://www.cse-cargo.ru/client", "Guid");
    private final static QName _ProductSerialNumberID_QNAME = new QName("http://www.cse-cargo.ru/client", "ID");
    private final static QName _ProductSerialNumberNumberGDT_QNAME = new QName("http://www.cse-cargo.ru/client", "NumberGDT");
    private final static QName _ProductSerialNumberSertificate_QNAME = new QName("http://www.cse-cargo.ru/client", "Sertificate");
    private final static QName _ProductPartiesClient_QNAME = new QName("http://www.cse-cargo.ru/client", "Client");
    private final static QName _ProductPartiesProject_QNAME = new QName("http://www.cse-cargo.ru/client", "Project");
    private final static QName _ProductPartiesDepartment_QNAME = new QName("http://www.cse-cargo.ru/client", "Department");
    private final static QName _ProductPackagesRate_QNAME = new QName("http://www.cse-cargo.ru/client", "Rate");
    private final static QName _ProductPackagesUnit_QNAME = new QName("http://www.cse-cargo.ru/client", "Unit");
    private final static QName _ProductPackagesTypeSize_QNAME = new QName("http://www.cse-cargo.ru/client", "TypeSize");
    private final static QName _ProductFeaturesFullName_QNAME = new QName("http://www.cse-cargo.ru/client", "FullName");
    private final static QName _ProblemNotClosed_QNAME = new QName("http://www.cse-cargo.ru/client", "NotClosed");
    private final static QName _ProblemTraceCode_QNAME = new QName("http://www.cse-cargo.ru/client", "TraceCode");
    private final static QName _ProblemDescription_QNAME = new QName("http://www.cse-cargo.ru/client", "Description");
    private final static QName _ProblemCanCloseTheTrace_QNAME = new QName("http://www.cse-cargo.ru/client", "CanCloseTheTrace");
    private final static QName _PrintDocumentsBarCode_QNAME = new QName("http://www.cse-cargo.ru/client", "BarCode");
    private final static QName _PrintDocumentsOrderDate_QNAME = new QName("http://www.cse-cargo.ru/client", "OrderDate");
    private final static QName _PrintDocumentsWaybillDate_QNAME = new QName("http://www.cse-cargo.ru/client", "WaybillDate");
    private final static QName _PrintDocumentsContractNumber_QNAME = new QName("http://www.cse-cargo.ru/client", "ContractNumber");
    private final static QName _PrintDocumentsPackageNumber_QNAME = new QName("http://www.cse-cargo.ru/client", "PackageNumber");
    private final static QName _PrintDocumentsDepartmentRecipient_QNAME = new QName("http://www.cse-cargo.ru/client", "DepartmentRecipient");
    private final static QName _PrintDocumentsDepartmentSender_QNAME = new QName("http://www.cse-cargo.ru/client", "DepartmentSender");
    private final static QName _PrintDocumentsFlagPaySender_QNAME = new QName("http://www.cse-cargo.ru/client", "FlagPaySender");
    private final static QName _PrintDocumentsFlagPayRecipient_QNAME = new QName("http://www.cse-cargo.ru/client", "FlagPayRecipient");
    private final static QName _PrintDocumentsFlagPayClient_QNAME = new QName("http://www.cse-cargo.ru/client", "FlagPayClient");
    private final static QName _PrintDocumentsFlagGuarantee_QNAME = new QName("http://www.cse-cargo.ru/client", "FlagGuarantee");
    private final static QName _PrintDocumentsFlagCash_QNAME = new QName("http://www.cse-cargo.ru/client", "FlagCash");
    private final static QName _PrintDocumentsFlagCashless_QNAME = new QName("http://www.cse-cargo.ru/client", "FlagCashless");
    private final static QName _PrintDocumentsCargo_QNAME = new QName("http://www.cse-cargo.ru/client", "Cargo");
    private final static QName _PrintDocumentsFlagInsurance_QNAME = new QName("http://www.cse-cargo.ru/client", "FlagInsurance");
    private final static QName _PrintDocumentsFlagDeclaredValue_QNAME = new QName("http://www.cse-cargo.ru/client", "FlagDeclaredValue");
    private final static QName _PrintDocumentsWithNotification_QNAME = new QName("http://www.cse-cargo.ru/client", "WithNotification");
    private final static QName _PrintDocumentsServiceAmount_QNAME = new QName("http://www.cse-cargo.ru/client", "ServiceAmount");
    private final static QName _PrintDocumentsServiceAmountCurrency_QNAME = new QName("http://www.cse-cargo.ru/client", "ServiceAmountCurrency");
    private final static QName _PrintDocumentsPaymentAmount_QNAME = new QName("http://www.cse-cargo.ru/client", "PaymentAmount");
    private final static QName _PrintDocumentsPaymentAmountCurrency_QNAME = new QName("http://www.cse-cargo.ru/client", "PaymentAmountCurrency");
    private final static QName _PrintDocumentsBarCodeOrder_QNAME = new QName("http://www.cse-cargo.ru/client", "BarCodeOrder");
    private final static QName _PrintDocumentsBarCodeClientCode_QNAME = new QName("http://www.cse-cargo.ru/client", "BarCodeClientCode");
    private final static QName _PrintDocumentsUrgency_QNAME = new QName("http://www.cse-cargo.ru/client", "Urgency");
    private final static QName _PrintDocumentsCommentFull_QNAME = new QName("http://www.cse-cargo.ru/client", "CommentFull");
    private final static QName _PrintDocumentsCourer_QNAME = new QName("http://www.cse-cargo.ru/client", "Courer");
    private final static QName _PhotoGoodsGuidPhoto_QNAME = new QName("http://www.cse-cargo.ru/client", "GuidPhoto");
    private final static QName _PhotoGoodsURL_QNAME = new QName("http://www.cse-cargo.ru/client", "URL");
    private final static QName _PhotoGoodsSize_QNAME = new QName("http://www.cse-cargo.ru/client", "Size");
    private final static QName _PayableContract_QNAME = new QName("http://www.cse-cargo.ru/client", "Contract");
    private final static QName _PayableSumma_QNAME = new QName("http://www.cse-cargo.ru/client", "Summa");
    private final static QName _PackagePropertiesTypeOfPackage_QNAME = new QName("http://www.cse-cargo.ru/client", "TypeOfPackage");
    private final static QName _PVZOffice_QNAME = new QName("http://www.cse-cargo.ru/client", "Office");
    private final static QName _PVZGeography_QNAME = new QName("http://www.cse-cargo.ru/client", "Geography");
    private final static QName _PVZPhone_QNAME = new QName("http://www.cse-cargo.ru/client", "Phone");
    private final static QName _PVZAddress_QNAME = new QName("http://www.cse-cargo.ru/client", "Address");
    private final static QName _PVZTypeOfPVZ_QNAME = new QName("http://www.cse-cargo.ru/client", "TypeOfPVZ");
    private final static QName _PVZCodePVZ_QNAME = new QName("http://www.cse-cargo.ru/client", "CodePVZ");
    private final static QName _PVZWeightLimite_QNAME = new QName("http://www.cse-cargo.ru/client", "WeightLimite");
    private final static QName _PVZHightLimite_QNAME = new QName("http://www.cse-cargo.ru/client", "HightLimite");
    private final static QName _PVZLengthLimite_QNAME = new QName("http://www.cse-cargo.ru/client", "LengthLimite");
    private final static QName _PVZWidthLimite_QNAME = new QName("http://www.cse-cargo.ru/client", "WidthLimite");
    private final static QName _PVZMaxDimensionLimite_QNAME = new QName("http://www.cse-cargo.ru/client", "MaxDimensionLimite");
    private final static QName _PVZSumDimensionLimite_QNAME = new QName("http://www.cse-cargo.ru/client", "SumDimensionLimite");
    private final static QName _PVZQtyLimite_QNAME = new QName("http://www.cse-cargo.ru/client", "QtyLimite");
    private final static QName _PVZCODLimite_QNAME = new QName("http://www.cse-cargo.ru/client", "CODLimite");
    private final static QName _PVZIssuanceOfShipping_QNAME = new QName("http://www.cse-cargo.ru/client", "IssuanceOfShipping");
    private final static QName _PVZPaymentByCard_QNAME = new QName("http://www.cse-cargo.ru/client", "PaymentByCard");
    private final static QName _PVZPaymentByCash_QNAME = new QName("http://www.cse-cargo.ru/client", "PaymentByCash");
    private final static QName _PVZReceivingSending_QNAME = new QName("http://www.cse-cargo.ru/client", "ReceivingSending");
    private final static QName _PVZTryOn_QNAME = new QName("http://www.cse-cargo.ru/client", "TryOn");
    private final static QName _PVZPartialBuyout_QNAME = new QName("http://www.cse-cargo.ru/client", "PartialBuyout");
    private final static QName _OutputSettingsCustomersGoodsReport3NumberWaybill_QNAME = new QName("http://www.cse-cargo.ru/client", "NumberWaybill");
    private final static QName _OutputSettingsCustomersGoodsReport3NumberOfOrder_QNAME = new QName("http://www.cse-cargo.ru/client", "NumberOfOrder");
    private final static QName _OutputSettingsCustomersGoodsReport3InfoWaybill_QNAME = new QName("http://www.cse-cargo.ru/client", "InfoWaybill");
    private final static QName _OutputSettingsCustomersGoodsReport3InfoCargo_QNAME = new QName("http://www.cse-cargo.ru/client", "InfoCargo");
    private final static QName _OutputSettingsCustomersGoodsReport3InfoDelivery_QNAME = new QName("http://www.cse-cargo.ru/client", "InfoDelivery");
    private final static QName _OutputSettingsCustomersGoodsReport3InfoTrace_QNAME = new QName("http://www.cse-cargo.ru/client", "InfoTrace");
    private final static QName _OutputSettingsCustomersGoodsReport3InfoState_QNAME = new QName("http://www.cse-cargo.ru/client", "InfoState");
    private final static QName _OutputSettingsCustomersGoodsReport3InfoDeliveryTime_QNAME = new QName("http://www.cse-cargo.ru/client", "InfoDeliveryTime");
    private final static QName _OpeningHoursStartReceiving_QNAME = new QName("http://www.cse-cargo.ru/client", "StartReceiving");
    private final static QName _OpeningHoursEndReceiving_QNAME = new QName("http://www.cse-cargo.ru/client", "EndReceiving");
    private final static QName _OpeningHoursStartIssue_QNAME = new QName("http://www.cse-cargo.ru/client", "StartIssue");
    private final static QName _OpeningHoursEndIssue_QNAME = new QName("http://www.cse-cargo.ru/client", "EndIssue");
    private final static QName _NotificationsSMS_QNAME = new QName("http://www.cse-cargo.ru/client", "SMS");
    private final static QName _NotificationsEmail_QNAME = new QName("http://www.cse-cargo.ru/client", "Email");
    private final static QName _MessageParent_QNAME = new QName("http://www.cse-cargo.ru/client", "Parent");
    private final static QName _MessageTheme_QNAME = new QName("http://www.cse-cargo.ru/client", "Theme");
    private final static QName _MessageText_QNAME = new QName("http://www.cse-cargo.ru/client", "Text");
    private final static QName _MessageEMail_QNAME = new QName("http://www.cse-cargo.ru/client", "EMail");
    private final static QName _MessageResult_QNAME = new QName("http://www.cse-cargo.ru/client", "Result");
    private final static QName _InfoWaybillReportsDate_QNAME = new QName("http://www.cse-cargo.ru/client", "Date");
    private final static QName _InfoWaybillReportsClientOfficial_QNAME = new QName("http://www.cse-cargo.ru/client", "ClientOfficial");
    private final static QName _InfoWaybillReportsClientDepartment_QNAME = new QName("http://www.cse-cargo.ru/client", "ClientDepartment");
    private final static QName _InfoWaybillReportsClientProject_QNAME = new QName("http://www.cse-cargo.ru/client", "ClientProject");
    private final static QName _InfoWaybillReportsSenderOfficial_QNAME = new QName("http://www.cse-cargo.ru/client", "SenderOfficial");
    private final static QName _InfoWaybillReportsSenderAddress_QNAME = new QName("http://www.cse-cargo.ru/client", "SenderAddress");
    private final static QName _InfoTraceReportsCode_QNAME = new QName("http://www.cse-cargo.ru/client", "Code");
    private final static QName _InfoStateReportsCodeDescription_QNAME = new QName("http://www.cse-cargo.ru/client", "CodeDescription");
    private final static QName _InfoDeliveryTimeReportsDeliveryPlan_QNAME = new QName("http://www.cse-cargo.ru/client", "DeliveryPlan");
    private final static QName _InfoDeliveryTimeReportsDeliveryFact_QNAME = new QName("http://www.cse-cargo.ru/client", "DeliveryFact");
    private final static QName _InfoDeliveryTimeReportsCount_QNAME = new QName("http://www.cse-cargo.ru/client", "Count");
    private final static QName _InfoDeliveryReportsDeliveryTime_QNAME = new QName("http://www.cse-cargo.ru/client", "DeliveryTime");
    private final static QName _InfoDeliveryReportsFIORecipient_QNAME = new QName("http://www.cse-cargo.ru/client", "FIORecipient");
    private final static QName _InfoCargoReportsWeight_QNAME = new QName("http://www.cse-cargo.ru/client", "Weight");
    private final static QName _InfoCargoReportsVolumeWeight_QNAME = new QName("http://www.cse-cargo.ru/client", "VolumeWeight");
    private final static QName _InfoCargoReportsDimensions_QNAME = new QName("http://www.cse-cargo.ru/client", "Dimensions");
    private final static QName _InfoCargoReportsDescriptionCargo_QNAME = new QName("http://www.cse-cargo.ru/client", "DescriptionCargo");
    private final static QName _GeographyPropertiesRussia_QNAME = new QName("http://www.cse-cargo.ru/client", "Russia");
    private final static QName _GeographyPropertiesLocatedInUSSR_QNAME = new QName("http://www.cse-cargo.ru/client", "LocatedInUSSR");
    private final static QName _GeographyPropertiesLocationInfo_QNAME = new QName("http://www.cse-cargo.ru/client", "LocationInfo");
    private final static QName _GeographyPropertiesCalculatorInfo_QNAME = new QName("http://www.cse-cargo.ru/client", "CalculatorInfo");
    private final static QName _GeographyPropertiesCountryGUID_QNAME = new QName("http://www.cse-cargo.ru/client", "CountryGUID");
    private final static QName _GeographyPropertiesPriority_QNAME = new QName("http://www.cse-cargo.ru/client", "Priority");
    private final static QName _GeographyPropertiesRegion_QNAME = new QName("http://www.cse-cargo.ru/client", "Region");
    private final static QName _GeographyPropertiesDistrict_QNAME = new QName("http://www.cse-cargo.ru/client", "District");
    private final static QName _GeoLang_QNAME = new QName("http://www.cse-cargo.ru/client", "Lang");
    private final static QName _GeoLat_QNAME = new QName("http://www.cse-cargo.ru/client", "Lat");
    private final static QName _GMHLength_QNAME = new QName("http://www.cse-cargo.ru/client", "Length");
    private final static QName _GMHWidth_QNAME = new QName("http://www.cse-cargo.ru/client", "Width");
    private final static QName _GMHHeight_QNAME = new QName("http://www.cse-cargo.ru/client", "Height");
    private final static QName _GMHClientCode_QNAME = new QName("http://www.cse-cargo.ru/client", "ClientCode");
    private final static QName _ElementValue_QNAME = new QName("http://www.cse-cargo.ru/client", "Value");
    private final static QName _ElementValueType_QNAME = new QName("http://www.cse-cargo.ru/client", "ValueType");
    private final static QName _DocumentsPhotoDocument_QNAME = new QName("http://www.cse-cargo.ru/client", "Document");
    private final static QName _DocumentsPhotoRequired_QNAME = new QName("http://www.cse-cargo.ru/client", "Required");
    private final static QName _DestinationInformationSubwayStation_QNAME = new QName("http://www.cse-cargo.ru/client", "SubwayStation");
    private final static QName _DestinationInformationProductsProcessingAction_QNAME = new QName("http://www.cse-cargo.ru/client", "ProductsProcessingAction");
    private final static QName _DestinationInformationStoreDependsOnDestination_QNAME = new QName("http://www.cse-cargo.ru/client", "StoreDependsOnDestination");
    private final static QName _DestinationAddressStreet_QNAME = new QName("http://www.cse-cargo.ru/client", "Street");
    private final static QName _DestinationAddressTypeOfHome_QNAME = new QName("http://www.cse-cargo.ru/client", "TypeOfHome");
    private final static QName _DestinationAddressHome_QNAME = new QName("http://www.cse-cargo.ru/client", "Home");
    private final static QName _DestinationAddressTypeOfBuilding_QNAME = new QName("http://www.cse-cargo.ru/client", "TypeOfBuilding");
    private final static QName _DestinationAddressBuilding_QNAME = new QName("http://www.cse-cargo.ru/client", "Building");
    private final static QName _DestinationAddressTypeOfApartment_QNAME = new QName("http://www.cse-cargo.ru/client", "TypeOfApartment");
    private final static QName _DestinationAddressApartment_QNAME = new QName("http://www.cse-cargo.ru/client", "Apartment");
    private final static QName _DestinationAddressIndex_QNAME = new QName("http://www.cse-cargo.ru/client", "Index");
    private final static QName _DestinationAddressCountry_QNAME = new QName("http://www.cse-cargo.ru/client", "Country");
    private final static QName _DestinationAddressDisrcict_QNAME = new QName("http://www.cse-cargo.ru/client", "Disrcict");
    private final static QName _CostingsFromGeography_QNAME = new QName("http://www.cse-cargo.ru/client", "FromGeography");
    private final static QName _CostingsToGeography_QNAME = new QName("http://www.cse-cargo.ru/client", "ToGeography");
    private final static QName _CostingsUrgencyDescription_QNAME = new QName("http://www.cse-cargo.ru/client", "UrgencyDescription");
    private final static QName _CostingsDeliveryPeriod_QNAME = new QName("http://www.cse-cargo.ru/client", "DeliveryPeriod");
    private final static QName _CostingsMinPeriod_QNAME = new QName("http://www.cse-cargo.ru/client", "MinPeriod");
    private final static QName _CostingsMaxPeriod_QNAME = new QName("http://www.cse-cargo.ru/client", "MaxPeriod");
    private final static QName _CostedTariffTariff_QNAME = new QName("http://www.cse-cargo.ru/client", "Tariff");
    private final static QName _CostedTariffTotalCurrency_QNAME = new QName("http://www.cse-cargo.ru/client", "TotalCurrency");
    private final static QName _CostedTariffTariffGuid_QNAME = new QName("http://www.cse-cargo.ru/client", "TariffGuid");
    private final static QName _CorrespondenceKey_QNAME = new QName("http://www.cse-cargo.ru/client", "Key");
    private final static QName _CorrespondenceInformation_QNAME = new QName("http://www.cse-cargo.ru/client", "Information");
    private final static QName _CorrespondenceCodes_QNAME = new QName("http://www.cse-cargo.ru/client", "Codes");
    private final static QName _CorrespondenceBankProperties_QNAME = new QName("http://www.cse-cargo.ru/client", "BankProperties");
    private final static QName _CorrespondenceDocumentProperties_QNAME = new QName("http://www.cse-cargo.ru/client", "DocumentProperties");
    private final static QName _CorrespondenceGeographyProperties_QNAME = new QName("http://www.cse-cargo.ru/client", "GeographyProperties");
    private final static QName _CorrespondenceTariffProperties_QNAME = new QName("http://www.cse-cargo.ru/client", "TariffProperties");
    private final static QName _CorrespondenceErase_QNAME = new QName("http://www.cse-cargo.ru/client", "Erase");
    private final static QName _CorrespondencePackageProperties_QNAME = new QName("http://www.cse-cargo.ru/client", "PackageProperties");
    private final static QName _CorrespondenceContactsProperties_QNAME = new QName("http://www.cse-cargo.ru/client", "ContactsProperties");
    private final static QName _CorrespondenceProductParties_QNAME = new QName("http://www.cse-cargo.ru/client", "ProductParties");
    private final static QName _CorrespondenceClientProducts_QNAME = new QName("http://www.cse-cargo.ru/client", "ClientProducts");
    private final static QName _CodesLevel_QNAME = new QName("http://www.cse-cargo.ru/client", "Level");
    private final static QName _CodesParentCode_QNAME = new QName("http://www.cse-cargo.ru/client", "ParentCode");
    private final static QName _CodesFIAS_QNAME = new QName("http://www.cse-cargo.ru/client", "FIAS");
    private final static QName _ClientProductsFullname_QNAME = new QName("http://www.cse-cargo.ru/client", "Fullname");
    private final static QName _ClientProductsBaseUnit_QNAME = new QName("http://www.cse-cargo.ru/client", "BaseUnit");
    private final static QName _ClientProductsKit_QNAME = new QName("http://www.cse-cargo.ru/client", "Kit");
    private final static QName _ClientProductsSpecifications_QNAME = new QName("http://www.cse-cargo.ru/client", "Specifications");
    private final static QName _ClientProductsPartyGUID_QNAME = new QName("http://www.cse-cargo.ru/client", "PartyGUID");
    private final static QName _ClientProductsQTY_QNAME = new QName("http://www.cse-cargo.ru/client", "QTY");
    private final static QName _ClientProductsService_QNAME = new QName("http://www.cse-cargo.ru/client", "Service");
    private final static QName _ClientProductsStoreGUID_QNAME = new QName("http://www.cse-cargo.ru/client", "StoreGUID");
    private final static QName _ClientProductsCategory_QNAME = new QName("http://www.cse-cargo.ru/client", "Category");
    private final static QName _CargoPackagesPackageID_QNAME = new QName("http://www.cse-cargo.ru/client", "PackageID");
    private final static QName _CargoInsuranceRate_QNAME = new QName("http://www.cse-cargo.ru/client", "InsuranceRate");
    private final static QName _CargoInsuranceRateCurrency_QNAME = new QName("http://www.cse-cargo.ru/client", "InsuranceRateCurrency");
    private final static QName _CargoDeclaredValueRate_QNAME = new QName("http://www.cse-cargo.ru/client", "DeclaredValueRate");
    private final static QName _CargoDeclaredValueRateCurrency_QNAME = new QName("http://www.cse-cargo.ru/client", "DeclaredValueRateCurrency");
    private final static QName _CargoCODDescription_QNAME = new QName("http://www.cse-cargo.ru/client", "CODDescription");
    private final static QName _CargoSenderShippingCost_QNAME = new QName("http://www.cse-cargo.ru/client", "SenderShippingCost");
    private final static QName _CargoCargoDescriptionWhithoutType_QNAME = new QName("http://www.cse-cargo.ru/client", "CargoDescriptionWhithoutType");
    private final static QName _CargoInsuranceRateFee_QNAME = new QName("http://www.cse-cargo.ru/client", "InsuranceRateFee");
    private final static QName _CargoInsuranceRateFeeCurrency_QNAME = new QName("http://www.cse-cargo.ru/client", "InsuranceRateFeeCurrency");
    private final static QName _BankPropertiesCity_QNAME = new QName("http://www.cse-cargo.ru/client", "City");
    private final static QName _BankPropertiesCorrespondentAccount_QNAME = new QName("http://www.cse-cargo.ru/client", "CorrespondentAccount");
    private final static QName _BankPropertiesPhones_QNAME = new QName("http://www.cse-cargo.ru/client", "Phones");
    private final static QName _AddressFIO_QNAME = new QName("http://www.cse-cargo.ru/client", "FIO");
    private final static QName _AddressDestAddress_QNAME = new QName("http://www.cse-cargo.ru/client", "DestAddress");
    private final static QName _AccessClientCanChangePassword_QNAME = new QName("http://www.cse-cargo.ru/client", "CanChangePassword");
    private final static QName _AccessClientCanSeeAnyDocuments_QNAME = new QName("http://www.cse-cargo.ru/client", "CanSeeAnyDocuments");
    private final static QName _AccessClientWorkOwnDocumentOnly_QNAME = new QName("http://www.cse-cargo.ru/client", "WorkOwnDocumentOnly");
    private final static QName _AccessClientUseTemplateDocuments_QNAME = new QName("http://www.cse-cargo.ru/client", "UseTemplateDocuments");
    private final static QName _AccessClientReportAgentCod_QNAME = new QName("http://www.cse-cargo.ru/client", "ReportAgentCod");
    private final static QName _AccessClientGetScan_QNAME = new QName("http://www.cse-cargo.ru/client", "GetScan");
    private final static QName _AccessClientGetPhotoGoods_QNAME = new QName("http://www.cse-cargo.ru/client", "GetPhotoGoods");
    private final static QName _AccessClientUseAddressFromBookOnly_QNAME = new QName("http://www.cse-cargo.ru/client", "UseAddressFromBookOnly");
    private final static QName _ContactsFirstName_QNAME = new QName("http://www.cse-cargo.ru/client", "FirstName");
    private final static QName _ContactsLastName_QNAME = new QName("http://www.cse-cargo.ru/client", "LastName");
    private final static QName _ContactsPatronymic_QNAME = new QName("http://www.cse-cargo.ru/client", "Patronymic");
    private final static QName _ContactsDeletionMark_QNAME = new QName("http://www.cse-cargo.ru/client", "DeletionMark");
    private final static QName _ContactsPosition_QNAME = new QName("http://www.cse-cargo.ru/client", "Position");
    private final static QName _ResultReestrOrgAddress_QNAME = new QName("http://www.cse-cargo.ru/client", "OrgAddress");
    private final static QName _ResultReestrOrgPhone_QNAME = new QName("http://www.cse-cargo.ru/client", "OrgPhone");
    private final static QName _ResultReestrResultCargoQty_QNAME = new QName("http://www.cse-cargo.ru/client", "ResultCargoQty");
    private final static QName _ResultReestrContractDate_QNAME = new QName("http://www.cse-cargo.ru/client", "ContractDate");
    private final static QName _OrderReplyEMail_QNAME = new QName("http://www.cse-cargo.ru/client", "ReplyEMail");
    private final static QName _OrderReplySMSPhone_QNAME = new QName("http://www.cse-cargo.ru/client", "ReplySMSPhone");
    private final static QName _OrderTakeTime_QNAME = new QName("http://www.cse-cargo.ru/client", "TakeTime");
    private final static QName _OrderTypeOfPayer_QNAME = new QName("http://www.cse-cargo.ru/client", "TypeOfPayer");
    private final static QName _OrderWayOfPayment_QNAME = new QName("http://www.cse-cargo.ru/client", "WayOfPayment");
    private final static QName _OrderAutoType_QNAME = new QName("http://www.cse-cargo.ru/client", "AutoType");
    private final static QName _OrderAutoModel_QNAME = new QName("http://www.cse-cargo.ru/client", "AutoModel");
    private final static QName _OrderStoreDoor_QNAME = new QName("http://www.cse-cargo.ru/client", "StoreDoor");
    private final static QName _OrderDeliveryOfCargo_QNAME = new QName("http://www.cse-cargo.ru/client", "DeliveryOfCargo");
    private final static QName _OrderInsurance_QNAME = new QName("http://www.cse-cargo.ru/client", "Insurance");
    private final static QName _OrderDeclared_QNAME = new QName("http://www.cse-cargo.ru/client", "Declared");
    private final static QName _OrderPersonallyInHand_QNAME = new QName("http://www.cse-cargo.ru/client", "PersonallyInHand");
    private final static QName _OrderLUW_QNAME = new QName("http://www.cse-cargo.ru/client", "LUW");
    private final static QName _OrderWithSignature_QNAME = new QName("http://www.cse-cargo.ru/client", "WithSignature");
    private final static QName _OrderDistribution_QNAME = new QName("http://www.cse-cargo.ru/client", "Distribution");
    private final static QName _OrderCallCourer_QNAME = new QName("http://www.cse-cargo.ru/client", "CallCourer");
    private final static QName _OrderTypeOfParentForWaybill_QNAME = new QName("http://www.cse-cargo.ru/client", "TypeOfParentForWaybill");
    private final static QName _OrderParentOrderForWaybill_QNAME = new QName("http://www.cse-cargo.ru/client", "ParentOrderForWaybill");
    private final static QName _OrderAnalyticsInfoBase_QNAME = new QName("http://www.cse-cargo.ru/client", "AnalyticsInfoBase");
    private final static QName _RegistrationInformationActualAddress_QNAME = new QName("http://www.cse-cargo.ru/client", "ActualAddress");
    private final static QName _RegistrationInformationAdditionalInformation_QNAME = new QName("http://www.cse-cargo.ru/client", "AdditionalInformation");
    private final static QName _RegistrationInformationBIK_QNAME = new QName("http://www.cse-cargo.ru/client", "BIK");
    private final static QName _RegistrationInformationCarsDescription_QNAME = new QName("http://www.cse-cargo.ru/client", "CarsDescription");
    private final static QName _RegistrationInformationCompanyName_QNAME = new QName("http://www.cse-cargo.ru/client", "CompanyName");
    private final static QName _RegistrationInformationCompanyContact_QNAME = new QName("http://www.cse-cargo.ru/client", "CompanyContact");
    private final static QName _RegistrationInformationCurrentAccount_QNAME = new QName("http://www.cse-cargo.ru/client", "CurrentAccount");
    private final static QName _RegistrationInformationFax_QNAME = new QName("http://www.cse-cargo.ru/client", "Fax");
    private final static QName _RegistrationInformationFormOfIncorporation_QNAME = new QName("http://www.cse-cargo.ru/client", "FormOfIncorporation");
    private final static QName _RegistrationInformationINN_QNAME = new QName("http://www.cse-cargo.ru/client", "INN");
    private final static QName _RegistrationInformationJuridicalAddress_QNAME = new QName("http://www.cse-cargo.ru/client", "JuridicalAddress");
    private final static QName _RegistrationInformationKPP_QNAME = new QName("http://www.cse-cargo.ru/client", "KPP");
    private final static QName _RegistrationInformationMeansTheAgent_QNAME = new QName("http://www.cse-cargo.ru/client", "MeansTheAgent");
    private final static QName _RegistrationInformationNotificationEMail_QNAME = new QName("http://www.cse-cargo.ru/client", "NotificationEMail");
    private final static QName _RegistrationInformationNotificationSMSPhone_QNAME = new QName("http://www.cse-cargo.ru/client", "NotificationSMSPhone");
    private final static QName _RegistrationInformationOGRN_QNAME = new QName("http://www.cse-cargo.ru/client", "OGRN");
    private final static QName _RegistrationInformationOKPO_QNAME = new QName("http://www.cse-cargo.ru/client", "OKPO");
    private final static QName _RegistrationInformationWebPage_QNAME = new QName("http://www.cse-cargo.ru/client", "WebPage");
    private final static QName _ResultBDataBData_QNAME = new QName("http://www.cse-cargo.ru/client", "BData");
    private final static QName _ResultOrderOrder_QNAME = new QName("http://www.cse-cargo.ru/client", "Order");
    private final static QName _ResultOrderEditable_QNAME = new QName("http://www.cse-cargo.ru/client", "Editable");
    private final static QName _ResultOrderHasScan_QNAME = new QName("http://www.cse-cargo.ru/client", "HasScan");
    private final static QName _ResultOrderHasPrintForm_QNAME = new QName("http://www.cse-cargo.ru/client", "HasPrintForm");
    private final static QName _ResultOrderGUIDState_QNAME = new QName("http://www.cse-cargo.ru/client", "GUIDState");
    private final static QName _SettingsNumberOfWaybill_QNAME = new QName("http://www.cse-cargo.ru/client", "NumberOfWaybill");
    private final static QName _SettingsStateDelivery_QNAME = new QName("http://www.cse-cargo.ru/client", "StateDelivery");
    private final static QName _SettingsProductName_QNAME = new QName("http://www.cse-cargo.ru/client", "ProductName");
    private final static QName _SettingsStateTrace_QNAME = new QName("http://www.cse-cargo.ru/client", "StateTrace");
    private final static QName _UserInfoCompanyCode_QNAME = new QName("http://www.cse-cargo.ru/client", "CompanyCode");
    private final static QName _UserInfoData_QNAME = new QName("http://www.cse-cargo.ru/client", "Data");
    private final static QName _UserInfoFullCompanyName_QNAME = new QName("http://www.cse-cargo.ru/client", "FullCompanyName");
    private final static QName _UserInfoGeographyGUID_QNAME = new QName("http://www.cse-cargo.ru/client", "GeographyGUID");
    private final static QName _UserInfoOfficialName_QNAME = new QName("http://www.cse-cargo.ru/client", "OfficialName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.cse.APILk.Service1c
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Calc }
     * 
     */
    public Calc createCalc() {
        return new Calc();
    }

    /**
     * Create an instance of {@link ArrayCalc }
     * 
     */
    public ArrayCalc createArrayCalc() {
        return new ArrayCalc();
    }

    /**
     * Create an instance of {@link CalcResponse }
     * 
     */
    public CalcResponse createCalcResponse() {
        return new CalcResponse();
    }

    /**
     * Create an instance of {@link ResultCalcArray }
     * 
     */
    public ResultCalcArray createResultCalcArray() {
        return new ResultCalcArray();
    }

    /**
     * Create an instance of {@link CalcOffice }
     * 
     */
    public CalcOffice createCalcOffice() {
        return new CalcOffice();
    }

    /**
     * Create an instance of {@link CalcOfficeResponse }
     * 
     */
    public CalcOfficeResponse createCalcOfficeResponse() {
        return new CalcOfficeResponse();
    }

    /**
     * Create an instance of {@link ResultCalc }
     * 
     */
    public ResultCalc createResultCalc() {
        return new ResultCalc();
    }

    /**
     * Create an instance of {@link ChangePassword }
     * 
     */
    public ChangePassword createChangePassword() {
        return new ChangePassword();
    }

    /**
     * Create an instance of {@link ChangePasswordResponse }
     * 
     */
    public ChangePasswordResponse createChangePasswordResponse() {
        return new ChangePasswordResponse();
    }

    /**
     * Create an instance of {@link ResultBoolean }
     * 
     */
    public ResultBoolean createResultBoolean() {
        return new ResultBoolean();
    }

    /**
     * Create an instance of {@link CheckOrder }
     * 
     */
    public CheckOrder createCheckOrder() {
        return new CheckOrder();
    }

    /**
     * Create an instance of {@link CheckOrderResponse }
     * 
     */
    public CheckOrderResponse createCheckOrderResponse() {
        return new CheckOrderResponse();
    }

    /**
     * Create an instance of {@link CheckUser }
     * 
     */
    public CheckUser createCheckUser() {
        return new CheckUser();
    }

    /**
     * Create an instance of {@link CheckUserResponse }
     * 
     */
    public CheckUserResponse createCheckUserResponse() {
        return new CheckUserResponse();
    }

    /**
     * Create an instance of {@link UserInfo }
     * 
     */
    public UserInfo createUserInfo() {
        return new UserInfo();
    }

    /**
     * Create an instance of {@link CheckWaybill }
     * 
     */
    public CheckWaybill createCheckWaybill() {
        return new CheckWaybill();
    }

    /**
     * Create an instance of {@link CheckWaybillResponse }
     * 
     */
    public CheckWaybillResponse createCheckWaybillResponse() {
        return new CheckWaybillResponse();
    }

    /**
     * Create an instance of {@link CheckWaybills }
     * 
     */
    public CheckWaybills createCheckWaybills() {
        return new CheckWaybills();
    }

    /**
     * Create an instance of {@link CheckWaybillsResponse }
     * 
     */
    public CheckWaybillsResponse createCheckWaybillsResponse() {
        return new CheckWaybillsResponse();
    }

    /**
     * Create an instance of {@link ResultString }
     * 
     */
    public ResultString createResultString() {
        return new ResultString();
    }

    /**
     * Create an instance of {@link ConsolidationManifest }
     * 
     */
    public ConsolidationManifest createConsolidationManifest() {
        return new ConsolidationManifest();
    }

    /**
     * Create an instance of {@link ConsolidationManifestResponse }
     * 
     */
    public ConsolidationManifestResponse createConsolidationManifestResponse() {
        return new ConsolidationManifestResponse();
    }

    /**
     * Create an instance of {@link CustomersGoodsReport3 }
     * 
     */
    public CustomersGoodsReport3 createCustomersGoodsReport3() {
        return new CustomersGoodsReport3();
    }

    /**
     * Create an instance of {@link Settings }
     * 
     */
    public Settings createSettings() {
        return new Settings();
    }

    /**
     * Create an instance of {@link CustomersGoodsReport3Response }
     * 
     */
    public CustomersGoodsReport3Response createCustomersGoodsReport3Response() {
        return new CustomersGoodsReport3Response();
    }

    /**
     * Create an instance of {@link DeliveryTimes }
     * 
     */
    public DeliveryTimes createDeliveryTimes() {
        return new DeliveryTimes();
    }

    /**
     * Create an instance of {@link DeliveryTimesResponse }
     * 
     */
    public DeliveryTimesResponse createDeliveryTimesResponse() {
        return new DeliveryTimesResponse();
    }

    /**
     * Create an instance of {@link DeliveryTimesByDocument }
     * 
     */
    public DeliveryTimesByDocument createDeliveryTimesByDocument() {
        return new DeliveryTimesByDocument();
    }

    /**
     * Create an instance of {@link DeliveryTimesByDocumentResponse }
     * 
     */
    public DeliveryTimesByDocumentResponse createDeliveryTimesByDocumentResponse() {
        return new DeliveryTimesByDocumentResponse();
    }

    /**
     * Create an instance of {@link FeedbackOffice }
     * 
     */
    public FeedbackOffice createFeedbackOffice() {
        return new FeedbackOffice();
    }

    /**
     * Create an instance of {@link FeedbackOfficeResponse }
     * 
     */
    public FeedbackOfficeResponse createFeedbackOfficeResponse() {
        return new FeedbackOfficeResponse();
    }

    /**
     * Create an instance of {@link GetAddressBook }
     * 
     */
    public GetAddressBook createGetAddressBook() {
        return new GetAddressBook();
    }

    /**
     * Create an instance of {@link GetAddressBookResponse }
     * 
     */
    public GetAddressBookResponse createGetAddressBookResponse() {
        return new GetAddressBookResponse();
    }

    /**
     * Create an instance of {@link AddressBook }
     * 
     */
    public AddressBook createAddressBook() {
        return new AddressBook();
    }

    /**
     * Create an instance of {@link GetCargoDescriptions }
     * 
     */
    public GetCargoDescriptions createGetCargoDescriptions() {
        return new GetCargoDescriptions();
    }

    /**
     * Create an instance of {@link GetCargoDescriptionsResponse }
     * 
     */
    public GetCargoDescriptionsResponse createGetCargoDescriptionsResponse() {
        return new GetCargoDescriptionsResponse();
    }

    /**
     * Create an instance of {@link ListOfCorrespondences }
     * 
     */
    public ListOfCorrespondences createListOfCorrespondences() {
        return new ListOfCorrespondences();
    }

    /**
     * Create an instance of {@link GetDepartments }
     * 
     */
    public GetDepartments createGetDepartments() {
        return new GetDepartments();
    }

    /**
     * Create an instance of {@link GetDepartmentsResponse }
     * 
     */
    public GetDepartmentsResponse createGetDepartmentsResponse() {
        return new GetDepartmentsResponse();
    }

    /**
     * Create an instance of {@link GetGeographyObjects }
     * 
     */
    public GetGeographyObjects createGetGeographyObjects() {
        return new GetGeographyObjects();
    }

    /**
     * Create an instance of {@link GetGeographyObjectsResponse }
     * 
     */
    public GetGeographyObjectsResponse createGetGeographyObjectsResponse() {
        return new GetGeographyObjectsResponse();
    }

    /**
     * Create an instance of {@link GetListOfAutoModels }
     * 
     */
    public GetListOfAutoModels createGetListOfAutoModels() {
        return new GetListOfAutoModels();
    }

    /**
     * Create an instance of {@link GetListOfAutoModelsResponse }
     * 
     */
    public GetListOfAutoModelsResponse createGetListOfAutoModelsResponse() {
        return new GetListOfAutoModelsResponse();
    }

    /**
     * Create an instance of {@link GetListOfAutoTypes }
     * 
     */
    public GetListOfAutoTypes createGetListOfAutoTypes() {
        return new GetListOfAutoTypes();
    }

    /**
     * Create an instance of {@link GetListOfAutoTypesResponse }
     * 
     */
    public GetListOfAutoTypesResponse createGetListOfAutoTypesResponse() {
        return new GetListOfAutoTypesResponse();
    }

    /**
     * Create an instance of {@link GetListOfBanks }
     * 
     */
    public GetListOfBanks createGetListOfBanks() {
        return new GetListOfBanks();
    }

    /**
     * Create an instance of {@link GetListOfBanksResponse }
     * 
     */
    public GetListOfBanksResponse createGetListOfBanksResponse() {
        return new GetListOfBanksResponse();
    }

    /**
     * Create an instance of {@link GetListOfCompanies }
     * 
     */
    public GetListOfCompanies createGetListOfCompanies() {
        return new GetListOfCompanies();
    }

    /**
     * Create an instance of {@link GetListOfCompaniesResponse }
     * 
     */
    public GetListOfCompaniesResponse createGetListOfCompaniesResponse() {
        return new GetListOfCompaniesResponse();
    }

    /**
     * Create an instance of {@link GetListOfConsolidationsForAgent }
     * 
     */
    public GetListOfConsolidationsForAgent createGetListOfConsolidationsForAgent() {
        return new GetListOfConsolidationsForAgent();
    }

    /**
     * Create an instance of {@link GetListOfConsolidationsForAgentResponse }
     * 
     */
    public GetListOfConsolidationsForAgentResponse createGetListOfConsolidationsForAgentResponse() {
        return new GetListOfConsolidationsForAgentResponse();
    }

    /**
     * Create an instance of {@link ResultListOfWaybills }
     * 
     */
    public ResultListOfWaybills createResultListOfWaybills() {
        return new ResultListOfWaybills();
    }

    /**
     * Create an instance of {@link GetListOfCurrencies }
     * 
     */
    public GetListOfCurrencies createGetListOfCurrencies() {
        return new GetListOfCurrencies();
    }

    /**
     * Create an instance of {@link GetListOfCurrenciesResponse }
     * 
     */
    public GetListOfCurrenciesResponse createGetListOfCurrenciesResponse() {
        return new GetListOfCurrenciesResponse();
    }

    /**
     * Create an instance of {@link GetListOfDeliveryMethods }
     * 
     */
    public GetListOfDeliveryMethods createGetListOfDeliveryMethods() {
        return new GetListOfDeliveryMethods();
    }

    /**
     * Create an instance of {@link GetListOfDeliveryMethodsResponse }
     * 
     */
    public GetListOfDeliveryMethodsResponse createGetListOfDeliveryMethodsResponse() {
        return new GetListOfDeliveryMethodsResponse();
    }

    /**
     * Create an instance of {@link GetListOfOffices }
     * 
     */
    public GetListOfOffices createGetListOfOffices() {
        return new GetListOfOffices();
    }

    /**
     * Create an instance of {@link GetListOfOfficesResponse }
     * 
     */
    public GetListOfOfficesResponse createGetListOfOfficesResponse() {
        return new GetListOfOfficesResponse();
    }

    /**
     * Create an instance of {@link GetListOfOptionsForDescribingProblem }
     * 
     */
    public GetListOfOptionsForDescribingProblem createGetListOfOptionsForDescribingProblem() {
        return new GetListOfOptionsForDescribingProblem();
    }

    /**
     * Create an instance of {@link GetListOfOptionsForDescribingProblemResponse }
     * 
     */
    public GetListOfOptionsForDescribingProblemResponse createGetListOfOptionsForDescribingProblemResponse() {
        return new GetListOfOptionsForDescribingProblemResponse();
    }

    /**
     * Create an instance of {@link GetListOfOrders }
     * 
     */
    public GetListOfOrders createGetListOfOrders() {
        return new GetListOfOrders();
    }

    /**
     * Create an instance of {@link GetListOfOrdersResponse }
     * 
     */
    public GetListOfOrdersResponse createGetListOfOrdersResponse() {
        return new GetListOfOrdersResponse();
    }

    /**
     * Create an instance of {@link GetListOfProblemCodes }
     * 
     */
    public GetListOfProblemCodes createGetListOfProblemCodes() {
        return new GetListOfProblemCodes();
    }

    /**
     * Create an instance of {@link GetListOfProblemCodesResponse }
     * 
     */
    public GetListOfProblemCodesResponse createGetListOfProblemCodesResponse() {
        return new GetListOfProblemCodesResponse();
    }

    /**
     * Create an instance of {@link GetListOfServices }
     * 
     */
    public GetListOfServices createGetListOfServices() {
        return new GetListOfServices();
    }

    /**
     * Create an instance of {@link GetListOfServicesResponse }
     * 
     */
    public GetListOfServicesResponse createGetListOfServicesResponse() {
        return new GetListOfServicesResponse();
    }

    /**
     * Create an instance of {@link GetListOfTypesOfApartments }
     * 
     */
    public GetListOfTypesOfApartments createGetListOfTypesOfApartments() {
        return new GetListOfTypesOfApartments();
    }

    /**
     * Create an instance of {@link GetListOfTypesOfApartmentsResponse }
     * 
     */
    public GetListOfTypesOfApartmentsResponse createGetListOfTypesOfApartmentsResponse() {
        return new GetListOfTypesOfApartmentsResponse();
    }

    /**
     * Create an instance of {@link GetListOfTypesOfBuildings }
     * 
     */
    public GetListOfTypesOfBuildings createGetListOfTypesOfBuildings() {
        return new GetListOfTypesOfBuildings();
    }

    /**
     * Create an instance of {@link GetListOfTypesOfBuildingsResponse }
     * 
     */
    public GetListOfTypesOfBuildingsResponse createGetListOfTypesOfBuildingsResponse() {
        return new GetListOfTypesOfBuildingsResponse();
    }

    /**
     * Create an instance of {@link GetListOfTypesOfCargo }
     * 
     */
    public GetListOfTypesOfCargo createGetListOfTypesOfCargo() {
        return new GetListOfTypesOfCargo();
    }

    /**
     * Create an instance of {@link GetListOfTypesOfCargoResponse }
     * 
     */
    public GetListOfTypesOfCargoResponse createGetListOfTypesOfCargoResponse() {
        return new GetListOfTypesOfCargoResponse();
    }

    /**
     * Create an instance of {@link GetListOfTypesOfGeography }
     * 
     */
    public GetListOfTypesOfGeography createGetListOfTypesOfGeography() {
        return new GetListOfTypesOfGeography();
    }

    /**
     * Create an instance of {@link GetListOfTypesOfGeographyResponse }
     * 
     */
    public GetListOfTypesOfGeographyResponse createGetListOfTypesOfGeographyResponse() {
        return new GetListOfTypesOfGeographyResponse();
    }

    /**
     * Create an instance of {@link GetListOfTypesOfHomes }
     * 
     */
    public GetListOfTypesOfHomes createGetListOfTypesOfHomes() {
        return new GetListOfTypesOfHomes();
    }

    /**
     * Create an instance of {@link GetListOfTypesOfHomesResponse }
     * 
     */
    public GetListOfTypesOfHomesResponse createGetListOfTypesOfHomesResponse() {
        return new GetListOfTypesOfHomesResponse();
    }

    /**
     * Create an instance of {@link GetListOfTypesOfPayers }
     * 
     */
    public GetListOfTypesOfPayers createGetListOfTypesOfPayers() {
        return new GetListOfTypesOfPayers();
    }

    /**
     * Create an instance of {@link GetListOfTypesOfPayersResponse }
     * 
     */
    public GetListOfTypesOfPayersResponse createGetListOfTypesOfPayersResponse() {
        return new GetListOfTypesOfPayersResponse();
    }

    /**
     * Create an instance of {@link GetListOfUrgencies }
     * 
     */
    public GetListOfUrgencies createGetListOfUrgencies() {
        return new GetListOfUrgencies();
    }

    /**
     * Create an instance of {@link GetListOfUrgenciesResponse }
     * 
     */
    public GetListOfUrgenciesResponse createGetListOfUrgenciesResponse() {
        return new GetListOfUrgenciesResponse();
    }

    /**
     * Create an instance of {@link GetListOfWaybillsForAgent }
     * 
     */
    public GetListOfWaybillsForAgent createGetListOfWaybillsForAgent() {
        return new GetListOfWaybillsForAgent();
    }

    /**
     * Create an instance of {@link GetListOfWaybillsForAgentResponse }
     * 
     */
    public GetListOfWaybillsForAgentResponse createGetListOfWaybillsForAgentResponse() {
        return new GetListOfWaybillsForAgentResponse();
    }

    /**
     * Create an instance of {@link GetListOfWaybillsForClient }
     * 
     */
    public GetListOfWaybillsForClient createGetListOfWaybillsForClient() {
        return new GetListOfWaybillsForClient();
    }

    /**
     * Create an instance of {@link GetListOfWaybillsForClientResponse }
     * 
     */
    public GetListOfWaybillsForClientResponse createGetListOfWaybillsForClientResponse() {
        return new GetListOfWaybillsForClientResponse();
    }

    /**
     * Create an instance of {@link GetListOfWaysOfPayment }
     * 
     */
    public GetListOfWaysOfPayment createGetListOfWaysOfPayment() {
        return new GetListOfWaysOfPayment();
    }

    /**
     * Create an instance of {@link GetListOfWaysOfPaymentResponse }
     * 
     */
    public GetListOfWaysOfPaymentResponse createGetListOfWaysOfPaymentResponse() {
        return new GetListOfWaysOfPaymentResponse();
    }

    /**
     * Create an instance of {@link GetOrder }
     * 
     */
    public GetOrder createGetOrder() {
        return new GetOrder();
    }

    /**
     * Create an instance of {@link GetOrderResponse }
     * 
     */
    public GetOrderResponse createGetOrderResponse() {
        return new GetOrderResponse();
    }

    /**
     * Create an instance of {@link ResultOrder }
     * 
     */
    public ResultOrder createResultOrder() {
        return new ResultOrder();
    }

    /**
     * Create an instance of {@link GetOrderPrintForm }
     * 
     */
    public GetOrderPrintForm createGetOrderPrintForm() {
        return new GetOrderPrintForm();
    }

    /**
     * Create an instance of {@link GetOrderPrintFormResponse }
     * 
     */
    public GetOrderPrintFormResponse createGetOrderPrintFormResponse() {
        return new GetOrderPrintFormResponse();
    }

    /**
     * Create an instance of {@link ResultBData }
     * 
     */
    public ResultBData createResultBData() {
        return new ResultBData();
    }

    /**
     * Create an instance of {@link GetPackageTypes }
     * 
     */
    public GetPackageTypes createGetPackageTypes() {
        return new GetPackageTypes();
    }

    /**
     * Create an instance of {@link GetPackageTypesResponse }
     * 
     */
    public GetPackageTypesResponse createGetPackageTypesResponse() {
        return new GetPackageTypesResponse();
    }

    /**
     * Create an instance of {@link GetProjects }
     * 
     */
    public GetProjects createGetProjects() {
        return new GetProjects();
    }

    /**
     * Create an instance of {@link GetProjectsResponse }
     * 
     */
    public GetProjectsResponse createGetProjectsResponse() {
        return new GetProjectsResponse();
    }

    /**
     * Create an instance of {@link GetTrackingDocuments }
     * 
     */
    public GetTrackingDocuments createGetTrackingDocuments() {
        return new GetTrackingDocuments();
    }

    /**
     * Create an instance of {@link GetTrackingDocumentsResponse }
     * 
     */
    public GetTrackingDocumentsResponse createGetTrackingDocumentsResponse() {
        return new GetTrackingDocumentsResponse();
    }

    /**
     * Create an instance of {@link GetWaybill }
     * 
     */
    public GetWaybill createGetWaybill() {
        return new GetWaybill();
    }

    /**
     * Create an instance of {@link GetWaybillResponse }
     * 
     */
    public GetWaybillResponse createGetWaybillResponse() {
        return new GetWaybillResponse();
    }

    /**
     * Create an instance of {@link GetWaybillScan }
     * 
     */
    public GetWaybillScan createGetWaybillScan() {
        return new GetWaybillScan();
    }

    /**
     * Create an instance of {@link GetWaybillScanResponse }
     * 
     */
    public GetWaybillScanResponse createGetWaybillScanResponse() {
        return new GetWaybillScanResponse();
    }

    /**
     * Create an instance of {@link ResultMultipleBData }
     * 
     */
    public ResultMultipleBData createResultMultipleBData() {
        return new ResultMultipleBData();
    }

    /**
     * Create an instance of {@link GetWaybillScanPath }
     * 
     */
    public GetWaybillScanPath createGetWaybillScanPath() {
        return new GetWaybillScanPath();
    }

    /**
     * Create an instance of {@link GetWaybillScanPathResponse }
     * 
     */
    public GetWaybillScanPathResponse createGetWaybillScanPathResponse() {
        return new GetWaybillScanPathResponse();
    }

    /**
     * Create an instance of {@link GetWaybillsForOrder }
     * 
     */
    public GetWaybillsForOrder createGetWaybillsForOrder() {
        return new GetWaybillsForOrder();
    }

    /**
     * Create an instance of {@link GetWaybillsForOrderResponse }
     * 
     */
    public GetWaybillsForOrderResponse createGetWaybillsForOrderResponse() {
        return new GetWaybillsForOrderResponse();
    }

    /**
     * Create an instance of {@link InvoicesDetailingOfTheMonth }
     * 
     */
    public InvoicesDetailingOfTheMonth createInvoicesDetailingOfTheMonth() {
        return new InvoicesDetailingOfTheMonth();
    }

    /**
     * Create an instance of {@link InvoicesDetailingOfTheMonthResponse }
     * 
     */
    public InvoicesDetailingOfTheMonthResponse createInvoicesDetailingOfTheMonthResponse() {
        return new InvoicesDetailingOfTheMonthResponse();
    }

    /**
     * Create an instance of {@link OfficesContacts }
     * 
     */
    public OfficesContacts createOfficesContacts() {
        return new OfficesContacts();
    }

    /**
     * Create an instance of {@link OfficesContactsResponse }
     * 
     */
    public OfficesContactsResponse createOfficesContactsResponse() {
        return new OfficesContactsResponse();
    }

    /**
     * Create an instance of {@link PrintDocument }
     * 
     */
    public PrintDocument createPrintDocument() {
        return new PrintDocument();
    }

    /**
     * Create an instance of {@link PrintDocumentResponse }
     * 
     */
    public PrintDocumentResponse createPrintDocumentResponse() {
        return new PrintDocumentResponse();
    }

    /**
     * Create an instance of {@link ArrayPrint }
     * 
     */
    public ArrayPrint createArrayPrint() {
        return new ArrayPrint();
    }

    /**
     * Create an instance of {@link RegisterOfOrdersReport }
     * 
     */
    public RegisterOfOrdersReport createRegisterOfOrdersReport() {
        return new RegisterOfOrdersReport();
    }

    /**
     * Create an instance of {@link RegisterOfOrdersReportResponse }
     * 
     */
    public RegisterOfOrdersReportResponse createRegisterOfOrdersReportResponse() {
        return new RegisterOfOrdersReportResponse();
    }

    /**
     * Create an instance of {@link Registration }
     * 
     */
    public Registration createRegistration() {
        return new Registration();
    }

    /**
     * Create an instance of {@link RegistrationInformation }
     * 
     */
    public RegistrationInformation createRegistrationInformation() {
        return new RegistrationInformation();
    }

    /**
     * Create an instance of {@link RegistrationResponse }
     * 
     */
    public RegistrationResponse createRegistrationResponse() {
        return new RegistrationResponse();
    }

    /**
     * Create an instance of {@link SaveCargoReaddress }
     * 
     */
    public SaveCargoReaddress createSaveCargoReaddress() {
        return new SaveCargoReaddress();
    }

    /**
     * Create an instance of {@link SaveCargoReaddressResponse }
     * 
     */
    public SaveCargoReaddressResponse createSaveCargoReaddressResponse() {
        return new SaveCargoReaddressResponse();
    }

    /**
     * Create an instance of {@link SaveCargoReturn }
     * 
     */
    public SaveCargoReturn createSaveCargoReturn() {
        return new SaveCargoReturn();
    }

    /**
     * Create an instance of {@link SaveCargoReturnResponse }
     * 
     */
    public SaveCargoReturnResponse createSaveCargoReturnResponse() {
        return new SaveCargoReturnResponse();
    }

    /**
     * Create an instance of {@link SaveCashInflow }
     * 
     */
    public SaveCashInflow createSaveCashInflow() {
        return new SaveCashInflow();
    }

    /**
     * Create an instance of {@link SaveCashInflowResponse }
     * 
     */
    public SaveCashInflowResponse createSaveCashInflowResponse() {
        return new SaveCashInflowResponse();
    }

    /**
     * Create an instance of {@link SaveConfirmationOfDelivery }
     * 
     */
    public SaveConfirmationOfDelivery createSaveConfirmationOfDelivery() {
        return new SaveConfirmationOfDelivery();
    }

    /**
     * Create an instance of {@link SaveConfirmationOfDeliveryResponse }
     * 
     */
    public SaveConfirmationOfDeliveryResponse createSaveConfirmationOfDeliveryResponse() {
        return new SaveConfirmationOfDeliveryResponse();
    }

    /**
     * Create an instance of {@link SaveConfirmationOfDelivery1 }
     * 
     */
    public SaveConfirmationOfDelivery1 createSaveConfirmationOfDelivery1() {
        return new SaveConfirmationOfDelivery1();
    }

    /**
     * Create an instance of {@link SaveConfirmationOfDelivery1Response }
     * 
     */
    public SaveConfirmationOfDelivery1Response createSaveConfirmationOfDelivery1Response() {
        return new SaveConfirmationOfDelivery1Response();
    }

    /**
     * Create an instance of {@link SaveConfirmationOfReceipt }
     * 
     */
    public SaveConfirmationOfReceipt createSaveConfirmationOfReceipt() {
        return new SaveConfirmationOfReceipt();
    }

    /**
     * Create an instance of {@link SaveConfirmationOfReceiptResponse }
     * 
     */
    public SaveConfirmationOfReceiptResponse createSaveConfirmationOfReceiptResponse() {
        return new SaveConfirmationOfReceiptResponse();
    }

    /**
     * Create an instance of {@link SaveDistribution }
     * 
     */
    public SaveDistribution createSaveDistribution() {
        return new SaveDistribution();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link SaveDistributionResponse }
     * 
     */
    public SaveDistributionResponse createSaveDistributionResponse() {
        return new SaveDistributionResponse();
    }

    /**
     * Create an instance of {@link SaveOrderOffice }
     * 
     */
    public SaveOrderOffice createSaveOrderOffice() {
        return new SaveOrderOffice();
    }

    /**
     * Create an instance of {@link SaveOrderOfficeResponse }
     * 
     */
    public SaveOrderOfficeResponse createSaveOrderOfficeResponse() {
        return new SaveOrderOfficeResponse();
    }

    /**
     * Create an instance of {@link ResultArray }
     * 
     */
    public ResultArray createResultArray() {
        return new ResultArray();
    }

    /**
     * Create an instance of {@link SaveTrace }
     * 
     */
    public SaveTrace createSaveTrace() {
        return new SaveTrace();
    }

    /**
     * Create an instance of {@link SaveTraceResponse }
     * 
     */
    public SaveTraceResponse createSaveTraceResponse() {
        return new SaveTraceResponse();
    }

    /**
     * Create an instance of {@link SaveTrace2 }
     * 
     */
    public SaveTrace2 createSaveTrace2() {
        return new SaveTrace2();
    }

    /**
     * Create an instance of {@link SaveTrace2Response }
     * 
     */
    public SaveTrace2Response createSaveTrace2Response() {
        return new SaveTrace2Response();
    }

    /**
     * Create an instance of {@link ShipmentOfGoodsInWaybills }
     * 
     */
    public ShipmentOfGoodsInWaybills createShipmentOfGoodsInWaybills() {
        return new ShipmentOfGoodsInWaybills();
    }

    /**
     * Create an instance of {@link ShipmentOfGoodsInWaybillsResponse }
     * 
     */
    public ShipmentOfGoodsInWaybillsResponse createShipmentOfGoodsInWaybillsResponse() {
        return new ShipmentOfGoodsInWaybillsResponse();
    }

    /**
     * Create an instance of {@link StorehouseBalance }
     * 
     */
    public StorehouseBalance createStorehouseBalance() {
        return new StorehouseBalance();
    }

    /**
     * Create an instance of {@link StorehouseBalanceResponse }
     * 
     */
    public StorehouseBalanceResponse createStorehouseBalanceResponse() {
        return new StorehouseBalanceResponse();
    }

    /**
     * Create an instance of {@link TraceClosing }
     * 
     */
    public TraceClosing createTraceClosing() {
        return new TraceClosing();
    }

    /**
     * Create an instance of {@link TraceClosingResponse }
     * 
     */
    public TraceClosingResponse createTraceClosingResponse() {
        return new TraceClosingResponse();
    }

    /**
     * Create an instance of {@link Tracking }
     * 
     */
    public Tracking createTracking() {
        return new Tracking();
    }

    /**
     * Create an instance of {@link TrackingResponse }
     * 
     */
    public TrackingResponse createTrackingResponse() {
        return new TrackingResponse();
    }

    /**
     * Create an instance of {@link ResultTracking }
     * 
     */
    public ResultTracking createResultTracking() {
        return new ResultTracking();
    }

    /**
     * Create an instance of {@link UpdateAddressBook }
     * 
     */
    public UpdateAddressBook createUpdateAddressBook() {
        return new UpdateAddressBook();
    }

    /**
     * Create an instance of {@link UpdateAddressBookResponse }
     * 
     */
    public UpdateAddressBookResponse createUpdateAddressBookResponse() {
        return new UpdateAddressBookResponse();
    }

    /**
     * Create an instance of {@link UpdateCargoDescriptions }
     * 
     */
    public UpdateCargoDescriptions createUpdateCargoDescriptions() {
        return new UpdateCargoDescriptions();
    }

    /**
     * Create an instance of {@link UpdateCargoDescriptionsResponse }
     * 
     */
    public UpdateCargoDescriptionsResponse createUpdateCargoDescriptionsResponse() {
        return new UpdateCargoDescriptionsResponse();
    }

    /**
     * Create an instance of {@link UpdateDepartments }
     * 
     */
    public UpdateDepartments createUpdateDepartments() {
        return new UpdateDepartments();
    }

    /**
     * Create an instance of {@link UpdateDepartmentsResponse }
     * 
     */
    public UpdateDepartmentsResponse createUpdateDepartmentsResponse() {
        return new UpdateDepartmentsResponse();
    }

    /**
     * Create an instance of {@link PrintReestr }
     * 
     */
    public PrintReestr createPrintReestr() {
        return new PrintReestr();
    }

    /**
     * Create an instance of {@link PrintReestrResponse }
     * 
     */
    public PrintReestrResponse createPrintReestrResponse() {
        return new PrintReestrResponse();
    }

    /**
     * Create an instance of {@link ResultReestr }
     * 
     */
    public ResultReestr createResultReestr() {
        return new ResultReestr();
    }

    /**
     * Create an instance of {@link GetInfoWaybill }
     * 
     */
    public GetInfoWaybill createGetInfoWaybill() {
        return new GetInfoWaybill();
    }

    /**
     * Create an instance of {@link GetInfoWaybillResponse }
     * 
     */
    public GetInfoWaybillResponse createGetInfoWaybillResponse() {
        return new GetInfoWaybillResponse();
    }

    /**
     * Create an instance of {@link SaveWaybillOffice }
     * 
     */
    public SaveWaybillOffice createSaveWaybillOffice() {
        return new SaveWaybillOffice();
    }

    /**
     * Create an instance of {@link SaveWaybillOfficeResponse }
     * 
     */
    public SaveWaybillOfficeResponse createSaveWaybillOfficeResponse() {
        return new SaveWaybillOfficeResponse();
    }

    /**
     * Create an instance of {@link LoadWaybills }
     * 
     */
    public LoadWaybills createLoadWaybills() {
        return new LoadWaybills();
    }

    /**
     * Create an instance of {@link LoadWaybills2 }
     * 
     */
    public LoadWaybills2 createLoadWaybills2() {
        return new LoadWaybills2();
    }

    /**
     * Create an instance of {@link LoadWaybillsResponse }
     * 
     */
    public LoadWaybillsResponse createLoadWaybillsResponse() {
        return new LoadWaybillsResponse();
    }

    /**
     * Create an instance of {@link ResultWaybills }
     * 
     */
    public ResultWaybills createResultWaybills() {
        return new ResultWaybills();
    }

    /**
     * Create an instance of {@link GetListOfProducts }
     * 
     */
    public GetListOfProducts createGetListOfProducts() {
        return new GetListOfProducts();
    }

    /**
     * Create an instance of {@link GetListOfProductsResponse }
     * 
     */
    public GetListOfProductsResponse createGetListOfProductsResponse() {
        return new GetListOfProductsResponse();
    }

    /**
     * Create an instance of {@link GetListOfUnit }
     * 
     */
    public GetListOfUnit createGetListOfUnit() {
        return new GetListOfUnit();
    }

    /**
     * Create an instance of {@link GetListOfUnitResponse }
     * 
     */
    public GetListOfUnitResponse createGetListOfUnitResponse() {
        return new GetListOfUnitResponse();
    }

    /**
     * Create an instance of {@link GetListOfPackage }
     * 
     */
    public GetListOfPackage createGetListOfPackage() {
        return new GetListOfPackage();
    }

    /**
     * Create an instance of {@link GetListOfPackageResponse }
     * 
     */
    public GetListOfPackageResponse createGetListOfPackageResponse() {
        return new GetListOfPackageResponse();
    }

    /**
     * Create an instance of {@link GetListOfTypeSize }
     * 
     */
    public GetListOfTypeSize createGetListOfTypeSize() {
        return new GetListOfTypeSize();
    }

    /**
     * Create an instance of {@link GetListOfTypeSizeResponse }
     * 
     */
    public GetListOfTypeSizeResponse createGetListOfTypeSizeResponse() {
        return new GetListOfTypeSizeResponse();
    }

    /**
     * Create an instance of {@link GetListOfProductParty }
     * 
     */
    public GetListOfProductParty createGetListOfProductParty() {
        return new GetListOfProductParty();
    }

    /**
     * Create an instance of {@link GetListOfProductPartyResponse }
     * 
     */
    public GetListOfProductPartyResponse createGetListOfProductPartyResponse() {
        return new GetListOfProductPartyResponse();
    }

    /**
     * Create an instance of {@link GetListOfContacts }
     * 
     */
    public GetListOfContacts createGetListOfContacts() {
        return new GetListOfContacts();
    }

    /**
     * Create an instance of {@link GetListOfContactsResponse }
     * 
     */
    public GetListOfContactsResponse createGetListOfContactsResponse() {
        return new GetListOfContactsResponse();
    }

    /**
     * Create an instance of {@link CheckBalanceOfGoods }
     * 
     */
    public CheckBalanceOfGoods createCheckBalanceOfGoods() {
        return new CheckBalanceOfGoods();
    }

    /**
     * Create an instance of {@link CheckBalanceOfGoodsResponse }
     * 
     */
    public CheckBalanceOfGoodsResponse createCheckBalanceOfGoodsResponse() {
        return new CheckBalanceOfGoodsResponse();
    }

    /**
     * Create an instance of {@link SaveOrderStore }
     * 
     */
    public SaveOrderStore createSaveOrderStore() {
        return new SaveOrderStore();
    }

    /**
     * Create an instance of {@link SaveOrderStoreResponse }
     * 
     */
    public SaveOrderStoreResponse createSaveOrderStoreResponse() {
        return new SaveOrderStoreResponse();
    }

    /**
     * Create an instance of {@link SaveOrderMaterials }
     * 
     */
    public SaveOrderMaterials createSaveOrderMaterials() {
        return new SaveOrderMaterials();
    }

    /**
     * Create an instance of {@link SaveOrderMaterialsResponse }
     * 
     */
    public SaveOrderMaterialsResponse createSaveOrderMaterialsResponse() {
        return new SaveOrderMaterialsResponse();
    }

    /**
     * Create an instance of {@link ListOfMessages }
     * 
     */
    public ListOfMessages createListOfMessages() {
        return new ListOfMessages();
    }

    /**
     * Create an instance of {@link ListOfMessagesResponse }
     * 
     */
    public ListOfMessagesResponse createListOfMessagesResponse() {
        return new ListOfMessagesResponse();
    }

    /**
     * Create an instance of {@link ListOfMessage }
     * 
     */
    public ListOfMessage createListOfMessage() {
        return new ListOfMessage();
    }

    /**
     * Create an instance of {@link SaveOrderConsolidation }
     * 
     */
    public SaveOrderConsolidation createSaveOrderConsolidation() {
        return new SaveOrderConsolidation();
    }

    /**
     * Create an instance of {@link SaveOrderConsolidationResponse }
     * 
     */
    public SaveOrderConsolidationResponse createSaveOrderConsolidationResponse() {
        return new SaveOrderConsolidationResponse();
    }

    /**
     * Create an instance of {@link CustomerPayable }
     * 
     */
    public CustomerPayable createCustomerPayable() {
        return new CustomerPayable();
    }

    /**
     * Create an instance of {@link CustomerPayableResponse }
     * 
     */
    public CustomerPayableResponse createCustomerPayableResponse() {
        return new CustomerPayableResponse();
    }

    /**
     * Create an instance of {@link ContactClient }
     * 
     */
    public ContactClient createContactClient() {
        return new ContactClient();
    }

    /**
     * Create an instance of {@link ContactClientResponse }
     * 
     */
    public ContactClientResponse createContactClientResponse() {
        return new ContactClientResponse();
    }

    /**
     * Create an instance of {@link ContactInfo }
     * 
     */
    public ContactInfo createContactInfo() {
        return new ContactInfo();
    }

    /**
     * Create an instance of {@link ReportAgentCodForMonth }
     * 
     */
    public ReportAgentCodForMonth createReportAgentCodForMonth() {
        return new ReportAgentCodForMonth();
    }

    /**
     * Create an instance of {@link ReportAgentCodForMonthResponse }
     * 
     */
    public ReportAgentCodForMonthResponse createReportAgentCodForMonthResponse() {
        return new ReportAgentCodForMonthResponse();
    }

    /**
     * Create an instance of {@link GetListOfCodeState }
     * 
     */
    public GetListOfCodeState createGetListOfCodeState() {
        return new GetListOfCodeState();
    }

    /**
     * Create an instance of {@link GetListOfCodeStateResponse }
     * 
     */
    public GetListOfCodeStateResponse createGetListOfCodeStateResponse() {
        return new GetListOfCodeStateResponse();
    }

    /**
     * Create an instance of {@link GetListOfCompaniesDepartments }
     * 
     */
    public GetListOfCompaniesDepartments createGetListOfCompaniesDepartments() {
        return new GetListOfCompaniesDepartments();
    }

    /**
     * Create an instance of {@link GetListOfCompaniesDepartmentsResponse }
     * 
     */
    public GetListOfCompaniesDepartmentsResponse createGetListOfCompaniesDepartmentsResponse() {
        return new GetListOfCompaniesDepartmentsResponse();
    }

    /**
     * Create an instance of {@link GetListOfCompaniesProjects }
     * 
     */
    public GetListOfCompaniesProjects createGetListOfCompaniesProjects() {
        return new GetListOfCompaniesProjects();
    }

    /**
     * Create an instance of {@link GetListOfCompaniesProjectsResponse }
     * 
     */
    public GetListOfCompaniesProjectsResponse createGetListOfCompaniesProjectsResponse() {
        return new GetListOfCompaniesProjectsResponse();
    }

    /**
     * Create an instance of {@link GetListOfCompaniesOfficials }
     * 
     */
    public GetListOfCompaniesOfficials createGetListOfCompaniesOfficials() {
        return new GetListOfCompaniesOfficials();
    }

    /**
     * Create an instance of {@link GetListOfCompaniesOfficialsResponse }
     * 
     */
    public GetListOfCompaniesOfficialsResponse createGetListOfCompaniesOfficialsResponse() {
        return new GetListOfCompaniesOfficialsResponse();
    }

    /**
     * Create an instance of {@link GetListOfCompaniesAddressBook }
     * 
     */
    public GetListOfCompaniesAddressBook createGetListOfCompaniesAddressBook() {
        return new GetListOfCompaniesAddressBook();
    }

    /**
     * Create an instance of {@link GetListOfCompaniesAddressBookResponse }
     * 
     */
    public GetListOfCompaniesAddressBookResponse createGetListOfCompaniesAddressBookResponse() {
        return new GetListOfCompaniesAddressBookResponse();
    }

    /**
     * Create an instance of {@link GetListOfDeliveryOfCargo }
     * 
     */
    public GetListOfDeliveryOfCargo createGetListOfDeliveryOfCargo() {
        return new GetListOfDeliveryOfCargo();
    }

    /**
     * Create an instance of {@link GetListOfDeliveryOfCargoResponse }
     * 
     */
    public GetListOfDeliveryOfCargoResponse createGetListOfDeliveryOfCargoResponse() {
        return new GetListOfDeliveryOfCargoResponse();
    }

    /**
     * Create an instance of {@link GetCalendar }
     * 
     */
    public GetCalendar createGetCalendar() {
        return new GetCalendar();
    }

    /**
     * Create an instance of {@link GetCalendarResponse }
     * 
     */
    public GetCalendarResponse createGetCalendarResponse() {
        return new GetCalendarResponse();
    }

    /**
     * Create an instance of {@link UpdateClientProducts }
     * 
     */
    public UpdateClientProducts createUpdateClientProducts() {
        return new UpdateClientProducts();
    }

    /**
     * Create an instance of {@link ListOfClientProducts }
     * 
     */
    public ListOfClientProducts createListOfClientProducts() {
        return new ListOfClientProducts();
    }

    /**
     * Create an instance of {@link UpdateClientProductsResponse }
     * 
     */
    public UpdateClientProductsResponse createUpdateClientProductsResponse() {
        return new UpdateClientProductsResponse();
    }

    /**
     * Create an instance of {@link ChangeStateOrder }
     * 
     */
    public ChangeStateOrder createChangeStateOrder() {
        return new ChangeStateOrder();
    }

    /**
     * Create an instance of {@link ChangeStateOrderResponse }
     * 
     */
    public ChangeStateOrderResponse createChangeStateOrderResponse() {
        return new ChangeStateOrderResponse();
    }

    /**
     * Create an instance of {@link GetPhotoOfGoods }
     * 
     */
    public GetPhotoOfGoods createGetPhotoOfGoods() {
        return new GetPhotoOfGoods();
    }

    /**
     * Create an instance of {@link GetPhotoOfGoodsResponse }
     * 
     */
    public GetPhotoOfGoodsResponse createGetPhotoOfGoodsResponse() {
        return new GetPhotoOfGoodsResponse();
    }

    /**
     * Create an instance of {@link CheckBalanceOfManyGoods }
     * 
     */
    public CheckBalanceOfManyGoods createCheckBalanceOfManyGoods() {
        return new CheckBalanceOfManyGoods();
    }

    /**
     * Create an instance of {@link ArrayString }
     * 
     */
    public ArrayString createArrayString() {
        return new ArrayString();
    }

    /**
     * Create an instance of {@link CheckBalanceOfManyGoodsResponse }
     * 
     */
    public CheckBalanceOfManyGoodsResponse createCheckBalanceOfManyGoodsResponse() {
        return new CheckBalanceOfManyGoodsResponse();
    }

    /**
     * Create an instance of {@link SaveWaybillReturn }
     * 
     */
    public SaveWaybillReturn createSaveWaybillReturn() {
        return new SaveWaybillReturn();
    }

    /**
     * Create an instance of {@link SaveWaybillReturnResponse }
     * 
     */
    public SaveWaybillReturnResponse createSaveWaybillReturnResponse() {
        return new SaveWaybillReturnResponse();
    }

    /**
     * Create an instance of {@link UpdateProjects }
     * 
     */
    public UpdateProjects createUpdateProjects() {
        return new UpdateProjects();
    }

    /**
     * Create an instance of {@link UpdateProjectsResponse }
     * 
     */
    public UpdateProjectsResponse createUpdateProjectsResponse() {
        return new UpdateProjectsResponse();
    }

    /**
     * Create an instance of {@link UpdateOfficial }
     * 
     */
    public UpdateOfficial createUpdateOfficial() {
        return new UpdateOfficial();
    }

    /**
     * Create an instance of {@link UpdateOfficialResponse }
     * 
     */
    public UpdateOfficialResponse createUpdateOfficialResponse() {
        return new UpdateOfficialResponse();
    }

    /**
     * Create an instance of {@link SaveWaybillLG }
     * 
     */
    public SaveWaybillLG createSaveWaybillLG() {
        return new SaveWaybillLG();
    }

    /**
     * Create an instance of {@link ArrayGMH }
     * 
     */
    public ArrayGMH createArrayGMH() {
        return new ArrayGMH();
    }

    /**
     * Create an instance of {@link SaveWaybillLGResponse }
     * 
     */
    public SaveWaybillLGResponse createSaveWaybillLGResponse() {
        return new SaveWaybillLGResponse();
    }

    /**
     * Create an instance of {@link Version }
     * 
     */
    public Version createVersion() {
        return new Version();
    }

    /**
     * Create an instance of {@link VersionResponse }
     * 
     */
    public VersionResponse createVersionResponse() {
        return new VersionResponse();
    }

    /**
     * Create an instance of {@link GetListOfWarehouses }
     * 
     */
    public GetListOfWarehouses createGetListOfWarehouses() {
        return new GetListOfWarehouses();
    }

    /**
     * Create an instance of {@link GetListOfWarehousesResponse }
     * 
     */
    public GetListOfWarehousesResponse createGetListOfWarehousesResponse() {
        return new GetListOfWarehousesResponse();
    }

    /**
     * Create an instance of {@link NewUser }
     * 
     */
    public NewUser createNewUser() {
        return new NewUser();
    }

    /**
     * Create an instance of {@link Contacts }
     * 
     */
    public Contacts createContacts() {
        return new Contacts();
    }

    /**
     * Create an instance of {@link NewUserResponse }
     * 
     */
    public NewUserResponse createNewUserResponse() {
        return new NewUserResponse();
    }

    /**
     * Create an instance of {@link SaveOrderFake }
     * 
     */
    public SaveOrderFake createSaveOrderFake() {
        return new SaveOrderFake();
    }

    /**
     * Create an instance of {@link SaveOrderFakeResponse }
     * 
     */
    public SaveOrderFakeResponse createSaveOrderFakeResponse() {
        return new SaveOrderFakeResponse();
    }

    /**
     * Create an instance of {@link CancelOrder }
     * 
     */
    public CancelOrder createCancelOrder() {
        return new CancelOrder();
    }

    /**
     * Create an instance of {@link CancelOrderResponse }
     * 
     */
    public CancelOrderResponse createCancelOrderResponse() {
        return new CancelOrderResponse();
    }

    /**
     * Create an instance of {@link UpdateProductCategory }
     * 
     */
    public UpdateProductCategory createUpdateProductCategory() {
        return new UpdateProductCategory();
    }

    /**
     * Create an instance of {@link ArrayStruct }
     * 
     */
    public ArrayStruct createArrayStruct() {
        return new ArrayStruct();
    }

    /**
     * Create an instance of {@link UpdateProductCategoryResponse }
     * 
     */
    public UpdateProductCategoryResponse createUpdateProductCategoryResponse() {
        return new UpdateProductCategoryResponse();
    }

    /**
     * Create an instance of {@link LoadWaybillsBD }
     * 
     */
    public LoadWaybillsBD createLoadWaybillsBD() {
        return new LoadWaybillsBD();
    }

    /**
     * Create an instance of {@link LoadWaybillsBDResponse }
     * 
     */
    public LoadWaybillsBDResponse createLoadWaybillsBDResponse() {
        return new LoadWaybillsBDResponse();
    }

    /**
     * Create an instance of {@link UpdateProductParty }
     * 
     */
    public UpdateProductParty createUpdateProductParty() {
        return new UpdateProductParty();
    }

    /**
     * Create an instance of {@link UpdateProductPartyResponse }
     * 
     */
    public UpdateProductPartyResponse createUpdateProductPartyResponse() {
        return new UpdateProductPartyResponse();
    }

    /**
     * Create an instance of {@link UpdateStorageGroup }
     * 
     */
    public UpdateStorageGroup createUpdateStorageGroup() {
        return new UpdateStorageGroup();
    }

    /**
     * Create an instance of {@link UpdateStorageGroupResponse }
     * 
     */
    public UpdateStorageGroupResponse createUpdateStorageGroupResponse() {
        return new UpdateStorageGroupResponse();
    }

    /**
     * Create an instance of {@link GetListOfAvailableCodesForClient }
     * 
     */
    public GetListOfAvailableCodesForClient createGetListOfAvailableCodesForClient() {
        return new GetListOfAvailableCodesForClient();
    }

    /**
     * Create an instance of {@link GetListOfAvailableCodesForClientResponse }
     * 
     */
    public GetListOfAvailableCodesForClientResponse createGetListOfAvailableCodesForClientResponse() {
        return new GetListOfAvailableCodesForClientResponse();
    }

    /**
     * Create an instance of {@link GetListOfPVZ }
     * 
     */
    public GetListOfPVZ createGetListOfPVZ() {
        return new GetListOfPVZ();
    }

    /**
     * Create an instance of {@link GetListOfPVZResponse }
     * 
     */
    public GetListOfPVZResponse createGetListOfPVZResponse() {
        return new GetListOfPVZResponse();
    }

    /**
     * Create an instance of {@link ArrayPVZ }
     * 
     */
    public ArrayPVZ createArrayPVZ() {
        return new ArrayPVZ();
    }

    /**
     * Create an instance of {@link AccessAgent }
     * 
     */
    public AccessAgent createAccessAgent() {
        return new AccessAgent();
    }

    /**
     * Create an instance of {@link AccessClient }
     * 
     */
    public AccessClient createAccessClient() {
        return new AccessClient();
    }

    /**
     * Create an instance of {@link AccessInfo }
     * 
     */
    public AccessInfo createAccessInfo() {
        return new AccessInfo();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link ArrayCostings }
     * 
     */
    public ArrayCostings createArrayCostings() {
        return new ArrayCostings();
    }

    /**
     * Create an instance of {@link BankProperties }
     * 
     */
    public BankProperties createBankProperties() {
        return new BankProperties();
    }

    /**
     * Create an instance of {@link Calc2 }
     * 
     */
    public Calc2 createCalc2() {
        return new Calc2();
    }

    /**
     * Create an instance of {@link Cargo }
     * 
     */
    public Cargo createCargo() {
        return new Cargo();
    }

    /**
     * Create an instance of {@link CargoPackages }
     * 
     */
    public CargoPackages createCargoPackages() {
        return new CargoPackages();
    }

    /**
     * Create an instance of {@link ClientInfo }
     * 
     */
    public ClientInfo createClientInfo() {
        return new ClientInfo();
    }

    /**
     * Create an instance of {@link ClientProducts }
     * 
     */
    public ClientProducts createClientProducts() {
        return new ClientProducts();
    }

    /**
     * Create an instance of {@link Codes }
     * 
     */
    public Codes createCodes() {
        return new Codes();
    }

    /**
     * Create an instance of {@link Consolidation }
     * 
     */
    public Consolidation createConsolidation() {
        return new Consolidation();
    }

    /**
     * Create an instance of {@link Correspondence }
     * 
     */
    public Correspondence createCorrespondence() {
        return new Correspondence();
    }

    /**
     * Create an instance of {@link CostedTariff }
     * 
     */
    public CostedTariff createCostedTariff() {
        return new CostedTariff();
    }

    /**
     * Create an instance of {@link Costings }
     * 
     */
    public Costings createCostings() {
        return new Costings();
    }

    /**
     * Create an instance of {@link DestinationAddress }
     * 
     */
    public DestinationAddress createDestinationAddress() {
        return new DestinationAddress();
    }

    /**
     * Create an instance of {@link DestinationInformation }
     * 
     */
    public DestinationInformation createDestinationInformation() {
        return new DestinationInformation();
    }

    /**
     * Create an instance of {@link DistributionWaybill }
     * 
     */
    public DistributionWaybill createDistributionWaybill() {
        return new DistributionWaybill();
    }

    /**
     * Create an instance of {@link DocumentProperties }
     * 
     */
    public DocumentProperties createDocumentProperties() {
        return new DocumentProperties();
    }

    /**
     * Create an instance of {@link DocumentsPhoto }
     * 
     */
    public DocumentsPhoto createDocumentsPhoto() {
        return new DocumentsPhoto();
    }

    /**
     * Create an instance of {@link Element }
     * 
     */
    public Element createElement() {
        return new Element();
    }

    /**
     * Create an instance of {@link GMH }
     * 
     */
    public GMH createGMH() {
        return new GMH();
    }

    /**
     * Create an instance of {@link Geo }
     * 
     */
    public Geo createGeo() {
        return new Geo();
    }

    /**
     * Create an instance of {@link GeographyProperties }
     * 
     */
    public GeographyProperties createGeographyProperties() {
        return new GeographyProperties();
    }

    /**
     * Create an instance of {@link InfoCargoReports }
     * 
     */
    public InfoCargoReports createInfoCargoReports() {
        return new InfoCargoReports();
    }

    /**
     * Create an instance of {@link InfoDeliveryReports }
     * 
     */
    public InfoDeliveryReports createInfoDeliveryReports() {
        return new InfoDeliveryReports();
    }

    /**
     * Create an instance of {@link InfoDeliveryTimeReports }
     * 
     */
    public InfoDeliveryTimeReports createInfoDeliveryTimeReports() {
        return new InfoDeliveryTimeReports();
    }

    /**
     * Create an instance of {@link InfoStateReports }
     * 
     */
    public InfoStateReports createInfoStateReports() {
        return new InfoStateReports();
    }

    /**
     * Create an instance of {@link InfoTraceReports }
     * 
     */
    public InfoTraceReports createInfoTraceReports() {
        return new InfoTraceReports();
    }

    /**
     * Create an instance of {@link InfoWaybillReports }
     * 
     */
    public InfoWaybillReports createInfoWaybillReports() {
        return new InfoWaybillReports();
    }

    /**
     * Create an instance of {@link Materials }
     * 
     */
    public Materials createMaterials() {
        return new Materials();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link Notifications }
     * 
     */
    public Notifications createNotifications() {
        return new Notifications();
    }

    /**
     * Create an instance of {@link OpeningHours }
     * 
     */
    public OpeningHours createOpeningHours() {
        return new OpeningHours();
    }

    /**
     * Create an instance of {@link OutputSettingsCustomersGoodsReport3 }
     * 
     */
    public OutputSettingsCustomersGoodsReport3 createOutputSettingsCustomersGoodsReport3() {
        return new OutputSettingsCustomersGoodsReport3();
    }

    /**
     * Create an instance of {@link PVZ }
     * 
     */
    public PVZ createPVZ() {
        return new PVZ();
    }

    /**
     * Create an instance of {@link PackageProperties }
     * 
     */
    public PackageProperties createPackageProperties() {
        return new PackageProperties();
    }

    /**
     * Create an instance of {@link Payable }
     * 
     */
    public Payable createPayable() {
        return new Payable();
    }

    /**
     * Create an instance of {@link PhotoGoods }
     * 
     */
    public PhotoGoods createPhotoGoods() {
        return new PhotoGoods();
    }

    /**
     * Create an instance of {@link PrintDocuments }
     * 
     */
    public PrintDocuments createPrintDocuments() {
        return new PrintDocuments();
    }

    /**
     * Create an instance of {@link Problem }
     * 
     */
    public Problem createProblem() {
        return new Problem();
    }

    /**
     * Create an instance of {@link ProductFeatures }
     * 
     */
    public ProductFeatures createProductFeatures() {
        return new ProductFeatures();
    }

    /**
     * Create an instance of {@link ProductPackages }
     * 
     */
    public ProductPackages createProductPackages() {
        return new ProductPackages();
    }

    /**
     * Create an instance of {@link ProductParties }
     * 
     */
    public ProductParties createProductParties() {
        return new ProductParties();
    }

    /**
     * Create an instance of {@link ProductSerialNumber }
     * 
     */
    public ProductSerialNumber createProductSerialNumber() {
        return new ProductSerialNumber();
    }

    /**
     * Create an instance of {@link Products }
     * 
     */
    public Products createProducts() {
        return new Products();
    }

    /**
     * Create an instance of {@link ReestrWaybill }
     * 
     */
    public ReestrWaybill createReestrWaybill() {
        return new ReestrWaybill();
    }

    /**
     * Create an instance of {@link ResultArrayPhoto }
     * 
     */
    public ResultArrayPhoto createResultArrayPhoto() {
        return new ResultArrayPhoto();
    }

    /**
     * Create an instance of {@link Roles }
     * 
     */
    public Roles createRoles() {
        return new Roles();
    }

    /**
     * Create an instance of {@link SructType }
     * 
     */
    public SructType createSructType() {
        return new SructType();
    }

    /**
     * Create an instance of {@link TariffProperties }
     * 
     */
    public TariffProperties createTariffProperties() {
        return new TariffProperties();
    }

    /**
     * Create an instance of {@link TrackingEvent }
     * 
     */
    public TrackingEvent createTrackingEvent() {
        return new TrackingEvent();
    }

    /**
     * Create an instance of {@link TrackingInfo }
     * 
     */
    public TrackingInfo createTrackingInfo() {
        return new TrackingInfo();
    }

    /**
     * Create an instance of {@link UserData }
     * 
     */
    public UserData createUserData() {
        return new UserData();
    }

    /**
     * Create an instance of {@link Waybill }
     * 
     */
    public Waybill createWaybill() {
        return new Waybill();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "OrderNumber", scope = Waybill.class)
    public JAXBElement<String> createWaybillOrderNumber(String value) {
        return new JAXBElement<String>(_WaybillOrderNumber_QNAME, String.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "WaybillNumber", scope = Waybill.class)
    public JAXBElement<String> createWaybillWaybillNumber(String value) {
        return new JAXBElement<String>(_WaybillWaybillNumber_QNAME, String.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ClientNumber", scope = Waybill.class)
    public JAXBElement<String> createWaybillClientNumber(String value) {
        return new JAXBElement<String>(_WaybillClientNumber_QNAME, String.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CreateDate", scope = Waybill.class)
    public JAXBElement<XMLGregorianCalendar> createWaybillCreateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WaybillCreateDate_QNAME, XMLGregorianCalendar.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "State", scope = Waybill.class)
    public JAXBElement<String> createWaybillState(String value) {
        return new JAXBElement<String>(_WaybillState_QNAME, String.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "DeliveryDate", scope = Waybill.class)
    public JAXBElement<XMLGregorianCalendar> createWaybillDeliveryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WaybillDeliveryDate_QNAME, XMLGregorianCalendar.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Sender", scope = Waybill.class)
    public JAXBElement<String> createWaybillSender(String value) {
        return new JAXBElement<String>(_WaybillSender_QNAME, String.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "SenderGeography", scope = Waybill.class)
    public JAXBElement<String> createWaybillSenderGeography(String value) {
        return new JAXBElement<String>(_WaybillSenderGeography_QNAME, String.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Recipient", scope = Waybill.class)
    public JAXBElement<String> createWaybillRecipient(String value) {
        return new JAXBElement<String>(_WaybillRecipient_QNAME, String.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "RecipientGeography", scope = Waybill.class)
    public JAXBElement<String> createWaybillRecipientGeography(String value) {
        return new JAXBElement<String>(_WaybillRecipientGeography_QNAME, String.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "RecipientAddress", scope = Waybill.class)
    public JAXBElement<String> createWaybillRecipientAddress(String value) {
        return new JAXBElement<String>(_WaybillRecipientAddress_QNAME, String.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "SendDate", scope = Waybill.class)
    public JAXBElement<XMLGregorianCalendar> createWaybillSendDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WaybillSendDate_QNAME, XMLGregorianCalendar.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Payer", scope = Waybill.class)
    public JAXBElement<String> createWaybillPayer(String value) {
        return new JAXBElement<String>(_WaybillPayer_QNAME, String.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CargoQty", scope = Waybill.class)
    public JAXBElement<Integer> createWaybillCargoQty(Integer value) {
        return new JAXBElement<Integer>(_WaybillCargoQty_QNAME, Integer.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "NetWeight", scope = Waybill.class)
    public JAXBElement<Float> createWaybillNetWeight(Float value) {
        return new JAXBElement<Float>(_WaybillNetWeight_QNAME, Float.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "GrossWeight", scope = Waybill.class)
    public JAXBElement<Float> createWaybillGrossWeight(Float value) {
        return new JAXBElement<Float>(_WaybillGrossWeight_QNAME, Float.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ConsolidationNumber", scope = Waybill.class)
    public JAXBElement<String> createWaybillConsolidationNumber(String value) {
        return new JAXBElement<String>(_WaybillConsolidationNumber_QNAME, String.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "InventoryWaybillNumber", scope = Waybill.class)
    public JAXBElement<String> createWaybillInventoryWaybillNumber(String value) {
        return new JAXBElement<String>(_WaybillInventoryWaybillNumber_QNAME, String.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "DeliveryMethod", scope = Waybill.class)
    public JAXBElement<String> createWaybillDeliveryMethod(String value) {
        return new JAXBElement<String>(_WaybillDeliveryMethod_QNAME, String.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Volume", scope = Waybill.class)
    public JAXBElement<Float> createWaybillVolume(Float value) {
        return new JAXBElement<Float>(_WaybillVolume_QNAME, Float.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "RequirePaymentInCash", scope = Waybill.class)
    public JAXBElement<Boolean> createWaybillRequirePaymentInCash(Boolean value) {
        return new JAXBElement<Boolean>(_WaybillRequirePaymentInCash_QNAME, Boolean.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "PaymentInCash", scope = Waybill.class)
    public JAXBElement<Float> createWaybillPaymentInCash(Float value) {
        return new JAXBElement<Float>(_WaybillPaymentInCash_QNAME, Float.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "PaymentInCashCurrency", scope = Waybill.class)
    public JAXBElement<String> createWaybillPaymentInCashCurrency(String value) {
        return new JAXBElement<String>(_WaybillPaymentInCashCurrency_QNAME, String.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "RecipientOfficial", scope = Waybill.class)
    public JAXBElement<String> createWaybillRecipientOfficial(String value) {
        return new JAXBElement<String>(_WaybillRecipientOfficial_QNAME, String.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ValueForCustomsPurposes", scope = Waybill.class)
    public JAXBElement<Float> createWaybillValueForCustomsPurposes(Float value) {
        return new JAXBElement<Float>(_WaybillValueForCustomsPurposes_QNAME, Float.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ValueForCustomsPurposesCurrency", scope = Waybill.class)
    public JAXBElement<String> createWaybillValueForCustomsPurposesCurrency(String value) {
        return new JAXBElement<String>(_WaybillValueForCustomsPurposesCurrency_QNAME, String.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Comment", scope = Waybill.class)
    public JAXBElement<String> createWaybillComment(String value) {
        return new JAXBElement<String>(_WaybillComment_QNAME, String.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "WithReturn", scope = Waybill.class)
    public JAXBElement<Boolean> createWaybillWithReturn(Boolean value) {
        return new JAXBElement<Boolean>(_WaybillWithReturn_QNAME, Boolean.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Total", scope = Waybill.class)
    public JAXBElement<Float> createWaybillTotal(Float value) {
        return new JAXBElement<Float>(_WaybillTotal_QNAME, Float.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "TypeOfOrder", scope = Waybill.class)
    public JAXBElement<String> createWaybillTypeOfOrder(String value) {
        return new JAXBElement<String>(_WaybillTypeOfOrder_QNAME, String.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "TypeOfCargo", scope = Waybill.class)
    public JAXBElement<String> createWaybillTypeOfCargo(String value) {
        return new JAXBElement<String>(_WaybillTypeOfCargo_QNAME, String.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CargoDescription", scope = Waybill.class)
    public JAXBElement<String> createWaybillCargoDescription(String value) {
        return new JAXBElement<String>(_WaybillCargoDescription_QNAME, String.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ClientContact", scope = Waybill.class)
    public JAXBElement<String> createWaybillClientContact(String value) {
        return new JAXBElement<String>(_WaybillClientContact_QNAME, String.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "RecipientContact", scope = Waybill.class)
    public JAXBElement<String> createWaybillRecipientContact(String value) {
        return new JAXBElement<String>(_WaybillRecipientContact_QNAME, String.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "TakeDate", scope = Waybill.class)
    public JAXBElement<XMLGregorianCalendar> createWaybillTakeDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WaybillTakeDate_QNAME, XMLGregorianCalendar.class, Waybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "AddressBook", scope = UserData.class)
    public JAXBElement<AddressBook> createUserDataAddressBook(AddressBook value) {
        return new JAXBElement<AddressBook>(_UserDataAddressBook_QNAME, AddressBook.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CargoDescriptions", scope = UserData.class)
    public JAXBElement<ListOfCorrespondences> createUserDataCargoDescriptions(ListOfCorrespondences value) {
        return new JAXBElement<ListOfCorrespondences>(_UserDataCargoDescriptions_QNAME, ListOfCorrespondences.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Companies", scope = UserData.class)
    public JAXBElement<ListOfCorrespondences> createUserDataCompanies(ListOfCorrespondences value) {
        return new JAXBElement<ListOfCorrespondences>(_UserDataCompanies_QNAME, ListOfCorrespondences.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "DeliveryMethods", scope = UserData.class)
    public JAXBElement<ListOfCorrespondences> createUserDataDeliveryMethods(ListOfCorrespondences value) {
        return new JAXBElement<ListOfCorrespondences>(_UserDataDeliveryMethods_QNAME, ListOfCorrespondences.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "DepartmentOnlyFromPredefinedList", scope = UserData.class)
    public JAXBElement<Boolean> createUserDataDepartmentOnlyFromPredefinedList(Boolean value) {
        return new JAXBElement<Boolean>(_UserDataDepartmentOnlyFromPredefinedList_QNAME, Boolean.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "DepartmentRequired", scope = UserData.class)
    public JAXBElement<Boolean> createUserDataDepartmentRequired(Boolean value) {
        return new JAXBElement<Boolean>(_UserDataDepartmentRequired_QNAME, Boolean.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Departments", scope = UserData.class)
    public JAXBElement<ListOfCorrespondences> createUserDataDepartments(ListOfCorrespondences value) {
        return new JAXBElement<ListOfCorrespondences>(_UserDataDepartments_QNAME, ListOfCorrespondences.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "PackageTypes", scope = UserData.class)
    public JAXBElement<ListOfCorrespondences> createUserDataPackageTypes(ListOfCorrespondences value) {
        return new JAXBElement<ListOfCorrespondences>(_UserDataPackageTypes_QNAME, ListOfCorrespondences.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Services", scope = UserData.class)
    public JAXBElement<ListOfCorrespondences> createUserDataServices(ListOfCorrespondences value) {
        return new JAXBElement<ListOfCorrespondences>(_UserDataServices_QNAME, ListOfCorrespondences.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "TrackingDocuments", scope = UserData.class)
    public JAXBElement<ListOfCorrespondences> createUserDataTrackingDocuments(ListOfCorrespondences value) {
        return new JAXBElement<ListOfCorrespondences>(_UserDataTrackingDocuments_QNAME, ListOfCorrespondences.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "TypesOfCargo", scope = UserData.class)
    public JAXBElement<ListOfCorrespondences> createUserDataTypesOfCargo(ListOfCorrespondences value) {
        return new JAXBElement<ListOfCorrespondences>(_UserDataTypesOfCargo_QNAME, ListOfCorrespondences.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "TypesOfPayers", scope = UserData.class)
    public JAXBElement<ListOfCorrespondences> createUserDataTypesOfPayers(ListOfCorrespondences value) {
        return new JAXBElement<ListOfCorrespondences>(_UserDataTypesOfPayers_QNAME, ListOfCorrespondences.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Urgencies", scope = UserData.class)
    public JAXBElement<ListOfCorrespondences> createUserDataUrgencies(ListOfCorrespondences value) {
        return new JAXBElement<ListOfCorrespondences>(_UserDataUrgencies_QNAME, ListOfCorrespondences.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "WaysOfPayment", scope = UserData.class)
    public JAXBElement<ListOfCorrespondences> createUserDataWaysOfPayment(ListOfCorrespondences value) {
        return new JAXBElement<ListOfCorrespondences>(_UserDataWaysOfPayment_QNAME, ListOfCorrespondences.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Store", scope = UserData.class)
    public JAXBElement<String> createUserDataStore(String value) {
        return new JAXBElement<String>(_UserDataStore_QNAME, String.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "PriceInOrderForStore", scope = UserData.class)
    public JAXBElement<Boolean> createUserDataPriceInOrderForStore(Boolean value) {
        return new JAXBElement<Boolean>(_UserDataPriceInOrderForStore_QNAME, Boolean.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CoefficientOfVolumeWeight", scope = UserData.class)
    public JAXBElement<Integer> createUserDataCoefficientOfVolumeWeight(Integer value) {
        return new JAXBElement<Integer>(_UserDataCoefficientOfVolumeWeight_QNAME, Integer.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "WeightLimit", scope = UserData.class)
    public JAXBElement<Float> createUserDataWeightLimit(Float value) {
        return new JAXBElement<Float>(_UserDataWeightLimit_QNAME, Float.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "PrintProject", scope = UserData.class)
    public JAXBElement<Boolean> createUserDataPrintProject(Boolean value) {
        return new JAXBElement<Boolean>(_UserDataPrintProject_QNAME, Boolean.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "PrintDepartment", scope = UserData.class)
    public JAXBElement<Boolean> createUserDataPrintDepartment(Boolean value) {
        return new JAXBElement<Boolean>(_UserDataPrintDepartment_QNAME, Boolean.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CargoPackagesRequired", scope = UserData.class)
    public JAXBElement<Boolean> createUserDataCargoPackagesRequired(Boolean value) {
        return new JAXBElement<Boolean>(_UserDataCargoPackagesRequired_QNAME, Boolean.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CargoDiscriptionRequired", scope = UserData.class)
    public JAXBElement<Boolean> createUserDataCargoDiscriptionRequired(Boolean value) {
        return new JAXBElement<Boolean>(_UserDataCargoDiscriptionRequired_QNAME, Boolean.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "RecipientOfficialRequired", scope = UserData.class)
    public JAXBElement<Boolean> createUserDataRecipientOfficialRequired(Boolean value) {
        return new JAXBElement<Boolean>(_UserDataRecipientOfficialRequired_QNAME, Boolean.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "SenderOfficialRequired", scope = UserData.class)
    public JAXBElement<Boolean> createUserDataSenderOfficialRequired(Boolean value) {
        return new JAXBElement<Boolean>(_UserDataSenderOfficialRequired_QNAME, Boolean.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ClientOfficialRequired", scope = UserData.class)
    public JAXBElement<Boolean> createUserDataClientOfficialRequired(Boolean value) {
        return new JAXBElement<Boolean>(_UserDataClientOfficialRequired_QNAME, Boolean.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "WriteInsuranceCost", scope = UserData.class)
    public JAXBElement<String> createUserDataWriteInsuranceCost(String value) {
        return new JAXBElement<String>(_UserDataWriteInsuranceCost_QNAME, String.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "WriteDeclaredCost", scope = UserData.class)
    public JAXBElement<String> createUserDataWriteDeclaredCost(String value) {
        return new JAXBElement<String>(_UserDataWriteDeclaredCost_QNAME, String.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CommentWaybill", scope = UserData.class)
    public JAXBElement<String> createUserDataCommentWaybill(String value) {
        return new JAXBElement<String>(_UserDataCommentWaybill_QNAME, String.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CommentOrder", scope = UserData.class)
    public JAXBElement<String> createUserDataCommentOrder(String value) {
        return new JAXBElement<String>(_UserDataCommentOrder_QNAME, String.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "MainTypeOfDelivery", scope = UserData.class)
    public JAXBElement<String> createUserDataMainTypeOfDelivery(String value) {
        return new JAXBElement<String>(_UserDataMainTypeOfDelivery_QNAME, String.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "MainPayer", scope = UserData.class)
    public JAXBElement<String> createUserDataMainPayer(String value) {
        return new JAXBElement<String>(_UserDataMainPayer_QNAME, String.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "MainDocument", scope = UserData.class)
    public JAXBElement<String> createUserDataMainDocument(String value) {
        return new JAXBElement<String>(_UserDataMainDocument_QNAME, String.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "MainTypeOfCargo", scope = UserData.class)
    public JAXBElement<String> createUserDataMainTypeOfCargo(String value) {
        return new JAXBElement<String>(_UserDataMainTypeOfCargo_QNAME, String.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "MainEmailRecipient", scope = UserData.class)
    public JAXBElement<String> createUserDataMainEmailRecipient(String value) {
        return new JAXBElement<String>(_UserDataMainEmailRecipient_QNAME, String.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "MainPhonelRecipient", scope = UserData.class)
    public JAXBElement<String> createUserDataMainPhonelRecipient(String value) {
        return new JAXBElement<String>(_UserDataMainPhonelRecipient_QNAME, String.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "MainAddressRecipient", scope = UserData.class)
    public JAXBElement<String> createUserDataMainAddressRecipient(String value) {
        return new JAXBElement<String>(_UserDataMainAddressRecipient_QNAME, String.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "MainCommentRecipient", scope = UserData.class)
    public JAXBElement<String> createUserDataMainCommentRecipient(String value) {
        return new JAXBElement<String>(_UserDataMainCommentRecipient_QNAME, String.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "MainRecipient", scope = UserData.class)
    public JAXBElement<String> createUserDataMainRecipient(String value) {
        return new JAXBElement<String>(_UserDataMainRecipient_QNAME, String.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "MainOfficialRecipient", scope = UserData.class)
    public JAXBElement<String> createUserDataMainOfficialRecipient(String value) {
        return new JAXBElement<String>(_UserDataMainOfficialRecipient_QNAME, String.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "MainGeographyRecipient", scope = UserData.class)
    public JAXBElement<String> createUserDataMainGeographyRecipient(String value) {
        return new JAXBElement<String>(_UserDataMainGeographyRecipient_QNAME, String.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "MainEmailSender", scope = UserData.class)
    public JAXBElement<String> createUserDataMainEmailSender(String value) {
        return new JAXBElement<String>(_UserDataMainEmailSender_QNAME, String.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "MainPhonelSender", scope = UserData.class)
    public JAXBElement<String> createUserDataMainPhonelSender(String value) {
        return new JAXBElement<String>(_UserDataMainPhonelSender_QNAME, String.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "MainSender", scope = UserData.class)
    public JAXBElement<String> createUserDataMainSender(String value) {
        return new JAXBElement<String>(_UserDataMainSender_QNAME, String.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "MainCommentSender", scope = UserData.class)
    public JAXBElement<String> createUserDataMainCommentSender(String value) {
        return new JAXBElement<String>(_UserDataMainCommentSender_QNAME, String.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "MainAddressSender", scope = UserData.class)
    public JAXBElement<String> createUserDataMainAddressSender(String value) {
        return new JAXBElement<String>(_UserDataMainAddressSender_QNAME, String.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "MainOfficialSender", scope = UserData.class)
    public JAXBElement<String> createUserDataMainOfficialSender(String value) {
        return new JAXBElement<String>(_UserDataMainOfficialSender_QNAME, String.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "MainGeographySender", scope = UserData.class)
    public JAXBElement<String> createUserDataMainGeographySender(String value) {
        return new JAXBElement<String>(_UserDataMainGeographySender_QNAME, String.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ProjectRequired", scope = UserData.class)
    public JAXBElement<Boolean> createUserDataProjectRequired(Boolean value) {
        return new JAXBElement<Boolean>(_UserDataProjectRequired_QNAME, Boolean.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "DetermineIntakeOffice", scope = UserData.class)
    public JAXBElement<Boolean> createUserDataDetermineIntakeOffice(Boolean value) {
        return new JAXBElement<Boolean>(_UserDataDetermineIntakeOffice_QNAME, Boolean.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "EnebleCOD", scope = UserData.class)
    public JAXBElement<Boolean> createUserDataEnebleCOD(Boolean value) {
        return new JAXBElement<Boolean>(_UserDataEnebleCOD_QNAME, Boolean.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "EnebleDateTimeDepart", scope = UserData.class)
    public JAXBElement<Boolean> createUserDataEnebleDateTimeDepart(Boolean value) {
        return new JAXBElement<Boolean>(_UserDataEnebleDateTimeDepart_QNAME, Boolean.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Contacts", scope = UserData.class)
    public JAXBElement<Address> createUserDataContacts(Address value) {
        return new JAXBElement<Address>(_UserDataContacts_QNAME, Address.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "TypeOfDeliveryOfCargo", scope = UserData.class)
    public JAXBElement<ListOfCorrespondences> createUserDataTypeOfDeliveryOfCargo(ListOfCorrespondences value) {
        return new JAXBElement<ListOfCorrespondences>(_UserDataTypeOfDeliveryOfCargo_QNAME, ListOfCorrespondences.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "UseOptionallyAnalytics", scope = UserData.class)
    public JAXBElement<Boolean> createUserDataUseOptionallyAnalytics(Boolean value) {
        return new JAXBElement<Boolean>(_UserDataUseOptionallyAnalytics_QNAME, Boolean.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Organization", scope = UserData.class)
    public JAXBElement<String> createUserDataOrganization(String value) {
        return new JAXBElement<String>(_UserDataOrganization_QNAME, String.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "DeclaredLimit", scope = UserData.class)
    public JAXBElement<Float> createUserDataDeclaredLimit(Float value) {
        return new JAXBElement<Float>(_UserDataDeclaredLimit_QNAME, Float.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "InsuranceLimit", scope = UserData.class)
    public JAXBElement<Float> createUserDataInsuranceLimit(Float value) {
        return new JAXBElement<Float>(_UserDataInsuranceLimit_QNAME, Float.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Restrictions", scope = UserData.class)
    public JAXBElement<ListOfCorrespondences> createUserDataRestrictions(ListOfCorrespondences value) {
        return new JAXBElement<ListOfCorrespondences>(_UserDataRestrictions_QNAME, ListOfCorrespondences.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "PreliminaryCost", scope = UserData.class)
    public JAXBElement<Boolean> createUserDataPreliminaryCost(Boolean value) {
        return new JAXBElement<Boolean>(_UserDataPreliminaryCost_QNAME, Boolean.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "AvailableFunctionalCategory", scope = UserData.class)
    public JAXBElement<Boolean> createUserDataAvailableFunctionalCategory(Boolean value) {
        return new JAXBElement<Boolean>(_UserDataAvailableFunctionalCategory_QNAME, Boolean.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ChangeCustomerGoods", scope = UserData.class)
    public JAXBElement<Boolean> createUserDataChangeCustomerGoods(Boolean value) {
        return new JAXBElement<Boolean>(_UserDataChangeCustomerGoods_QNAME, Boolean.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CreateCustomerGoods", scope = UserData.class)
    public JAXBElement<Boolean> createUserDataCreateCustomerGoods(Boolean value) {
        return new JAXBElement<Boolean>(_UserDataCreateCustomerGoods_QNAME, Boolean.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ChangeCustomerGoodsPhoto", scope = UserData.class)
    public JAXBElement<Boolean> createUserDataChangeCustomerGoodsPhoto(Boolean value) {
        return new JAXBElement<Boolean>(_UserDataChangeCustomerGoodsPhoto_QNAME, Boolean.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CreateCustomerGoodsPhoto", scope = UserData.class)
    public JAXBElement<Boolean> createUserDataCreateCustomerGoodsPhoto(Boolean value) {
        return new JAXBElement<Boolean>(_UserDataCreateCustomerGoodsPhoto_QNAME, Boolean.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "FieldsProjectCustomerGoods", scope = UserData.class)
    public JAXBElement<String> createUserDataFieldsProjectCustomerGoods(String value) {
        return new JAXBElement<String>(_UserDataFieldsProjectCustomerGoods_QNAME, String.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "EditRecipientInOrderForApproval", scope = UserData.class)
    public JAXBElement<Boolean> createUserDataEditRecipientInOrderForApproval(Boolean value) {
        return new JAXBElement<Boolean>(_UserDataEditRecipientInOrderForApproval_QNAME, Boolean.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "RequiresOrderConfirmationWarehouse", scope = UserData.class)
    public JAXBElement<Boolean> createUserDataRequiresOrderConfirmationWarehouse(Boolean value) {
        return new JAXBElement<Boolean>(_UserDataRequiresOrderConfirmationWarehouse_QNAME, Boolean.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CreateProjects", scope = UserData.class)
    public JAXBElement<Boolean> createUserDataCreateProjects(Boolean value) {
        return new JAXBElement<Boolean>(_UserDataCreateProjects_QNAME, Boolean.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CreateDepartments", scope = UserData.class)
    public JAXBElement<Boolean> createUserDataCreateDepartments(Boolean value) {
        return new JAXBElement<Boolean>(_UserDataCreateDepartments_QNAME, Boolean.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CreateOfficials", scope = UserData.class)
    public JAXBElement<Boolean> createUserDataCreateOfficials(Boolean value) {
        return new JAXBElement<Boolean>(_UserDataCreateOfficials_QNAME, Boolean.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "RecipientEmailRequired", scope = UserData.class)
    public JAXBElement<Boolean> createUserDataRecipientEmailRequired(Boolean value) {
        return new JAXBElement<Boolean>(_UserDataRecipientEmailRequired_QNAME, Boolean.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "SenderEmailRequired", scope = UserData.class)
    public JAXBElement<Boolean> createUserDataSenderEmailRequired(Boolean value) {
        return new JAXBElement<Boolean>(_UserDataSenderEmailRequired_QNAME, Boolean.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "SplitAnAddressBook", scope = UserData.class)
    public JAXBElement<Boolean> createUserDataSplitAnAddressBook(Boolean value) {
        return new JAXBElement<Boolean>(_UserDataSplitAnAddressBook_QNAME, Boolean.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "UseOwnAddressBook", scope = UserData.class)
    public JAXBElement<Boolean> createUserDataUseOwnAddressBook(Boolean value) {
        return new JAXBElement<Boolean>(_UserDataUseOwnAddressBook_QNAME, Boolean.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Type", scope = TrackingInfo.class)
    public JAXBElement<String> createTrackingInfoType(String value) {
        return new JAXBElement<String>(_TrackingInfoType_QNAME, String.class, TrackingInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Number", scope = TrackingInfo.class)
    public JAXBElement<String> createTrackingInfoNumber(String value) {
        return new JAXBElement<String>(_TrackingInfoNumber_QNAME, String.class, TrackingInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Info", scope = TrackingInfo.class)
    public JAXBElement<String> createTrackingInfoInfo(String value) {
        return new JAXBElement<String>(_TrackingInfoInfo_QNAME, String.class, TrackingInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "AgentURL", scope = TrackingInfo.class)
    public JAXBElement<String> createTrackingInfoAgentURL(String value) {
        return new JAXBElement<String>(_TrackingInfoAgentURL_QNAME, String.class, TrackingInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CreateDate", scope = TrackingInfo.class)
    public JAXBElement<XMLGregorianCalendar> createTrackingInfoCreateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WaybillCreateDate_QNAME, XMLGregorianCalendar.class, TrackingInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "State", scope = TrackingInfo.class)
    public JAXBElement<String> createTrackingInfoState(String value) {
        return new JAXBElement<String>(_WaybillState_QNAME, String.class, TrackingInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "DeliveryDate", scope = TrackingInfo.class)
    public JAXBElement<XMLGregorianCalendar> createTrackingInfoDeliveryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WaybillDeliveryDate_QNAME, XMLGregorianCalendar.class, TrackingInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "DeliveryInfo", scope = TrackingInfo.class)
    public JAXBElement<String> createTrackingInfoDeliveryInfo(String value) {
        return new JAXBElement<String>(_TrackingInfoDeliveryInfo_QNAME, String.class, TrackingInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "PlannedDeliveryPeriodMin", scope = TrackingInfo.class)
    public JAXBElement<Integer> createTrackingInfoPlannedDeliveryPeriodMin(Integer value) {
        return new JAXBElement<Integer>(_TrackingInfoPlannedDeliveryPeriodMin_QNAME, Integer.class, TrackingInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "PlannedDeliveryPeriodMax", scope = TrackingInfo.class)
    public JAXBElement<Integer> createTrackingInfoPlannedDeliveryPeriodMax(Integer value) {
        return new JAXBElement<Integer>(_TrackingInfoPlannedDeliveryPeriodMax_QNAME, Integer.class, TrackingInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "PlannedDeliveryDate", scope = TrackingInfo.class)
    public JAXBElement<XMLGregorianCalendar> createTrackingInfoPlannedDeliveryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TrackingInfoPlannedDeliveryDate_QNAME, XMLGregorianCalendar.class, TrackingInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "EventDate", scope = TrackingEvent.class)
    public JAXBElement<XMLGregorianCalendar> createTrackingEventEventDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TrackingEventEventDate_QNAME, XMLGregorianCalendar.class, TrackingEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "EventName", scope = TrackingEvent.class)
    public JAXBElement<String> createTrackingEventEventName(String value) {
        return new JAXBElement<String>(_TrackingEventEventName_QNAME, String.class, TrackingEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "EventInfo", scope = TrackingEvent.class)
    public JAXBElement<String> createTrackingEventEventInfo(String value) {
        return new JAXBElement<String>(_TrackingEventEventInfo_QNAME, String.class, TrackingEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "GUID", scope = SructType.class)
    public JAXBElement<String> createSructTypeGUID(String value) {
        return new JAXBElement<String>(_SructTypeGUID_QNAME, String.class, SructType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ParentGUID", scope = SructType.class)
    public JAXBElement<String> createSructTypeParentGUID(String value) {
        return new JAXBElement<String>(_SructTypeParentGUID_QNAME, String.class, SructType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "IsFolder", scope = SructType.class)
    public JAXBElement<Boolean> createSructTypeIsFolder(Boolean value) {
        return new JAXBElement<Boolean>(_SructTypeIsFolder_QNAME, Boolean.class, SructType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Default", scope = SructType.class)
    public JAXBElement<Boolean> createSructTypeDefault(Boolean value) {
        return new JAXBElement<Boolean>(_SructTypeDefault_QNAME, Boolean.class, SructType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Error", scope = ResultArrayPhoto.class)
    public JAXBElement<Boolean> createResultArrayPhotoError(Boolean value) {
        return new JAXBElement<Boolean>(_ResultArrayPhotoError_QNAME, Boolean.class, ResultArrayPhoto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ErrorInfo", scope = ResultArrayPhoto.class)
    public JAXBElement<String> createResultArrayPhotoErrorInfo(String value) {
        return new JAXBElement<String>(_ResultArrayPhotoErrorInfo_QNAME, String.class, ResultArrayPhoto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CargoQty", scope = ReestrWaybill.class)
    public JAXBElement<Integer> createReestrWaybillCargoQty(Integer value) {
        return new JAXBElement<Integer>(_WaybillCargoQty_QNAME, Integer.class, ReestrWaybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "NetWeight", scope = ReestrWaybill.class)
    public JAXBElement<Float> createReestrWaybillNetWeight(Float value) {
        return new JAXBElement<Float>(_WaybillNetWeight_QNAME, Float.class, ReestrWaybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CargoDescription", scope = ReestrWaybill.class)
    public JAXBElement<String> createReestrWaybillCargoDescription(String value) {
        return new JAXBElement<String>(_WaybillCargoDescription_QNAME, String.class, ReestrWaybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "TypeOfCargo", scope = ReestrWaybill.class)
    public JAXBElement<String> createReestrWaybillTypeOfCargo(String value) {
        return new JAXBElement<String>(_WaybillTypeOfCargo_QNAME, String.class, ReestrWaybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Recipient", scope = ReestrWaybill.class)
    public JAXBElement<String> createReestrWaybillRecipient(String value) {
        return new JAXBElement<String>(_WaybillRecipient_QNAME, String.class, ReestrWaybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "RecipientGeography", scope = ReestrWaybill.class)
    public JAXBElement<String> createReestrWaybillRecipientGeography(String value) {
        return new JAXBElement<String>(_WaybillRecipientGeography_QNAME, String.class, ReestrWaybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "RecipientAddress", scope = ReestrWaybill.class)
    public JAXBElement<String> createReestrWaybillRecipientAddress(String value) {
        return new JAXBElement<String>(_WaybillRecipientAddress_QNAME, String.class, ReestrWaybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Official", scope = ReestrWaybill.class)
    public JAXBElement<String> createReestrWaybillOfficial(String value) {
        return new JAXBElement<String>(_ReestrWaybillOfficial_QNAME, String.class, ReestrWaybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Article", scope = Products.class)
    public JAXBElement<String> createProductsArticle(String value) {
        return new JAXBElement<String>(_ProductsArticle_QNAME, String.class, Products.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Name", scope = Products.class)
    public JAXBElement<String> createProductsName(String value) {
        return new JAXBElement<String>(_ProductsName_QNAME, String.class, Products.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "BCProduct", scope = Products.class)
    public JAXBElement<String> createProductsBCProduct(String value) {
        return new JAXBElement<String>(_ProductsBCProduct_QNAME, String.class, Products.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Party", scope = Products.class)
    public JAXBElement<String> createProductsParty(String value) {
        return new JAXBElement<String>(_ProductsParty_QNAME, String.class, Products.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "DayOfParty", scope = Products.class)
    public JAXBElement<XMLGregorianCalendar> createProductsDayOfParty(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProductsDayOfParty_QNAME, XMLGregorianCalendar.class, Products.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ExpirationDate", scope = Products.class)
    public JAXBElement<XMLGregorianCalendar> createProductsExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProductsExpirationDate_QNAME, XMLGregorianCalendar.class, Products.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "SerialNumber", scope = Products.class)
    public JAXBElement<String> createProductsSerialNumber(String value) {
        return new JAXBElement<String>(_ProductsSerialNumber_QNAME, String.class, Products.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Price", scope = Products.class)
    public JAXBElement<Float> createProductsPrice(Float value) {
        return new JAXBElement<Float>(_ProductsPrice_QNAME, Float.class, Products.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Package", scope = Products.class)
    public JAXBElement<String> createProductsPackage(String value) {
        return new JAXBElement<String>(_ProductsPackage_QNAME, String.class, Products.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "PackageQty", scope = Products.class)
    public JAXBElement<Integer> createProductsPackageQty(Integer value) {
        return new JAXBElement<Integer>(_ProductsPackageQty_QNAME, Integer.class, Products.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Qty", scope = Products.class)
    public JAXBElement<Integer> createProductsQty(Integer value) {
        return new JAXBElement<Integer>(_ProductsQty_QNAME, Integer.class, Products.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "VATRate", scope = Products.class)
    public JAXBElement<Integer> createProductsVATRate(Integer value) {
        return new JAXBElement<Integer>(_ProductsVATRate_QNAME, Integer.class, Products.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CodeFromOrder", scope = Products.class)
    public JAXBElement<Integer> createProductsCodeFromOrder(Integer value) {
        return new JAXBElement<Integer>(_ProductsCodeFromOrder_QNAME, Integer.class, Products.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "AssessedValue", scope = Products.class)
    public JAXBElement<Float> createProductsAssessedValue(Float value) {
        return new JAXBElement<Float>(_ProductsAssessedValue_QNAME, Float.class, Products.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Guid", scope = ProductSerialNumber.class)
    public JAXBElement<String> createProductSerialNumberGuid(String value) {
        return new JAXBElement<String>(_ProductSerialNumberGuid_QNAME, String.class, ProductSerialNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Name", scope = ProductSerialNumber.class)
    public JAXBElement<String> createProductSerialNumberName(String value) {
        return new JAXBElement<String>(_ProductsName_QNAME, String.class, ProductSerialNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ID", scope = ProductSerialNumber.class)
    public JAXBElement<String> createProductSerialNumberID(String value) {
        return new JAXBElement<String>(_ProductSerialNumberID_QNAME, String.class, ProductSerialNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Number", scope = ProductSerialNumber.class)
    public JAXBElement<String> createProductSerialNumberNumber(String value) {
        return new JAXBElement<String>(_TrackingInfoNumber_QNAME, String.class, ProductSerialNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "NumberGDT", scope = ProductSerialNumber.class)
    public JAXBElement<String> createProductSerialNumberNumberGDT(String value) {
        return new JAXBElement<String>(_ProductSerialNumberNumberGDT_QNAME, String.class, ProductSerialNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "SerialNumber", scope = ProductSerialNumber.class)
    public JAXBElement<String> createProductSerialNumberSerialNumber(String value) {
        return new JAXBElement<String>(_ProductsSerialNumber_QNAME, String.class, ProductSerialNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Sertificate", scope = ProductSerialNumber.class)
    public JAXBElement<String> createProductSerialNumberSertificate(String value) {
        return new JAXBElement<String>(_ProductSerialNumberSertificate_QNAME, String.class, ProductSerialNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ExpirationDate", scope = ProductSerialNumber.class)
    public JAXBElement<XMLGregorianCalendar> createProductSerialNumberExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProductsExpirationDate_QNAME, XMLGregorianCalendar.class, ProductSerialNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Client", scope = ProductParties.class)
    public JAXBElement<String> createProductPartiesClient(String value) {
        return new JAXBElement<String>(_ProductPartiesClient_QNAME, String.class, ProductParties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ID", scope = ProductParties.class)
    public JAXBElement<String> createProductPartiesID(String value) {
        return new JAXBElement<String>(_ProductSerialNumberID_QNAME, String.class, ProductParties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ExpirationDate", scope = ProductParties.class)
    public JAXBElement<XMLGregorianCalendar> createProductPartiesExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProductsExpirationDate_QNAME, XMLGregorianCalendar.class, ProductParties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Project", scope = ProductParties.class)
    public JAXBElement<String> createProductPartiesProject(String value) {
        return new JAXBElement<String>(_ProductPartiesProject_QNAME, String.class, ProductParties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Department", scope = ProductParties.class)
    public JAXBElement<String> createProductPartiesDepartment(String value) {
        return new JAXBElement<String>(_ProductPartiesDepartment_QNAME, String.class, ProductParties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "DayOfParty", scope = ProductParties.class)
    public JAXBElement<XMLGregorianCalendar> createProductPartiesDayOfParty(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProductsDayOfParty_QNAME, XMLGregorianCalendar.class, ProductParties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Guid", scope = ProductPackages.class)
    public JAXBElement<String> createProductPackagesGuid(String value) {
        return new JAXBElement<String>(_ProductSerialNumberGuid_QNAME, String.class, ProductPackages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Name", scope = ProductPackages.class)
    public JAXBElement<String> createProductPackagesName(String value) {
        return new JAXBElement<String>(_ProductsName_QNAME, String.class, ProductPackages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ID", scope = ProductPackages.class)
    public JAXBElement<String> createProductPackagesID(String value) {
        return new JAXBElement<String>(_ProductSerialNumberID_QNAME, String.class, ProductPackages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Rate", scope = ProductPackages.class)
    public JAXBElement<Integer> createProductPackagesRate(Integer value) {
        return new JAXBElement<Integer>(_ProductPackagesRate_QNAME, Integer.class, ProductPackages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Unit", scope = ProductPackages.class)
    public JAXBElement<String> createProductPackagesUnit(String value) {
        return new JAXBElement<String>(_ProductPackagesUnit_QNAME, String.class, ProductPackages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Package", scope = ProductPackages.class)
    public JAXBElement<String> createProductPackagesPackage(String value) {
        return new JAXBElement<String>(_ProductsPackage_QNAME, String.class, ProductPackages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "TypeSize", scope = ProductPackages.class)
    public JAXBElement<String> createProductPackagesTypeSize(String value) {
        return new JAXBElement<String>(_ProductPackagesTypeSize_QNAME, String.class, ProductPackages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Guid", scope = ProductFeatures.class)
    public JAXBElement<String> createProductFeaturesGuid(String value) {
        return new JAXBElement<String>(_ProductSerialNumberGuid_QNAME, String.class, ProductFeatures.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Name", scope = ProductFeatures.class)
    public JAXBElement<String> createProductFeaturesName(String value) {
        return new JAXBElement<String>(_ProductsName_QNAME, String.class, ProductFeatures.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "FullName", scope = ProductFeatures.class)
    public JAXBElement<String> createProductFeaturesFullName(String value) {
        return new JAXBElement<String>(_ProductFeaturesFullName_QNAME, String.class, ProductFeatures.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "NotClosed", scope = Problem.class)
    public JAXBElement<Boolean> createProblemNotClosed(Boolean value) {
        return new JAXBElement<Boolean>(_ProblemNotClosed_QNAME, Boolean.class, Problem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "TraceCode", scope = Problem.class)
    public JAXBElement<String> createProblemTraceCode(String value) {
        return new JAXBElement<String>(_ProblemTraceCode_QNAME, String.class, Problem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Description", scope = Problem.class)
    public JAXBElement<String> createProblemDescription(String value) {
        return new JAXBElement<String>(_ProblemDescription_QNAME, String.class, Problem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CanCloseTheTrace", scope = Problem.class)
    public JAXBElement<Boolean> createProblemCanCloseTheTrace(Boolean value) {
        return new JAXBElement<Boolean>(_ProblemCanCloseTheTrace_QNAME, Boolean.class, Problem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "BarCode", scope = PrintDocuments.class)
    public JAXBElement<String> createPrintDocumentsBarCode(String value) {
        return new JAXBElement<String>(_PrintDocumentsBarCode_QNAME, String.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "WaybillNumber", scope = PrintDocuments.class)
    public JAXBElement<String> createPrintDocumentsWaybillNumber(String value) {
        return new JAXBElement<String>(_WaybillWaybillNumber_QNAME, String.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "OrderNumber", scope = PrintDocuments.class)
    public JAXBElement<String> createPrintDocumentsOrderNumber(String value) {
        return new JAXBElement<String>(_WaybillOrderNumber_QNAME, String.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "OrderDate", scope = PrintDocuments.class)
    public JAXBElement<String> createPrintDocumentsOrderDate(String value) {
        return new JAXBElement<String>(_PrintDocumentsOrderDate_QNAME, String.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "WaybillDate", scope = PrintDocuments.class)
    public JAXBElement<String> createPrintDocumentsWaybillDate(String value) {
        return new JAXBElement<String>(_PrintDocumentsWaybillDate_QNAME, String.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "TakeDate", scope = PrintDocuments.class)
    public JAXBElement<String> createPrintDocumentsTakeDate(String value) {
        return new JAXBElement<String>(_WaybillTakeDate_QNAME, String.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ContractNumber", scope = PrintDocuments.class)
    public JAXBElement<String> createPrintDocumentsContractNumber(String value) {
        return new JAXBElement<String>(_PrintDocumentsContractNumber_QNAME, String.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "PackageNumber", scope = PrintDocuments.class)
    public JAXBElement<String> createPrintDocumentsPackageNumber(String value) {
        return new JAXBElement<String>(_PrintDocumentsPackageNumber_QNAME, String.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ClientNumber", scope = PrintDocuments.class)
    public JAXBElement<String> createPrintDocumentsClientNumber(String value) {
        return new JAXBElement<String>(_WaybillClientNumber_QNAME, String.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Project", scope = PrintDocuments.class)
    public JAXBElement<String> createPrintDocumentsProject(String value) {
        return new JAXBElement<String>(_ProductPartiesProject_QNAME, String.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "DepartmentRecipient", scope = PrintDocuments.class)
    public JAXBElement<String> createPrintDocumentsDepartmentRecipient(String value) {
        return new JAXBElement<String>(_PrintDocumentsDepartmentRecipient_QNAME, String.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "DepartmentSender", scope = PrintDocuments.class)
    public JAXBElement<String> createPrintDocumentsDepartmentSender(String value) {
        return new JAXBElement<String>(_PrintDocumentsDepartmentSender_QNAME, String.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DestinationInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Sender", scope = PrintDocuments.class)
    public JAXBElement<DestinationInformation> createPrintDocumentsSender(DestinationInformation value) {
        return new JAXBElement<DestinationInformation>(_WaybillSender_QNAME, DestinationInformation.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DestinationInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Recipient", scope = PrintDocuments.class)
    public JAXBElement<DestinationInformation> createPrintDocumentsRecipient(DestinationInformation value) {
        return new JAXBElement<DestinationInformation>(_WaybillRecipient_QNAME, DestinationInformation.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "FlagPaySender", scope = PrintDocuments.class)
    public JAXBElement<Boolean> createPrintDocumentsFlagPaySender(Boolean value) {
        return new JAXBElement<Boolean>(_PrintDocumentsFlagPaySender_QNAME, Boolean.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "FlagPayRecipient", scope = PrintDocuments.class)
    public JAXBElement<Boolean> createPrintDocumentsFlagPayRecipient(Boolean value) {
        return new JAXBElement<Boolean>(_PrintDocumentsFlagPayRecipient_QNAME, Boolean.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "FlagPayClient", scope = PrintDocuments.class)
    public JAXBElement<Boolean> createPrintDocumentsFlagPayClient(Boolean value) {
        return new JAXBElement<Boolean>(_PrintDocumentsFlagPayClient_QNAME, Boolean.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "FlagGuarantee", scope = PrintDocuments.class)
    public JAXBElement<Boolean> createPrintDocumentsFlagGuarantee(Boolean value) {
        return new JAXBElement<Boolean>(_PrintDocumentsFlagGuarantee_QNAME, Boolean.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "FlagCash", scope = PrintDocuments.class)
    public JAXBElement<Boolean> createPrintDocumentsFlagCash(Boolean value) {
        return new JAXBElement<Boolean>(_PrintDocumentsFlagCash_QNAME, Boolean.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "FlagCashless", scope = PrintDocuments.class)
    public JAXBElement<Boolean> createPrintDocumentsFlagCashless(Boolean value) {
        return new JAXBElement<Boolean>(_PrintDocumentsFlagCashless_QNAME, Boolean.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "TypeOfCargo", scope = PrintDocuments.class)
    public JAXBElement<String> createPrintDocumentsTypeOfCargo(String value) {
        return new JAXBElement<String>(_WaybillTypeOfCargo_QNAME, String.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cargo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Cargo", scope = PrintDocuments.class)
    public JAXBElement<Cargo> createPrintDocumentsCargo(Cargo value) {
        return new JAXBElement<Cargo>(_PrintDocumentsCargo_QNAME, Cargo.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "FlagInsurance", scope = PrintDocuments.class)
    public JAXBElement<Boolean> createPrintDocumentsFlagInsurance(Boolean value) {
        return new JAXBElement<Boolean>(_PrintDocumentsFlagInsurance_QNAME, Boolean.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "FlagDeclaredValue", scope = PrintDocuments.class)
    public JAXBElement<Boolean> createPrintDocumentsFlagDeclaredValue(Boolean value) {
        return new JAXBElement<Boolean>(_PrintDocumentsFlagDeclaredValue_QNAME, Boolean.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "WithReturn", scope = PrintDocuments.class)
    public JAXBElement<Boolean> createPrintDocumentsWithReturn(Boolean value) {
        return new JAXBElement<Boolean>(_WaybillWithReturn_QNAME, Boolean.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "WithNotification", scope = PrintDocuments.class)
    public JAXBElement<Boolean> createPrintDocumentsWithNotification(Boolean value) {
        return new JAXBElement<Boolean>(_PrintDocumentsWithNotification_QNAME, Boolean.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ServiceAmount", scope = PrintDocuments.class)
    public JAXBElement<Float> createPrintDocumentsServiceAmount(Float value) {
        return new JAXBElement<Float>(_PrintDocumentsServiceAmount_QNAME, Float.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ServiceAmountCurrency", scope = PrintDocuments.class)
    public JAXBElement<String> createPrintDocumentsServiceAmountCurrency(String value) {
        return new JAXBElement<String>(_PrintDocumentsServiceAmountCurrency_QNAME, String.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "PaymentAmount", scope = PrintDocuments.class)
    public JAXBElement<Float> createPrintDocumentsPaymentAmount(Float value) {
        return new JAXBElement<Float>(_PrintDocumentsPaymentAmount_QNAME, Float.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "PaymentAmountCurrency", scope = PrintDocuments.class)
    public JAXBElement<String> createPrintDocumentsPaymentAmountCurrency(String value) {
        return new JAXBElement<String>(_PrintDocumentsPaymentAmountCurrency_QNAME, String.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "BarCodeOrder", scope = PrintDocuments.class)
    public JAXBElement<String> createPrintDocumentsBarCodeOrder(String value) {
        return new JAXBElement<String>(_PrintDocumentsBarCodeOrder_QNAME, String.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "BarCodeClientCode", scope = PrintDocuments.class)
    public JAXBElement<String> createPrintDocumentsBarCodeClientCode(String value) {
        return new JAXBElement<String>(_PrintDocumentsBarCodeClientCode_QNAME, String.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Urgency", scope = PrintDocuments.class)
    public JAXBElement<String> createPrintDocumentsUrgency(String value) {
        return new JAXBElement<String>(_PrintDocumentsUrgency_QNAME, String.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Comment", scope = PrintDocuments.class)
    public JAXBElement<String> createPrintDocumentsComment(String value) {
        return new JAXBElement<String>(_WaybillComment_QNAME, String.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CommentFull", scope = PrintDocuments.class)
    public JAXBElement<String> createPrintDocumentsCommentFull(String value) {
        return new JAXBElement<String>(_PrintDocumentsCommentFull_QNAME, String.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Courer", scope = PrintDocuments.class)
    public JAXBElement<String> createPrintDocumentsCourer(String value) {
        return new JAXBElement<String>(_PrintDocumentsCourer_QNAME, String.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Client", scope = PrintDocuments.class)
    public JAXBElement<String> createPrintDocumentsClient(String value) {
        return new JAXBElement<String>(_ProductPartiesClient_QNAME, String.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Organization", scope = PrintDocuments.class)
    public JAXBElement<String> createPrintDocumentsOrganization(String value) {
        return new JAXBElement<String>(_UserDataOrganization_QNAME, String.class, PrintDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "GuidPhoto", scope = PhotoGoods.class)
    public JAXBElement<String> createPhotoGoodsGuidPhoto(String value) {
        return new JAXBElement<String>(_PhotoGoodsGuidPhoto_QNAME, String.class, PhotoGoods.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Name", scope = PhotoGoods.class)
    public JAXBElement<String> createPhotoGoodsName(String value) {
        return new JAXBElement<String>(_ProductsName_QNAME, String.class, PhotoGoods.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Description", scope = PhotoGoods.class)
    public JAXBElement<String> createPhotoGoodsDescription(String value) {
        return new JAXBElement<String>(_ProblemDescription_QNAME, String.class, PhotoGoods.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "URL", scope = PhotoGoods.class)
    public JAXBElement<String> createPhotoGoodsURL(String value) {
        return new JAXBElement<String>(_PhotoGoodsURL_QNAME, String.class, PhotoGoods.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Default", scope = PhotoGoods.class)
    public JAXBElement<Boolean> createPhotoGoodsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_SructTypeDefault_QNAME, Boolean.class, PhotoGoods.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Size", scope = PhotoGoods.class)
    public JAXBElement<Integer> createPhotoGoodsSize(Integer value) {
        return new JAXBElement<Integer>(_PhotoGoodsSize_QNAME, Integer.class, PhotoGoods.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Contract", scope = Payable.class)
    public JAXBElement<String> createPayableContract(String value) {
        return new JAXBElement<String>(_PayableContract_QNAME, String.class, Payable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Summa", scope = Payable.class)
    public JAXBElement<Float> createPayableSumma(Float value) {
        return new JAXBElement<Float>(_PayableSumma_QNAME, Float.class, Payable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "TypeOfPackage", scope = PackageProperties.class)
    public JAXBElement<String> createPackagePropertiesTypeOfPackage(String value) {
        return new JAXBElement<String>(_PackagePropertiesTypeOfPackage_QNAME, String.class, PackageProperties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "TypeOfCargo", scope = PackageProperties.class)
    public JAXBElement<String> createPackagePropertiesTypeOfCargo(String value) {
        return new JAXBElement<String>(_WaybillTypeOfCargo_QNAME, String.class, PackageProperties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Office", scope = PVZ.class)
    public JAXBElement<String> createPVZOffice(String value) {
        return new JAXBElement<String>(_PVZOffice_QNAME, String.class, PVZ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Geography", scope = PVZ.class)
    public JAXBElement<String> createPVZGeography(String value) {
        return new JAXBElement<String>(_PVZGeography_QNAME, String.class, PVZ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Phone", scope = PVZ.class)
    public JAXBElement<String> createPVZPhone(String value) {
        return new JAXBElement<String>(_PVZPhone_QNAME, String.class, PVZ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Address", scope = PVZ.class)
    public JAXBElement<String> createPVZAddress(String value) {
        return new JAXBElement<String>(_PVZAddress_QNAME, String.class, PVZ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "TypeOfPVZ", scope = PVZ.class)
    public JAXBElement<String> createPVZTypeOfPVZ(String value) {
        return new JAXBElement<String>(_PVZTypeOfPVZ_QNAME, String.class, PVZ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CodePVZ", scope = PVZ.class)
    public JAXBElement<String> createPVZCodePVZ(String value) {
        return new JAXBElement<String>(_PVZCodePVZ_QNAME, String.class, PVZ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "WeightLimite", scope = PVZ.class)
    public JAXBElement<Float> createPVZWeightLimite(Float value) {
        return new JAXBElement<Float>(_PVZWeightLimite_QNAME, Float.class, PVZ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "HightLimite", scope = PVZ.class)
    public JAXBElement<Float> createPVZHightLimite(Float value) {
        return new JAXBElement<Float>(_PVZHightLimite_QNAME, Float.class, PVZ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "LengthLimite", scope = PVZ.class)
    public JAXBElement<Float> createPVZLengthLimite(Float value) {
        return new JAXBElement<Float>(_PVZLengthLimite_QNAME, Float.class, PVZ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "WidthLimite", scope = PVZ.class)
    public JAXBElement<Float> createPVZWidthLimite(Float value) {
        return new JAXBElement<Float>(_PVZWidthLimite_QNAME, Float.class, PVZ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "MaxDimensionLimite", scope = PVZ.class)
    public JAXBElement<Float> createPVZMaxDimensionLimite(Float value) {
        return new JAXBElement<Float>(_PVZMaxDimensionLimite_QNAME, Float.class, PVZ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "SumDimensionLimite", scope = PVZ.class)
    public JAXBElement<Float> createPVZSumDimensionLimite(Float value) {
        return new JAXBElement<Float>(_PVZSumDimensionLimite_QNAME, Float.class, PVZ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "QtyLimite", scope = PVZ.class)
    public JAXBElement<Integer> createPVZQtyLimite(Integer value) {
        return new JAXBElement<Integer>(_PVZQtyLimite_QNAME, Integer.class, PVZ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CODLimite", scope = PVZ.class)
    public JAXBElement<Float> createPVZCODLimite(Float value) {
        return new JAXBElement<Float>(_PVZCODLimite_QNAME, Float.class, PVZ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "IssuanceOfShipping", scope = PVZ.class)
    public JAXBElement<Boolean> createPVZIssuanceOfShipping(Boolean value) {
        return new JAXBElement<Boolean>(_PVZIssuanceOfShipping_QNAME, Boolean.class, PVZ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "PaymentByCard", scope = PVZ.class)
    public JAXBElement<Boolean> createPVZPaymentByCard(Boolean value) {
        return new JAXBElement<Boolean>(_PVZPaymentByCard_QNAME, Boolean.class, PVZ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "PaymentByCash", scope = PVZ.class)
    public JAXBElement<Boolean> createPVZPaymentByCash(Boolean value) {
        return new JAXBElement<Boolean>(_PVZPaymentByCash_QNAME, Boolean.class, PVZ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ReceivingSending", scope = PVZ.class)
    public JAXBElement<Boolean> createPVZReceivingSending(Boolean value) {
        return new JAXBElement<Boolean>(_PVZReceivingSending_QNAME, Boolean.class, PVZ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "TryOn", scope = PVZ.class)
    public JAXBElement<Boolean> createPVZTryOn(Boolean value) {
        return new JAXBElement<Boolean>(_PVZTryOn_QNAME, Boolean.class, PVZ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "PartialBuyout", scope = PVZ.class)
    public JAXBElement<Boolean> createPVZPartialBuyout(Boolean value) {
        return new JAXBElement<Boolean>(_PVZPartialBuyout_QNAME, Boolean.class, PVZ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "NumberWaybill", scope = OutputSettingsCustomersGoodsReport3 .class)
    public JAXBElement<String> createOutputSettingsCustomersGoodsReport3NumberWaybill(String value) {
        return new JAXBElement<String>(_OutputSettingsCustomersGoodsReport3NumberWaybill_QNAME, String.class, OutputSettingsCustomersGoodsReport3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "NumberOfOrder", scope = OutputSettingsCustomersGoodsReport3 .class)
    public JAXBElement<String> createOutputSettingsCustomersGoodsReport3NumberOfOrder(String value) {
        return new JAXBElement<String>(_OutputSettingsCustomersGoodsReport3NumberOfOrder_QNAME, String.class, OutputSettingsCustomersGoodsReport3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfoWaybillReports }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "InfoWaybill", scope = OutputSettingsCustomersGoodsReport3 .class)
    public JAXBElement<InfoWaybillReports> createOutputSettingsCustomersGoodsReport3InfoWaybill(InfoWaybillReports value) {
        return new JAXBElement<InfoWaybillReports>(_OutputSettingsCustomersGoodsReport3InfoWaybill_QNAME, InfoWaybillReports.class, OutputSettingsCustomersGoodsReport3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfoCargoReports }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "InfoCargo", scope = OutputSettingsCustomersGoodsReport3 .class)
    public JAXBElement<InfoCargoReports> createOutputSettingsCustomersGoodsReport3InfoCargo(InfoCargoReports value) {
        return new JAXBElement<InfoCargoReports>(_OutputSettingsCustomersGoodsReport3InfoCargo_QNAME, InfoCargoReports.class, OutputSettingsCustomersGoodsReport3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfoDeliveryReports }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "InfoDelivery", scope = OutputSettingsCustomersGoodsReport3 .class)
    public JAXBElement<InfoDeliveryReports> createOutputSettingsCustomersGoodsReport3InfoDelivery(InfoDeliveryReports value) {
        return new JAXBElement<InfoDeliveryReports>(_OutputSettingsCustomersGoodsReport3InfoDelivery_QNAME, InfoDeliveryReports.class, OutputSettingsCustomersGoodsReport3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfoTraceReports }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "InfoTrace", scope = OutputSettingsCustomersGoodsReport3 .class)
    public JAXBElement<InfoTraceReports> createOutputSettingsCustomersGoodsReport3InfoTrace(InfoTraceReports value) {
        return new JAXBElement<InfoTraceReports>(_OutputSettingsCustomersGoodsReport3InfoTrace_QNAME, InfoTraceReports.class, OutputSettingsCustomersGoodsReport3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfoStateReports }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "InfoState", scope = OutputSettingsCustomersGoodsReport3 .class)
    public JAXBElement<InfoStateReports> createOutputSettingsCustomersGoodsReport3InfoState(InfoStateReports value) {
        return new JAXBElement<InfoStateReports>(_OutputSettingsCustomersGoodsReport3InfoState_QNAME, InfoStateReports.class, OutputSettingsCustomersGoodsReport3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfoDeliveryTimeReports }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "InfoDeliveryTime", scope = OutputSettingsCustomersGoodsReport3 .class)
    public JAXBElement<InfoDeliveryTimeReports> createOutputSettingsCustomersGoodsReport3InfoDeliveryTime(InfoDeliveryTimeReports value) {
        return new JAXBElement<InfoDeliveryTimeReports>(_OutputSettingsCustomersGoodsReport3InfoDeliveryTime_QNAME, InfoDeliveryTimeReports.class, OutputSettingsCustomersGoodsReport3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "StartReceiving", scope = OpeningHours.class)
    public JAXBElement<XMLGregorianCalendar> createOpeningHoursStartReceiving(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpeningHoursStartReceiving_QNAME, XMLGregorianCalendar.class, OpeningHours.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "EndReceiving", scope = OpeningHours.class)
    public JAXBElement<XMLGregorianCalendar> createOpeningHoursEndReceiving(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpeningHoursEndReceiving_QNAME, XMLGregorianCalendar.class, OpeningHours.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "StartIssue", scope = OpeningHours.class)
    public JAXBElement<XMLGregorianCalendar> createOpeningHoursStartIssue(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpeningHoursStartIssue_QNAME, XMLGregorianCalendar.class, OpeningHours.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "EndIssue", scope = OpeningHours.class)
    public JAXBElement<XMLGregorianCalendar> createOpeningHoursEndIssue(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpeningHoursEndIssue_QNAME, XMLGregorianCalendar.class, OpeningHours.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Info", scope = OpeningHours.class)
    public JAXBElement<String> createOpeningHoursInfo(String value) {
        return new JAXBElement<String>(_TrackingInfoInfo_QNAME, String.class, OpeningHours.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Name", scope = Notifications.class)
    public JAXBElement<String> createNotificationsName(String value) {
        return new JAXBElement<String>(_ProductsName_QNAME, String.class, Notifications.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "SMS", scope = Notifications.class)
    public JAXBElement<Boolean> createNotificationsSMS(Boolean value) {
        return new JAXBElement<Boolean>(_NotificationsSMS_QNAME, Boolean.class, Notifications.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Email", scope = Notifications.class)
    public JAXBElement<Boolean> createNotificationsEmail(Boolean value) {
        return new JAXBElement<Boolean>(_NotificationsEmail_QNAME, Boolean.class, Notifications.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Parent", scope = Message.class)
    public JAXBElement<String> createMessageParent(String value) {
        return new JAXBElement<String>(_MessageParent_QNAME, String.class, Message.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Theme", scope = Message.class)
    public JAXBElement<String> createMessageTheme(String value) {
        return new JAXBElement<String>(_MessageTheme_QNAME, String.class, Message.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Text", scope = Message.class)
    public JAXBElement<String> createMessageText(String value) {
        return new JAXBElement<String>(_MessageText_QNAME, String.class, Message.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ClientContact", scope = Message.class)
    public JAXBElement<String> createMessageClientContact(String value) {
        return new JAXBElement<String>(_WaybillClientContact_QNAME, String.class, Message.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Phone", scope = Message.class)
    public JAXBElement<String> createMessagePhone(String value) {
        return new JAXBElement<String>(_PVZPhone_QNAME, String.class, Message.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "EMail", scope = Message.class)
    public JAXBElement<String> createMessageEMail(String value) {
        return new JAXBElement<String>(_MessageEMail_QNAME, String.class, Message.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Result", scope = Message.class)
    public JAXBElement<String> createMessageResult(String value) {
        return new JAXBElement<String>(_MessageResult_QNAME, String.class, Message.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Name", scope = Materials.class)
    public JAXBElement<String> createMaterialsName(String value) {
        return new JAXBElement<String>(_ProductsName_QNAME, String.class, Materials.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Price", scope = Materials.class)
    public JAXBElement<Float> createMaterialsPrice(Float value) {
        return new JAXBElement<Float>(_ProductsPrice_QNAME, Float.class, Materials.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Qty", scope = Materials.class)
    public JAXBElement<Integer> createMaterialsQty(Integer value) {
        return new JAXBElement<Integer>(_ProductsQty_QNAME, Integer.class, Materials.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Date", scope = InfoWaybillReports.class)
    public JAXBElement<XMLGregorianCalendar> createInfoWaybillReportsDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InfoWaybillReportsDate_QNAME, XMLGregorianCalendar.class, InfoWaybillReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Client", scope = InfoWaybillReports.class)
    public JAXBElement<String> createInfoWaybillReportsClient(String value) {
        return new JAXBElement<String>(_ProductPartiesClient_QNAME, String.class, InfoWaybillReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ClientOfficial", scope = InfoWaybillReports.class)
    public JAXBElement<String> createInfoWaybillReportsClientOfficial(String value) {
        return new JAXBElement<String>(_InfoWaybillReportsClientOfficial_QNAME, String.class, InfoWaybillReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ClientDepartment", scope = InfoWaybillReports.class)
    public JAXBElement<String> createInfoWaybillReportsClientDepartment(String value) {
        return new JAXBElement<String>(_InfoWaybillReportsClientDepartment_QNAME, String.class, InfoWaybillReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ClientProject", scope = InfoWaybillReports.class)
    public JAXBElement<String> createInfoWaybillReportsClientProject(String value) {
        return new JAXBElement<String>(_InfoWaybillReportsClientProject_QNAME, String.class, InfoWaybillReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Sender", scope = InfoWaybillReports.class)
    public JAXBElement<String> createInfoWaybillReportsSender(String value) {
        return new JAXBElement<String>(_WaybillSender_QNAME, String.class, InfoWaybillReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "SenderOfficial", scope = InfoWaybillReports.class)
    public JAXBElement<String> createInfoWaybillReportsSenderOfficial(String value) {
        return new JAXBElement<String>(_InfoWaybillReportsSenderOfficial_QNAME, String.class, InfoWaybillReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "SenderGeography", scope = InfoWaybillReports.class)
    public JAXBElement<String> createInfoWaybillReportsSenderGeography(String value) {
        return new JAXBElement<String>(_WaybillSenderGeography_QNAME, String.class, InfoWaybillReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "SenderAddress", scope = InfoWaybillReports.class)
    public JAXBElement<String> createInfoWaybillReportsSenderAddress(String value) {
        return new JAXBElement<String>(_InfoWaybillReportsSenderAddress_QNAME, String.class, InfoWaybillReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Recipient", scope = InfoWaybillReports.class)
    public JAXBElement<String> createInfoWaybillReportsRecipient(String value) {
        return new JAXBElement<String>(_WaybillRecipient_QNAME, String.class, InfoWaybillReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "RecipientOfficial", scope = InfoWaybillReports.class)
    public JAXBElement<String> createInfoWaybillReportsRecipientOfficial(String value) {
        return new JAXBElement<String>(_WaybillRecipientOfficial_QNAME, String.class, InfoWaybillReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "RecipientGeography", scope = InfoWaybillReports.class)
    public JAXBElement<String> createInfoWaybillReportsRecipientGeography(String value) {
        return new JAXBElement<String>(_WaybillRecipientGeography_QNAME, String.class, InfoWaybillReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "RecipientAddress", scope = InfoWaybillReports.class)
    public JAXBElement<String> createInfoWaybillReportsRecipientAddress(String value) {
        return new JAXBElement<String>(_WaybillRecipientAddress_QNAME, String.class, InfoWaybillReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Urgency", scope = InfoWaybillReports.class)
    public JAXBElement<String> createInfoWaybillReportsUrgency(String value) {
        return new JAXBElement<String>(_PrintDocumentsUrgency_QNAME, String.class, InfoWaybillReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Price", scope = InfoWaybillReports.class)
    public JAXBElement<String> createInfoWaybillReportsPrice(String value) {
        return new JAXBElement<String>(_ProductsPrice_QNAME, String.class, InfoWaybillReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Date", scope = InfoTraceReports.class)
    public JAXBElement<XMLGregorianCalendar> createInfoTraceReportsDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InfoWaybillReportsDate_QNAME, XMLGregorianCalendar.class, InfoTraceReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Code", scope = InfoTraceReports.class)
    public JAXBElement<String> createInfoTraceReportsCode(String value) {
        return new JAXBElement<String>(_InfoTraceReportsCode_QNAME, String.class, InfoTraceReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Date", scope = InfoStateReports.class)
    public JAXBElement<XMLGregorianCalendar> createInfoStateReportsDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InfoWaybillReportsDate_QNAME, XMLGregorianCalendar.class, InfoStateReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Code", scope = InfoStateReports.class)
    public JAXBElement<String> createInfoStateReportsCode(String value) {
        return new JAXBElement<String>(_InfoTraceReportsCode_QNAME, String.class, InfoStateReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CodeDescription", scope = InfoStateReports.class)
    public JAXBElement<String> createInfoStateReportsCodeDescription(String value) {
        return new JAXBElement<String>(_InfoStateReportsCodeDescription_QNAME, String.class, InfoStateReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "DeliveryPlan", scope = InfoDeliveryTimeReports.class)
    public JAXBElement<Integer> createInfoDeliveryTimeReportsDeliveryPlan(Integer value) {
        return new JAXBElement<Integer>(_InfoDeliveryTimeReportsDeliveryPlan_QNAME, Integer.class, InfoDeliveryTimeReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "DeliveryFact", scope = InfoDeliveryTimeReports.class)
    public JAXBElement<Integer> createInfoDeliveryTimeReportsDeliveryFact(Integer value) {
        return new JAXBElement<Integer>(_InfoDeliveryTimeReportsDeliveryFact_QNAME, Integer.class, InfoDeliveryTimeReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Count", scope = InfoDeliveryTimeReports.class)
    public JAXBElement<Integer> createInfoDeliveryTimeReportsCount(Integer value) {
        return new JAXBElement<Integer>(_InfoDeliveryTimeReportsCount_QNAME, Integer.class, InfoDeliveryTimeReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "State", scope = InfoDeliveryTimeReports.class)
    public JAXBElement<String> createInfoDeliveryTimeReportsState(String value) {
        return new JAXBElement<String>(_WaybillState_QNAME, String.class, InfoDeliveryTimeReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "DeliveryDate", scope = InfoDeliveryReports.class)
    public JAXBElement<XMLGregorianCalendar> createInfoDeliveryReportsDeliveryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WaybillDeliveryDate_QNAME, XMLGregorianCalendar.class, InfoDeliveryReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "DeliveryTime", scope = InfoDeliveryReports.class)
    public JAXBElement<String> createInfoDeliveryReportsDeliveryTime(String value) {
        return new JAXBElement<String>(_InfoDeliveryReportsDeliveryTime_QNAME, String.class, InfoDeliveryReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "FIORecipient", scope = InfoDeliveryReports.class)
    public JAXBElement<String> createInfoDeliveryReportsFIORecipient(String value) {
        return new JAXBElement<String>(_InfoDeliveryReportsFIORecipient_QNAME, String.class, InfoDeliveryReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Weight", scope = InfoCargoReports.class)
    public JAXBElement<Float> createInfoCargoReportsWeight(Float value) {
        return new JAXBElement<Float>(_InfoCargoReportsWeight_QNAME, Float.class, InfoCargoReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "VolumeWeight", scope = InfoCargoReports.class)
    public JAXBElement<Float> createInfoCargoReportsVolumeWeight(Float value) {
        return new JAXBElement<Float>(_InfoCargoReportsVolumeWeight_QNAME, Float.class, InfoCargoReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Qty", scope = InfoCargoReports.class)
    public JAXBElement<Integer> createInfoCargoReportsQty(Integer value) {
        return new JAXBElement<Integer>(_ProductsQty_QNAME, Integer.class, InfoCargoReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Dimensions", scope = InfoCargoReports.class)
    public JAXBElement<String> createInfoCargoReportsDimensions(String value) {
        return new JAXBElement<String>(_InfoCargoReportsDimensions_QNAME, String.class, InfoCargoReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "TypeOfCargo", scope = InfoCargoReports.class)
    public JAXBElement<String> createInfoCargoReportsTypeOfCargo(String value) {
        return new JAXBElement<String>(_WaybillTypeOfCargo_QNAME, String.class, InfoCargoReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "DescriptionCargo", scope = InfoCargoReports.class)
    public JAXBElement<String> createInfoCargoReportsDescriptionCargo(String value) {
        return new JAXBElement<String>(_InfoCargoReportsDescriptionCargo_QNAME, String.class, InfoCargoReports.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Russia", scope = GeographyProperties.class)
    public JAXBElement<Boolean> createGeographyPropertiesRussia(Boolean value) {
        return new JAXBElement<Boolean>(_GeographyPropertiesRussia_QNAME, Boolean.class, GeographyProperties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "LocatedInUSSR", scope = GeographyProperties.class)
    public JAXBElement<Boolean> createGeographyPropertiesLocatedInUSSR(Boolean value) {
        return new JAXBElement<Boolean>(_GeographyPropertiesLocatedInUSSR_QNAME, Boolean.class, GeographyProperties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "LocationInfo", scope = GeographyProperties.class)
    public JAXBElement<String> createGeographyPropertiesLocationInfo(String value) {
        return new JAXBElement<String>(_GeographyPropertiesLocationInfo_QNAME, String.class, GeographyProperties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CalculatorInfo", scope = GeographyProperties.class)
    public JAXBElement<String> createGeographyPropertiesCalculatorInfo(String value) {
        return new JAXBElement<String>(_GeographyPropertiesCalculatorInfo_QNAME, String.class, GeographyProperties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CountryGUID", scope = GeographyProperties.class)
    public JAXBElement<String> createGeographyPropertiesCountryGUID(String value) {
        return new JAXBElement<String>(_GeographyPropertiesCountryGUID_QNAME, String.class, GeographyProperties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Priority", scope = GeographyProperties.class)
    public JAXBElement<Integer> createGeographyPropertiesPriority(Integer value) {
        return new JAXBElement<Integer>(_GeographyPropertiesPriority_QNAME, Integer.class, GeographyProperties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Region", scope = GeographyProperties.class)
    public JAXBElement<String> createGeographyPropertiesRegion(String value) {
        return new JAXBElement<String>(_GeographyPropertiesRegion_QNAME, String.class, GeographyProperties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "District", scope = GeographyProperties.class)
    public JAXBElement<String> createGeographyPropertiesDistrict(String value) {
        return new JAXBElement<String>(_GeographyPropertiesDistrict_QNAME, String.class, GeographyProperties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Lang", scope = Geo.class)
    public JAXBElement<String> createGeoLang(String value) {
        return new JAXBElement<String>(_GeoLang_QNAME, String.class, Geo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Lat", scope = Geo.class)
    public JAXBElement<String> createGeoLat(String value) {
        return new JAXBElement<String>(_GeoLat_QNAME, String.class, Geo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Weight", scope = GMH.class)
    public JAXBElement<Float> createGMHWeight(Float value) {
        return new JAXBElement<Float>(_InfoCargoReportsWeight_QNAME, Float.class, GMH.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "VolumeWeight", scope = GMH.class)
    public JAXBElement<Float> createGMHVolumeWeight(Float value) {
        return new JAXBElement<Float>(_InfoCargoReportsVolumeWeight_QNAME, Float.class, GMH.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Volume", scope = GMH.class)
    public JAXBElement<Float> createGMHVolume(Float value) {
        return new JAXBElement<Float>(_WaybillVolume_QNAME, Float.class, GMH.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Length", scope = GMH.class)
    public JAXBElement<Float> createGMHLength(Float value) {
        return new JAXBElement<Float>(_GMHLength_QNAME, Float.class, GMH.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Width", scope = GMH.class)
    public JAXBElement<Float> createGMHWidth(Float value) {
        return new JAXBElement<Float>(_GMHWidth_QNAME, Float.class, GMH.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Height", scope = GMH.class)
    public JAXBElement<Float> createGMHHeight(Float value) {
        return new JAXBElement<Float>(_GMHHeight_QNAME, Float.class, GMH.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ClientNumber", scope = GMH.class)
    public JAXBElement<String> createGMHClientNumber(String value) {
        return new JAXBElement<String>(_WaybillClientNumber_QNAME, String.class, GMH.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ClientCode", scope = GMH.class)
    public JAXBElement<String> createGMHClientCode(String value) {
        return new JAXBElement<String>(_GMHClientCode_QNAME, String.class, GMH.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Value", scope = Element.class)
    public JAXBElement<Object> createElementValue(Object value) {
        return new JAXBElement<Object>(_ElementValue_QNAME, Object.class, Element.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ValueType", scope = Element.class)
    public JAXBElement<String> createElementValueType(String value) {
        return new JAXBElement<String>(_ElementValueType_QNAME, String.class, Element.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Document", scope = DocumentsPhoto.class)
    public JAXBElement<String> createDocumentsPhotoDocument(String value) {
        return new JAXBElement<String>(_DocumentsPhotoDocument_QNAME, String.class, DocumentsPhoto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Required", scope = DocumentsPhoto.class)
    public JAXBElement<Boolean> createDocumentsPhotoRequired(Boolean value) {
        return new JAXBElement<Boolean>(_DocumentsPhotoRequired_QNAME, Boolean.class, DocumentsPhoto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "WaybillNumber", scope = DistributionWaybill.class)
    public JAXBElement<String> createDistributionWaybillWaybillNumber(String value) {
        return new JAXBElement<String>(_WaybillWaybillNumber_QNAME, String.class, DistributionWaybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DestinationInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Recipient", scope = DistributionWaybill.class)
    public JAXBElement<DestinationInformation> createDistributionWaybillRecipient(DestinationInformation value) {
        return new JAXBElement<DestinationInformation>(_WaybillRecipient_QNAME, DestinationInformation.class, DistributionWaybill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Client", scope = DestinationInformation.class)
    public JAXBElement<String> createDestinationInformationClient(String value) {
        return new JAXBElement<String>(_ProductPartiesClient_QNAME, String.class, DestinationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Official", scope = DestinationInformation.class)
    public JAXBElement<String> createDestinationInformationOfficial(String value) {
        return new JAXBElement<String>(_ReestrWaybillOfficial_QNAME, String.class, DestinationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DestinationAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Address", scope = DestinationInformation.class)
    public JAXBElement<DestinationAddress> createDestinationInformationAddress(DestinationAddress value) {
        return new JAXBElement<DestinationAddress>(_PVZAddress_QNAME, DestinationAddress.class, DestinationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "SubwayStation", scope = DestinationInformation.class)
    public JAXBElement<String> createDestinationInformationSubwayStation(String value) {
        return new JAXBElement<String>(_DestinationInformationSubwayStation_QNAME, String.class, DestinationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Phone", scope = DestinationInformation.class)
    public JAXBElement<String> createDestinationInformationPhone(String value) {
        return new JAXBElement<String>(_PVZPhone_QNAME, String.class, DestinationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "EMail", scope = DestinationInformation.class)
    public JAXBElement<String> createDestinationInformationEMail(String value) {
        return new JAXBElement<String>(_MessageEMail_QNAME, String.class, DestinationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Info", scope = DestinationInformation.class)
    public JAXBElement<String> createDestinationInformationInfo(String value) {
        return new JAXBElement<String>(_TrackingInfoInfo_QNAME, String.class, DestinationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Urgency", scope = DestinationInformation.class)
    public JAXBElement<String> createDestinationInformationUrgency(String value) {
        return new JAXBElement<String>(_PrintDocumentsUrgency_QNAME, String.class, DestinationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cargo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Cargo", scope = DestinationInformation.class)
    public JAXBElement<Cargo> createDestinationInformationCargo(Cargo value) {
        return new JAXBElement<Cargo>(_PrintDocumentsCargo_QNAME, Cargo.class, DestinationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ProductsProcessingAction", scope = DestinationInformation.class)
    public JAXBElement<String> createDestinationInformationProductsProcessingAction(String value) {
        return new JAXBElement<String>(_DestinationInformationProductsProcessingAction_QNAME, String.class, DestinationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "StoreDependsOnDestination", scope = DestinationInformation.class)
    public JAXBElement<Boolean> createDestinationInformationStoreDependsOnDestination(Boolean value) {
        return new JAXBElement<Boolean>(_DestinationInformationStoreDependsOnDestination_QNAME, Boolean.class, DestinationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Geography", scope = DestinationAddress.class)
    public JAXBElement<String> createDestinationAddressGeography(String value) {
        return new JAXBElement<String>(_PVZGeography_QNAME, String.class, DestinationAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Street", scope = DestinationAddress.class)
    public JAXBElement<String> createDestinationAddressStreet(String value) {
        return new JAXBElement<String>(_DestinationAddressStreet_QNAME, String.class, DestinationAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "TypeOfHome", scope = DestinationAddress.class)
    public JAXBElement<String> createDestinationAddressTypeOfHome(String value) {
        return new JAXBElement<String>(_DestinationAddressTypeOfHome_QNAME, String.class, DestinationAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Home", scope = DestinationAddress.class)
    public JAXBElement<String> createDestinationAddressHome(String value) {
        return new JAXBElement<String>(_DestinationAddressHome_QNAME, String.class, DestinationAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "TypeOfBuilding", scope = DestinationAddress.class)
    public JAXBElement<String> createDestinationAddressTypeOfBuilding(String value) {
        return new JAXBElement<String>(_DestinationAddressTypeOfBuilding_QNAME, String.class, DestinationAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Building", scope = DestinationAddress.class)
    public JAXBElement<String> createDestinationAddressBuilding(String value) {
        return new JAXBElement<String>(_DestinationAddressBuilding_QNAME, String.class, DestinationAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "TypeOfApartment", scope = DestinationAddress.class)
    public JAXBElement<String> createDestinationAddressTypeOfApartment(String value) {
        return new JAXBElement<String>(_DestinationAddressTypeOfApartment_QNAME, String.class, DestinationAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Apartment", scope = DestinationAddress.class)
    public JAXBElement<String> createDestinationAddressApartment(String value) {
        return new JAXBElement<String>(_DestinationAddressApartment_QNAME, String.class, DestinationAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Index", scope = DestinationAddress.class)
    public JAXBElement<String> createDestinationAddressIndex(String value) {
        return new JAXBElement<String>(_DestinationAddressIndex_QNAME, String.class, DestinationAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Info", scope = DestinationAddress.class)
    public JAXBElement<String> createDestinationAddressInfo(String value) {
        return new JAXBElement<String>(_TrackingInfoInfo_QNAME, String.class, DestinationAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Comment", scope = DestinationAddress.class)
    public JAXBElement<String> createDestinationAddressComment(String value) {
        return new JAXBElement<String>(_WaybillComment_QNAME, String.class, DestinationAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Country", scope = DestinationAddress.class)
    public JAXBElement<String> createDestinationAddressCountry(String value) {
        return new JAXBElement<String>(_DestinationAddressCountry_QNAME, String.class, DestinationAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Region", scope = DestinationAddress.class)
    public JAXBElement<String> createDestinationAddressRegion(String value) {
        return new JAXBElement<String>(_GeographyPropertiesRegion_QNAME, String.class, DestinationAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Disrcict", scope = DestinationAddress.class)
    public JAXBElement<String> createDestinationAddressDisrcict(String value) {
        return new JAXBElement<String>(_DestinationAddressDisrcict_QNAME, String.class, DestinationAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "FromGeography", scope = Costings.class)
    public JAXBElement<String> createCostingsFromGeography(String value) {
        return new JAXBElement<String>(_CostingsFromGeography_QNAME, String.class, Costings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ToGeography", scope = Costings.class)
    public JAXBElement<String> createCostingsToGeography(String value) {
        return new JAXBElement<String>(_CostingsToGeography_QNAME, String.class, Costings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Urgency", scope = Costings.class)
    public JAXBElement<String> createCostingsUrgency(String value) {
        return new JAXBElement<String>(_PrintDocumentsUrgency_QNAME, String.class, Costings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "UrgencyDescription", scope = Costings.class)
    public JAXBElement<String> createCostingsUrgencyDescription(String value) {
        return new JAXBElement<String>(_CostingsUrgencyDescription_QNAME, String.class, Costings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Weight", scope = Costings.class)
    public JAXBElement<Float> createCostingsWeight(Float value) {
        return new JAXBElement<Float>(_InfoCargoReportsWeight_QNAME, Float.class, Costings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "DeliveryPeriod", scope = Costings.class)
    public JAXBElement<String> createCostingsDeliveryPeriod(String value) {
        return new JAXBElement<String>(_CostingsDeliveryPeriod_QNAME, String.class, Costings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "MinPeriod", scope = Costings.class)
    public JAXBElement<Float> createCostingsMinPeriod(Float value) {
        return new JAXBElement<Float>(_CostingsMinPeriod_QNAME, Float.class, Costings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "MaxPeriod", scope = Costings.class)
    public JAXBElement<Float> createCostingsMaxPeriod(Float value) {
        return new JAXBElement<Float>(_CostingsMaxPeriod_QNAME, Float.class, Costings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "TypeOfCargo", scope = Costings.class)
    public JAXBElement<String> createCostingsTypeOfCargo(String value) {
        return new JAXBElement<String>(_WaybillTypeOfCargo_QNAME, String.class, Costings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Tariff", scope = CostedTariff.class)
    public JAXBElement<String> createCostedTariffTariff(String value) {
        return new JAXBElement<String>(_CostedTariffTariff_QNAME, String.class, CostedTariff.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Total", scope = CostedTariff.class)
    public JAXBElement<Float> createCostedTariffTotal(Float value) {
        return new JAXBElement<Float>(_WaybillTotal_QNAME, Float.class, CostedTariff.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "TotalCurrency", scope = CostedTariff.class)
    public JAXBElement<String> createCostedTariffTotalCurrency(String value) {
        return new JAXBElement<String>(_CostedTariffTotalCurrency_QNAME, String.class, CostedTariff.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "TariffGuid", scope = CostedTariff.class)
    public JAXBElement<String> createCostedTariffTariffGuid(String value) {
        return new JAXBElement<String>(_CostedTariffTariffGuid_QNAME, String.class, CostedTariff.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Key", scope = Correspondence.class)
    public JAXBElement<String> createCorrespondenceKey(String value) {
        return new JAXBElement<String>(_CorrespondenceKey_QNAME, String.class, Correspondence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Value", scope = Correspondence.class)
    public JAXBElement<String> createCorrespondenceValue(String value) {
        return new JAXBElement<String>(_ElementValue_QNAME, String.class, Correspondence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Information", scope = Correspondence.class)
    public JAXBElement<String> createCorrespondenceInformation(String value) {
        return new JAXBElement<String>(_CorrespondenceInformation_QNAME, String.class, Correspondence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Default", scope = Correspondence.class)
    public JAXBElement<Boolean> createCorrespondenceDefault(Boolean value) {
        return new JAXBElement<Boolean>(_SructTypeDefault_QNAME, Boolean.class, Correspondence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Codes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Codes", scope = Correspondence.class)
    public JAXBElement<Codes> createCorrespondenceCodes(Codes value) {
        return new JAXBElement<Codes>(_CorrespondenceCodes_QNAME, Codes.class, Correspondence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "BankProperties", scope = Correspondence.class)
    public JAXBElement<BankProperties> createCorrespondenceBankProperties(BankProperties value) {
        return new JAXBElement<BankProperties>(_CorrespondenceBankProperties_QNAME, BankProperties.class, Correspondence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "DocumentProperties", scope = Correspondence.class)
    public JAXBElement<DocumentProperties> createCorrespondenceDocumentProperties(DocumentProperties value) {
        return new JAXBElement<DocumentProperties>(_CorrespondenceDocumentProperties_QNAME, DocumentProperties.class, Correspondence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeographyProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "GeographyProperties", scope = Correspondence.class)
    public JAXBElement<GeographyProperties> createCorrespondenceGeographyProperties(GeographyProperties value) {
        return new JAXBElement<GeographyProperties>(_CorrespondenceGeographyProperties_QNAME, GeographyProperties.class, Correspondence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TariffProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "TariffProperties", scope = Correspondence.class)
    public JAXBElement<TariffProperties> createCorrespondenceTariffProperties(TariffProperties value) {
        return new JAXBElement<TariffProperties>(_CorrespondenceTariffProperties_QNAME, TariffProperties.class, Correspondence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Erase", scope = Correspondence.class)
    public JAXBElement<Boolean> createCorrespondenceErase(Boolean value) {
        return new JAXBElement<Boolean>(_CorrespondenceErase_QNAME, Boolean.class, Correspondence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackageProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "PackageProperties", scope = Correspondence.class)
    public JAXBElement<PackageProperties> createCorrespondencePackageProperties(PackageProperties value) {
        return new JAXBElement<PackageProperties>(_CorrespondencePackageProperties_QNAME, PackageProperties.class, Correspondence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Contacts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ContactsProperties", scope = Correspondence.class)
    public JAXBElement<Contacts> createCorrespondenceContactsProperties(Contacts value) {
        return new JAXBElement<Contacts>(_CorrespondenceContactsProperties_QNAME, Contacts.class, Correspondence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductParties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ProductParties", scope = Correspondence.class)
    public JAXBElement<ProductParties> createCorrespondenceProductParties(ProductParties value) {
        return new JAXBElement<ProductParties>(_CorrespondenceProductParties_QNAME, ProductParties.class, Correspondence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientProducts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ClientProducts", scope = Correspondence.class)
    public JAXBElement<ClientProducts> createCorrespondenceClientProducts(ClientProducts value) {
        return new JAXBElement<ClientProducts>(_CorrespondenceClientProducts_QNAME, ClientProducts.class, Correspondence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Code", scope = Codes.class)
    public JAXBElement<String> createCodesCode(String value) {
        return new JAXBElement<String>(_InfoTraceReportsCode_QNAME, String.class, Codes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Level", scope = Codes.class)
    public JAXBElement<Integer> createCodesLevel(Integer value) {
        return new JAXBElement<Integer>(_CodesLevel_QNAME, Integer.class, Codes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ParentCode", scope = Codes.class)
    public JAXBElement<String> createCodesParentCode(String value) {
        return new JAXBElement<String>(_CodesParentCode_QNAME, String.class, Codes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "FIAS", scope = Codes.class)
    public JAXBElement<String> createCodesFIAS(String value) {
        return new JAXBElement<String>(_CodesFIAS_QNAME, String.class, Codes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Client", scope = ClientProducts.class)
    public JAXBElement<String> createClientProductsClient(String value) {
        return new JAXBElement<String>(_ProductPartiesClient_QNAME, String.class, ClientProducts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Fullname", scope = ClientProducts.class)
    public JAXBElement<String> createClientProductsFullname(String value) {
        return new JAXBElement<String>(_ClientProductsFullname_QNAME, String.class, ClientProducts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ID", scope = ClientProducts.class)
    public JAXBElement<String> createClientProductsID(String value) {
        return new JAXBElement<String>(_ProductSerialNumberID_QNAME, String.class, ClientProducts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Article", scope = ClientProducts.class)
    public JAXBElement<String> createClientProductsArticle(String value) {
        return new JAXBElement<String>(_ProductsArticle_QNAME, String.class, ClientProducts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Project", scope = ClientProducts.class)
    public JAXBElement<String> createClientProductsProject(String value) {
        return new JAXBElement<String>(_ProductPartiesProject_QNAME, String.class, ClientProducts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "BaseUnit", scope = ClientProducts.class)
    public JAXBElement<String> createClientProductsBaseUnit(String value) {
        return new JAXBElement<String>(_ClientProductsBaseUnit_QNAME, String.class, ClientProducts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Unit", scope = ClientProducts.class)
    public JAXBElement<String> createClientProductsUnit(String value) {
        return new JAXBElement<String>(_ProductPackagesUnit_QNAME, String.class, ClientProducts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Party", scope = ClientProducts.class)
    public JAXBElement<Boolean> createClientProductsParty(Boolean value) {
        return new JAXBElement<Boolean>(_ProductsParty_QNAME, Boolean.class, ClientProducts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Kit", scope = ClientProducts.class)
    public JAXBElement<Boolean> createClientProductsKit(Boolean value) {
        return new JAXBElement<Boolean>(_ClientProductsKit_QNAME, Boolean.class, ClientProducts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "SerialNumber", scope = ClientProducts.class)
    public JAXBElement<Boolean> createClientProductsSerialNumber(Boolean value) {
        return new JAXBElement<Boolean>(_ProductsSerialNumber_QNAME, Boolean.class, ClientProducts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Specifications", scope = ClientProducts.class)
    public JAXBElement<Boolean> createClientProductsSpecifications(Boolean value) {
        return new JAXBElement<Boolean>(_ClientProductsSpecifications_QNAME, Boolean.class, ClientProducts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Name", scope = ClientProducts.class)
    public JAXBElement<String> createClientProductsName(String value) {
        return new JAXBElement<String>(_ProductsName_QNAME, String.class, ClientProducts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Description", scope = ClientProducts.class)
    public JAXBElement<String> createClientProductsDescription(String value) {
        return new JAXBElement<String>(_ProblemDescription_QNAME, String.class, ClientProducts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "PartyGUID", scope = ClientProducts.class)
    public JAXBElement<String> createClientProductsPartyGUID(String value) {
        return new JAXBElement<String>(_ClientProductsPartyGUID_QNAME, String.class, ClientProducts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "QTY", scope = ClientProducts.class)
    public JAXBElement<Integer> createClientProductsQTY(Integer value) {
        return new JAXBElement<Integer>(_ClientProductsQTY_QNAME, Integer.class, ClientProducts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Store", scope = ClientProducts.class)
    public JAXBElement<String> createClientProductsStore(String value) {
        return new JAXBElement<String>(_UserDataStore_QNAME, String.class, ClientProducts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "VATRate", scope = ClientProducts.class)
    public JAXBElement<Integer> createClientProductsVATRate(Integer value) {
        return new JAXBElement<Integer>(_ProductsVATRate_QNAME, Integer.class, ClientProducts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Service", scope = ClientProducts.class)
    public JAXBElement<Boolean> createClientProductsService(Boolean value) {
        return new JAXBElement<Boolean>(_ClientProductsService_QNAME, Boolean.class, ClientProducts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "GUID", scope = ClientProducts.class)
    public JAXBElement<String> createClientProductsGUID(String value) {
        return new JAXBElement<String>(_SructTypeGUID_QNAME, String.class, ClientProducts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "StoreGUID", scope = ClientProducts.class)
    public JAXBElement<String> createClientProductsStoreGUID(String value) {
        return new JAXBElement<String>(_ClientProductsStoreGUID_QNAME, String.class, ClientProducts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Category", scope = ClientProducts.class)
    public JAXBElement<String> createClientProductsCategory(String value) {
        return new JAXBElement<String>(_ClientProductsCategory_QNAME, String.class, ClientProducts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ErrorInfo", scope = ClientInfo.class)
    public JAXBElement<String> createClientInfoErrorInfo(String value) {
        return new JAXBElement<String>(_ResultArrayPhotoErrorInfo_QNAME, String.class, ClientInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Length", scope = CargoPackages.class)
    public JAXBElement<Float> createCargoPackagesLength(Float value) {
        return new JAXBElement<Float>(_GMHLength_QNAME, Float.class, CargoPackages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Width", scope = CargoPackages.class)
    public JAXBElement<Float> createCargoPackagesWidth(Float value) {
        return new JAXBElement<Float>(_GMHWidth_QNAME, Float.class, CargoPackages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Height", scope = CargoPackages.class)
    public JAXBElement<Float> createCargoPackagesHeight(Float value) {
        return new JAXBElement<Float>(_GMHHeight_QNAME, Float.class, CargoPackages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Package", scope = CargoPackages.class)
    public JAXBElement<String> createCargoPackagesPackage(String value) {
        return new JAXBElement<String>(_ProductsPackage_QNAME, String.class, CargoPackages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Weight", scope = CargoPackages.class)
    public JAXBElement<Float> createCargoPackagesWeight(Float value) {
        return new JAXBElement<Float>(_InfoCargoReportsWeight_QNAME, Float.class, CargoPackages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "VolumeWeight", scope = CargoPackages.class)
    public JAXBElement<Float> createCargoPackagesVolumeWeight(Float value) {
        return new JAXBElement<Float>(_InfoCargoReportsVolumeWeight_QNAME, Float.class, CargoPackages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "PackageQty", scope = CargoPackages.class)
    public JAXBElement<Integer> createCargoPackagesPackageQty(Integer value) {
        return new JAXBElement<Integer>(_ProductsPackageQty_QNAME, Integer.class, CargoPackages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "PackageID", scope = CargoPackages.class)
    public JAXBElement<String> createCargoPackagesPackageID(String value) {
        return new JAXBElement<String>(_CargoPackagesPackageID_QNAME, String.class, CargoPackages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CargoDescription", scope = Cargo.class)
    public JAXBElement<String> createCargoCargoDescription(String value) {
        return new JAXBElement<String>(_WaybillCargoDescription_QNAME, String.class, Cargo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "InsuranceRate", scope = Cargo.class)
    public JAXBElement<Float> createCargoInsuranceRate(Float value) {
        return new JAXBElement<Float>(_CargoInsuranceRate_QNAME, Float.class, Cargo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "InsuranceRateCurrency", scope = Cargo.class)
    public JAXBElement<String> createCargoInsuranceRateCurrency(String value) {
        return new JAXBElement<String>(_CargoInsuranceRateCurrency_QNAME, String.class, Cargo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "DeclaredValueRate", scope = Cargo.class)
    public JAXBElement<Float> createCargoDeclaredValueRate(Float value) {
        return new JAXBElement<Float>(_CargoDeclaredValueRate_QNAME, Float.class, Cargo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "DeclaredValueRateCurrency", scope = Cargo.class)
    public JAXBElement<String> createCargoDeclaredValueRateCurrency(String value) {
        return new JAXBElement<String>(_CargoDeclaredValueRateCurrency_QNAME, String.class, Cargo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ValueForCustomsPurposes", scope = Cargo.class)
    public JAXBElement<Float> createCargoValueForCustomsPurposes(Float value) {
        return new JAXBElement<Float>(_WaybillValueForCustomsPurposes_QNAME, Float.class, Cargo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ValueForCustomsPurposesCurrency", scope = Cargo.class)
    public JAXBElement<String> createCargoValueForCustomsPurposesCurrency(String value) {
        return new JAXBElement<String>(_WaybillValueForCustomsPurposesCurrency_QNAME, String.class, Cargo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "PackageID", scope = Cargo.class)
    public JAXBElement<String> createCargoPackageID(String value) {
        return new JAXBElement<String>(_CargoPackagesPackageID_QNAME, String.class, Cargo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CODDescription", scope = Cargo.class)
    public JAXBElement<String> createCargoCODDescription(String value) {
        return new JAXBElement<String>(_CargoCODDescription_QNAME, String.class, Cargo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "SenderShippingCost", scope = Cargo.class)
    public JAXBElement<Float> createCargoSenderShippingCost(Float value) {
        return new JAXBElement<Float>(_CargoSenderShippingCost_QNAME, Float.class, Cargo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CargoDescriptionWhithoutType", scope = Cargo.class)
    public JAXBElement<String> createCargoCargoDescriptionWhithoutType(String value) {
        return new JAXBElement<String>(_CargoCargoDescriptionWhithoutType_QNAME, String.class, Cargo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "InsuranceRateFee", scope = Cargo.class)
    public JAXBElement<Float> createCargoInsuranceRateFee(Float value) {
        return new JAXBElement<Float>(_CargoInsuranceRateFee_QNAME, Float.class, Cargo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "InsuranceRateFeeCurrency", scope = Cargo.class)
    public JAXBElement<String> createCargoInsuranceRateFeeCurrency(String value) {
        return new JAXBElement<String>(_CargoInsuranceRateFeeCurrency_QNAME, String.class, Cargo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "TypeOfCargo", scope = Calc2 .class)
    public JAXBElement<String> createCalc2TypeOfCargo(String value) {
        return new JAXBElement<String>(_WaybillTypeOfCargo_QNAME, String.class, Calc2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Urgency", scope = Calc2 .class)
    public JAXBElement<String> createCalc2Urgency(String value) {
        return new JAXBElement<String>(_PrintDocumentsUrgency_QNAME, String.class, Calc2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Service", scope = Calc2 .class)
    public JAXBElement<String> createCalc2Service(String value) {
        return new JAXBElement<String>(_ClientProductsService_QNAME, String.class, Calc2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Address", scope = BankProperties.class)
    public JAXBElement<String> createBankPropertiesAddress(String value) {
        return new JAXBElement<String>(_PVZAddress_QNAME, String.class, BankProperties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "City", scope = BankProperties.class)
    public JAXBElement<String> createBankPropertiesCity(String value) {
        return new JAXBElement<String>(_BankPropertiesCity_QNAME, String.class, BankProperties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CorrespondentAccount", scope = BankProperties.class)
    public JAXBElement<String> createBankPropertiesCorrespondentAccount(String value) {
        return new JAXBElement<String>(_BankPropertiesCorrespondentAccount_QNAME, String.class, BankProperties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Phones", scope = BankProperties.class)
    public JAXBElement<String> createBankPropertiesPhones(String value) {
        return new JAXBElement<String>(_BankPropertiesPhones_QNAME, String.class, BankProperties.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ErrorInfo", scope = ArrayCostings.class)
    public JAXBElement<String> createArrayCostingsErrorInfo(String value) {
        return new JAXBElement<String>(_ResultArrayPhotoErrorInfo_QNAME, String.class, ArrayCostings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Code", scope = Address.class)
    public JAXBElement<String> createAddressCode(String value) {
        return new JAXBElement<String>(_InfoTraceReportsCode_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Name", scope = Address.class)
    public JAXBElement<String> createAddressName(String value) {
        return new JAXBElement<String>(_ProductsName_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Official", scope = Address.class)
    public JAXBElement<String> createAddressOfficial(String value) {
        return new JAXBElement<String>(_ReestrWaybillOfficial_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "FIO", scope = Address.class)
    public JAXBElement<String> createAddressFIO(String value) {
        return new JAXBElement<String>(_AddressFIO_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Geography", scope = Address.class)
    public JAXBElement<String> createAddressGeography(String value) {
        return new JAXBElement<String>(_PVZGeography_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "DestAddress", scope = Address.class)
    public JAXBElement<String> createAddressDestAddress(String value) {
        return new JAXBElement<String>(_AddressDestAddress_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "SubwayStation", scope = Address.class)
    public JAXBElement<String> createAddressSubwayStation(String value) {
        return new JAXBElement<String>(_DestinationInformationSubwayStation_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Phone", scope = Address.class)
    public JAXBElement<String> createAddressPhone(String value) {
        return new JAXBElement<String>(_PVZPhone_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "EMail", scope = Address.class)
    public JAXBElement<String> createAddressEMail(String value) {
        return new JAXBElement<String>(_MessageEMail_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Info", scope = Address.class)
    public JAXBElement<String> createAddressInfo(String value) {
        return new JAXBElement<String>(_TrackingInfoInfo_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Department", scope = Address.class)
    public JAXBElement<String> createAddressDepartment(String value) {
        return new JAXBElement<String>(_ProductPartiesDepartment_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Project", scope = Address.class)
    public JAXBElement<String> createAddressProject(String value) {
        return new JAXBElement<String>(_ProductPartiesProject_QNAME, String.class, Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CanChangePassword", scope = AccessClient.class)
    public JAXBElement<Boolean> createAccessClientCanChangePassword(Boolean value) {
        return new JAXBElement<Boolean>(_AccessClientCanChangePassword_QNAME, Boolean.class, AccessClient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CanSeeAnyDocuments", scope = AccessClient.class)
    public JAXBElement<Boolean> createAccessClientCanSeeAnyDocuments(Boolean value) {
        return new JAXBElement<Boolean>(_AccessClientCanSeeAnyDocuments_QNAME, Boolean.class, AccessClient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "WorkOwnDocumentOnly", scope = AccessClient.class)
    public JAXBElement<Boolean> createAccessClientWorkOwnDocumentOnly(Boolean value) {
        return new JAXBElement<Boolean>(_AccessClientWorkOwnDocumentOnly_QNAME, Boolean.class, AccessClient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "UseTemplateDocuments", scope = AccessClient.class)
    public JAXBElement<Boolean> createAccessClientUseTemplateDocuments(Boolean value) {
        return new JAXBElement<Boolean>(_AccessClientUseTemplateDocuments_QNAME, Boolean.class, AccessClient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ReportAgentCod", scope = AccessClient.class)
    public JAXBElement<Boolean> createAccessClientReportAgentCod(Boolean value) {
        return new JAXBElement<Boolean>(_AccessClientReportAgentCod_QNAME, Boolean.class, AccessClient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "GetScan", scope = AccessClient.class)
    public JAXBElement<Boolean> createAccessClientGetScan(Boolean value) {
        return new JAXBElement<Boolean>(_AccessClientGetScan_QNAME, Boolean.class, AccessClient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "GetPhotoGoods", scope = AccessClient.class)
    public JAXBElement<Boolean> createAccessClientGetPhotoGoods(Boolean value) {
        return new JAXBElement<Boolean>(_AccessClientGetPhotoGoods_QNAME, Boolean.class, AccessClient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "UseAddressFromBookOnly", scope = AccessClient.class)
    public JAXBElement<Boolean> createAccessClientUseAddressFromBookOnly(Boolean value) {
        return new JAXBElement<Boolean>(_AccessClientUseAddressFromBookOnly_QNAME, Boolean.class, AccessClient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Error", scope = ArrayPVZ.class)
    public JAXBElement<Boolean> createArrayPVZError(Boolean value) {
        return new JAXBElement<Boolean>(_ResultArrayPhotoError_QNAME, Boolean.class, ArrayPVZ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ErrorInfo", scope = ArrayPVZ.class)
    public JAXBElement<String> createArrayPVZErrorInfo(String value) {
        return new JAXBElement<String>(_ResultArrayPhotoErrorInfo_QNAME, String.class, ArrayPVZ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Error", scope = ArrayStruct.class)
    public JAXBElement<Boolean> createArrayStructError(Boolean value) {
        return new JAXBElement<Boolean>(_ResultArrayPhotoError_QNAME, Boolean.class, ArrayStruct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ErrorInfo", scope = ArrayStruct.class)
    public JAXBElement<String> createArrayStructErrorInfo(String value) {
        return new JAXBElement<String>(_ResultArrayPhotoErrorInfo_QNAME, String.class, ArrayStruct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Guid", scope = Contacts.class)
    public JAXBElement<String> createContactsGuid(String value) {
        return new JAXBElement<String>(_ProductSerialNumberGuid_QNAME, String.class, Contacts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Name", scope = Contacts.class)
    public JAXBElement<String> createContactsName(String value) {
        return new JAXBElement<String>(_ProductsName_QNAME, String.class, Contacts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "FirstName", scope = Contacts.class)
    public JAXBElement<String> createContactsFirstName(String value) {
        return new JAXBElement<String>(_ContactsFirstName_QNAME, String.class, Contacts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "LastName", scope = Contacts.class)
    public JAXBElement<String> createContactsLastName(String value) {
        return new JAXBElement<String>(_ContactsLastName_QNAME, String.class, Contacts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Patronymic", scope = Contacts.class)
    public JAXBElement<String> createContactsPatronymic(String value) {
        return new JAXBElement<String>(_ContactsPatronymic_QNAME, String.class, Contacts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "DeletionMark", scope = Contacts.class)
    public JAXBElement<Boolean> createContactsDeletionMark(Boolean value) {
        return new JAXBElement<Boolean>(_ContactsDeletionMark_QNAME, Boolean.class, Contacts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Position", scope = Contacts.class)
    public JAXBElement<String> createContactsPosition(String value) {
        return new JAXBElement<String>(_ContactsPosition_QNAME, String.class, Contacts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Error", scope = ArrayString.class)
    public JAXBElement<Boolean> createArrayStringError(Boolean value) {
        return new JAXBElement<Boolean>(_ResultArrayPhotoError_QNAME, Boolean.class, ArrayString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ErrorInfo", scope = ArrayString.class)
    public JAXBElement<String> createArrayStringErrorInfo(String value) {
        return new JAXBElement<String>(_ResultArrayPhotoErrorInfo_QNAME, String.class, ArrayString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ErrorInfo", scope = ListOfClientProducts.class)
    public JAXBElement<String> createListOfClientProductsErrorInfo(String value) {
        return new JAXBElement<String>(_ResultArrayPhotoErrorInfo_QNAME, String.class, ListOfClientProducts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Geography", scope = ContactInfo.class)
    public JAXBElement<String> createContactInfoGeography(String value) {
        return new JAXBElement<String>(_PVZGeography_QNAME, String.class, ContactInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Name", scope = ContactInfo.class)
    public JAXBElement<String> createContactInfoName(String value) {
        return new JAXBElement<String>(_ProductsName_QNAME, String.class, ContactInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ErrorInfo", scope = ListOfMessage.class)
    public JAXBElement<String> createListOfMessageErrorInfo(String value) {
        return new JAXBElement<String>(_ResultArrayPhotoErrorInfo_QNAME, String.class, ListOfMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ErrorInfo", scope = ResultWaybills.class)
    public JAXBElement<String> createResultWaybillsErrorInfo(String value) {
        return new JAXBElement<String>(_ResultArrayPhotoErrorInfo_QNAME, String.class, ResultWaybills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "OrgAddress", scope = ResultReestr.class)
    public JAXBElement<String> createResultReestrOrgAddress(String value) {
        return new JAXBElement<String>(_ResultReestrOrgAddress_QNAME, String.class, ResultReestr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "OrgPhone", scope = ResultReestr.class)
    public JAXBElement<String> createResultReestrOrgPhone(String value) {
        return new JAXBElement<String>(_ResultReestrOrgPhone_QNAME, String.class, ResultReestr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ResultCargoQty", scope = ResultReestr.class)
    public JAXBElement<Integer> createResultReestrResultCargoQty(Integer value) {
        return new JAXBElement<Integer>(_ResultReestrResultCargoQty_QNAME, Integer.class, ResultReestr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ErrorInfo", scope = ResultReestr.class)
    public JAXBElement<String> createResultReestrErrorInfo(String value) {
        return new JAXBElement<String>(_ResultArrayPhotoErrorInfo_QNAME, String.class, ResultReestr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Number", scope = ResultReestr.class)
    public JAXBElement<String> createResultReestrNumber(String value) {
        return new JAXBElement<String>(_TrackingInfoNumber_QNAME, String.class, ResultReestr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Client", scope = ResultReestr.class)
    public JAXBElement<String> createResultReestrClient(String value) {
        return new JAXBElement<String>(_ProductPartiesClient_QNAME, String.class, ResultReestr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Contract", scope = ResultReestr.class)
    public JAXBElement<String> createResultReestrContract(String value) {
        return new JAXBElement<String>(_PayableContract_QNAME, String.class, ResultReestr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CreateDate", scope = ResultReestr.class)
    public JAXBElement<XMLGregorianCalendar> createResultReestrCreateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WaybillCreateDate_QNAME, XMLGregorianCalendar.class, ResultReestr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Department", scope = ResultReestr.class)
    public JAXBElement<String> createResultReestrDepartment(String value) {
        return new JAXBElement<String>(_ProductPartiesDepartment_QNAME, String.class, ResultReestr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Project", scope = ResultReestr.class)
    public JAXBElement<String> createResultReestrProject(String value) {
        return new JAXBElement<String>(_ProductPartiesProject_QNAME, String.class, ResultReestr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Sender", scope = ResultReestr.class)
    public JAXBElement<String> createResultReestrSender(String value) {
        return new JAXBElement<String>(_WaybillSender_QNAME, String.class, ResultReestr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "SenderAddress", scope = ResultReestr.class)
    public JAXBElement<String> createResultReestrSenderAddress(String value) {
        return new JAXBElement<String>(_InfoWaybillReportsSenderAddress_QNAME, String.class, ResultReestr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ContractDate", scope = ResultReestr.class)
    public JAXBElement<XMLGregorianCalendar> createResultReestrContractDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ResultReestrContractDate_QNAME, XMLGregorianCalendar.class, ResultReestr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ErrorInfo", scope = ResultTracking.class)
    public JAXBElement<String> createResultTrackingErrorInfo(String value) {
        return new JAXBElement<String>(_ResultArrayPhotoErrorInfo_QNAME, String.class, ResultTracking.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ErrorInfo", scope = ResultArray.class)
    public JAXBElement<String> createResultArrayErrorInfo(String value) {
        return new JAXBElement<String>(_ResultArrayPhotoErrorInfo_QNAME, String.class, ResultArray.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Client", scope = Order.class)
    public JAXBElement<String> createOrderClient(String value) {
        return new JAXBElement<String>(_ProductPartiesClient_QNAME, String.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ClientContact", scope = Order.class)
    public JAXBElement<String> createOrderClientContact(String value) {
        return new JAXBElement<String>(_WaybillClientContact_QNAME, String.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Contract", scope = Order.class)
    public JAXBElement<String> createOrderContract(String value) {
        return new JAXBElement<String>(_PayableContract_QNAME, String.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CreateDate", scope = Order.class)
    public JAXBElement<XMLGregorianCalendar> createOrderCreateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WaybillCreateDate_QNAME, XMLGregorianCalendar.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "DeliveryDate", scope = Order.class)
    public JAXBElement<XMLGregorianCalendar> createOrderDeliveryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WaybillDeliveryDate_QNAME, XMLGregorianCalendar.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "DeliveryMethod", scope = Order.class)
    public JAXBElement<String> createOrderDeliveryMethod(String value) {
        return new JAXBElement<String>(_WaybillDeliveryMethod_QNAME, String.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "DeliveryTime", scope = Order.class)
    public JAXBElement<String> createOrderDeliveryTime(String value) {
        return new JAXBElement<String>(_InfoDeliveryReportsDeliveryTime_QNAME, String.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Department", scope = Order.class)
    public JAXBElement<String> createOrderDepartment(String value) {
        return new JAXBElement<String>(_ProductPartiesDepartment_QNAME, String.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Office", scope = Order.class)
    public JAXBElement<String> createOrderOffice(String value) {
        return new JAXBElement<String>(_PVZOffice_QNAME, String.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Official", scope = Order.class)
    public JAXBElement<String> createOrderOfficial(String value) {
        return new JAXBElement<String>(_ReestrWaybillOfficial_QNAME, String.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Project", scope = Order.class)
    public JAXBElement<String> createOrderProject(String value) {
        return new JAXBElement<String>(_ProductPartiesProject_QNAME, String.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ReplyEMail", scope = Order.class)
    public JAXBElement<String> createOrderReplyEMail(String value) {
        return new JAXBElement<String>(_OrderReplyEMail_QNAME, String.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ReplySMSPhone", scope = Order.class)
    public JAXBElement<String> createOrderReplySMSPhone(String value) {
        return new JAXBElement<String>(_OrderReplySMSPhone_QNAME, String.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DestinationInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Sender", scope = Order.class)
    public JAXBElement<DestinationInformation> createOrderSender(DestinationInformation value) {
        return new JAXBElement<DestinationInformation>(_WaybillSender_QNAME, DestinationInformation.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "TakeTime", scope = Order.class)
    public JAXBElement<String> createOrderTakeTime(String value) {
        return new JAXBElement<String>(_OrderTakeTime_QNAME, String.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "TypeOfCargo", scope = Order.class)
    public JAXBElement<String> createOrderTypeOfCargo(String value) {
        return new JAXBElement<String>(_WaybillTypeOfCargo_QNAME, String.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "TypeOfPayer", scope = Order.class)
    public JAXBElement<String> createOrderTypeOfPayer(String value) {
        return new JAXBElement<String>(_OrderTypeOfPayer_QNAME, String.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Urgency", scope = Order.class)
    public JAXBElement<String> createOrderUrgency(String value) {
        return new JAXBElement<String>(_PrintDocumentsUrgency_QNAME, String.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "WayOfPayment", scope = Order.class)
    public JAXBElement<String> createOrderWayOfPayment(String value) {
        return new JAXBElement<String>(_OrderWayOfPayment_QNAME, String.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "WithReturn", scope = Order.class)
    public JAXBElement<Boolean> createOrderWithReturn(Boolean value) {
        return new JAXBElement<Boolean>(_WaybillWithReturn_QNAME, Boolean.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "AutoType", scope = Order.class)
    public JAXBElement<String> createOrderAutoType(String value) {
        return new JAXBElement<String>(_OrderAutoType_QNAME, String.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "AutoModel", scope = Order.class)
    public JAXBElement<String> createOrderAutoModel(String value) {
        return new JAXBElement<String>(_OrderAutoModel_QNAME, String.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Comment", scope = Order.class)
    public JAXBElement<String> createOrderComment(String value) {
        return new JAXBElement<String>(_WaybillComment_QNAME, String.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "StoreDoor", scope = Order.class)
    public JAXBElement<Boolean> createOrderStoreDoor(Boolean value) {
        return new JAXBElement<Boolean>(_OrderStoreDoor_QNAME, Boolean.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "DeliveryOfCargo", scope = Order.class)
    public JAXBElement<String> createOrderDeliveryOfCargo(String value) {
        return new JAXBElement<String>(_OrderDeliveryOfCargo_QNAME, String.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Insurance", scope = Order.class)
    public JAXBElement<Boolean> createOrderInsurance(Boolean value) {
        return new JAXBElement<Boolean>(_OrderInsurance_QNAME, Boolean.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Declared", scope = Order.class)
    public JAXBElement<Boolean> createOrderDeclared(Boolean value) {
        return new JAXBElement<Boolean>(_OrderDeclared_QNAME, Boolean.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "PersonallyInHand", scope = Order.class)
    public JAXBElement<Boolean> createOrderPersonallyInHand(Boolean value) {
        return new JAXBElement<Boolean>(_OrderPersonallyInHand_QNAME, Boolean.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "LUW", scope = Order.class)
    public JAXBElement<Boolean> createOrderLUW(Boolean value) {
        return new JAXBElement<Boolean>(_OrderLUW_QNAME, Boolean.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "WithSignature", scope = Order.class)
    public JAXBElement<Boolean> createOrderWithSignature(Boolean value) {
        return new JAXBElement<Boolean>(_OrderWithSignature_QNAME, Boolean.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "TypeOfOrder", scope = Order.class)
    public JAXBElement<String> createOrderTypeOfOrder(String value) {
        return new JAXBElement<String>(_WaybillTypeOfOrder_QNAME, String.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Distribution", scope = Order.class)
    public JAXBElement<Boolean> createOrderDistribution(Boolean value) {
        return new JAXBElement<Boolean>(_OrderDistribution_QNAME, Boolean.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CallCourer", scope = Order.class)
    public JAXBElement<Boolean> createOrderCallCourer(Boolean value) {
        return new JAXBElement<Boolean>(_OrderCallCourer_QNAME, Boolean.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "TypeOfParentForWaybill", scope = Order.class)
    public JAXBElement<String> createOrderTypeOfParentForWaybill(String value) {
        return new JAXBElement<String>(_OrderTypeOfParentForWaybill_QNAME, String.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ParentOrderForWaybill", scope = Order.class)
    public JAXBElement<String> createOrderParentOrderForWaybill(String value) {
        return new JAXBElement<String>(_OrderParentOrderForWaybill_QNAME, String.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ClientNumber", scope = Order.class)
    public JAXBElement<String> createOrderClientNumber(String value) {
        return new JAXBElement<String>(_WaybillClientNumber_QNAME, String.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Services", scope = Order.class)
    public JAXBElement<ListOfCorrespondences> createOrderServices(ListOfCorrespondences value) {
        return new JAXBElement<ListOfCorrespondences>(_UserDataServices_QNAME, ListOfCorrespondences.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Store", scope = Order.class)
    public JAXBElement<String> createOrderStore(String value) {
        return new JAXBElement<String>(_UserDataStore_QNAME, String.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfCorrespondences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "AnalyticsInfoBase", scope = Order.class)
    public JAXBElement<ListOfCorrespondences> createOrderAnalyticsInfoBase(ListOfCorrespondences value) {
        return new JAXBElement<ListOfCorrespondences>(_OrderAnalyticsInfoBase_QNAME, ListOfCorrespondences.class, Order.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ActualAddress", scope = RegistrationInformation.class)
    public JAXBElement<String> createRegistrationInformationActualAddress(String value) {
        return new JAXBElement<String>(_RegistrationInformationActualAddress_QNAME, String.class, RegistrationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "AdditionalInformation", scope = RegistrationInformation.class)
    public JAXBElement<String> createRegistrationInformationAdditionalInformation(String value) {
        return new JAXBElement<String>(_RegistrationInformationAdditionalInformation_QNAME, String.class, RegistrationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "BIK", scope = RegistrationInformation.class)
    public JAXBElement<String> createRegistrationInformationBIK(String value) {
        return new JAXBElement<String>(_RegistrationInformationBIK_QNAME, String.class, RegistrationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CarsDescription", scope = RegistrationInformation.class)
    public JAXBElement<String> createRegistrationInformationCarsDescription(String value) {
        return new JAXBElement<String>(_RegistrationInformationCarsDescription_QNAME, String.class, RegistrationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CompanyName", scope = RegistrationInformation.class)
    public JAXBElement<String> createRegistrationInformationCompanyName(String value) {
        return new JAXBElement<String>(_RegistrationInformationCompanyName_QNAME, String.class, RegistrationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CompanyContact", scope = RegistrationInformation.class)
    public JAXBElement<String> createRegistrationInformationCompanyContact(String value) {
        return new JAXBElement<String>(_RegistrationInformationCompanyContact_QNAME, String.class, RegistrationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CurrentAccount", scope = RegistrationInformation.class)
    public JAXBElement<String> createRegistrationInformationCurrentAccount(String value) {
        return new JAXBElement<String>(_RegistrationInformationCurrentAccount_QNAME, String.class, RegistrationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "EMail", scope = RegistrationInformation.class)
    public JAXBElement<String> createRegistrationInformationEMail(String value) {
        return new JAXBElement<String>(_MessageEMail_QNAME, String.class, RegistrationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Fax", scope = RegistrationInformation.class)
    public JAXBElement<String> createRegistrationInformationFax(String value) {
        return new JAXBElement<String>(_RegistrationInformationFax_QNAME, String.class, RegistrationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "FormOfIncorporation", scope = RegistrationInformation.class)
    public JAXBElement<String> createRegistrationInformationFormOfIncorporation(String value) {
        return new JAXBElement<String>(_RegistrationInformationFormOfIncorporation_QNAME, String.class, RegistrationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Geography", scope = RegistrationInformation.class)
    public JAXBElement<String> createRegistrationInformationGeography(String value) {
        return new JAXBElement<String>(_PVZGeography_QNAME, String.class, RegistrationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "INN", scope = RegistrationInformation.class)
    public JAXBElement<String> createRegistrationInformationINN(String value) {
        return new JAXBElement<String>(_RegistrationInformationINN_QNAME, String.class, RegistrationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "JuridicalAddress", scope = RegistrationInformation.class)
    public JAXBElement<String> createRegistrationInformationJuridicalAddress(String value) {
        return new JAXBElement<String>(_RegistrationInformationJuridicalAddress_QNAME, String.class, RegistrationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "KPP", scope = RegistrationInformation.class)
    public JAXBElement<String> createRegistrationInformationKPP(String value) {
        return new JAXBElement<String>(_RegistrationInformationKPP_QNAME, String.class, RegistrationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "MeansTheAgent", scope = RegistrationInformation.class)
    public JAXBElement<String> createRegistrationInformationMeansTheAgent(String value) {
        return new JAXBElement<String>(_RegistrationInformationMeansTheAgent_QNAME, String.class, RegistrationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "NotificationEMail", scope = RegistrationInformation.class)
    public JAXBElement<String> createRegistrationInformationNotificationEMail(String value) {
        return new JAXBElement<String>(_RegistrationInformationNotificationEMail_QNAME, String.class, RegistrationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "NotificationSMSPhone", scope = RegistrationInformation.class)
    public JAXBElement<String> createRegistrationInformationNotificationSMSPhone(String value) {
        return new JAXBElement<String>(_RegistrationInformationNotificationSMSPhone_QNAME, String.class, RegistrationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "OGRN", scope = RegistrationInformation.class)
    public JAXBElement<String> createRegistrationInformationOGRN(String value) {
        return new JAXBElement<String>(_RegistrationInformationOGRN_QNAME, String.class, RegistrationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "OKPO", scope = RegistrationInformation.class)
    public JAXBElement<String> createRegistrationInformationOKPO(String value) {
        return new JAXBElement<String>(_RegistrationInformationOKPO_QNAME, String.class, RegistrationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Phone", scope = RegistrationInformation.class)
    public JAXBElement<String> createRegistrationInformationPhone(String value) {
        return new JAXBElement<String>(_PVZPhone_QNAME, String.class, RegistrationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "WebPage", scope = RegistrationInformation.class)
    public JAXBElement<String> createRegistrationInformationWebPage(String value) {
        return new JAXBElement<String>(_RegistrationInformationWebPage_QNAME, String.class, RegistrationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ErrorInfo", scope = ArrayPrint.class)
    public JAXBElement<String> createArrayPrintErrorInfo(String value) {
        return new JAXBElement<String>(_ResultArrayPhotoErrorInfo_QNAME, String.class, ArrayPrint.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ErrorInfo", scope = ResultMultipleBData.class)
    public JAXBElement<String> createResultMultipleBDataErrorInfo(String value) {
        return new JAXBElement<String>(_ResultArrayPhotoErrorInfo_QNAME, String.class, ResultMultipleBData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "BData", scope = ResultBData.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createResultBDataBData(byte[] value) {
        return new JAXBElement<byte[]>(_ResultBDataBData_QNAME, byte[].class, ResultBData.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ErrorInfo", scope = ResultBData.class)
    public JAXBElement<String> createResultBDataErrorInfo(String value) {
        return new JAXBElement<String>(_ResultArrayPhotoErrorInfo_QNAME, String.class, ResultBData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Order }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Order", scope = ResultOrder.class)
    public JAXBElement<Order> createResultOrderOrder(Order value) {
        return new JAXBElement<Order>(_ResultOrderOrder_QNAME, Order.class, ResultOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Editable", scope = ResultOrder.class)
    public JAXBElement<Boolean> createResultOrderEditable(Boolean value) {
        return new JAXBElement<Boolean>(_ResultOrderEditable_QNAME, Boolean.class, ResultOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "HasScan", scope = ResultOrder.class)
    public JAXBElement<Boolean> createResultOrderHasScan(Boolean value) {
        return new JAXBElement<Boolean>(_ResultOrderHasScan_QNAME, Boolean.class, ResultOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "HasPrintForm", scope = ResultOrder.class)
    public JAXBElement<Boolean> createResultOrderHasPrintForm(Boolean value) {
        return new JAXBElement<Boolean>(_ResultOrderHasPrintForm_QNAME, Boolean.class, ResultOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "State", scope = ResultOrder.class)
    public JAXBElement<String> createResultOrderState(String value) {
        return new JAXBElement<String>(_WaybillState_QNAME, String.class, ResultOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "GUIDState", scope = ResultOrder.class)
    public JAXBElement<String> createResultOrderGUIDState(String value) {
        return new JAXBElement<String>(_ResultOrderGUIDState_QNAME, String.class, ResultOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Contract", scope = ResultOrder.class)
    public JAXBElement<String> createResultOrderContract(String value) {
        return new JAXBElement<String>(_PayableContract_QNAME, String.class, ResultOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Number", scope = ResultOrder.class)
    public JAXBElement<String> createResultOrderNumber(String value) {
        return new JAXBElement<String>(_TrackingInfoNumber_QNAME, String.class, ResultOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "WaybillNumber", scope = ResultOrder.class)
    public JAXBElement<String> createResultOrderWaybillNumber(String value) {
        return new JAXBElement<String>(_WaybillWaybillNumber_QNAME, String.class, ResultOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ClientNumber", scope = ResultOrder.class)
    public JAXBElement<String> createResultOrderClientNumber(String value) {
        return new JAXBElement<String>(_WaybillClientNumber_QNAME, String.class, ResultOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ErrorInfo", scope = ResultOrder.class)
    public JAXBElement<String> createResultOrderErrorInfo(String value) {
        return new JAXBElement<String>(_ResultArrayPhotoErrorInfo_QNAME, String.class, ResultOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ErrorInfo", scope = ResultListOfWaybills.class)
    public JAXBElement<String> createResultListOfWaybillsErrorInfo(String value) {
        return new JAXBElement<String>(_ResultArrayPhotoErrorInfo_QNAME, String.class, ResultListOfWaybills.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ErrorInfo", scope = ListOfCorrespondences.class)
    public JAXBElement<String> createListOfCorrespondencesErrorInfo(String value) {
        return new JAXBElement<String>(_ResultArrayPhotoErrorInfo_QNAME, String.class, ListOfCorrespondences.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ErrorInfo", scope = AddressBook.class)
    public JAXBElement<String> createAddressBookErrorInfo(String value) {
        return new JAXBElement<String>(_ResultArrayPhotoErrorInfo_QNAME, String.class, AddressBook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "NumberOfOrder", scope = Settings.class)
    public JAXBElement<String> createSettingsNumberOfOrder(String value) {
        return new JAXBElement<String>(_OutputSettingsCustomersGoodsReport3NumberOfOrder_QNAME, String.class, Settings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "NumberOfWaybill", scope = Settings.class)
    public JAXBElement<String> createSettingsNumberOfWaybill(String value) {
        return new JAXBElement<String>(_SettingsNumberOfWaybill_QNAME, String.class, Settings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "TakeDate", scope = Settings.class)
    public JAXBElement<XMLGregorianCalendar> createSettingsTakeDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WaybillTakeDate_QNAME, XMLGregorianCalendar.class, Settings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ClientOfficial", scope = Settings.class)
    public JAXBElement<String> createSettingsClientOfficial(String value) {
        return new JAXBElement<String>(_InfoWaybillReportsClientOfficial_QNAME, String.class, Settings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ClientDepartment", scope = Settings.class)
    public JAXBElement<String> createSettingsClientDepartment(String value) {
        return new JAXBElement<String>(_InfoWaybillReportsClientDepartment_QNAME, String.class, Settings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ClientProject", scope = Settings.class)
    public JAXBElement<String> createSettingsClientProject(String value) {
        return new JAXBElement<String>(_InfoWaybillReportsClientProject_QNAME, String.class, Settings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Sender", scope = Settings.class)
    public JAXBElement<String> createSettingsSender(String value) {
        return new JAXBElement<String>(_WaybillSender_QNAME, String.class, Settings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "FromGeography", scope = Settings.class)
    public JAXBElement<String> createSettingsFromGeography(String value) {
        return new JAXBElement<String>(_CostingsFromGeography_QNAME, String.class, Settings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Recipient", scope = Settings.class)
    public JAXBElement<String> createSettingsRecipient(String value) {
        return new JAXBElement<String>(_WaybillRecipient_QNAME, String.class, Settings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ToGeography", scope = Settings.class)
    public JAXBElement<String> createSettingsToGeography(String value) {
        return new JAXBElement<String>(_CostingsToGeography_QNAME, String.class, Settings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Urgency", scope = Settings.class)
    public JAXBElement<String> createSettingsUrgency(String value) {
        return new JAXBElement<String>(_PrintDocumentsUrgency_QNAME, String.class, Settings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Weight", scope = Settings.class)
    public JAXBElement<Float> createSettingsWeight(Float value) {
        return new JAXBElement<Float>(_InfoCargoReportsWeight_QNAME, Float.class, Settings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "TypeOfCargo", scope = Settings.class)
    public JAXBElement<String> createSettingsTypeOfCargo(String value) {
        return new JAXBElement<String>(_WaybillTypeOfCargo_QNAME, String.class, Settings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "DeliveryDate", scope = Settings.class)
    public JAXBElement<XMLGregorianCalendar> createSettingsDeliveryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WaybillDeliveryDate_QNAME, XMLGregorianCalendar.class, Settings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "StateDelivery", scope = Settings.class)
    public JAXBElement<String> createSettingsStateDelivery(String value) {
        return new JAXBElement<String>(_SettingsStateDelivery_QNAME, String.class, Settings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "State", scope = Settings.class)
    public JAXBElement<String> createSettingsState(String value) {
        return new JAXBElement<String>(_WaybillState_QNAME, String.class, Settings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Article", scope = Settings.class)
    public JAXBElement<String> createSettingsArticle(String value) {
        return new JAXBElement<String>(_ProductsArticle_QNAME, String.class, Settings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ProductName", scope = Settings.class)
    public JAXBElement<String> createSettingsProductName(String value) {
        return new JAXBElement<String>(_SettingsProductName_QNAME, String.class, Settings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "StateTrace", scope = Settings.class)
    public JAXBElement<String> createSettingsStateTrace(String value) {
        return new JAXBElement<String>(_SettingsStateTrace_QNAME, String.class, Settings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ClientNumber", scope = Settings.class)
    public JAXBElement<String> createSettingsClientNumber(String value) {
        return new JAXBElement<String>(_WaybillClientNumber_QNAME, String.class, Settings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Value", scope = ResultString.class)
    public JAXBElement<String> createResultStringValue(String value) {
        return new JAXBElement<String>(_ElementValue_QNAME, String.class, ResultString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ErrorInfo", scope = ResultString.class)
    public JAXBElement<String> createResultStringErrorInfo(String value) {
        return new JAXBElement<String>(_ResultArrayPhotoErrorInfo_QNAME, String.class, ResultString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CompanyCode", scope = UserInfo.class)
    public JAXBElement<String> createUserInfoCompanyCode(String value) {
        return new JAXBElement<String>(_UserInfoCompanyCode_QNAME, String.class, UserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "CompanyName", scope = UserInfo.class)
    public JAXBElement<String> createUserInfoCompanyName(String value) {
        return new JAXBElement<String>(_RegistrationInformationCompanyName_QNAME, String.class, UserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Data", scope = UserInfo.class)
    public JAXBElement<UserData> createUserInfoData(UserData value) {
        return new JAXBElement<UserData>(_UserInfoData_QNAME, UserData.class, UserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Description", scope = UserInfo.class)
    public JAXBElement<String> createUserInfoDescription(String value) {
        return new JAXBElement<String>(_ProblemDescription_QNAME, String.class, UserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "EMail", scope = UserInfo.class)
    public JAXBElement<String> createUserInfoEMail(String value) {
        return new JAXBElement<String>(_MessageEMail_QNAME, String.class, UserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ErrorInfo", scope = UserInfo.class)
    public JAXBElement<String> createUserInfoErrorInfo(String value) {
        return new JAXBElement<String>(_ResultArrayPhotoErrorInfo_QNAME, String.class, UserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "FullCompanyName", scope = UserInfo.class)
    public JAXBElement<String> createUserInfoFullCompanyName(String value) {
        return new JAXBElement<String>(_UserInfoFullCompanyName_QNAME, String.class, UserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "GeographyGUID", scope = UserInfo.class)
    public JAXBElement<String> createUserInfoGeographyGUID(String value) {
        return new JAXBElement<String>(_UserInfoGeographyGUID_QNAME, String.class, UserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "OfficialName", scope = UserInfo.class)
    public JAXBElement<String> createUserInfoOfficialName(String value) {
        return new JAXBElement<String>(_UserInfoOfficialName_QNAME, String.class, UserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Phone", scope = UserInfo.class)
    public JAXBElement<String> createUserInfoPhone(String value) {
        return new JAXBElement<String>(_PVZPhone_QNAME, String.class, UserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ErrorInfo", scope = ResultBoolean.class)
    public JAXBElement<String> createResultBooleanErrorInfo(String value) {
        return new JAXBElement<String>(_ResultArrayPhotoErrorInfo_QNAME, String.class, ResultBoolean.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ErrorInfo", scope = ResultCalc.class)
    public JAXBElement<String> createResultCalcErrorInfo(String value) {
        return new JAXBElement<String>(_ResultArrayPhotoErrorInfo_QNAME, String.class, ResultCalc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "Error", scope = ResultCalcArray.class)
    public JAXBElement<Boolean> createResultCalcArrayError(Boolean value) {
        return new JAXBElement<Boolean>(_ResultArrayPhotoError_QNAME, Boolean.class, ResultCalcArray.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ErrorInfo", scope = ResultCalcArray.class)
    public JAXBElement<String> createResultCalcArrayErrorInfo(String value) {
        return new JAXBElement<String>(_ResultArrayPhotoErrorInfo_QNAME, String.class, ResultCalcArray.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/client", name = "ErrorInfo", scope = ArrayCalc.class)
    public JAXBElement<String> createArrayCalcErrorInfo(String value) {
        return new JAXBElement<String>(_ResultArrayPhotoErrorInfo_QNAME, String.class, ArrayCalc.class, value);
    }

}
