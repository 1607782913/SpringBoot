package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuexichengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuexichengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexichengjiView;

public interface XuexichengjiService extends IService<XuexichengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuexichengjiVO> selectListVO(Wrapper<XuexichengjiEntity> wrapper);
   	
   	XuexichengjiVO selectVO(@Param("ew") Wrapper<XuexichengjiEntity> wrapper);
   	
   	List<XuexichengjiView> selectListView(Wrapper<XuexichengjiEntity> wrapper);
   	
   	XuexichengjiView selectView(@Param("ew") Wrapper<XuexichengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuexichengjiEntity> wrapper);
   	

}

