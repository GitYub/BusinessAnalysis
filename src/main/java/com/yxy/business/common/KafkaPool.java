package com.yxy.business.common;

import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.apache.kafka.clients.producer.Producer;

import java.util.Properties;

public class KafkaPool {
    private GenericObjectPool<Producer<Object, Object>> objectPool;

    public KafkaPool(GenericObjectPoolConfig config, Properties properties){
        KafkaPooledObjectFactory kafkaPooledObjectFactory = new KafkaPooledObjectFactory(properties);
        objectPool = new GenericObjectPool<>(kafkaPooledObjectFactory, config);
    }

    public Producer<Object, Object> getConnection() throws Exception {
        return objectPool.borrowObject();
    }

    public void returnConnection(Producer<Object, Object> producer){
        if (producer != null) {
            objectPool.returnObject(producer);
        }
    }
}
