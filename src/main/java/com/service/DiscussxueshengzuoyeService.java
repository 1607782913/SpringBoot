package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxueshengzuoyeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxueshengzuoyeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxueshengzuoyeView;



public interface DiscussxueshengzuoyeService extends IService<DiscussxueshengzuoyeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxueshengzuoyeVO> selectListVO(Wrapper<DiscussxueshengzuoyeEntity> wrapper);
   	
   	DiscussxueshengzuoyeVO selectVO(@Param("ew") Wrapper<DiscussxueshengzuoyeEntity> wrapper);
   	
   	List<DiscussxueshengzuoyeView> selectListView(Wrapper<DiscussxueshengzuoyeEntity> wrapper);
   	
   	DiscussxueshengzuoyeView selectView(@Param("ew") Wrapper<DiscussxueshengzuoyeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxueshengzuoyeEntity> wrapper);
   	

}

