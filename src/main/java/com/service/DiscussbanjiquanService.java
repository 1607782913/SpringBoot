package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussbanjiquanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussbanjiquanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussbanjiquanView;



public interface DiscussbanjiquanService extends IService<DiscussbanjiquanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussbanjiquanVO> selectListVO(Wrapper<DiscussbanjiquanEntity> wrapper);
   	
   	DiscussbanjiquanVO selectVO(@Param("ew") Wrapper<DiscussbanjiquanEntity> wrapper);
   	
   	List<DiscussbanjiquanView> selectListView(Wrapper<DiscussbanjiquanEntity> wrapper);
   	
   	DiscussbanjiquanView selectView(@Param("ew") Wrapper<DiscussbanjiquanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussbanjiquanEntity> wrapper);
   	

}

