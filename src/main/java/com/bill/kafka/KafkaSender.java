package com.bill.kafka;

import com.bill.kafka.dto.Message;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

@Component
@Slf4j
public class KafkaSender {

    private static final String TOPIC = "bill_topic";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    //傳送訊息方法
    public void send(String msg) {

        this.kafkaTemplate.send(TOPIC, msg);
    }
}
