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


import com.dao.JiazhangrenwuDao;
import com.entity.JiazhangrenwuEntity;
import com.service.JiazhangrenwuService;
import com.entity.vo.JiazhangrenwuVO;
import com.entity.view.JiazhangrenwuView;

@Service("jiazhangrenwuService")
public class JiazhangrenwuServiceImpl extends ServiceImpl<JiazhangrenwuDao, JiazhangrenwuEntity> implements JiazhangrenwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiazhangrenwuEntity> page = this.selectPage(
                new Query<JiazhangrenwuEntity>(params).getPage(),
                new EntityWrapper<JiazhangrenwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiazhangrenwuEntity> wrapper) {
		  Page<JiazhangrenwuView> page =new Query<JiazhangrenwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiazhangrenwuVO> selectListVO(Wrapper<JiazhangrenwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiazhangrenwuVO selectVO(Wrapper<JiazhangrenwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiazhangrenwuView> selectListView(Wrapper<JiazhangrenwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiazhangrenwuView selectView(Wrapper<JiazhangrenwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
