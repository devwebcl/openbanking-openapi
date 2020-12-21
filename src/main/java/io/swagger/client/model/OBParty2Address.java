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

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.OBAddressTypeCode;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Postal address of a party.
 */
@Schema(description = "Postal address of a party.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-21T12:56:57.444774-03:00[America/Santiago]")
public class OBParty2Address {
  @SerializedName("AddressType")
  private OBAddressTypeCode addressType = null;

  @SerializedName("AddressLine")
  private List<String> addressLine = null;

  @SerializedName("StreetName")
  private String streetName = null;

  @SerializedName("BuildingNumber")
  private String buildingNumber = null;

  @SerializedName("PostCode")
  private String postCode = null;

  @SerializedName("TownName")
  private String townName = null;

  @SerializedName("CountrySubDivision")
  private String countrySubDivision = null;

  @SerializedName("Country")
  private String country = null;

  public OBParty2Address addressType(OBAddressTypeCode addressType) {
    this.addressType = addressType;
    return this;
  }

   /**
   * Get addressType
   * @return addressType
  **/
  @Schema(description = "")
  public OBAddressTypeCode getAddressType() {
    return addressType;
  }

  public void setAddressType(OBAddressTypeCode addressType) {
    this.addressType = addressType;
  }

  public OBParty2Address addressLine(List<String> addressLine) {
    this.addressLine = addressLine;
    return this;
  }

  public OBParty2Address addAddressLineItem(String addressLineItem) {
    if (this.addressLine == null) {
      this.addressLine = new ArrayList<String>();
    }
    this.addressLine.add(addressLineItem);
    return this;
  }

   /**
   * Get addressLine
   * @return addressLine
  **/
  @Schema(description = "")
  public List<String> getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(List<String> addressLine) {
    this.addressLine = addressLine;
  }

  public OBParty2Address streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

   /**
   * Get streetName
   * @return streetName
  **/
  @Schema(description = "")
  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public OBParty2Address buildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

   /**
   * Get buildingNumber
   * @return buildingNumber
  **/
  @Schema(description = "")
  public String getBuildingNumber() {
    return buildingNumber;
  }

  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }

  public OBParty2Address postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

   /**
   * Get postCode
   * @return postCode
  **/
  @Schema(description = "")
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public OBParty2Address townName(String townName) {
    this.townName = townName;
    return this;
  }

   /**
   * Get townName
   * @return townName
  **/
  @Schema(description = "")
  public String getTownName() {
    return townName;
  }

  public void setTownName(String townName) {
    this.townName = townName;
  }

  public OBParty2Address countrySubDivision(String countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
    return this;
  }

   /**
   * Get countrySubDivision
   * @return countrySubDivision
  **/
  @Schema(description = "")
  public String getCountrySubDivision() {
    return countrySubDivision;
  }

  public void setCountrySubDivision(String countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
  }

  public OBParty2Address country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @Schema(required = true, description = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBParty2Address obParty2Address = (OBParty2Address) o;
    return Objects.equals(this.addressType, obParty2Address.addressType) &&
        Objects.equals(this.addressLine, obParty2Address.addressLine) &&
        Objects.equals(this.streetName, obParty2Address.streetName) &&
        Objects.equals(this.buildingNumber, obParty2Address.buildingNumber) &&
        Objects.equals(this.postCode, obParty2Address.postCode) &&
        Objects.equals(this.townName, obParty2Address.townName) &&
        Objects.equals(this.countrySubDivision, obParty2Address.countrySubDivision) &&
        Objects.equals(this.country, obParty2Address.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressType, addressLine, streetName, buildingNumber, postCode, townName, countrySubDivision, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBParty2Address {\n");
    
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    townName: ").append(toIndentedString(townName)).append("\n");
    sb.append("    countrySubDivision: ").append(toIndentedString(countrySubDivision)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
