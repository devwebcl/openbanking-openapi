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
import io.swagger.client.model.OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Details about the interest that may be payable to the SME Loan holders
 */
@Schema(description = "Details about the interest that may be payable to the SME Loan holders")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-21T12:56:57.444774-03:00[America/Santiago]")
public class OBReadProduct2DataOtherProductTypeLoanInterest {
  @SerializedName("Notes")
  private List<String> notes = null;

  @SerializedName("LoanInterestTierBandSet")
  private List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet> loanInterestTierBandSet = new ArrayList<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet>();

  public OBReadProduct2DataOtherProductTypeLoanInterest notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterest addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<String>();
    }
    this.notes.add(notesItem);
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @Schema(description = "")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterest loanInterestTierBandSet(List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet> loanInterestTierBandSet) {
    this.loanInterestTierBandSet = loanInterestTierBandSet;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterest addLoanInterestTierBandSetItem(OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet loanInterestTierBandSetItem) {
    this.loanInterestTierBandSet.add(loanInterestTierBandSetItem);
    return this;
  }

   /**
   * Get loanInterestTierBandSet
   * @return loanInterestTierBandSet
  **/
  @Schema(required = true, description = "")
  public List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet> getLoanInterestTierBandSet() {
    return loanInterestTierBandSet;
  }

  public void setLoanInterestTierBandSet(List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet> loanInterestTierBandSet) {
    this.loanInterestTierBandSet = loanInterestTierBandSet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataOtherProductTypeLoanInterest obReadProduct2DataOtherProductTypeLoanInterest = (OBReadProduct2DataOtherProductTypeLoanInterest) o;
    return Objects.equals(this.notes, obReadProduct2DataOtherProductTypeLoanInterest.notes) &&
        Objects.equals(this.loanInterestTierBandSet, obReadProduct2DataOtherProductTypeLoanInterest.loanInterestTierBandSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes, loanInterestTierBandSet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeLoanInterest {\n");
    
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    loanInterestTierBandSet: ").append(toIndentedString(loanInterestTierBandSet)).append("\n");
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
