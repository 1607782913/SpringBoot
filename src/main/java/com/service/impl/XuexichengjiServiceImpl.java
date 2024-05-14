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


import com.dao.XuexichengjiDao;
import com.entity.XuexichengjiEntity;
import com.service.XuexichengjiService;
import com.entity.vo.XuexichengjiVO;
import com.entity.view.XuexichengjiView;

@Service("xuexichengjiService")
public class XuexichengjiServiceImpl extends ServiceImpl<XuexichengjiDao, XuexichengjiEntity> implements XuexichengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuexichengjiEntity> page = this.selectPage(
                new Query<XuexichengjiEntity>(params).getPage(),
                new EntityWrapper<XuexichengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuexichengjiEntity> wrapper) {
		  Page<XuexichengjiView> page =new Query<XuexichengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuexichengjiVO> selectListVO(Wrapper<XuexichengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuexichengjiVO selectVO(Wrapper<XuexichengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuexichengjiView> selectListView(Wrapper<XuexichengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuexichengjiView selectView(Wrapper<XuexichengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
