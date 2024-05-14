package com;

import cn.hutool.core.collection.CollUtil;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.dao.GuestBookDao;
import com.easemob.im.server.EMProperties;
import com.easemob.im.server.EMService;
import com.easemob.im.server.model.EMTextMessage;
import com.entity.GuestBookEntity;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Set;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringbootSchemaApplication.class})
class SpringbootSchemaApplicationTests {



	@Test
	void contextLoads() {
		EMProperties properties = EMProperties.builder()
				.setAppkey("1176240414150603#demo")
				.setClientId("YXA6DeKnjPa7QAyJvxTrzoxL3A")
				.setClientSecret("YXA6W33Bn-wcrTaNReM52MSRusvbY_Y")
				.build();

		EMService  service = new EMService(properties);

		//注册用户
		//service.user.create("user01","123456").block();
		//service.user().create("user03","123456").block();

		//添加用户
		//service.contact().add("user01","user02").block();

		//发送消息
		Set<String> set = CollUtil.newHashSet("user02");
		service.message().send("user01","users",set,new EMTextMessage().text("java"),null).block();
	}

}
