/**
 * Bybit API
 * ## REST API for the Bybit Exchange. Base URI: [https://api.bybit.com]  
 *
 * OpenAPI spec version: 0.2.10
 * Contact: support@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator 2.4.8.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

/*
 * LinearPositionListResult.h
 *
 * 
 */

#ifndef IO_SWAGGER_CLIENT_MODEL_LinearPositionListResult_H_
#define IO_SWAGGER_CLIENT_MODEL_LinearPositionListResult_H_


#include "../ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  LinearPositionListResult
    : public ModelBase
{
public:
    LinearPositionListResult();
    virtual ~LinearPositionListResult();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// LinearPositionListResult members

    /// <summary>
    /// 
    /// </summary>
    double getBustPrice() const;
    bool bustPriceIsSet() const;
    void unsetBust_price();
    void setBustPrice(double value);
    /// <summary>
    /// 
    /// </summary>
    double getCumRealisedPnl() const;
    bool cumRealisedPnlIsSet() const;
    void unsetCum_realised_pnl();
    void setCumRealisedPnl(double value);
    /// <summary>
    /// 
    /// </summary>
    double getEntryPrice() const;
    bool entryPriceIsSet() const;
    void unsetEntry_price();
    void setEntryPrice(double value);
    /// <summary>
    /// 
    /// </summary>
    double getFreeQty() const;
    bool freeQtyIsSet() const;
    void unsetFree_qty();
    void setFreeQty(double value);
    /// <summary>
    /// 
    /// </summary>
    double getLeverage() const;
    bool leverageIsSet() const;
    void unsetLeverage();
    void setLeverage(double value);
    /// <summary>
    /// 
    /// </summary>
    double getLiqPrice() const;
    bool liqPriceIsSet() const;
    void unsetLiq_price();
    void setLiqPrice(double value);
    /// <summary>
    /// 
    /// </summary>
    double getOccClosingFee() const;
    bool occClosingFeeIsSet() const;
    void unsetOcc_closing_fee();
    void setOccClosingFee(double value);
    /// <summary>
    /// 
    /// </summary>
    double getPositionMargin() const;
    bool positionMarginIsSet() const;
    void unsetPosition_margin();
    void setPositionMargin(double value);
    /// <summary>
    /// 
    /// </summary>
    double getPositionValue() const;
    bool positionValueIsSet() const;
    void unsetPosition_value();
    void setPositionValue(double value);
    /// <summary>
    /// 
    /// </summary>
    double getRealisedPnl() const;
    bool realisedPnlIsSet() const;
    void unsetRealised_pnl();
    void setRealisedPnl(double value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getSide() const;
    bool sideIsSet() const;
    void unsetSide();
    void setSide(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    double getSize() const;
    bool sizeIsSet() const;
    void unsetSize();
    void setSize(double value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getSymbol() const;
    bool symbolIsSet() const;
    void unsetSymbol();
    void setSymbol(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    int64_t getUserId() const;
    bool userIdIsSet() const;
    void unsetUser_id();
    void setUserId(int64_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getTpSlMode() const;
    bool tpSlModeIsSet() const;
    void unsetTp_sl_mode();
    void setTpSlMode(utility::string_t value);

protected:
    double m_Bust_price;
    bool m_Bust_priceIsSet;
    double m_Cum_realised_pnl;
    bool m_Cum_realised_pnlIsSet;
    double m_Entry_price;
    bool m_Entry_priceIsSet;
    double m_Free_qty;
    bool m_Free_qtyIsSet;
    double m_Leverage;
    bool m_LeverageIsSet;
    double m_Liq_price;
    bool m_Liq_priceIsSet;
    double m_Occ_closing_fee;
    bool m_Occ_closing_feeIsSet;
    double m_Position_margin;
    bool m_Position_marginIsSet;
    double m_Position_value;
    bool m_Position_valueIsSet;
    double m_Realised_pnl;
    bool m_Realised_pnlIsSet;
    utility::string_t m_Side;
    bool m_SideIsSet;
    double m_Size;
    bool m_SizeIsSet;
    utility::string_t m_Symbol;
    bool m_SymbolIsSet;
    int64_t m_User_id;
    bool m_User_idIsSet;
    utility::string_t m_Tp_sl_mode;
    bool m_Tp_sl_modeIsSet;
};

}
}
}
}

#endif /* IO_SWAGGER_CLIENT_MODEL_LinearPositionListResult_H_ */
