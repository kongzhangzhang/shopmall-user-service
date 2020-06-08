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
@Table(name = "d_commodity")
public class CommodityModel extends Sortable {
	private static final long serialVersionUID = 1L;

	//columns START
	@Column(name = "id")
	private Integer id;//"主键"

	@Column(name = "supplier")
	private String supplier;//"供应商"

	@Column(name = "commodity_name")
	private String commodityName;//"商品名称"

	@Column(name = "model")
	private String model;//"型号"

	@Column(name = "purchase_price")
	private Integer purchasePrice;//"进货价格"

	@Column(name = "sale_price")
	private Integer salePrice;//"销售价格"

	@Column(name = "is_online")
	private Integer isOnline;//"是否上架 1:是 0:否"

	@Column(name = "is_recommend")
	private Integer isRecommend;//"是否推荐 1:是 0:否"

	@Column(name = "recommend_order")
	private Integer recommendOrder;//"推荐顺序"

	@Column(name = "supplier_id")
	private Integer supplierId;//"供应商ID"

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
		
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getSupplier() {
		return this.supplier;
	}
		
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public String getCommodityName() {
		return this.commodityName;
	}
		
	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return this.model;
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
		
	public void setIsOnline(Integer isOnline) {
		this.isOnline = isOnline;
	}

	public Integer getIsOnline() {
		return this.isOnline;
	}
		
	public void setIsRecommend(Integer isRecommend) {
		this.isRecommend = isRecommend;
	}

	public Integer getIsRecommend() {
		return this.isRecommend;
	}
		
	public void setRecommendOrder(Integer recommendOrder) {
		this.recommendOrder = recommendOrder;
	}

	public Integer getRecommendOrder() {
		return this.recommendOrder;
	}
		
	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public Integer getSupplierId() {
		return this.supplierId;
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

