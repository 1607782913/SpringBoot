package com.dao;

import com.entity.DiscussbanjiquanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussbanjiquanVO;
import com.entity.view.DiscussbanjiquanView;



public interface DiscussbanjiquanDao extends BaseMapper<DiscussbanjiquanEntity> {
	
	List<DiscussbanjiquanVO> selectListVO(@Param("ew") Wrapper<DiscussbanjiquanEntity> wrapper);
	
	DiscussbanjiquanVO selectVO(@Param("ew") Wrapper<DiscussbanjiquanEntity> wrapper);
	
	List<DiscussbanjiquanView> selectListView(@Param("ew") Wrapper<DiscussbanjiquanEntity> wrapper);

	List<DiscussbanjiquanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussbanjiquanEntity> wrapper);
	
	DiscussbanjiquanView selectView(@Param("ew") Wrapper<DiscussbanjiquanEntity> wrapper);
	

}
