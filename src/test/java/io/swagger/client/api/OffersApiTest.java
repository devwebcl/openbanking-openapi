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
import io.swagger.client.model.OBReadOffer1;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OffersApi
 */
@Ignore
public class OffersApiTest {

    private final OffersApi api = new OffersApi();

    /**
     * Get Offers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountsAccountIdOffersTest() throws ApiException {
        String accountId = null;
        String authorization = null;
        String xFapiAuthDate = null;
        String xFapiCustomerIpAddress = null;
        String xFapiInteractionId = null;
        String xCustomerUserAgent = null;
        OBReadOffer1 response = api.getAccountsAccountIdOffers(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent);

        // TODO: test validations
    }
    /**
     * Get Offers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOffersTest() throws ApiException {
        String authorization = null;
        String xFapiAuthDate = null;
        String xFapiCustomerIpAddress = null;
        String xFapiInteractionId = null;
        String xCustomerUserAgent = null;
        OBReadOffer1 response = api.getOffers(authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent);

        // TODO: test validations
    }
}
