=begin
#Bybit API

### REST API for the Bybit Exchange. Base URI: [https://api.bybit.com]  

OpenAPI spec version: 0.2.10
Contact: support@bybit.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.8

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for SwaggerClient::LinearCancelStopOrderResult
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'LinearCancelStopOrderResult' do
  before do
    # run before each test
    @instance = SwaggerClient::LinearCancelStopOrderResult.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of LinearCancelStopOrderResult' do
    it 'should create an instance of LinearCancelStopOrderResult' do
      expect(@instance).to be_instance_of(SwaggerClient::LinearCancelStopOrderResult)
    end
  end
  describe 'test attribute "stop_order_id"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
