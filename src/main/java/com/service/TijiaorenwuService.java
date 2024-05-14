package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TijiaorenwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TijiaorenwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TijiaorenwuView;

public interface TijiaorenwuService extends IService<TijiaorenwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TijiaorenwuVO> selectListVO(Wrapper<TijiaorenwuEntity> wrapper);
   	
   	TijiaorenwuVO selectVO(@Param("ew") Wrapper<TijiaorenwuEntity> wrapper);
   	
   	List<TijiaorenwuView> selectListView(Wrapper<TijiaorenwuEntity> wrapper);
   	
   	TijiaorenwuView selectView(@Param("ew") Wrapper<TijiaorenwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TijiaorenwuEntity> wrapper);
   	

}

