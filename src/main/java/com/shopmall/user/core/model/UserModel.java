/*
 * 北京果敢时代科技有限公司
 * 北京市朝阳区望京SOHO T3 B座1607
 * 邮编：100022
 * 网址：www.davdian.com
 */

package com.shopmall.user.core.model;

import javax.persistence.*;
import com.shopmall.user.common.handler.Sortable;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author  shawn
 * @version 1.0
 * @since 1.0
 */
@Table(name = "d_user")
public class UserModel extends Sortable {
	private static final long serialVersionUID = 1L;

	//columns START
	@Column(name = "id")
	private Integer id;//"主键"

	@Column(name = "user_type")
	private Integer userType;//"用户类型；0：后台账号，1：会员账号"

	@Column(name = "user_status")
	private Integer userStatus;//"用户类型；0：普通会员，1：金牌会员"

	@Column(name = "user_name")
	private String userName;//"用户名"

	@Column(name = "contact_phone")
	private String contactPhone;//"手机号"

	@Column(name = "email")
	private String email;//"email"

	@Column(name = "password")
	private String password;//"密码"

	@Column(name = "country_id")
	private Integer countryId;//"国籍"

	@Column(name = "city_id")
	private Integer cityId;//"所在城市"

	@Column(name = "last_name")
	private String lastName;//"姓"

	@Column(name = "first_name")
	private String firstName;//"名"

	@Column(name = "birthday")
	private String birthday;//"出生日期"

	@Column(name = "sex")
	private Integer sex;//"性别"

	@Column(name = "nick_name")
	private String nickName;//"昵称"

	@Column(name = "agency_name")
	private String agencyName;//"机构/学校名称"

	@Column(name = "description")
	private String description;//"个人简介（一段文字）"

	@Column(name = "head_image")
	private String headImage;//"头像（照片）"

	@Column(name = "invite_code")
	private String inviteCode;//"邀请码"

	@Column(name = "balance")
	private BigDecimal balance;//"余额"

	@Column(name = "register_time")
	private Date registerTime;//"注册时间"

	@Column(name = "status")
	private Integer status;//"状态 0：正常，1：禁用"

	@Column(name = "enabled")
	private Boolean enabled;//"状态，0=冻结，1=正常"

	@Column(name = "last_login_ip")
	private String lastLoginIp;//"最后登录IP"

	@Column(name = "last_login_time")
	private Date lastLoginTime;//"最后登录时间"

	@Column(name = "account_non_locked")
	private Boolean accountNonLocked;//"未锁定状态，1=正常，0=锁定"

	@Column(name = "account_non_expired")
	private Boolean accountNonExpired;//"账号过期状态，1=正常，0=过期"

	@Column(name = "credentials_non_expired")
	private Boolean credentialsNonExpired;//"密码失效状态：1：未失效 0：已失效"

	@Column(name = "last_password_reset")
	private Date lastPasswordReset;//"上次密码重置时间"

	@Column(name = "c_time")
	private Date ctime;//"创建时间"

	@Column(name = "u_time")
	private Date utime;//"更新时间"

	@Transient
	private String token;

	@Transient
	private String verifyCode;

	@Transient
	private String queryStr;

	@Transient
	private List<Integer> userIds;

	//columns END
		
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return this.id;
	}
		
	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public Integer getUserType() {
		return this.userType;
	}
		
	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}

	public Integer getUserStatus() {
		return this.userStatus;
	}
		
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return this.userName;
	}
		
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getContactPhone() {
		return this.contactPhone;
	}
		
	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return this.email;
	}
		
	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return this.password;
	}
		
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public Integer getCountryId() {
		return this.countryId;
	}
		
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public Integer getCityId() {
		return this.cityId;
	}
		
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return this.lastName;
	}
		
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return this.firstName;
	}
		
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getBirthday() {
		return this.birthday;
	}
		
	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getSex() {
		return this.sex;
	}
		
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getNickName() {
		return this.nickName;
	}
		
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	public String getAgencyName() {
		return this.agencyName;
	}
		
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}
		
	public void setHeadImage(String headImage) {
		this.headImage = headImage;
	}

	public String getHeadImage() {
		return this.headImage;
	}
		
	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode;
	}

	public String getInviteCode() {
		return this.inviteCode;
	}
		
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public BigDecimal getBalance() {
		return this.balance;
	}
		
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public Date getRegisterTime() {
		return this.registerTime;
	}
		
	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getStatus() {
		return this.status;
	}
		
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Boolean getEnabled() {
		return this.enabled;
	}
		
	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public String getLastLoginIp() {
		return this.lastLoginIp;
	}
		
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Date getLastLoginTime() {
		return this.lastLoginTime;
	}
		
	public void setAccountNonLocked(Boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}

	public Boolean getAccountNonLocked() {
		return this.accountNonLocked;
	}
		
	public void setAccountNonExpired(Boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}

	public Boolean getAccountNonExpired() {
		return this.accountNonExpired;
	}
		
	public void setCredentialsNonExpired(Boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}

	public Boolean getCredentialsNonExpired() {
		return this.credentialsNonExpired;
	}
		
	public void setLastPasswordReset(Date lastPasswordReset) {
		this.lastPasswordReset = lastPasswordReset;
	}

	public Date getLastPasswordReset() {
		return this.lastPasswordReset;
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

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getVerifyCode() {
		return verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

	public String getQueryStr() {
		return queryStr;
	}

	public void setQueryStr(String queryStr) {
		this.queryStr = queryStr;
	}

	public List<Integer> getUserIds() {
		return userIds;
	}

	public void setUserIds(List<Integer> userIds) {
		this.userIds = userIds;
	}

}

