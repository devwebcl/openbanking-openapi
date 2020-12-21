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
import io.swagger.client.model.OtherApplicationFrequency;
import io.swagger.client.model.OtherCalculationFrequency;
import io.swagger.client.model.OtherFeeRateType;
import io.swagger.client.model.OtherFeeType;
import io.swagger.client.model.Overdraft1OverdraftFeeChargeCap;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Details about the fees/charges
 */
@Schema(description = "Details about the fees/charges")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-21T12:56:57.444774-03:00[America/Santiago]")
public class Overdraft1OverdraftFeeChargeDetail {
  /**
   * Overdraft fee type
   */
  @JsonAdapter(FeeTypeEnum.Adapter.class)
  public enum FeeTypeEnum {
    ARRANGEDOVERDRAFT("ArrangedOverdraft"),
    EMERGENCYBORROWING("EmergencyBorrowing"),
    BORROWINGITEM("BorrowingItem"),
    OVERDRAFTRENEWAL("OverdraftRenewal"),
    ANNUALREVIEW("AnnualReview"),
    OVERDRAFTSETUP("OverdraftSetup"),
    SURCHARGE("Surcharge"),
    TEMPOVERDRAFT("TempOverdraft"),
    UNAUTHORISEDBORROWING("UnauthorisedBorrowing"),
    UNAUTHORISEDPAIDTRANS("UnauthorisedPaidTrans"),
    OTHER("Other"),
    UNAUTHORISEDUNPAIDTRANS("UnauthorisedUnpaidTrans");

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
  private FeeTypeEnum feeType = null;

  @SerializedName("OverdraftControlIndicator")
  private Boolean overdraftControlIndicator = null;

  @SerializedName("IncrementalBorrowingAmount")
  private String incrementalBorrowingAmount = null;

  @SerializedName("FeeAmount")
  private String feeAmount = null;

  @SerializedName("FeeRate")
  private String feeRate = null;

  /**
   * Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
   */
  @JsonAdapter(FeeRateTypeEnum.Adapter.class)
  public enum FeeRateTypeEnum {
    LINKEDBASERATE("LinkedBaseRate"),
    GROSS("Gross"),
    NET("Net"),
    OTHER("Other");

    private String value;

    FeeRateTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static FeeRateTypeEnum fromValue(String text) {
      for (FeeRateTypeEnum b : FeeRateTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<FeeRateTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FeeRateTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FeeRateTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FeeRateTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("FeeRateType")
  private FeeRateTypeEnum feeRateType = null;

  /**
   * Frequency at which the overdraft charge is applied to the account
   */
  @JsonAdapter(ApplicationFrequencyEnum.Adapter.class)
  public enum ApplicationFrequencyEnum {
    ACCOUNTCLOSING("AccountClosing"),
    ACCOUNTOPENING("AccountOpening"),
    ACADEMICTERM("AcademicTerm"),
    CHARGINGPERIOD("ChargingPeriod"),
    DAILY("Daily"),
    PERITEM("PerItem"),
    MONTHLY("Monthly"),
    ONACCOUNTANNIVERSARY("OnAccountAnniversary"),
    OTHER("Other"),
    PERHOUR("PerHour"),
    PEROCCURRENCE("PerOccurrence"),
    PERSHEET("PerSheet"),
    PERTRANSACTION("PerTransaction"),
    PERTRANSACTIONAMOUNT("PerTransactionAmount"),
    PERTRANSACTIONPERCENTAGE("PerTransactionPercentage"),
    QUARTERLY("Quarterly"),
    SIXMONTHLY("SixMonthly"),
    STATEMENTMONTHLY("StatementMonthly"),
    WEEKLY("Weekly"),
    YEARLY("Yearly");

    private String value;

    ApplicationFrequencyEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ApplicationFrequencyEnum fromValue(String text) {
      for (ApplicationFrequencyEnum b : ApplicationFrequencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ApplicationFrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ApplicationFrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ApplicationFrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ApplicationFrequencyEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("ApplicationFrequency")
  private ApplicationFrequencyEnum applicationFrequency = null;

  /**
   * How often is the overdraft fee/charge calculated for the account.
   */
  @JsonAdapter(CalculationFrequencyEnum.Adapter.class)
  public enum CalculationFrequencyEnum {
    ACCOUNTCLOSING("AccountClosing"),
    ACCOUNTOPENING("AccountOpening"),
    ACADEMICTERM("AcademicTerm"),
    CHARGINGPERIOD("ChargingPeriod"),
    DAILY("Daily"),
    PERITEM("PerItem"),
    MONTHLY("Monthly"),
    ONACCOUNTANNIVERSARY("OnAccountAnniversary"),
    OTHER("Other"),
    PERHOUR("PerHour"),
    PEROCCURRENCE("PerOccurrence"),
    PERSHEET("PerSheet"),
    PERTRANSACTION("PerTransaction"),
    PERTRANSACTIONAMOUNT("PerTransactionAmount"),
    PERTRANSACTIONPERCENTAGE("PerTransactionPercentage"),
    QUARTERLY("Quarterly"),
    SIXMONTHLY("SixMonthly"),
    STATEMENTMONTHLY("StatementMonthly"),
    WEEKLY("Weekly"),
    YEARLY("Yearly");

    private String value;

    CalculationFrequencyEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CalculationFrequencyEnum fromValue(String text) {
      for (CalculationFrequencyEnum b : CalculationFrequencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CalculationFrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CalculationFrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CalculationFrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CalculationFrequencyEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("CalculationFrequency")
  private CalculationFrequencyEnum calculationFrequency = null;

  @SerializedName("Notes")
  private List<String> notes = null;

  @SerializedName("OtherFeeType")
  private OtherFeeType otherFeeType = null;

  @SerializedName("OtherFeeRateType")
  private OtherFeeRateType otherFeeRateType = null;

  @SerializedName("OtherApplicationFrequency")
  private OtherApplicationFrequency otherApplicationFrequency = null;

  @SerializedName("OtherCalculationFrequency")
  private OtherCalculationFrequency otherCalculationFrequency = null;

  @SerializedName("OverdraftFeeChargeCap")
  private Overdraft1OverdraftFeeChargeCap overdraftFeeChargeCap = null;

  public Overdraft1OverdraftFeeChargeDetail feeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
    return this;
  }

   /**
   * Overdraft fee type
   * @return feeType
  **/
  @Schema(required = true, description = "Overdraft fee type")
  public FeeTypeEnum getFeeType() {
    return feeType;
  }

  public void setFeeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
  }

  public Overdraft1OverdraftFeeChargeDetail overdraftControlIndicator(Boolean overdraftControlIndicator) {
    this.overdraftControlIndicator = overdraftControlIndicator;
    return this;
  }

   /**
   * Specifies for the overdraft control feature/benefit
   * @return overdraftControlIndicator
  **/
  @Schema(description = "Specifies for the overdraft control feature/benefit")
  public Boolean isOverdraftControlIndicator() {
    return overdraftControlIndicator;
  }

  public void setOverdraftControlIndicator(Boolean overdraftControlIndicator) {
    this.overdraftControlIndicator = overdraftControlIndicator;
  }

  public Overdraft1OverdraftFeeChargeDetail incrementalBorrowingAmount(String incrementalBorrowingAmount) {
    this.incrementalBorrowingAmount = incrementalBorrowingAmount;
    return this;
  }

   /**
   * Every additional tranche of an overdraft balance to which an overdraft fee is applied
   * @return incrementalBorrowingAmount
  **/
  @Schema(description = "Every additional tranche of an overdraft balance to which an overdraft fee is applied")
  public String getIncrementalBorrowingAmount() {
    return incrementalBorrowingAmount;
  }

  public void setIncrementalBorrowingAmount(String incrementalBorrowingAmount) {
    this.incrementalBorrowingAmount = incrementalBorrowingAmount;
  }

  public Overdraft1OverdraftFeeChargeDetail feeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
    return this;
  }

   /**
   * Amount charged for an overdraft fee/charge (where it is charged in terms of an amount rather than a rate)
   * @return feeAmount
  **/
  @Schema(description = "Amount charged for an overdraft fee/charge (where it is charged in terms of an amount rather than a rate)")
  public String getFeeAmount() {
    return feeAmount;
  }

  public void setFeeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
  }

  public Overdraft1OverdraftFeeChargeDetail feeRate(String feeRate) {
    this.feeRate = feeRate;
    return this;
  }

   /**
   * Rate charged for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
   * @return feeRate
  **/
  @Schema(description = "Rate charged for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)")
  public String getFeeRate() {
    return feeRate;
  }

  public void setFeeRate(String feeRate) {
    this.feeRate = feeRate;
  }

  public Overdraft1OverdraftFeeChargeDetail feeRateType(FeeRateTypeEnum feeRateType) {
    this.feeRateType = feeRateType;
    return this;
  }

   /**
   * Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
   * @return feeRateType
  **/
  @Schema(description = "Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)")
  public FeeRateTypeEnum getFeeRateType() {
    return feeRateType;
  }

  public void setFeeRateType(FeeRateTypeEnum feeRateType) {
    this.feeRateType = feeRateType;
  }

  public Overdraft1OverdraftFeeChargeDetail applicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
    return this;
  }

   /**
   * Frequency at which the overdraft charge is applied to the account
   * @return applicationFrequency
  **/
  @Schema(required = true, description = "Frequency at which the overdraft charge is applied to the account")
  public ApplicationFrequencyEnum getApplicationFrequency() {
    return applicationFrequency;
  }

  public void setApplicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
  }

  public Overdraft1OverdraftFeeChargeDetail calculationFrequency(CalculationFrequencyEnum calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
    return this;
  }

   /**
   * How often is the overdraft fee/charge calculated for the account.
   * @return calculationFrequency
  **/
  @Schema(description = "How often is the overdraft fee/charge calculated for the account.")
  public CalculationFrequencyEnum getCalculationFrequency() {
    return calculationFrequency;
  }

  public void setCalculationFrequency(CalculationFrequencyEnum calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
  }

  public Overdraft1OverdraftFeeChargeDetail notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public Overdraft1OverdraftFeeChargeDetail addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<String>();
    }
    this.notes.add(notesItem);
    return this;
  }

   /**
   * Free text for capturing any other info related to Overdraft Fees Charge Details
   * @return notes
  **/
  @Schema(description = "Free text for capturing any other info related to Overdraft Fees Charge Details")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public Overdraft1OverdraftFeeChargeDetail otherFeeType(OtherFeeType otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }

   /**
   * Get otherFeeType
   * @return otherFeeType
  **/
  @Schema(description = "")
  public OtherFeeType getOtherFeeType() {
    return otherFeeType;
  }

  public void setOtherFeeType(OtherFeeType otherFeeType) {
    this.otherFeeType = otherFeeType;
  }

  public Overdraft1OverdraftFeeChargeDetail otherFeeRateType(OtherFeeRateType otherFeeRateType) {
    this.otherFeeRateType = otherFeeRateType;
    return this;
  }

   /**
   * Get otherFeeRateType
   * @return otherFeeRateType
  **/
  @Schema(description = "")
  public OtherFeeRateType getOtherFeeRateType() {
    return otherFeeRateType;
  }

  public void setOtherFeeRateType(OtherFeeRateType otherFeeRateType) {
    this.otherFeeRateType = otherFeeRateType;
  }

  public Overdraft1OverdraftFeeChargeDetail otherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
    return this;
  }

   /**
   * Get otherApplicationFrequency
   * @return otherApplicationFrequency
  **/
  @Schema(description = "")
  public OtherApplicationFrequency getOtherApplicationFrequency() {
    return otherApplicationFrequency;
  }

  public void setOtherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
  }

  public Overdraft1OverdraftFeeChargeDetail otherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
    return this;
  }

   /**
   * Get otherCalculationFrequency
   * @return otherCalculationFrequency
  **/
  @Schema(description = "")
  public OtherCalculationFrequency getOtherCalculationFrequency() {
    return otherCalculationFrequency;
  }

  public void setOtherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
  }

  public Overdraft1OverdraftFeeChargeDetail overdraftFeeChargeCap(Overdraft1OverdraftFeeChargeCap overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
    return this;
  }

   /**
   * Get overdraftFeeChargeCap
   * @return overdraftFeeChargeCap
  **/
  @Schema(description = "")
  public Overdraft1OverdraftFeeChargeCap getOverdraftFeeChargeCap() {
    return overdraftFeeChargeCap;
  }

  public void setOverdraftFeeChargeCap(Overdraft1OverdraftFeeChargeCap overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Overdraft1OverdraftFeeChargeDetail overdraft1OverdraftFeeChargeDetail = (Overdraft1OverdraftFeeChargeDetail) o;
    return Objects.equals(this.feeType, overdraft1OverdraftFeeChargeDetail.feeType) &&
        Objects.equals(this.overdraftControlIndicator, overdraft1OverdraftFeeChargeDetail.overdraftControlIndicator) &&
        Objects.equals(this.incrementalBorrowingAmount, overdraft1OverdraftFeeChargeDetail.incrementalBorrowingAmount) &&
        Objects.equals(this.feeAmount, overdraft1OverdraftFeeChargeDetail.feeAmount) &&
        Objects.equals(this.feeRate, overdraft1OverdraftFeeChargeDetail.feeRate) &&
        Objects.equals(this.feeRateType, overdraft1OverdraftFeeChargeDetail.feeRateType) &&
        Objects.equals(this.applicationFrequency, overdraft1OverdraftFeeChargeDetail.applicationFrequency) &&
        Objects.equals(this.calculationFrequency, overdraft1OverdraftFeeChargeDetail.calculationFrequency) &&
        Objects.equals(this.notes, overdraft1OverdraftFeeChargeDetail.notes) &&
        Objects.equals(this.otherFeeType, overdraft1OverdraftFeeChargeDetail.otherFeeType) &&
        Objects.equals(this.otherFeeRateType, overdraft1OverdraftFeeChargeDetail.otherFeeRateType) &&
        Objects.equals(this.otherApplicationFrequency, overdraft1OverdraftFeeChargeDetail.otherApplicationFrequency) &&
        Objects.equals(this.otherCalculationFrequency, overdraft1OverdraftFeeChargeDetail.otherCalculationFrequency) &&
        Objects.equals(this.overdraftFeeChargeCap, overdraft1OverdraftFeeChargeDetail.overdraftFeeChargeCap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeType, overdraftControlIndicator, incrementalBorrowingAmount, feeAmount, feeRate, feeRateType, applicationFrequency, calculationFrequency, notes, otherFeeType, otherFeeRateType, otherApplicationFrequency, otherCalculationFrequency, overdraftFeeChargeCap);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Overdraft1OverdraftFeeChargeDetail {\n");
    
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    overdraftControlIndicator: ").append(toIndentedString(overdraftControlIndicator)).append("\n");
    sb.append("    incrementalBorrowingAmount: ").append(toIndentedString(incrementalBorrowingAmount)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
    sb.append("    feeRateType: ").append(toIndentedString(feeRateType)).append("\n");
    sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
    sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
    sb.append("    otherFeeRateType: ").append(toIndentedString(otherFeeRateType)).append("\n");
    sb.append("    otherApplicationFrequency: ").append(toIndentedString(otherApplicationFrequency)).append("\n");
    sb.append("    otherCalculationFrequency: ").append(toIndentedString(otherCalculationFrequency)).append("\n");
    sb.append("    overdraftFeeChargeCap: ").append(toIndentedString(overdraftFeeChargeCap)).append("\n");
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