package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussxuexichengjiDao;
import com.entity.DiscussxuexichengjiEntity;
import com.service.DiscussxuexichengjiService;
import com.entity.vo.DiscussxuexichengjiVO;
import com.entity.view.DiscussxuexichengjiView;

@Service("discussxuexichengjiService")
public class DiscussxuexichengjiServiceImpl extends ServiceImpl<DiscussxuexichengjiDao, DiscussxuexichengjiEntity> implements DiscussxuexichengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxuexichengjiEntity> page = this.selectPage(
                new Query<DiscussxuexichengjiEntity>(params).getPage(),
                new EntityWrapper<DiscussxuexichengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxuexichengjiEntity> wrapper) {
		  Page<DiscussxuexichengjiView> page =new Query<DiscussxuexichengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxuexichengjiVO> selectListVO(Wrapper<DiscussxuexichengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxuexichengjiVO selectVO(Wrapper<DiscussxuexichengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxuexichengjiView> selectListView(Wrapper<DiscussxuexichengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxuexichengjiView selectView(Wrapper<DiscussxuexichengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
