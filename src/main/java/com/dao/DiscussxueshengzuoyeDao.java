package com.dao;

import com.entity.DiscussxueshengzuoyeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxueshengzuoyeVO;
import com.entity.view.DiscussxueshengzuoyeView;


public interface DiscussxueshengzuoyeDao extends BaseMapper<DiscussxueshengzuoyeEntity> {
	
	List<DiscussxueshengzuoyeVO> selectListVO(@Param("ew") Wrapper<DiscussxueshengzuoyeEntity> wrapper);
	
	DiscussxueshengzuoyeVO selectVO(@Param("ew") Wrapper<DiscussxueshengzuoyeEntity> wrapper);
	
	List<DiscussxueshengzuoyeView> selectListView(@Param("ew") Wrapper<DiscussxueshengzuoyeEntity> wrapper);

	List<DiscussxueshengzuoyeView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxueshengzuoyeEntity> wrapper);
	
	DiscussxueshengzuoyeView selectView(@Param("ew") Wrapper<DiscussxueshengzuoyeEntity> wrapper);
	

}
