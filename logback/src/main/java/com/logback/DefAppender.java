package com.logback;

import ch.qos.logback.core.OutputStreamAppender;

public class DefAppender<E> extends OutputStreamAppender<E>{
    
    private String userName;
    
    public  void setUserName(String name){
        System.out.println(name);
        this.userName = name;
    }

}
