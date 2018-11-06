package com.badboy.cloud.mq.rabbitmq.user.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.badboy.cloud.domain.User;
import com.badboy.cloud.mq.rabbitmq.RabbitMQConfig;

@Component
public class UserLoginDateProducer {
	
	private static final Logger log = LoggerFactory.getLogger(UserLoginDateProducer.class);

	@Value("${spring.cloud.config.profile}")
	private String profile;
	@Autowired
	private AmqpTemplate rabbitTemplate;

	/**
	 * 修改最后登录时间
	 * 
	 * @param dto
	 */
	public void userLoginDate(User user) {
		if (user == null || user.getUuid() == null || user.getUuid() ==null) {
			return;
		}
		log.debug("Start send MQ {}, {}", RabbitMQConfig.user_login_date + profile, user);
		
//		try {
//			Thread.sleep(1000 * 10);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		System.out.println("rabbit send data。。。。。。。。");
		this.rabbitTemplate.convertAndSend(RabbitMQConfig.user_login_date + profile, user);
		log.debug("send ok");
	}
}
