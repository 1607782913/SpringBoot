package com.dao;

import com.entity.BanjixinwenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BanjixinwenVO;
import com.entity.view.BanjixinwenView;


public interface BanjixinwenDao extends BaseMapper<BanjixinwenEntity> {
	
	List<BanjixinwenVO> selectListVO(@Param("ew") Wrapper<BanjixinwenEntity> wrapper);
	
	BanjixinwenVO selectVO(@Param("ew") Wrapper<BanjixinwenEntity> wrapper);
	
	List<BanjixinwenView> selectListView(@Param("ew") Wrapper<BanjixinwenEntity> wrapper);

	List<BanjixinwenView> selectListView(Pagination page,@Param("ew") Wrapper<BanjixinwenEntity> wrapper);
	
	BanjixinwenView selectView(@Param("ew") Wrapper<BanjixinwenEntity> wrapper);
	

}
