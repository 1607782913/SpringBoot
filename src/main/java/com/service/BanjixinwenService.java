package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BanjixinwenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BanjixinwenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BanjixinwenView;



public interface BanjixinwenService extends IService<BanjixinwenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BanjixinwenVO> selectListVO(Wrapper<BanjixinwenEntity> wrapper);
   	
   	BanjixinwenVO selectVO(@Param("ew") Wrapper<BanjixinwenEntity> wrapper);
   	
   	List<BanjixinwenView> selectListView(Wrapper<BanjixinwenEntity> wrapper);
   	
   	BanjixinwenView selectView(@Param("ew") Wrapper<BanjixinwenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BanjixinwenEntity> wrapper);
   	

}

