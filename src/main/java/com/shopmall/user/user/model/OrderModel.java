/*
 * 北京果敢时代科技有限公司
 * 北京市朝阳区望京SOHO T3 B座1607
 * 邮编：100022
 * 网址：www.davdian.com
 */

package com.shopmall.user.user.model;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;
import com.shopmall.user.common.handler.Sortable;
/**
 * @author  shawn
 * @version 1.0
 * @since 1.0
 */
@Table(name = "d_order")
public class OrderModel extends Sortable {
	private static final long serialVersionUID = 1L;

	//columns START
	@Column(name = "id")
	private Integer id;//"主键"

	@Column(name = "order_code")
	private String orderCode;//"订单编号"

	@Column(name = "order_time")
	private Date orderTime;//"下单时间"

	@Column(name = "order_commodity_name")
	private String orderCommodityName;//"下单商品名称"

	@Column(name = "order_suer_name")
	private String orderSuerName;//"下单人"

	@Column(name = "order_money")
	private Integer orderMoney;//"下单金额"

	@Column(name = "order_mobile_phone")
	private String orderMobilePhone;//"手机号"

	@Column(name = "order_supplier_name")
	private String orderSupplierName;//"下单供应商名称"

	@Column(name = "order_status")
	private Integer orderStatus;//"订单状态：待付款=1、待发货=2、待收货=3、已收货=4、售后=5"

	@Column(name = "logistics_company")
	private String logisticsCompany;//"物流公司"

	@Column(name = "courier_number")
	private String courierNumber;//"快递单号"

	@Column(name = "return_logistics_company")
	private String returnLogisticsCompany;//"退货物流公司"

	@Column(name = "return_courier_number")
	private String returnCourierNumber;//"退货快递单号"

	@Column(name = "receiving_address")
	private String receivingAddress;//"收货地址"

	@Column(name = "commodity_id")
	private String commodityId;//"商品ID"

	@Column(name = "suer_id")
	private String suerId;//"下单人ID"

	@Column(name = "supplier_id")
	private String supplierId;//"供应商ID"

	@Column(name = "c_time")
	private Date ctime;//"创建时间"

	@Column(name = "u_time")
	private Date utime;//"更新时间"

	//columns END
		
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return this.id;
	}
		
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOrderCode() {
		return this.orderCode;
	}
		
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public Date getOrderTime() {
		return this.orderTime;
	}
		
	public void setOrderCommodityName(String orderCommodityName) {
		this.orderCommodityName = orderCommodityName;
	}

	public String getOrderCommodityName() {
		return this.orderCommodityName;
	}
		
	public void setOrderSuerName(String orderSuerName) {
		this.orderSuerName = orderSuerName;
	}

	public String getOrderSuerName() {
		return this.orderSuerName;
	}
		
	public void setOrderMoney(Integer orderMoney) {
		this.orderMoney = orderMoney;
	}

	public Integer getOrderMoney() {
		return this.orderMoney;
	}
		
	public void setOrderMobilePhone(String orderMobilePhone) {
		this.orderMobilePhone = orderMobilePhone;
	}

	public String getOrderMobilePhone() {
		return this.orderMobilePhone;
	}
		
	public void setOrderSupplierName(String orderSupplierName) {
		this.orderSupplierName = orderSupplierName;
	}

	public String getOrderSupplierName() {
		return this.orderSupplierName;
	}
		
	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Integer getOrderStatus() {
		return this.orderStatus;
	}
		
	public void setLogisticsCompany(String logisticsCompany) {
		this.logisticsCompany = logisticsCompany;
	}

	public String getLogisticsCompany() {
		return this.logisticsCompany;
	}
		
	public void setCourierNumber(String courierNumber) {
		this.courierNumber = courierNumber;
	}

	public String getCourierNumber() {
		return this.courierNumber;
	}
		
	public void setReturnLogisticsCompany(String returnLogisticsCompany) {
		this.returnLogisticsCompany = returnLogisticsCompany;
	}

	public String getReturnLogisticsCompany() {
		return this.returnLogisticsCompany;
	}
		
	public void setReturnCourierNumber(String returnCourierNumber) {
		this.returnCourierNumber = returnCourierNumber;
	}

	public String getReturnCourierNumber() {
		return this.returnCourierNumber;
	}
		
	public void setReceivingAddress(String receivingAddress) {
		this.receivingAddress = receivingAddress;
	}

	public String getReceivingAddress() {
		return this.receivingAddress;
	}
		
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public String getCommodityId() {
		return this.commodityId;
	}
		
	public void setSuerId(String suerId) {
		this.suerId = suerId;
	}

	public String getSuerId() {
		return this.suerId;
	}
		
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
		
	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public Date getCtime() {
		return this.ctime;
	}
		
	public void setUtime(Date utime) {
		this.utime = utime;
	}

	public Date getUtime() {
		return this.utime;
	}

}

