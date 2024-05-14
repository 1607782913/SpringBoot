package com.dao;

import com.entity.TijiaorenwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TijiaorenwuVO;
import com.entity.view.TijiaorenwuView;

public interface TijiaorenwuDao extends BaseMapper<TijiaorenwuEntity> {
	
	List<TijiaorenwuVO> selectListVO(@Param("ew") Wrapper<TijiaorenwuEntity> wrapper);
	
	TijiaorenwuVO selectVO(@Param("ew") Wrapper<TijiaorenwuEntity> wrapper);
	
	List<TijiaorenwuView> selectListView(@Param("ew") Wrapper<TijiaorenwuEntity> wrapper);

	List<TijiaorenwuView> selectListView(Pagination page,@Param("ew") Wrapper<TijiaorenwuEntity> wrapper);
	
	TijiaorenwuView selectView(@Param("ew") Wrapper<TijiaorenwuEntity> wrapper);
	

}
