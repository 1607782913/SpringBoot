package com.entity.view;

import com.entity.TijiaorenwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 提交任务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("tijiaorenwu")
public class TijiaorenwuView  extends TijiaorenwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TijiaorenwuView(){
	}
 
 	public TijiaorenwuView(TijiaorenwuEntity tijiaorenwuEntity){
 	try {
			BeanUtils.copyProperties(this, tijiaorenwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
