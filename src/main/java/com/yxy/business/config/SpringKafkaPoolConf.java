package com.yxy.business.config;

import com.yxy.business.common.KafkaPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.apache.kafka.clients.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.util.Properties;

@Configuration
public class SpringKafkaPoolConf {

    @Value("${kafkapool.file}")
    private String kafkaPoolFilePath;

    @Bean
    public KafkaPool kafkaPool() throws IOException {
        Properties properties = new Properties();
        Resource resource = new ClassPathResource(kafkaPoolFilePath);
        properties.load(resource.getInputStream());
        return new KafkaPool(new GenericObjectPoolConfig(), properties);
    }

    @Bean
    @Scope("prototype")
    @Autowired
    public Producer<Object, Object> kafkaConnection(KafkaPool kafkaPool) throws Exception {
        return kafkaPool.getConnection();
    }
}
