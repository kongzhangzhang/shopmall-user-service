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
@Table(name = "d_supplier")
public class SupplierModel extends Sortable {
	private static final long serialVersionUID = 1L;

	//columns START
	@Column(name = "id")
	private Integer id;//"主键"

	@Column(name = "supplier_name")
	private String supplierName;//"供应商名称"

	@Column(name = "supplier_account_number")
	private String supplierAccountNumber;//"供应商账号"

	@Column(name = "supplier_publicity_map")
	private String supplierPublicityMap;//"供应商宣传图"

	@Column(name = "supplier_introduce")
	private String supplierIntroduce;//"供应商介绍"

	@Column(name = "suser_id")
	private Integer suserId;//"用户ID"

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
		
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierName() {
		return this.supplierName;
	}
		
	public void setSupplierAccountNumber(String supplierAccountNumber) {
		this.supplierAccountNumber = supplierAccountNumber;
	}

	public String getSupplierAccountNumber() {
		return this.supplierAccountNumber;
	}
		
	public void setSupplierPublicityMap(String supplierPublicityMap) {
		this.supplierPublicityMap = supplierPublicityMap;
	}

	public String getSupplierPublicityMap() {
		return this.supplierPublicityMap;
	}
		
	public void setSupplierIntroduce(String supplierIntroduce) {
		this.supplierIntroduce = supplierIntroduce;
	}

	public String getSupplierIntroduce() {
		return this.supplierIntroduce;
	}
		
	public void setSuserId(Integer suserId) {
		this.suserId = suserId;
	}

	public Integer getSuserId() {
		return this.suserId;
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

