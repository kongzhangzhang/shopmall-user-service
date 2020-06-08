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
@Table(name = "d_reconciliation")
public class ReconciliationModel extends Sortable {
	private static final long serialVersionUID = 1L;

	//columns START
	@Column(name = "id")
	private Integer id;//"主键"

	@Column(name = "supplier_name")
	private String supplierName;//"供应商名称"

	@Column(name = "commodity_name")
	private String commodityName;//"商品名称"

	@Column(name = "r_type")
	private String rtype;//"类型"

	@Column(name = "r_operation")
	private String roperation;//"操作"

	@Column(name = "purchase_price")
	private Integer purchasePrice;//"进货价格"

	@Column(name = "sale_price")
	private Integer salePrice;//"销售价格"

	@Column(name = "balance")
	private Integer balance;//"余额"

	@Column(name = "order_code")
	private String orderCode;//"订单编号"

	@Column(name = "create_user_id")
	private Integer createUserId;//"创建人"

	@Column(name = "update_user_id")
	private Integer updateUserId;//"最后修改人"

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
		
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierName() {
		return this.supplierName;
	}
		
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public String getCommodityName() {
		return this.commodityName;
	}
		
	public void setRtype(String rtype) {
		this.rtype = rtype;
	}

	public String getRtype() {
		return this.rtype;
	}
		
	public void setRoperation(String roperation) {
		this.roperation = roperation;
	}

	public String getRoperation() {
		return this.roperation;
	}
		
	public void setPurchasePrice(Integer purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Integer getPurchasePrice() {
		return this.purchasePrice;
	}
		
	public void setSalePrice(Integer salePrice) {
		this.salePrice = salePrice;
	}

	public Integer getSalePrice() {
		return this.salePrice;
	}
		
	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public Integer getBalance() {
		return this.balance;
	}
		
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOrderCode() {
		return this.orderCode;
	}
		
	public void setCreateUserId(Integer createUserId) {
		this.createUserId = createUserId;
	}

	public Integer getCreateUserId() {
		return this.createUserId;
	}
		
	public void setUpdateUserId(Integer updateUserId) {
		this.updateUserId = updateUserId;
	}

	public Integer getUpdateUserId() {
		return this.updateUserId;
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

