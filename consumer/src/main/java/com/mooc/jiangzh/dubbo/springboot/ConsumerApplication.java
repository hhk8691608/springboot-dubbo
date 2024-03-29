package com.mooc.jiangzh.dubbo.springboot;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.mooc.jiangzh.dubbo.springboot.consumer.quickstart.QuickstartConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDubboConfiguration
public class ConsumerApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext run = SpringApplication.run(ConsumerApplication.class, args);
		QuickstartConsumer quickstartConsumer = (QuickstartConsumer) run.getBean("quickstartConsumer");
		quickstartConsumer.sendMessage("Ace 说话");
	}

}
