package com.badboy.cloud.mq.rabbitmq.user.Consumer;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.badboy.cloud.domain.User;
import com.badboy.cloud.mq.rabbitmq.RabbitMQConfig;
import com.badboy.cloud.service.IUserService;
import com.rabbitmq.client.Channel;

@Component
@RabbitListener(queues = RabbitMQConfig.user_login_date + "${spring.cloud.config.profile}")
public class UserLoginDateConsumer {

	private static final Logger log = LoggerFactory.getLogger(UserLoginDateConsumer.class);
	
	@Autowired
	private IUserService userService;
	
	@RabbitHandler
	public void process(User user, Channel channel, Message message) {
		try {
			if (user == null || user.getUuid() == null || user.getUuid() ==null) {
				channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
				return;
			}
			log.debug("udpate login deta: " + user.getUuid());
			
			User dbUser = userService.getUserInfo(user.getUuid());
			if(dbUser != null) {
				System.out.println("-------修改登录时间-- start---------");
				log.debug("udpate login deta: " + user.getUuid());
				System.out.println("-------修改登录时间-- end---------");
			}
			
			// 处理成功ack掉这条消息
			channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
			log.debug("receiver success");
		} catch (IOException e) {
			// 丢弃这条消息
			// channel.basicNack(message.getMessageProperties().getDeliveryTag(),
			// false,false);
			log.debug("receiver fail");
		}
	}
}
