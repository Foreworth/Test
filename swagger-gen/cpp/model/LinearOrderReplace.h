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
 * LinearOrderReplace.h
 *
 * replace order can modify/amend your active orders
 */

#ifndef IO_SWAGGER_CLIENT_MODEL_LinearOrderReplace_H_
#define IO_SWAGGER_CLIENT_MODEL_LinearOrderReplace_H_


#include "../ModelBase.h"

#include <cpprest/details/basic_types.h>
#include "Object.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// replace order can modify/amend your active orders
/// </summary>
class  LinearOrderReplace
    : public ModelBase
{
public:
    LinearOrderReplace();
    virtual ~LinearOrderReplace();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// LinearOrderReplace members

    /// <summary>
    /// 
    /// </summary>
    double getRetCode() const;
    bool retCodeIsSet() const;
    void unsetRet_code();
    void setRetCode(double value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getRetMsg() const;
    bool retMsgIsSet() const;
    void unsetRet_msg();
    void setRetMsg(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getExtCode() const;
    bool extCodeIsSet() const;
    void unsetExt_code();
    void setExtCode(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getExtInfo() const;
    bool extInfoIsSet() const;
    void unsetExt_info();
    void setExtInfo(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Object> getResult() const;
    bool resultIsSet() const;
    void unsetResult();
    void setResult(std::shared_ptr<Object> value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getTimeNow() const;
    bool timeNowIsSet() const;
    void unsetTime_now();
    void setTimeNow(utility::string_t value);

protected:
    double m_Ret_code;
    bool m_Ret_codeIsSet;
    utility::string_t m_Ret_msg;
    bool m_Ret_msgIsSet;
    utility::string_t m_Ext_code;
    bool m_Ext_codeIsSet;
    utility::string_t m_Ext_info;
    bool m_Ext_infoIsSet;
    std::shared_ptr<Object> m_Result;
    bool m_ResultIsSet;
    utility::string_t m_Time_now;
    bool m_Time_nowIsSet;
};

}
}
}
}

#endif /* IO_SWAGGER_CLIENT_MODEL_LinearOrderReplace_H_ */
