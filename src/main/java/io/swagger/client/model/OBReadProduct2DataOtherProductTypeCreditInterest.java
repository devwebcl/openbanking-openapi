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
import io.swagger.client.model.OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Details about the interest that may be payable to the Account holders
 */
@Schema(description = "Details about the interest that may be payable to the Account holders")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-21T12:56:57.444774-03:00[America/Santiago]")
public class OBReadProduct2DataOtherProductTypeCreditInterest {
  @SerializedName("TierBandSet")
  private List<OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet> tierBandSet = new ArrayList<OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet>();

  public OBReadProduct2DataOtherProductTypeCreditInterest tierBandSet(List<OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet> tierBandSet) {
    this.tierBandSet = tierBandSet;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeCreditInterest addTierBandSetItem(OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet tierBandSetItem) {
    this.tierBandSet.add(tierBandSetItem);
    return this;
  }

   /**
   * Get tierBandSet
   * @return tierBandSet
  **/
  @Schema(required = true, description = "")
  public List<OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet> getTierBandSet() {
    return tierBandSet;
  }

  public void setTierBandSet(List<OBReadProduct2DataOtherProductTypeCreditInterestTierBandSet> tierBandSet) {
    this.tierBandSet = tierBandSet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataOtherProductTypeCreditInterest obReadProduct2DataOtherProductTypeCreditInterest = (OBReadProduct2DataOtherProductTypeCreditInterest) o;
    return Objects.equals(this.tierBandSet, obReadProduct2DataOtherProductTypeCreditInterest.tierBandSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tierBandSet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeCreditInterest {\n");
    
    sb.append("    tierBandSet: ").append(toIndentedString(tierBandSet)).append("\n");
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
