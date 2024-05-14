package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BanjiquanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BanjiquanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BanjiquanView;


public interface BanjiquanService extends IService<BanjiquanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BanjiquanVO> selectListVO(Wrapper<BanjiquanEntity> wrapper);
   	
   	BanjiquanVO selectVO(@Param("ew") Wrapper<BanjiquanEntity> wrapper);
   	
   	List<BanjiquanView> selectListView(Wrapper<BanjiquanEntity> wrapper);
   	
   	BanjiquanView selectView(@Param("ew") Wrapper<BanjiquanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BanjiquanEntity> wrapper);
   	

}

