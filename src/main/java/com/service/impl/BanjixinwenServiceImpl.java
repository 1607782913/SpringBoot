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


import com.dao.BanjixinwenDao;
import com.entity.BanjixinwenEntity;
import com.service.BanjixinwenService;
import com.entity.vo.BanjixinwenVO;
import com.entity.view.BanjixinwenView;

@Service("banjixinwenService")
public class BanjixinwenServiceImpl extends ServiceImpl<BanjixinwenDao, BanjixinwenEntity> implements BanjixinwenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BanjixinwenEntity> page = this.selectPage(
                new Query<BanjixinwenEntity>(params).getPage(),
                new EntityWrapper<BanjixinwenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BanjixinwenEntity> wrapper) {
		  Page<BanjixinwenView> page =new Query<BanjixinwenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BanjixinwenVO> selectListVO(Wrapper<BanjixinwenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BanjixinwenVO selectVO(Wrapper<BanjixinwenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BanjixinwenView> selectListView(Wrapper<BanjixinwenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BanjixinwenView selectView(Wrapper<BanjixinwenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
