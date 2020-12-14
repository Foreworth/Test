//
// LinearOrderRecordsResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct LinearOrderRecordsResponse: Codable {

    public var currentPage: Int64?
    public var data: [LinearListOrderResult]?

    public init(currentPage: Int64?, data: [LinearListOrderResult]?) {
        self.currentPage = currentPage
        self.data = data
    }

    public enum CodingKeys: String, CodingKey { 
        case currentPage = "current_page"
        case data
    }


}

