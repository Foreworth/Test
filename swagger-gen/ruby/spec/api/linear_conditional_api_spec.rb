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

# Unit tests for SwaggerClient::LinearConditionalApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'LinearConditionalApi' do
  before do
    # run before each test
    @instance = SwaggerClient::LinearConditionalApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of LinearConditionalApi' do
    it 'should create an instance of LinearConditionalApi' do
      expect(@instance).to be_instance_of(SwaggerClient::LinearConditionalApi)
    end
  end

  # unit tests for linear_conditional_cancel
  # Cancel Active Order
  # This will cancel linear active order
  # @param [Hash] opts the optional parameters
  # @option opts [String] :stop_order_id 
  # @option opts [String] :order_link_id 
  # @option opts [String] :symbol 
  # @return [Object]
  describe 'linear_conditional_cancel test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for linear_conditional_cancel_all
  # Cancel all stop orders.
  # @param symbol Contract type.
  # @param [Hash] opts the optional parameters
  # @return [Object]
  describe 'linear_conditional_cancel_all test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for linear_conditional_get_orders
  # Get linear Stop Orders
  # This will get linear active orders
  # @param [Hash] opts the optional parameters
  # @option opts [String] :stop_order_id 
  # @option opts [String] :order_link_id 
  # @option opts [String] :symbol 
  # @option opts [String] :order 
  # @option opts [String] :page 
  # @option opts [String] :limit 
  # @option opts [String] :stop_order_status 
  # @return [Object]
  describe 'linear_conditional_get_orders test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for linear_conditional_new
  # Create linear stop Order
  # This will create linear stop order
  # @param [Hash] opts the optional parameters
  # @option opts [String] :symbol 
  # @option opts [String] :side 
  # @option opts [String] :order_type 
  # @option opts [Float] :qty 
  # @option opts [Float] :price 
  # @option opts [Float] :base_price 
  # @option opts [Float] :stop_px 
  # @option opts [String] :time_in_force 
  # @option opts [String] :trigger_by 
  # @option opts [BOOLEAN] :reduce_only 
  # @option opts [BOOLEAN] :close_on_trigger 
  # @option opts [String] :order_link_id 
  # @option opts [Float] :take_profit 
  # @option opts [Float] :stop_loss 
  # @option opts [String] :tp_trigger_by 
  # @option opts [String] :sl_trigger_by 
  # @return [Object]
  describe 'linear_conditional_new test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for linear_conditional_query
  # Get Stop Orders(real-time)
  # This will get linear stop orders(real-time)
  # @param [Hash] opts the optional parameters
  # @option opts [String] :symbol 
  # @option opts [String] :stop_order_id 
  # @option opts [String] :order_link_id 
  # @return [Object]
  describe 'linear_conditional_query test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for linear_conditional_replace
  # Replace conditional order
  # @param symbol 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :stop_order_id 
  # @option opts [String] :order_link_id 
  # @option opts [String] :p_r_qty 
  # @option opts [Float] :p_r_price 
  # @option opts [Float] :p_r_trigger_price 
  # @return [Object]
  describe 'linear_conditional_replace test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
