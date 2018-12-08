package com.company;
import javax.swing.*;
import java.awt.*;
import  java.awt.geom.Path2D;
import java.util.Random;

public class myGUIWindow extends JFrame{
    private int MyWidth;
    private int MyHeight;

    public int getMyWidth() {
        return MyWidth;
    }
    public int getMyHeight(){
        return MyHeight;
    }

    public myGUIWindow(String title, int canvasWidth, int canvasHeight){
        super(title);

        MyWidth=canvasWidth;
        MyHeight=canvasHeight;

        MyPanel canvas=new MyPanel();
        setContentPane(canvas);
        pack();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    private class MyPanel extends JPanel{
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D)g;
            //drawing procedure of each hexagon
            for(int i=0;i<19;i++) {
                Path2D polyline = new Path2D.Double();
                //moving to the specified coordinates
                polyline.moveTo(Controller.getHEX()[i].xCoordinates[0], Controller.getHEX()[i].yCoordinates[0]);
                //the loop to traverse six vertex
                for (int j = 0; j < Controller.getHEX()[i].xCoordinates.length; j++) {
                    //drawing a straight line from the current coordinates to the new specified coordinates specified in double precision.
                    polyline.lineTo(Controller.getHEX()[i].xCoordinates[j], Controller.getHEX()[i].yCoordinates[j]);
                    g2.draw(polyline);
                }
                polyline.closePath();
                g2.draw(polyline);
                Shape hex = polyline;

                DrawingHelper.setHexColor(g2, hex, Controller.getHEX()[i].HG.getColorRes());
                DrawingHelper.setHexStroke(g2, hex, Color.black);
                int min = 1;
                int max = 12;
                Random ran = new Random();
                int s = ran.nextInt(max) % (max - min + 1) + min;
                g2.setFont(new Font("Times New Roman",Font.PLAIN,30));
                g2.drawString(String.valueOf(s), (float) Controller.getHEX()[i].xCenter, (float) Controller.getHEX()[i].yCenter);
            }

        }
        @Override
        public Dimension getPreferredSize(){
            return new Dimension(MyWidth,MyHeight);
        }/*determine the size of the canvas in its proper class
         */

    }

}