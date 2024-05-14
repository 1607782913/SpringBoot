package com.entity.view;

import com.entity.XuexichengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学习成绩
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xuexichengji")
public class XuexichengjiView  extends XuexichengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuexichengjiView(){
	}
 
 	public XuexichengjiView(XuexichengjiEntity xuexichengjiEntity){
 	try {
			BeanUtils.copyProperties(this, xuexichengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
