/*
 * Account and Transaction API Specification
 * Swagger for Account and Transaction API Specification
 *
 * OpenAPI spec version: v3.1.6
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.OBErrorResponse1;
import io.swagger.client.model.OBReadDirectDebit2;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DirectDebitsApi
 */
@Ignore
public class DirectDebitsApiTest {

    private final DirectDebitsApi api = new DirectDebitsApi();

    /**
     * Get Direct Debits
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountsAccountIdDirectDebitsTest() throws ApiException {
        String accountId = null;
        String authorization = null;
        String xFapiAuthDate = null;
        String xFapiCustomerIpAddress = null;
        String xFapiInteractionId = null;
        String xCustomerUserAgent = null;
        OBReadDirectDebit2 response = api.getAccountsAccountIdDirectDebits(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent);

        // TODO: test validations
    }
    /**
     * Get Direct Debits
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDirectDebitsTest() throws ApiException {
        String authorization = null;
        String xFapiAuthDate = null;
        String xFapiCustomerIpAddress = null;
        String xFapiInteractionId = null;
        String xCustomerUserAgent = null;
        OBReadDirectDebit2 response = api.getDirectDebits(authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent);

        // TODO: test validations
    }
}
