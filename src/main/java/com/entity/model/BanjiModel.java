package com.entity.model;

import com.entity.BanjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 班级
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 */
public class BanjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 班级人数
	 */
	
	private Integer banjirenshu;
		
	/**
	 * 班主任姓名
	 */
	
	private String banzhurenxingming;
		
	/**
	 * 教师电话
	 */
	
	private String jiaoshidianhua;
				
	
	/**
	 * 设置：班级人数
	 */
	 
	public void setBanjirenshu(Integer banjirenshu) {
		this.banjirenshu = banjirenshu;
	}
	
	/**
	 * 获取：班级人数
	 */
	public Integer getBanjirenshu() {
		return banjirenshu;
	}
				
	
	/**
	 * 设置：班主任姓名
	 */
	 
	public void setBanzhurenxingming(String banzhurenxingming) {
		this.banzhurenxingming = banzhurenxingming;
	}
	
	/**
	 * 获取：班主任姓名
	 */
	public String getBanzhurenxingming() {
		return banzhurenxingming;
	}
				
	
	/**
	 * 设置：教师电话
	 */
	 
	public void setJiaoshidianhua(String jiaoshidianhua) {
		this.jiaoshidianhua = jiaoshidianhua;
	}
	
	/**
	 * 获取：教师电话
	 */
	public String getJiaoshidianhua() {
		return jiaoshidianhua;
	}
			
}
