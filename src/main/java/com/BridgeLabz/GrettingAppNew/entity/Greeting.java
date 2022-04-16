package com.BridgeLabz.GrettingAppNew.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Getter
@Table(name="GREETINGTABLE")
public class Greeting {

    @Id
    @Column(name="id",nullable = false) private long counter;
    private String message;

    public Greeting(long counter,String message){
        this.counter=counter;
        this.message=message;
    }

    public Greeting(){
        counter=0;
        message="";
    }
}
