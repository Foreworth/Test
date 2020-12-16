/**
 * Bybit API
 * ## REST API for the Bybit Exchange. Base URI: [https://api.bybit.com]  
 *
 * OpenAPI spec version: 0.2.10
 * Contact: support@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.client.model.LinearListStopOrderResult;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class LinearStopOrderRecordsResponse {
  
  @SerializedName("current_page")
  private Long currentPage = null;
  @SerializedName("last_page")
  private Long lastPage = null;
  @SerializedName("data")
  private List<LinearListStopOrderResult> data = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getCurrentPage() {
    return currentPage;
  }
  public void setCurrentPage(Long currentPage) {
    this.currentPage = currentPage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getLastPage() {
    return lastPage;
  }
  public void setLastPage(Long lastPage) {
    this.lastPage = lastPage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<LinearListStopOrderResult> getData() {
    return data;
  }
  public void setData(List<LinearListStopOrderResult> data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinearStopOrderRecordsResponse linearStopOrderRecordsResponse = (LinearStopOrderRecordsResponse) o;
    return (this.currentPage == null ? linearStopOrderRecordsResponse.currentPage == null : this.currentPage.equals(linearStopOrderRecordsResponse.currentPage)) &&
        (this.lastPage == null ? linearStopOrderRecordsResponse.lastPage == null : this.lastPage.equals(linearStopOrderRecordsResponse.lastPage)) &&
        (this.data == null ? linearStopOrderRecordsResponse.data == null : this.data.equals(linearStopOrderRecordsResponse.data));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.currentPage == null ? 0: this.currentPage.hashCode());
    result = 31 * result + (this.lastPage == null ? 0: this.lastPage.hashCode());
    result = 31 * result + (this.data == null ? 0: this.data.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinearStopOrderRecordsResponse {\n");
    
    sb.append("  currentPage: ").append(currentPage).append("\n");
    sb.append("  lastPage: ").append(lastPage).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}