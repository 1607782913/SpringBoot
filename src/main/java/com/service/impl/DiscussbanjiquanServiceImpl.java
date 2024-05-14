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


import com.dao.DiscussbanjiquanDao;
import com.entity.DiscussbanjiquanEntity;
import com.service.DiscussbanjiquanService;
import com.entity.vo.DiscussbanjiquanVO;
import com.entity.view.DiscussbanjiquanView;

@Service("discussbanjiquanService")
public class DiscussbanjiquanServiceImpl extends ServiceImpl<DiscussbanjiquanDao, DiscussbanjiquanEntity> implements DiscussbanjiquanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussbanjiquanEntity> page = this.selectPage(
                new Query<DiscussbanjiquanEntity>(params).getPage(),
                new EntityWrapper<DiscussbanjiquanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussbanjiquanEntity> wrapper) {
		  Page<DiscussbanjiquanView> page =new Query<DiscussbanjiquanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussbanjiquanVO> selectListVO(Wrapper<DiscussbanjiquanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussbanjiquanVO selectVO(Wrapper<DiscussbanjiquanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussbanjiquanView> selectListView(Wrapper<DiscussbanjiquanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussbanjiquanView selectView(Wrapper<DiscussbanjiquanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
