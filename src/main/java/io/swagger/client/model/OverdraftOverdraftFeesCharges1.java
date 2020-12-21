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
import io.swagger.client.model.OverdraftOverdraftFeeChargeCap;
import io.swagger.client.model.OverdraftOverdraftFeeChargeDetail;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Overdraft fees and charges details
 */
@Schema(description = "Overdraft fees and charges details")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-21T12:56:57.444774-03:00[America/Santiago]")
public class OverdraftOverdraftFeesCharges1 {
  @SerializedName("OverdraftFeeChargeCap")
  private List<OverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap = null;

  @SerializedName("OverdraftFeeChargeDetail")
  private List<OverdraftOverdraftFeeChargeDetail> overdraftFeeChargeDetail = new ArrayList<OverdraftOverdraftFeeChargeDetail>();

  public OverdraftOverdraftFeesCharges1 overdraftFeeChargeCap(List<OverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
    return this;
  }

  public OverdraftOverdraftFeesCharges1 addOverdraftFeeChargeCapItem(OverdraftOverdraftFeeChargeCap overdraftFeeChargeCapItem) {
    if (this.overdraftFeeChargeCap == null) {
      this.overdraftFeeChargeCap = new ArrayList<OverdraftOverdraftFeeChargeCap>();
    }
    this.overdraftFeeChargeCap.add(overdraftFeeChargeCapItem);
    return this;
  }

   /**
   * Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.
   * @return overdraftFeeChargeCap
  **/
  @Schema(description = "Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.")
  public List<OverdraftOverdraftFeeChargeCap> getOverdraftFeeChargeCap() {
    return overdraftFeeChargeCap;
  }

  public void setOverdraftFeeChargeCap(List<OverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
  }

  public OverdraftOverdraftFeesCharges1 overdraftFeeChargeDetail(List<OverdraftOverdraftFeeChargeDetail> overdraftFeeChargeDetail) {
    this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
    return this;
  }

  public OverdraftOverdraftFeesCharges1 addOverdraftFeeChargeDetailItem(OverdraftOverdraftFeeChargeDetail overdraftFeeChargeDetailItem) {
    this.overdraftFeeChargeDetail.add(overdraftFeeChargeDetailItem);
    return this;
  }

   /**
   * Details about the fees/charges
   * @return overdraftFeeChargeDetail
  **/
  @Schema(required = true, description = "Details about the fees/charges")
  public List<OverdraftOverdraftFeeChargeDetail> getOverdraftFeeChargeDetail() {
    return overdraftFeeChargeDetail;
  }

  public void setOverdraftFeeChargeDetail(List<OverdraftOverdraftFeeChargeDetail> overdraftFeeChargeDetail) {
    this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OverdraftOverdraftFeesCharges1 overdraftOverdraftFeesCharges1 = (OverdraftOverdraftFeesCharges1) o;
    return Objects.equals(this.overdraftFeeChargeCap, overdraftOverdraftFeesCharges1.overdraftFeeChargeCap) &&
        Objects.equals(this.overdraftFeeChargeDetail, overdraftOverdraftFeesCharges1.overdraftFeeChargeDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overdraftFeeChargeCap, overdraftFeeChargeDetail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverdraftOverdraftFeesCharges1 {\n");
    
    sb.append("    overdraftFeeChargeCap: ").append(toIndentedString(overdraftFeeChargeCap)).append("\n");
    sb.append("    overdraftFeeChargeDetail: ").append(toIndentedString(overdraftFeeChargeDetail)).append("\n");
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
