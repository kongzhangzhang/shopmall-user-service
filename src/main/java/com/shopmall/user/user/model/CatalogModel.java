/*
 * 北京果敢时代科技有限公司
 * 北京市朝阳区望京SOHO T3 B座1607
 * 邮编：100022
 * 网址：www.davdian.com
 */

package com.shopmall.user.user.model;

import com.shopmall.user.common.handler.Sortable;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author  shawn
 * @version 1.0
 * @since 1.0
 */
@Table(name = "d_catalog")
public class CatalogModel extends Sortable {
	private static final long serialVersionUID = 1L;

	//columns START
	@Column(name = "id")
	private Integer id;//"主键"

	@Column(name = "catalog_name")
	private String catalogName;//"类目名称"

	@Column(name = "action")
	private String action;//"请求链接"

	@Column(name = "icon")
	private String icon;//"菜单图标"

	@Column(name = "status")
	private Integer status;//"是否启用（0：不启用，1：启用）"

	@Column(name = "user_id")
	private String userId;//"用户ID"

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
		
	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
	}

	public String getCatalogName() {
		return this.catalogName;
	}
		
	public void setAction(String action) {
		this.action = action;
	}

	public String getAction() {
		return this.action;
	}
		
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getIcon() {
		return this.icon;
	}
		
	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getStatus() {
		return this.status;
	}
		
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserId() {
		return this.userId;
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

