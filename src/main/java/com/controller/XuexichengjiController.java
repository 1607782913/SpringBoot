package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.XuexichengjiEntity;
import com.entity.view.XuexichengjiView;

import com.service.XuexichengjiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

@RestController
@RequestMapping("/xuexichengji")
public class XuexichengjiController {
    @Autowired
    private XuexichengjiService xuexichengjiService;

    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XuexichengjiEntity xuexichengji,
		HttpServletRequest request){
    	//get的请求时,若在request中含有XuexichengjiEntity的属性会将其自动存入xuexichengji中
		System.out.println(params);
		System.out.println(xuexichengji.getId());
		System.out.println(xuexichengji.getKechengkemu());
		System.out.println(xuexichengji.getFenshu());
		System.out.println(xuexichengji.getXueshengxingming());
		String tableName = request.getSession().getAttribute("tableName").toString();
		String id = request.getSession().getAttribute("userId").toString();
		System.out.println(tableName + " " + id);
		if(tableName.equals("jiazhang")) {
			xuexichengji.setJiazhangzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			xuexichengji.setJiaoshizhanghao((String)request.getSession().getAttribute("username"));
		}

		for(String key : params.keySet()) {
			System.out.println(key);
		}

        EntityWrapper<XuexichengjiEntity> ew = new EntityWrapper<XuexichengjiEntity>();
		PageUtils page = xuexichengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuexichengji), params), params));
		//MPUtil.likeOrEq(ew, xuexichengji):根据xuexichengji中的属性名构造条件控制器。
		//MPUtil.between(wrapper, params):根据params来构造条件控制器的wrapper取值范围。
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XuexichengjiEntity xuexichengji, 
		HttpServletRequest request){
        EntityWrapper<XuexichengjiEntity> ew = new EntityWrapper<XuexichengjiEntity>();

		PageUtils page = xuexichengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuexichengji), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XuexichengjiEntity xuexichengji){
       	EntityWrapper<XuexichengjiEntity> ew = new EntityWrapper<XuexichengjiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xuexichengji, "xuexichengji")); 
        return R.ok().put("data", xuexichengjiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XuexichengjiEntity xuexichengji){
        EntityWrapper< XuexichengjiEntity> ew = new EntityWrapper< XuexichengjiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xuexichengji, "xuexichengji")); 
		XuexichengjiView xuexichengjiView =  xuexichengjiService.selectView(ew);
		return R.ok("查询学习成绩成功").put("data", xuexichengjiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XuexichengjiEntity xuexichengji = xuexichengjiService.selectById(id);
        return R.ok().put("data", xuexichengji);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XuexichengjiEntity xuexichengji = xuexichengjiService.selectById(id);
        return R.ok().put("data", xuexichengji);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XuexichengjiEntity xuexichengji, HttpServletRequest request){
    	xuexichengji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xuexichengji);
        xuexichengjiService.insert(xuexichengji);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XuexichengjiEntity xuexichengji, HttpServletRequest request){
    	xuexichengji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xuexichengji);
        xuexichengjiService.insert(xuexichengji);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XuexichengjiEntity xuexichengji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xuexichengji);
        xuexichengjiService.updateById(xuexichengji);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xuexichengjiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<XuexichengjiEntity> wrapper = new EntityWrapper<XuexichengjiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiazhang")) {
			wrapper.eq("jiazhangzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			wrapper.eq("jiaoshizhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = xuexichengjiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
