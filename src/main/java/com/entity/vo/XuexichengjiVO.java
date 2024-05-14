package com.entity.vo;

import com.entity.XuexichengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

public class XuexichengjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	private String xueshengxingming;
	private String banji;
	private String jiaoshizhanghao;
	private String jiaoshixingming;
	private String kechengkemu;
	private String fenshu;
	private String shifouhege;
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaoshishijian;
	private String fengmian;
	private String beizhu;
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}

	public String getXueshengxingming() {
		return xueshengxingming;
	}

	public void setBanji(String banji) {
		this.banji = banji;
	}

	public String getBanji() {
		return banji;
	}
	 
	public void setJiaoshizhanghao(String jiaoshizhanghao) {
		this.jiaoshizhanghao = jiaoshizhanghao;
	}

	public String getJiaoshizhanghao() {
		return jiaoshizhanghao;
	}
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}

	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
	 
	public void setKechengkemu(String kechengkemu) {
		this.kechengkemu = kechengkemu;
	}

	public String getKechengkemu() {
		return kechengkemu;
	}

	public void setFenshu(String fenshu) {
		this.fenshu = fenshu;
	}

	public String getFenshu() {
		return fenshu;
	}
	 
	public void setShifouhege(String shifouhege) {
		this.shifouhege = shifouhege;
	}

	public String getShifouhege() {
		return shifouhege;
	}
	 
	public void setKaoshishijian(Date kaoshishijian) {
		this.kaoshishijian = kaoshishijian;
	}

	public Date getKaoshishijian() {
		return kaoshishijian;
	}

	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}

	public String getFengmian() {
		return fengmian;
	}

	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

	public String getBeizhu() {
		return beizhu;
	}
			
}
