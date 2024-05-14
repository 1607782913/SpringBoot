package com.entity.view;

import com.entity.DiscussbanjiquanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 班级圈评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("discussbanjiquan")
public class DiscussbanjiquanView  extends DiscussbanjiquanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussbanjiquanView(){
	}
 
 	public DiscussbanjiquanView(DiscussbanjiquanEntity discussbanjiquanEntity){
 	try {
			BeanUtils.copyProperties(this, discussbanjiquanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
