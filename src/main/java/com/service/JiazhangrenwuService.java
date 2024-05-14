package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiazhangrenwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiazhangrenwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiazhangrenwuView;


public interface JiazhangrenwuService extends IService<JiazhangrenwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiazhangrenwuVO> selectListVO(Wrapper<JiazhangrenwuEntity> wrapper);
   	
   	JiazhangrenwuVO selectVO(@Param("ew") Wrapper<JiazhangrenwuEntity> wrapper);
   	
   	List<JiazhangrenwuView> selectListView(Wrapper<JiazhangrenwuEntity> wrapper);
   	
   	JiazhangrenwuView selectView(@Param("ew") Wrapper<JiazhangrenwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiazhangrenwuEntity> wrapper);
   	

}

