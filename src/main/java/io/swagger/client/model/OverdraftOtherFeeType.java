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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Other fee type code which is not available in the standard code set
 */
@Schema(description = "Other fee type code which is not available in the standard code set")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-21T12:56:57.444774-03:00[America/Santiago]")
public class OverdraftOtherFeeType {
  @SerializedName("Code")
  private String code = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Description")
  private String description = null;

  public OverdraftOtherFeeType code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The four letter Mnemonic used within an XML file to identify a code
   * @return code
  **/
  @Schema(description = "The four letter Mnemonic used within an XML file to identify a code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OverdraftOtherFeeType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Long name associated with the code
   * @return name
  **/
  @Schema(required = true, description = "Long name associated with the code")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OverdraftOtherFeeType description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description to describe the purpose of the code
   * @return description
  **/
  @Schema(required = true, description = "Description to describe the purpose of the code")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OverdraftOtherFeeType overdraftOtherFeeType = (OverdraftOtherFeeType) o;
    return Objects.equals(this.code, overdraftOtherFeeType.code) &&
        Objects.equals(this.name, overdraftOtherFeeType.name) &&
        Objects.equals(this.description, overdraftOtherFeeType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverdraftOtherFeeType {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
