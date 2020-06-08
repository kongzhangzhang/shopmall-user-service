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
@Table(name = "d_coupon")
public class CouponModel extends Sortable {
	private static final long serialVersionUID = 1L;

	//columns START
	@Column(name = "id")
	private Integer id;//"主键"

	@Column(name = "coupon_name")
	private String couponName;//"优惠卷名称"

	@Column(name = "satisfy_money")
	private Integer satisfyMoney;//"满足金额"

	@Column(name = "deduction_money")
	private Integer deductionMoney;//"扣减金额"

	@Column(name = "start_time")
	private Date startTime;//"开始时间"

	@Column(name = "end_time")
	private Date endTime;//"结束时间"

	@Column(name = "supplier_id")
	private String supplierId;//"供应商ID"

	@Column(name = "supplier_name")
	private String supplierName;//"供应商名称"

	@Column(name = "create_user_id")
	private Integer createUserId;//"创建人"

	@Column(name = "create_user_name")
	private String createUserName;//"创建人"

	@Column(name = "update_user_id")
	private Integer updateUserId;//"最后修改人"

	@Column(name = "update_user_name")
	private String updateUserName;//"修改人"

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
		
	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public String getCouponName() {
		return this.couponName;
	}
		
	public void setSatisfyMoney(Integer satisfyMoney) {
		this.satisfyMoney = satisfyMoney;
	}

	public Integer getSatisfyMoney() {
		return this.satisfyMoney;
	}
		
	public void setDeductionMoney(Integer deductionMoney) {
		this.deductionMoney = deductionMoney;
	}

	public Integer getDeductionMoney() {
		return this.deductionMoney;
	}
		
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getStartTime() {
		return this.startTime;
	}
		
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}
		
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
		
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierName() {
		return this.supplierName;
	}
		
	public void setCreateUserId(Integer createUserId) {
		this.createUserId = createUserId;
	}

	public Integer getCreateUserId() {
		return this.createUserId;
	}
		
	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}

	public String getCreateUserName() {
		return this.createUserName;
	}
		
	public void setUpdateUserId(Integer updateUserId) {
		this.updateUserId = updateUserId;
	}

	public Integer getUpdateUserId() {
		return this.updateUserId;
	}
		
	public void setUpdateUserName(String updateUserName) {
		this.updateUserName = updateUserName;
	}

	public String getUpdateUserName() {
		return this.updateUserName;
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

