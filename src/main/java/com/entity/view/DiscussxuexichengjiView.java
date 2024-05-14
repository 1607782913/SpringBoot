package com.entity.view;

import com.entity.DiscussxuexichengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学习成绩评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("discussxuexichengji")
public class DiscussxuexichengjiView  extends DiscussxuexichengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussxuexichengjiView(){
	}
 
 	public DiscussxuexichengjiView(DiscussxuexichengjiEntity discussxuexichengjiEntity){
 	try {
			BeanUtils.copyProperties(this, discussxuexichengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
