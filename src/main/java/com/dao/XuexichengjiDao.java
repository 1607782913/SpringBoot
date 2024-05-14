package com.dao;

import com.entity.XuexichengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuexichengjiVO;
import com.entity.view.XuexichengjiView;

public interface XuexichengjiDao extends BaseMapper<XuexichengjiEntity> {
	
	List<XuexichengjiVO> selectListVO(@Param("ew") Wrapper<XuexichengjiEntity> wrapper);
	
	XuexichengjiVO selectVO(@Param("ew") Wrapper<XuexichengjiEntity> wrapper);
	
	List<XuexichengjiView> selectListView(@Param("ew") Wrapper<XuexichengjiEntity> wrapper);

	List<XuexichengjiView> selectListView(Pagination page,@Param("ew") Wrapper<XuexichengjiEntity> wrapper);
	
	XuexichengjiView selectView(@Param("ew") Wrapper<XuexichengjiEntity> wrapper);
	

}
