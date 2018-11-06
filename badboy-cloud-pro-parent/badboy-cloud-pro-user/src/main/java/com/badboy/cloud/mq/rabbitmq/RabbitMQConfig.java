package com.badboy.cloud.mq.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration	
public class RabbitMQConfig {

	public static final String user_login_date = "mq_login_date";
	@Value("${spring.cloud.config.profile}")
	private String profile;
	
	@Bean
    public Queue queue() {
        return new Queue(user_login_date + profile );
    }
}
