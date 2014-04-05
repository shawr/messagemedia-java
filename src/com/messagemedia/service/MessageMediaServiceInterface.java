
package com.messagemedia.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MessageMediaServiceInterface", targetNamespace = "http://xml.m4u.com.au/2009")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MessageMediaServiceInterface {


    /**
     * 
     * @param requestBody
     * @param authentication
     * @return
     *     returns com.messagemedia.service.SendMessagesResultType
     * @throws FaultResponse
     */
    @WebMethod(action = "http://xml.m4u.com.au/2009/sendMessages")
    @WebResult(name = "result", targetNamespace = "http://xml.m4u.com.au/2009")
    @RequestWrapper(localName = "sendMessages", targetNamespace = "http://xml.m4u.com.au/2009", className = "com.messagemedia.service.SendMessagesRequestType")
    @ResponseWrapper(localName = "sendMessagesResponse", targetNamespace = "http://xml.m4u.com.au/2009", className = "com.messagemedia.service.SendMessagesResponseType")
    public SendMessagesResultType sendMessages(
        @WebParam(name = "authentication", targetNamespace = "http://xml.m4u.com.au/2009")
        AuthenticationType authentication,
        @WebParam(name = "requestBody", targetNamespace = "http://xml.m4u.com.au/2009")
        SendMessagesBodyType requestBody)
        throws FaultResponse
    ;

    /**
     * 
     * @param authentication
     * @return
     *     returns com.messagemedia.service.CheckUserResultType
     * @throws FaultResponse
     */
    @WebMethod(action = "http://xml.m4u.com.au/2009/checkUser")
    @WebResult(name = "result", targetNamespace = "http://xml.m4u.com.au/2009")
    @RequestWrapper(localName = "checkUser", targetNamespace = "http://xml.m4u.com.au/2009", className = "com.messagemedia.service.CheckUserRequestType")
    @ResponseWrapper(localName = "checkUserResponse", targetNamespace = "http://xml.m4u.com.au/2009", className = "com.messagemedia.service.CheckUserResponseType")
    public CheckUserResultType checkUser(
        @WebParam(name = "authentication", targetNamespace = "http://xml.m4u.com.au/2009")
        AuthenticationType authentication)
        throws FaultResponse
    ;

    /**
     * 
     * @param requestBody
     * @param authentication
     * @return
     *     returns com.messagemedia.service.CheckRepliesResultType
     * @throws FaultResponse
     */
    @WebMethod(action = "http://xml.m4u.com.au/2009/checkReplies")
    @WebResult(name = "result", targetNamespace = "http://xml.m4u.com.au/2009")
    @RequestWrapper(localName = "checkReplies", targetNamespace = "http://xml.m4u.com.au/2009", className = "com.messagemedia.service.CheckRepliesRequestType")
    @ResponseWrapper(localName = "checkRepliesResponse", targetNamespace = "http://xml.m4u.com.au/2009", className = "com.messagemedia.service.CheckRepliesResponseType")
    public CheckRepliesResultType checkReplies(
        @WebParam(name = "authentication", targetNamespace = "http://xml.m4u.com.au/2009")
        AuthenticationType authentication,
        @WebParam(name = "requestBody", targetNamespace = "http://xml.m4u.com.au/2009")
        CheckRepliesBodyType requestBody)
        throws FaultResponse
    ;

    /**
     * 
     * @param requestBody
     * @param authentication
     * @return
     *     returns com.messagemedia.service.CheckReportsResultType
     * @throws FaultResponse
     */
    @WebMethod(action = "http://xml.m4u.com.au/2009/checkReports")
    @WebResult(name = "result", targetNamespace = "http://xml.m4u.com.au/2009")
    @RequestWrapper(localName = "checkReports", targetNamespace = "http://xml.m4u.com.au/2009", className = "com.messagemedia.service.CheckReportsRequestType")
    @ResponseWrapper(localName = "checkReportsResponse", targetNamespace = "http://xml.m4u.com.au/2009", className = "com.messagemedia.service.CheckReportsResponseType")
    public CheckReportsResultType checkReports(
        @WebParam(name = "authentication", targetNamespace = "http://xml.m4u.com.au/2009")
        AuthenticationType authentication,
        @WebParam(name = "requestBody", targetNamespace = "http://xml.m4u.com.au/2009")
        CheckReportsBodyType requestBody)
        throws FaultResponse
    ;

    /**
     * 
     * @param requestBody
     * @param authentication
     * @return
     *     returns com.messagemedia.service.ConfirmRepliesResultType
     * @throws FaultResponse
     */
    @WebMethod(action = "http://xml.m4u.com.au/2009/confirmReplies")
    @WebResult(name = "result", targetNamespace = "http://xml.m4u.com.au/2009")
    @RequestWrapper(localName = "confirmReplies", targetNamespace = "http://xml.m4u.com.au/2009", className = "com.messagemedia.service.ConfirmRepliesRequestType")
    @ResponseWrapper(localName = "confirmRepliesResponse", targetNamespace = "http://xml.m4u.com.au/2009", className = "com.messagemedia.service.ConfirmRepliesResponseType")
    public ConfirmRepliesResultType confirmReplies(
        @WebParam(name = "authentication", targetNamespace = "http://xml.m4u.com.au/2009")
        AuthenticationType authentication,
        @WebParam(name = "requestBody", targetNamespace = "http://xml.m4u.com.au/2009")
        ConfirmRepliesBodyType requestBody)
        throws FaultResponse
    ;

    /**
     * 
     * @param requestBody
     * @param authentication
     * @return
     *     returns com.messagemedia.service.ConfirmReportsResultType
     * @throws FaultResponse
     */
    @WebMethod(action = "http://xml.m4u.com.au/2009/confirmReports")
    @WebResult(name = "result", targetNamespace = "http://xml.m4u.com.au/2009")
    @RequestWrapper(localName = "confirmReports", targetNamespace = "http://xml.m4u.com.au/2009", className = "com.messagemedia.service.ConfirmReportsRequestType")
    @ResponseWrapper(localName = "confirmReportsResponse", targetNamespace = "http://xml.m4u.com.au/2009", className = "com.messagemedia.service.ConfirmReportsResponseType")
    public ConfirmReportsResultType confirmReports(
        @WebParam(name = "authentication", targetNamespace = "http://xml.m4u.com.au/2009")
        AuthenticationType authentication,
        @WebParam(name = "requestBody", targetNamespace = "http://xml.m4u.com.au/2009")
        ConfirmReportsBodyType requestBody)
        throws FaultResponse
    ;

    /**
     * 
     * @param requestBody
     * @param authentication
     * @return
     *     returns com.messagemedia.service.DeleteScheduledMessagesResultType
     * @throws FaultResponse
     */
    @WebMethod(action = "http://xml.m4u.com.au/2009/soap/deleteScheduledMessages")
    @WebResult(name = "result", targetNamespace = "http://xml.m4u.com.au/2009")
    @RequestWrapper(localName = "deleteScheduledMessages", targetNamespace = "http://xml.m4u.com.au/2009", className = "com.messagemedia.service.DeleteScheduledMessagesRequestType")
    @ResponseWrapper(localName = "deleteScheduledMessagesResponse", targetNamespace = "http://xml.m4u.com.au/2009", className = "com.messagemedia.service.DeleteScheduledMessagesResponseType")
    public DeleteScheduledMessagesResultType deleteScheduledMessages(
        @WebParam(name = "authentication", targetNamespace = "http://xml.m4u.com.au/2009")
        AuthenticationType authentication,
        @WebParam(name = "requestBody", targetNamespace = "http://xml.m4u.com.au/2009")
        DeleteScheduledMessagesBodyType requestBody)
        throws FaultResponse
    ;

    /**
     * 
     * @param requestBody
     * @param authentication
     * @return
     *     returns com.messagemedia.service.BlockNumbersResultType
     * @throws FaultResponse
     */
    @WebMethod(action = "http://xml.m4u.com.au/2009/blockNumbers")
    @WebResult(name = "result", targetNamespace = "http://xml.m4u.com.au/2009")
    @RequestWrapper(localName = "blockNumbers", targetNamespace = "http://xml.m4u.com.au/2009", className = "com.messagemedia.service.BlockNumbersRequestType")
    @ResponseWrapper(localName = "blockNumbersResponse", targetNamespace = "http://xml.m4u.com.au/2009", className = "com.messagemedia.service.BlockNumbersResponseType")
    public BlockNumbersResultType blockNumbers(
        @WebParam(name = "authentication", targetNamespace = "http://xml.m4u.com.au/2009")
        AuthenticationType authentication,
        @WebParam(name = "requestBody", targetNamespace = "http://xml.m4u.com.au/2009")
        BlockNumbersBodyType requestBody)
        throws FaultResponse
    ;

    /**
     * 
     * @param requestBody
     * @param authentication
     * @return
     *     returns com.messagemedia.service.UnblockNumbersResultType
     * @throws FaultResponse
     */
    @WebMethod(action = "http://xml.m4u.com.au/2009/unblockNumbers")
    @WebResult(name = "result", targetNamespace = "http://xml.m4u.com.au/2009")
    @RequestWrapper(localName = "unblockNumbers", targetNamespace = "http://xml.m4u.com.au/2009", className = "com.messagemedia.service.UnblockNumbersRequestType")
    @ResponseWrapper(localName = "unblockNumbersResponse", targetNamespace = "http://xml.m4u.com.au/2009", className = "com.messagemedia.service.UnblockNumbersResponseType")
    public UnblockNumbersResultType unblockNumbers(
        @WebParam(name = "authentication", targetNamespace = "http://xml.m4u.com.au/2009")
        AuthenticationType authentication,
        @WebParam(name = "requestBody", targetNamespace = "http://xml.m4u.com.au/2009")
        UnblockNumbersBodyType requestBody)
        throws FaultResponse
    ;

    /**
     * 
     * @param requestBody
     * @param authentication
     * @return
     *     returns com.messagemedia.service.GetBlockedNumbersResultType
     * @throws FaultResponse
     */
    @WebMethod(action = "http://xml.m4u.com.au/2009/getBlockedNumbers")
    @WebResult(name = "result", targetNamespace = "http://xml.m4u.com.au/2009")
    @RequestWrapper(localName = "getBlockedNumbers", targetNamespace = "http://xml.m4u.com.au/2009", className = "com.messagemedia.service.GetBlockedNumbersRequestType")
    @ResponseWrapper(localName = "getBlockedNumbersResponse", targetNamespace = "http://xml.m4u.com.au/2009", className = "com.messagemedia.service.GetBlockedNumbersResponseType")
    public GetBlockedNumbersResultType getBlockedNumbers(
        @WebParam(name = "authentication", targetNamespace = "http://xml.m4u.com.au/2009")
        AuthenticationType authentication,
        @WebParam(name = "requestBody", targetNamespace = "http://xml.m4u.com.au/2009")
        GetBlockedNumbersBodyType requestBody)
        throws FaultResponse
    ;

}
