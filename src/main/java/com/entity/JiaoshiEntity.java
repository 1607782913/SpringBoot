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


/**
 * 教师
 * 数据库通用操作实体类（普通增删改查）
 */
@TableName("jiaoshi")
public class JiaoshiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
	private Long id;
	private String jiaoshizhanghao;
	private String mima;
	private String jiaoshixingming;
	private String jiaoshidianhua;
	private String xingbie;
	private String zhicheng;
	private String banji;
	private String touxiang;
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

	public String getJiaoshizhanghao() {
		return jiaoshizhanghao;
	}

	public void setJiaoshizhanghao(String jiaoshizhanghao) {
		this.jiaoshizhanghao = jiaoshizhanghao;
	}

	public String getMima() {
		return mima;
	}

	public void setMima(String mima) {
		this.mima = mima;
	}

	public String getJiaoshixingming() {
		return jiaoshixingming;
	}

	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}

	public String getJiaoshidianhua() {
		return jiaoshidianhua;
	}

	public void setJiaoshidianhua(String jiaoshidianhua) {
		this.jiaoshidianhua = jiaoshidianhua;
	}

	public String getXingbie() {
		return xingbie;
	}

	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}

	public String getZhicheng() {
		return zhicheng;
	}

	public void setZhicheng(String zhicheng) {
		this.zhicheng = zhicheng;
	}

	public String getBanji() {
		return banji;
	}

	public void setBanji(String banji) {
		this.banji = banji;
	}

	public String getTouxiang() {
		return touxiang;
	}

	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
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
