package com.bill.kafka.dto;

import lombok.Data;

import java.util.Date;

@Data
public class Message {
    private Long id;    //id
    private String msg; //訊息
    private Date sendTime;  //時間戳
}