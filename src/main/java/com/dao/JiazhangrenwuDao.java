package com.dao;

import com.entity.JiazhangrenwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiazhangrenwuVO;
import com.entity.view.JiazhangrenwuView;



public interface JiazhangrenwuDao extends BaseMapper<JiazhangrenwuEntity> {
	
	List<JiazhangrenwuVO> selectListVO(@Param("ew") Wrapper<JiazhangrenwuEntity> wrapper);
	
	JiazhangrenwuVO selectVO(@Param("ew") Wrapper<JiazhangrenwuEntity> wrapper);
	
	List<JiazhangrenwuView> selectListView(@Param("ew") Wrapper<JiazhangrenwuEntity> wrapper);

	List<JiazhangrenwuView> selectListView(Pagination page,@Param("ew") Wrapper<JiazhangrenwuEntity> wrapper);
	
	JiazhangrenwuView selectView(@Param("ew") Wrapper<JiazhangrenwuEntity> wrapper);
	

}
