package com.yxy.business.test;

import com.yxy.business.BusinessApplication;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BusinessApplication.class)
public class KafkaPoolTest {

    @Autowired
    private Producer<Object, Object> producer;


    @Test
    public void hello() throws ExecutionException, InterruptedException {
        Assert.assertNotNull(producer);

        ProducerRecord<Object, Object> r = new ProducerRecord<Object, Object>("test", "hello", "world");

        Future<RecordMetadata> future = producer.send(r);

        RecordMetadata data = future.get();

        System.out.println(data.toString());
    }
}
