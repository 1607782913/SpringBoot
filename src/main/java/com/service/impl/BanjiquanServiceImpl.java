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


import com.dao.BanjiquanDao;
import com.entity.BanjiquanEntity;
import com.service.BanjiquanService;
import com.entity.vo.BanjiquanVO;
import com.entity.view.BanjiquanView;

@Service("banjiquanService")
public class BanjiquanServiceImpl extends ServiceImpl<BanjiquanDao, BanjiquanEntity> implements BanjiquanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BanjiquanEntity> page = this.selectPage(
                new Query<BanjiquanEntity>(params).getPage(),
                new EntityWrapper<BanjiquanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BanjiquanEntity> wrapper) {
		  Page<BanjiquanView> page =new Query<BanjiquanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BanjiquanVO> selectListVO(Wrapper<BanjiquanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BanjiquanVO selectVO(Wrapper<BanjiquanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BanjiquanView> selectListView(Wrapper<BanjiquanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BanjiquanView selectView(Wrapper<BanjiquanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
