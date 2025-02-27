package com.dao;

import com.entity.KechengbiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengbiaoVO;
import com.entity.view.KechengbiaoView;


public interface KechengbiaoDao extends BaseMapper<KechengbiaoEntity> {
	
	List<KechengbiaoVO> selectListVO(@Param("ew") Wrapper<KechengbiaoEntity> wrapper);
	
	KechengbiaoVO selectVO(@Param("ew") Wrapper<KechengbiaoEntity> wrapper);
	
	List<KechengbiaoView> selectListView(@Param("ew") Wrapper<KechengbiaoEntity> wrapper);

	List<KechengbiaoView> selectListView(Pagination page,@Param("ew") Wrapper<KechengbiaoEntity> wrapper);
	
	KechengbiaoView selectView(@Param("ew") Wrapper<KechengbiaoEntity> wrapper);
	

}
