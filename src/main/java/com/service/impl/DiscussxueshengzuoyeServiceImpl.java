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


import com.dao.DiscussxueshengzuoyeDao;
import com.entity.DiscussxueshengzuoyeEntity;
import com.service.DiscussxueshengzuoyeService;
import com.entity.vo.DiscussxueshengzuoyeVO;
import com.entity.view.DiscussxueshengzuoyeView;

@Service("discussxueshengzuoyeService")
public class DiscussxueshengzuoyeServiceImpl extends ServiceImpl<DiscussxueshengzuoyeDao, DiscussxueshengzuoyeEntity> implements DiscussxueshengzuoyeService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxueshengzuoyeEntity> page = this.selectPage(
                new Query<DiscussxueshengzuoyeEntity>(params).getPage(),
                new EntityWrapper<DiscussxueshengzuoyeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxueshengzuoyeEntity> wrapper) {
		  Page<DiscussxueshengzuoyeView> page =new Query<DiscussxueshengzuoyeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxueshengzuoyeVO> selectListVO(Wrapper<DiscussxueshengzuoyeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxueshengzuoyeVO selectVO(Wrapper<DiscussxueshengzuoyeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxueshengzuoyeView> selectListView(Wrapper<DiscussxueshengzuoyeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxueshengzuoyeView selectView(Wrapper<DiscussxueshengzuoyeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
