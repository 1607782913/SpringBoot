package com.dao;

import com.entity.DiscussxuexichengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxuexichengjiVO;
import com.entity.view.DiscussxuexichengjiView;
public interface DiscussxuexichengjiDao extends BaseMapper<DiscussxuexichengjiEntity> {
	
	List<DiscussxuexichengjiVO> selectListVO(@Param("ew") Wrapper<DiscussxuexichengjiEntity> wrapper);
	
	DiscussxuexichengjiVO selectVO(@Param("ew") Wrapper<DiscussxuexichengjiEntity> wrapper);
	
	List<DiscussxuexichengjiView> selectListView(@Param("ew") Wrapper<DiscussxuexichengjiEntity> wrapper);

	List<DiscussxuexichengjiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxuexichengjiEntity> wrapper);
	
	DiscussxuexichengjiView selectView(@Param("ew") Wrapper<DiscussxuexichengjiEntity> wrapper);
	

}
