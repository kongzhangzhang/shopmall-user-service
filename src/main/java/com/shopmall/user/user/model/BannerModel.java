/*
 * 北京果敢时代科技有限公司
 * 北京市朝阳区望京SOHO T3 B座1607
 * 邮编：100022
 * 网址：www.davdian.com
 */

package com.shopmall.user.user.model;

import com.shopmall.user.common.handler.Sortable;

import javax.persistence.*;
import java.util.Date;

/**
 * @author  shawn
 * @version 1.0
 * @since 1.0
 */
@Table(name = "d_banner")
public class BannerModel extends Sortable {
	private static final long serialVersionUID = 1L;

	//columns START
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;//"主键"

	@Column(name = "link")
	private String link;//"banner图片"

	@Column(name = "status")
	private Integer status;//"是否生效"

	@Column(name = "user_id")
	private Integer userId;//"创建人"

	@Column(name = "sort")
	private Integer sort;//"排序"

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
		
	public void setLink(String link) {
		this.link = link;
	}

	public String getLink() {
		return this.link;
	}
		
	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getStatus() {
		return this.status;
	}
		
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getUserId() {
		return this.userId;
	}
		
	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getSort() {
		return this.sort;
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

