package com.entity.view;

import com.entity.JiazhangrenwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 家长任务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jiazhangrenwu")
public class JiazhangrenwuView  extends JiazhangrenwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiazhangrenwuView(){
	}
 
 	public JiazhangrenwuView(JiazhangrenwuEntity jiazhangrenwuEntity){
 	try {
			BeanUtils.copyProperties(this, jiazhangrenwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
