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


import com.dao.TijiaorenwuDao;
import com.entity.TijiaorenwuEntity;
import com.service.TijiaorenwuService;
import com.entity.vo.TijiaorenwuVO;
import com.entity.view.TijiaorenwuView;

@Service("tijiaorenwuService")
public class TijiaorenwuServiceImpl extends ServiceImpl<TijiaorenwuDao, TijiaorenwuEntity> implements TijiaorenwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TijiaorenwuEntity> page = this.selectPage(
                new Query<TijiaorenwuEntity>(params).getPage(),
                new EntityWrapper<TijiaorenwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TijiaorenwuEntity> wrapper) {
		  Page<TijiaorenwuView> page =new Query<TijiaorenwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TijiaorenwuVO> selectListVO(Wrapper<TijiaorenwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TijiaorenwuVO selectVO(Wrapper<TijiaorenwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TijiaorenwuView> selectListView(Wrapper<TijiaorenwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TijiaorenwuView selectView(Wrapper<TijiaorenwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
