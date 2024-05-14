package com.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.entity.GuestBookEntity;

import com.service.GuestBookService;
import com.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guestbook")
public class GuestBookController {

    @Autowired
    private GuestBookService guestbookService;

    @RequestMapping("/record")
    public R list(GuestBookEntity guestBookEntity){
        EntityWrapper<GuestBookEntity> wrapper = new EntityWrapper<GuestBookEntity>();
        System.out.println(guestBookEntity.getTeacher_id()+" "+ guestBookEntity.getParent_id());
        wrapper.eq("teacher_id",guestBookEntity.getTeacher_id()).eq("parent_id",guestBookEntity.getParent_id());
        return R.ok().put("data",guestbookService.selectOne(wrapper));
//        EntityWrapper<XuexichengjiEntity> ew = new EntityWrapper<XuexichengjiEntity>();
//        ew.allEq(MPUtil.allEQMapPre( xuexichengji, "xuexichengji"));
//        return R.ok().put("data", xuexichengjiService.selectListView(ew));
    }

}
