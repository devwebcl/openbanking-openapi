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
import io.swagger.client.model.Overdraft1OverdraftFeeChargeCap;
import io.swagger.client.model.Overdraft1OverdraftFeeChargeDetail;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Overdraft fees and charges
 */
@Schema(description = "Overdraft fees and charges")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-21T12:56:57.444774-03:00[America/Santiago]")
public class Overdraft1OverdraftFeesCharges {
  @SerializedName("OverdraftFeeChargeCap")
  private List<Overdraft1OverdraftFeeChargeCap> overdraftFeeChargeCap = null;

  @SerializedName("OverdraftFeeChargeDetail")
  private List<Overdraft1OverdraftFeeChargeDetail> overdraftFeeChargeDetail = new ArrayList<Overdraft1OverdraftFeeChargeDetail>();

  public Overdraft1OverdraftFeesCharges overdraftFeeChargeCap(List<Overdraft1OverdraftFeeChargeCap> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
    return this;
  }

  public Overdraft1OverdraftFeesCharges addOverdraftFeeChargeCapItem(Overdraft1OverdraftFeeChargeCap overdraftFeeChargeCapItem) {
    if (this.overdraftFeeChargeCap == null) {
      this.overdraftFeeChargeCap = new ArrayList<Overdraft1OverdraftFeeChargeCap>();
    }
    this.overdraftFeeChargeCap.add(overdraftFeeChargeCapItem);
    return this;
  }

   /**
   * Details about any caps (maximum charges) that apply to a particular fee/charge
   * @return overdraftFeeChargeCap
  **/
  @Schema(description = "Details about any caps (maximum charges) that apply to a particular fee/charge")
  public List<Overdraft1OverdraftFeeChargeCap> getOverdraftFeeChargeCap() {
    return overdraftFeeChargeCap;
  }

  public void setOverdraftFeeChargeCap(List<Overdraft1OverdraftFeeChargeCap> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
  }

  public Overdraft1OverdraftFeesCharges overdraftFeeChargeDetail(List<Overdraft1OverdraftFeeChargeDetail> overdraftFeeChargeDetail) {
    this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
    return this;
  }

  public Overdraft1OverdraftFeesCharges addOverdraftFeeChargeDetailItem(Overdraft1OverdraftFeeChargeDetail overdraftFeeChargeDetailItem) {
    this.overdraftFeeChargeDetail.add(overdraftFeeChargeDetailItem);
    return this;
  }

   /**
   * Details about the fees/charges
   * @return overdraftFeeChargeDetail
  **/
  @Schema(required = true, description = "Details about the fees/charges")
  public List<Overdraft1OverdraftFeeChargeDetail> getOverdraftFeeChargeDetail() {
    return overdraftFeeChargeDetail;
  }

  public void setOverdraftFeeChargeDetail(List<Overdraft1OverdraftFeeChargeDetail> overdraftFeeChargeDetail) {
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
    Overdraft1OverdraftFeesCharges overdraft1OverdraftFeesCharges = (Overdraft1OverdraftFeesCharges) o;
    return Objects.equals(this.overdraftFeeChargeCap, overdraft1OverdraftFeesCharges.overdraftFeeChargeCap) &&
        Objects.equals(this.overdraftFeeChargeDetail, overdraft1OverdraftFeesCharges.overdraftFeeChargeDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overdraftFeeChargeCap, overdraftFeeChargeDetail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Overdraft1OverdraftFeesCharges {\n");
    
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
