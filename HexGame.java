package com.company;

import java.awt.*;
import java.util.ArrayList;

public class HexGame {

    private Color ColorRes;//determine the color to display according to its resource
    private boolean Biff;//indicate if Biff is on this hex
    private boolean Wormhole;//indicate if this hex has a wormhole
    private int[] IndicesPlayer =new int[6];//indicate players of the buildings on the 6 vertex
    private int ResNum;

    public HexGame(int id_Hex){
        setColorRes(Controller.getMap()[id_Hex]);
        setBiff(Controller.getMap()[id_Hex]);

    }
    public Color getColorRes(){
        return ColorRes;
    }

    public void setColorRes(int colorRes) {
        switch (colorRes){
            case 0:ColorRes=Color.lightGray;//color of Biff
            break;
            case 1:ColorRes=Color.pink;//color of mineral resources
            break;
            case 2:ColorRes=Color.yellow;//color of grains
            break;
            case 3:ColorRes=Color.blue;//color of textiles
            break;
            case 4:ColorRes=Color.orange;//color of building materials
            break;
        }
    }
    public void setBiff(int colorRes){
        if (colorRes==0)
            Biff=true;
        else
            Biff=false;
    }

}
