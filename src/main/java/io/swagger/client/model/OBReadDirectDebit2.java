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
import io.swagger.client.model.Links;
import io.swagger.client.model.Meta;
import io.swagger.client.model.OBReadDirectDebit2Data;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * OBReadDirectDebit2
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-21T12:56:57.444774-03:00[America/Santiago]")
public class OBReadDirectDebit2 {
  @SerializedName("Data")
  private OBReadDirectDebit2Data data = null;

  @SerializedName("Links")
  private Links links = null;

  @SerializedName("Meta")
  private Meta meta = null;

  public OBReadDirectDebit2 data(OBReadDirectDebit2Data data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(required = true, description = "")
  public OBReadDirectDebit2Data getData() {
    return data;
  }

  public void setData(OBReadDirectDebit2Data data) {
    this.data = data;
  }

  public OBReadDirectDebit2 links(Links links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @Schema(description = "")
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public OBReadDirectDebit2 meta(Meta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @Schema(description = "")
  public Meta getMeta() {
    return meta;
  }

  public void setMeta(Meta meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadDirectDebit2 obReadDirectDebit2 = (OBReadDirectDebit2) o;
    return Objects.equals(this.data, obReadDirectDebit2.data) &&
        Objects.equals(this.links, obReadDirectDebit2.links) &&
        Objects.equals(this.meta, obReadDirectDebit2.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadDirectDebit2 {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
