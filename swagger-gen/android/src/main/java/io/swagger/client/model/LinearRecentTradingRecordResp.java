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
public class LinearRecentTradingRecordResp {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("price")
  private Double price = null;
  @SerializedName("qty")
  private Double qty = null;
  @SerializedName("side")
  private String side = null;
  @SerializedName("symbol")
  private String symbol = null;
  @SerializedName("time")
  private String time = null;
  @SerializedName("trade_time_ms")
  private Long tradeTimeMs = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getPrice() {
    return price;
  }
  public void setPrice(Double price) {
    this.price = price;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getQty() {
    return qty;
  }
  public void setQty(Double qty) {
    this.qty = qty;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSide() {
    return side;
  }
  public void setSide(String side) {
    this.side = side;
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

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTime() {
    return time;
  }
  public void setTime(String time) {
    this.time = time;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getTradeTimeMs() {
    return tradeTimeMs;
  }
  public void setTradeTimeMs(Long tradeTimeMs) {
    this.tradeTimeMs = tradeTimeMs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinearRecentTradingRecordResp linearRecentTradingRecordResp = (LinearRecentTradingRecordResp) o;
    return (this.id == null ? linearRecentTradingRecordResp.id == null : this.id.equals(linearRecentTradingRecordResp.id)) &&
        (this.price == null ? linearRecentTradingRecordResp.price == null : this.price.equals(linearRecentTradingRecordResp.price)) &&
        (this.qty == null ? linearRecentTradingRecordResp.qty == null : this.qty.equals(linearRecentTradingRecordResp.qty)) &&
        (this.side == null ? linearRecentTradingRecordResp.side == null : this.side.equals(linearRecentTradingRecordResp.side)) &&
        (this.symbol == null ? linearRecentTradingRecordResp.symbol == null : this.symbol.equals(linearRecentTradingRecordResp.symbol)) &&
        (this.time == null ? linearRecentTradingRecordResp.time == null : this.time.equals(linearRecentTradingRecordResp.time)) &&
        (this.tradeTimeMs == null ? linearRecentTradingRecordResp.tradeTimeMs == null : this.tradeTimeMs.equals(linearRecentTradingRecordResp.tradeTimeMs));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.price == null ? 0: this.price.hashCode());
    result = 31 * result + (this.qty == null ? 0: this.qty.hashCode());
    result = 31 * result + (this.side == null ? 0: this.side.hashCode());
    result = 31 * result + (this.symbol == null ? 0: this.symbol.hashCode());
    result = 31 * result + (this.time == null ? 0: this.time.hashCode());
    result = 31 * result + (this.tradeTimeMs == null ? 0: this.tradeTimeMs.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinearRecentTradingRecordResp {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  qty: ").append(qty).append("\n");
    sb.append("  side: ").append(side).append("\n");
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  time: ").append(time).append("\n");
    sb.append("  tradeTimeMs: ").append(tradeTimeMs).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}