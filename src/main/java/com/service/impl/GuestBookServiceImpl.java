package com.service.impl;

import com.baomidou.mybatisplus.service.IService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dao.GuestBookDao;
import com.entity.GuestBookEntity;
import com.service.GuestBookService;
import org.springframework.stereotype.Service;

@Service("guestbookService")
public class GuestBookServiceImpl extends ServiceImpl<GuestBookDao,GuestBookEntity> implements GuestBookService {
    
}
