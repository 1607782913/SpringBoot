package com.entity.view;

import com.entity.DiscussxueshengzuoyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生作业评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("discussxueshengzuoye")
public class DiscussxueshengzuoyeView  extends DiscussxueshengzuoyeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussxueshengzuoyeView(){
	}
 
 	public DiscussxueshengzuoyeView(DiscussxueshengzuoyeEntity discussxueshengzuoyeEntity){
 	try {
			BeanUtils.copyProperties(this, discussxueshengzuoyeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
