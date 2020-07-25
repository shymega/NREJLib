package com.thalesgroup.rtti._2015_05_14.ldbsv_ref;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.3.5
 * 2020-05-24T15:42:24.675+01:00
 * Generated source version: 3.3.5
 *
 */
@WebService(targetNamespace = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", name = "LDBSVRefServiceSoap")
@XmlSeeAlso({com.thalesgroup.rtti._2014_02_20.ldbsv.types.ObjectFactory.class, com.thalesgroup.rtti._2015_11_27.ldbsv.types.ObjectFactory.class, com.thalesgroup.rtti._2016_02_16.ldbsv.types.ObjectFactory.class, com.thalesgroup.rtti._2017_10_01.ldbsv.types.ObjectFactory.class, com.thalesgroup.rtti._2007_10_10.ldb.commontypes.ObjectFactory.class, com.thalesgroup.rtti._2012_01_13.ldbsv.types.ObjectFactory.class, ObjectFactory.class, com.thalesgroup.rtti._2015_11_27.ldbsv.commontypes.ObjectFactory.class, com.thalesgroup.rtti._2017_10_01.ldbsv.ObjectFactory.class, com.thalesgroup.rtti._2013_11_28.token.types.ObjectFactory.class, com.thalesgroup.rtti._2017_10_01.ldbsv.commontypes.ObjectFactory.class, com.thalesgroup.rtti._2015_05_14.ldbsv_ref.types.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface LDBSVRefServiceSoap {

    @WebMethod(operationName = "GetReasonCode", action = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/GetReasonCode")
    @WebResult(name = "GetReasonCodeResponse", targetNamespace = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", partName = "parameters")
    public GetReasonCodeResponseType getReasonCode(

        @WebParam(partName = "parameters", name = "GetReasonCodeRequest", targetNamespace = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/")
        GetReasonCodeRequestParams parameters,
        @WebParam(partName = "AccessToken", name = "AccessToken", targetNamespace = "http://thalesgroup.com/RTTI/2013-11-28/Token/types", header = true)
        com.thalesgroup.rtti._2013_11_28.token.types.AccessToken accessToken
    );

    @WebMethod(operationName = "GetTOCList", action = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/GetTOCList")
    @WebResult(name = "GetTOCListResponse", targetNamespace = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", partName = "parameters")
    public GetTOCListResponseType getTOCList(

        @WebParam(partName = "parameters", name = "GetTOCListRequest", targetNamespace = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/")
        GetVersionedRefDataRequestParams parameters,
        @WebParam(partName = "AccessToken", name = "AccessToken", targetNamespace = "http://thalesgroup.com/RTTI/2013-11-28/Token/types", header = true)
        com.thalesgroup.rtti._2013_11_28.token.types.AccessToken accessToken
    );

    @WebMethod(operationName = "GetStationList", action = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/GetStationList")
    @WebResult(name = "GetStationListResponse", targetNamespace = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", partName = "parameters")
    public GetStationListResponseType getStationList(

        @WebParam(partName = "parameters", name = "GetStationListRequest", targetNamespace = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/")
        GetVersionedRefDataRequestParams parameters,
        @WebParam(partName = "AccessToken", name = "AccessToken", targetNamespace = "http://thalesgroup.com/RTTI/2013-11-28/Token/types", header = true)
        com.thalesgroup.rtti._2013_11_28.token.types.AccessToken accessToken
    );

    @WebMethod(operationName = "GetSourceInstanceNames", action = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/GetSourceInstanceNames")
    @WebResult(name = "GetSourceInstanceNamesResponse", targetNamespace = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", partName = "parameters")
    public GetSourceInstanceNamesResponseType getSourceInstanceNames(

        @WebParam(partName = "parameters", name = "GetSourceInstanceNamesRequest", targetNamespace = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/")
        VoidParams parameters,
        @WebParam(partName = "AccessToken", name = "AccessToken", targetNamespace = "http://thalesgroup.com/RTTI/2013-11-28/Token/types", header = true)
        com.thalesgroup.rtti._2013_11_28.token.types.AccessToken accessToken
    );

    @WebMethod(operationName = "GetReasonCodeList", action = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/GetReasonCodeList")
    @WebResult(name = "GetReasonCodeListResponse", targetNamespace = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/", partName = "parameters")
    public GetReasonCodeListResponseType getReasonCodeList(

        @WebParam(partName = "parameters", name = "GetReasonCodeListRequest", targetNamespace = "http://thalesgroup.com/RTTI/2015-05-14/ldbsv_ref/")
        VoidParams parameters,
        @WebParam(partName = "AccessToken", name = "AccessToken", targetNamespace = "http://thalesgroup.com/RTTI/2013-11-28/Token/types", header = true)
        com.thalesgroup.rtti._2013_11_28.token.types.AccessToken accessToken
    );
}
