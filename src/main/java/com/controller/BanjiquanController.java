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

import com.entity.BanjiquanEntity;
import com.entity.view.BanjiquanView;

import com.service.BanjiquanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;


@RestController
@RequestMapping("/banjiquan")
public class BanjiquanController {
    @Autowired
    private BanjiquanService banjiquanService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BanjiquanEntity banjiquan,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiazhang")) {
			banjiquan.setJiazhangzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<BanjiquanEntity> ew = new EntityWrapper<BanjiquanEntity>();

		PageUtils page = banjiquanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, banjiquan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BanjiquanEntity banjiquan, 
		HttpServletRequest request){
        EntityWrapper<BanjiquanEntity> ew = new EntityWrapper<BanjiquanEntity>();

		PageUtils page = banjiquanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, banjiquan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BanjiquanEntity banjiquan){
       	EntityWrapper<BanjiquanEntity> ew = new EntityWrapper<BanjiquanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( banjiquan, "banjiquan")); 
        return R.ok().put("data", banjiquanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BanjiquanEntity banjiquan){
        EntityWrapper< BanjiquanEntity> ew = new EntityWrapper< BanjiquanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( banjiquan, "banjiquan")); 
		BanjiquanView banjiquanView =  banjiquanService.selectView(ew);
		return R.ok("查询班级圈成功").put("data", banjiquanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BanjiquanEntity banjiquan = banjiquanService.selectById(id);
        return R.ok().put("data", banjiquan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BanjiquanEntity banjiquan = banjiquanService.selectById(id);
        return R.ok().put("data", banjiquan);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        BanjiquanEntity banjiquan = banjiquanService.selectById(id);
        if(type.equals("1")) {
        	banjiquan.setThumbsupnum(banjiquan.getThumbsupnum()+1);
        } else {
        	banjiquan.setCrazilynum(banjiquan.getCrazilynum()+1);
        }
        banjiquanService.updateById(banjiquan);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BanjiquanEntity banjiquan, HttpServletRequest request){
    	banjiquan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(banjiquan);
        banjiquanService.insert(banjiquan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BanjiquanEntity banjiquan, HttpServletRequest request){
    	banjiquan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(banjiquan);
        banjiquanService.insert(banjiquan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody BanjiquanEntity banjiquan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(banjiquan);
        banjiquanService.updateById(banjiquan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        banjiquanService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<BanjiquanEntity> wrapper = new EntityWrapper<BanjiquanEntity>();
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

		int count = banjiquanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
