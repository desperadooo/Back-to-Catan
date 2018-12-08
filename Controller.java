package com.company;

import java.awt.*;

public class Controller {
    //data field
    private static Hexagone[] HEX;
    private static int[] map=new int[19];
    //view field
    private static myGUIWindow Frame;

    public static Hexagone[] getHEX() {
        return HEX;
    }
    public static int[] getMap(){
        return map;
    }

    //constructor
    public Controller(double xC,double yC,double s,String t,int Width,int Height,int m){
        //initialize data
        HEX=new Hexagone[19];
        map=Maps.mapDeterminer(m);
        for(int i=0;i<19;i++){
            HEX[i]=new Hexagone(xC,yC,s,i);
        }
        //initialize view
        EventQueue.invokeLater(()->{
            Frame = new myGUIWindow(t,Width,Height);
        });
    }
}
