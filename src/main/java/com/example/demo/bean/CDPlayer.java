package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer {
    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }

    public void playCd(){
        cd.play();
    }
}

