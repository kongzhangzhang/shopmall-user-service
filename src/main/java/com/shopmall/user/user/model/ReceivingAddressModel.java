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
@Table(name = "d_receiving_address")
public class ReceivingAddressModel extends Sortable {
	private static final long serialVersionUID = 1L;

	//columns START
	@Column(name = "id")
	private Integer id;//"主键"

	@Column(name = "consignee")
	private String consignee;//"收货人"

	@Column(name = "mobile_phone")
	private String mobilePhone;//"手机号"

	@Column(name = "receiving_address")
	private String receivingAddress;//"收货地址"

	@Column(name = "user_id")
	private String userId;//"用户ID"

	@Column(name = "is_default")
	private Integer isDefault;//"是否为默认地址，0代表否，1代表是"

	@Column(name = "sort")
	private Integer sort;//"排序"

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
		
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public String getConsignee() {
		return this.consignee;
	}
		
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}
		
	public void setReceivingAddress(String receivingAddress) {
		this.receivingAddress = receivingAddress;
	}

	public String getReceivingAddress() {
		return this.receivingAddress;
	}
		
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserId() {
		return this.userId;
	}
		
	public void setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
	}

	public Integer getIsDefault() {
		return this.isDefault;
	}
		
	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getSort() {
		return this.sort;
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

