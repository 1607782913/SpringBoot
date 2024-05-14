package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxuexichengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxuexichengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxuexichengjiView;


public interface DiscussxuexichengjiService extends IService<DiscussxuexichengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxuexichengjiVO> selectListVO(Wrapper<DiscussxuexichengjiEntity> wrapper);
   	
   	DiscussxuexichengjiVO selectVO(@Param("ew") Wrapper<DiscussxuexichengjiEntity> wrapper);
   	
   	List<DiscussxuexichengjiView> selectListView(Wrapper<DiscussxuexichengjiEntity> wrapper);
   	
   	DiscussxuexichengjiView selectView(@Param("ew") Wrapper<DiscussxuexichengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxuexichengjiEntity> wrapper);
   	

}

