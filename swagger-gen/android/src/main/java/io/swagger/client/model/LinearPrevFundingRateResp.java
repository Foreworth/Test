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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class LinearPrevFundingRateResp {
  
  @SerializedName("funding_rate")
  private Double fundingRate = null;
  @SerializedName("funding_rate_timestamp")
  private String fundingRateTimestamp = null;
  @SerializedName("symbol")
  private String symbol = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getFundingRate() {
    return fundingRate;
  }
  public void setFundingRate(Double fundingRate) {
    this.fundingRate = fundingRate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFundingRateTimestamp() {
    return fundingRateTimestamp;
  }
  public void setFundingRateTimestamp(String fundingRateTimestamp) {
    this.fundingRateTimestamp = fundingRateTimestamp;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinearPrevFundingRateResp linearPrevFundingRateResp = (LinearPrevFundingRateResp) o;
    return (this.fundingRate == null ? linearPrevFundingRateResp.fundingRate == null : this.fundingRate.equals(linearPrevFundingRateResp.fundingRate)) &&
        (this.fundingRateTimestamp == null ? linearPrevFundingRateResp.fundingRateTimestamp == null : this.fundingRateTimestamp.equals(linearPrevFundingRateResp.fundingRateTimestamp)) &&
        (this.symbol == null ? linearPrevFundingRateResp.symbol == null : this.symbol.equals(linearPrevFundingRateResp.symbol));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fundingRate == null ? 0: this.fundingRate.hashCode());
    result = 31 * result + (this.fundingRateTimestamp == null ? 0: this.fundingRateTimestamp.hashCode());
    result = 31 * result + (this.symbol == null ? 0: this.symbol.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinearPrevFundingRateResp {\n");
    
    sb.append("  fundingRate: ").append(fundingRate).append("\n");
    sb.append("  fundingRateTimestamp: ").append(fundingRateTimestamp).append("\n");
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
