package com.yxy.business.common;

import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.DefaultPooledObject;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;

import java.util.Properties;

public class KafkaPooledObjectFactory implements PooledObjectFactory<Producer<Object, Object>> {

    private Properties properties;

    public KafkaPooledObjectFactory(Properties properties){
        this.properties = properties;
    }

    @Override
    public PooledObject<Producer<Object, Object>> makeObject() throws Exception {
        Producer<Object, Object> producer = new KafkaProducer<>(properties);
        return new DefaultPooledObject<>(producer);
    }

    @Override
    public void destroyObject(PooledObject<Producer<Object, Object>> p) throws Exception {
        Producer<Object, Object> producer = p.getObject();
        if (producer != null){
            producer.close();
        }
    }

    @Override
    public boolean validateObject(PooledObject<Producer<Object, Object>> p) {
        return true;
    }

    @Override
    public void activateObject(PooledObject<Producer<Object, Object>> p) throws Exception {

    }

    @Override
    public void passivateObject(PooledObject<Producer<Object, Object>> p) throws Exception {

    }
}
