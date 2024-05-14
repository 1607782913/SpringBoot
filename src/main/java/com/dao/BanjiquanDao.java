package com.dao;

import com.entity.BanjiquanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BanjiquanVO;
import com.entity.view.BanjiquanView;



public interface BanjiquanDao extends BaseMapper<BanjiquanEntity> {
	
	List<BanjiquanVO> selectListVO(@Param("ew") Wrapper<BanjiquanEntity> wrapper);
	
	BanjiquanVO selectVO(@Param("ew") Wrapper<BanjiquanEntity> wrapper);
	
	List<BanjiquanView> selectListView(@Param("ew") Wrapper<BanjiquanEntity> wrapper);

	List<BanjiquanView> selectListView(Pagination page,@Param("ew") Wrapper<BanjiquanEntity> wrapper);
	
	BanjiquanView selectView(@Param("ew") Wrapper<BanjiquanEntity> wrapper);
	

}
