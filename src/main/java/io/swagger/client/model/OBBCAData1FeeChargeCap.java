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
import io.swagger.client.model.OverdraftOtherFeeType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Details about any caps (maximum charges) that apply to a particular or group of fee/charge
 */
@Schema(description = "Details about any caps (maximum charges) that apply to a particular or group of fee/charge")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-21T12:56:57.444774-03:00[America/Santiago]")
public class OBBCAData1FeeChargeCap {
  /**
   * Fee/charge type which is being capped
   */
  @JsonAdapter(FeeTypeEnum.Adapter.class)
  public enum FeeTypeEnum {
    OTHER("Other"),
    SERVICECACCOUNTFEE("ServiceCAccountFee"),
    SERVICECACCOUNTFEEMONTHLY("ServiceCAccountFeeMonthly"),
    SERVICECACCOUNTFEEQUARTERLY("ServiceCAccountFeeQuarterly"),
    SERVICECFIXEDTARIFF("ServiceCFixedTariff"),
    SERVICECBUSIDEPACCBREAKAGE("ServiceCBusiDepAccBreakage"),
    SERVICECMINIMUMMONTHLYFEE("ServiceCMinimumMonthlyFee"),
    SERVICECOTHER("ServiceCOther");

    private String value;

    FeeTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static FeeTypeEnum fromValue(String text) {
      for (FeeTypeEnum b : FeeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<FeeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FeeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FeeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FeeTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("FeeType")
  private List<FeeTypeEnum> feeType = new ArrayList<FeeTypeEnum>();

  /**
   * Min Max type
   */
  @JsonAdapter(MinMaxTypeEnum.Adapter.class)
  public enum MinMaxTypeEnum {
    MINIMUM("Minimum"),
    MAXIMUM("Maximum");

    private String value;

    MinMaxTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static MinMaxTypeEnum fromValue(String text) {
      for (MinMaxTypeEnum b : MinMaxTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<MinMaxTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MinMaxTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MinMaxTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MinMaxTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("MinMaxType")
  private MinMaxTypeEnum minMaxType = null;

  @SerializedName("FeeCapOccurrence")
  private Float feeCapOccurrence = null;

  @SerializedName("FeeCapAmount")
  private String feeCapAmount = null;

  /**
   * Period e.g. day, week, month etc. for which the fee/charge is capped
   */
  @JsonAdapter(CappingPeriodEnum.Adapter.class)
  public enum CappingPeriodEnum {
    DAY("Day"),
    HALF_YEAR("Half Year"),
    MONTH("Month"),
    QUARTER("Quarter"),
    WEEK("Week"),
    YEAR("Year");

    private String value;

    CappingPeriodEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CappingPeriodEnum fromValue(String text) {
      for (CappingPeriodEnum b : CappingPeriodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CappingPeriodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CappingPeriodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CappingPeriodEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CappingPeriodEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("CappingPeriod")
  private CappingPeriodEnum cappingPeriod = null;

  @SerializedName("Notes")
  private List<String> notes = null;

  @SerializedName("OtherFeeType")
  private List<OverdraftOtherFeeType> otherFeeType = null;

  public OBBCAData1FeeChargeCap feeType(List<FeeTypeEnum> feeType) {
    this.feeType = feeType;
    return this;
  }

  public OBBCAData1FeeChargeCap addFeeTypeItem(FeeTypeEnum feeTypeItem) {
    this.feeType.add(feeTypeItem);
    return this;
  }

   /**
   * Fee/charge type which is being capped
   * @return feeType
  **/
  @Schema(required = true, description = "Fee/charge type which is being capped")
  public List<FeeTypeEnum> getFeeType() {
    return feeType;
  }

  public void setFeeType(List<FeeTypeEnum> feeType) {
    this.feeType = feeType;
  }

  public OBBCAData1FeeChargeCap minMaxType(MinMaxTypeEnum minMaxType) {
    this.minMaxType = minMaxType;
    return this;
  }

   /**
   * Min Max type
   * @return minMaxType
  **/
  @Schema(required = true, description = "Min Max type")
  public MinMaxTypeEnum getMinMaxType() {
    return minMaxType;
  }

  public void setMinMaxType(MinMaxTypeEnum minMaxType) {
    this.minMaxType = minMaxType;
  }

  public OBBCAData1FeeChargeCap feeCapOccurrence(Float feeCapOccurrence) {
    this.feeCapOccurrence = feeCapOccurrence;
    return this;
  }

   /**
   * fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount
   * @return feeCapOccurrence
  **/
  @Schema(description = "fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount")
  public Float getFeeCapOccurrence() {
    return feeCapOccurrence;
  }

  public void setFeeCapOccurrence(Float feeCapOccurrence) {
    this.feeCapOccurrence = feeCapOccurrence;
  }

  public OBBCAData1FeeChargeCap feeCapAmount(String feeCapAmount) {
    this.feeCapAmount = feeCapAmount;
    return this;
  }

   /**
   * Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
   * @return feeCapAmount
  **/
  @Schema(description = "Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)")
  public String getFeeCapAmount() {
    return feeCapAmount;
  }

  public void setFeeCapAmount(String feeCapAmount) {
    this.feeCapAmount = feeCapAmount;
  }

  public OBBCAData1FeeChargeCap cappingPeriod(CappingPeriodEnum cappingPeriod) {
    this.cappingPeriod = cappingPeriod;
    return this;
  }

   /**
   * Period e.g. day, week, month etc. for which the fee/charge is capped
   * @return cappingPeriod
  **/
  @Schema(description = "Period e.g. day, week, month etc. for which the fee/charge is capped")
  public CappingPeriodEnum getCappingPeriod() {
    return cappingPeriod;
  }

  public void setCappingPeriod(CappingPeriodEnum cappingPeriod) {
    this.cappingPeriod = cappingPeriod;
  }

  public OBBCAData1FeeChargeCap notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBBCAData1FeeChargeCap addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<String>();
    }
    this.notes.add(notesItem);
    return this;
  }

   /**
   * Free text for adding  extra details for fee charge cap
   * @return notes
  **/
  @Schema(description = "Free text for adding  extra details for fee charge cap")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OBBCAData1FeeChargeCap otherFeeType(List<OverdraftOtherFeeType> otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }

  public OBBCAData1FeeChargeCap addOtherFeeTypeItem(OverdraftOtherFeeType otherFeeTypeItem) {
    if (this.otherFeeType == null) {
      this.otherFeeType = new ArrayList<OverdraftOtherFeeType>();
    }
    this.otherFeeType.add(otherFeeTypeItem);
    return this;
  }

   /**
   * Other fee type code which is not available in the standard code set
   * @return otherFeeType
  **/
  @Schema(description = "Other fee type code which is not available in the standard code set")
  public List<OverdraftOtherFeeType> getOtherFeeType() {
    return otherFeeType;
  }

  public void setOtherFeeType(List<OverdraftOtherFeeType> otherFeeType) {
    this.otherFeeType = otherFeeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBBCAData1FeeChargeCap obBCAData1FeeChargeCap = (OBBCAData1FeeChargeCap) o;
    return Objects.equals(this.feeType, obBCAData1FeeChargeCap.feeType) &&
        Objects.equals(this.minMaxType, obBCAData1FeeChargeCap.minMaxType) &&
        Objects.equals(this.feeCapOccurrence, obBCAData1FeeChargeCap.feeCapOccurrence) &&
        Objects.equals(this.feeCapAmount, obBCAData1FeeChargeCap.feeCapAmount) &&
        Objects.equals(this.cappingPeriod, obBCAData1FeeChargeCap.cappingPeriod) &&
        Objects.equals(this.notes, obBCAData1FeeChargeCap.notes) &&
        Objects.equals(this.otherFeeType, obBCAData1FeeChargeCap.otherFeeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeType, minMaxType, feeCapOccurrence, feeCapAmount, cappingPeriod, notes, otherFeeType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBBCAData1FeeChargeCap {\n");
    
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    minMaxType: ").append(toIndentedString(minMaxType)).append("\n");
    sb.append("    feeCapOccurrence: ").append(toIndentedString(feeCapOccurrence)).append("\n");
    sb.append("    feeCapAmount: ").append(toIndentedString(feeCapAmount)).append("\n");
    sb.append("    cappingPeriod: ").append(toIndentedString(cappingPeriod)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
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