package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

@TableName("jiazhang")
public class JiazhangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
	private Long id;
	private String jiazhangzhanghao;
	private String mima;
	private String jiazhangxingming;
	private String jiazhangdianhua;
	private String guanxi;
	private String xingbie;
	private String touxiang;
	private String xueshengxingming;
	private String banji;
	private String hxusername;
	private String hxpassword;


	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJiazhangzhanghao() {
		return jiazhangzhanghao;
	}

	public void setJiazhangzhanghao(String jiazhangzhanghao) {
		this.jiazhangzhanghao = jiazhangzhanghao;
	}

	public String getMima() {
		return mima;
	}

	public void setMima(String mima) {
		this.mima = mima;
	}

	public String getJiazhangxingming() {
		return jiazhangxingming;
	}

	public void setJiazhangxingming(String jiazhangxingming) {
		this.jiazhangxingming = jiazhangxingming;
	}

	public String getJiazhangdianhua() {
		return jiazhangdianhua;
	}

	public void setJiazhangdianhua(String jiazhangdianhua) {
		this.jiazhangdianhua = jiazhangdianhua;
	}

	public String getGuanxi() {
		return guanxi;
	}

	public void setGuanxi(String guanxi) {
		this.guanxi = guanxi;
	}

	public String getXingbie() {
		return xingbie;
	}

	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}

	public String getTouxiang() {
		return touxiang;
	}

	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}

	public String getXueshengxingming() {
		return xueshengxingming;
	}

	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}

	public String getBanji() {
		return banji;
	}

	public void setBanji(String banji) {
		this.banji = banji;
	}

	public String getHxusername() {
		return hxusername;
	}

	public void setHxusername(String hxusername) {
		this.hxusername = hxusername;
	}

	public String getHxpassword() {
		return hxpassword;
	}

	public void setHxpassword(String hxpassword) {
		this.hxpassword = hxpassword;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}



}
