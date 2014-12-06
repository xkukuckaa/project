/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stihacka;

import java.awt.event.KeyEvent;
import net.useobjects.draw.drawable.GroupView;
import net.useobjects.draw.samples.Aircraft;
import net.useobjects.frame.MainWindow;
import net.useobjects.timer.SimpleTimer;

/**
 *
 * @author ja
 */
public class Stihacka{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");// TODO code application logic here
    MainWindow window = new MainWindow("bojova hra", 1024, 768);
        GroupView group = window.getRootGroup();
    Aircraft aircraft1 = new Aircraft(group, 250, 200, 0);
    
    final double DEFAULT_SPEED = 2;
    final double SPEED_CHANGE = 0.05;
    double speed = DEFAULT_SPEED;
    while(! window.isKeyDown(KeyEvent.VK_ESCAPE)){
        final double ROTATION_CHANGE = 0.1;
        
        if( window.isKeyDown(KeyEvent.VK_RIGHT)){
            aircraft1.rotate(ROTATION_CHANGE);
        }
        if( window.isKeyDown(KeyEvent.VK_LEFT)){
            aircraft1.rotate(-ROTATION_CHANGE);
        }
        if( window.isKeyDown(KeyEvent.VK_UP)){
        
            speed++;
        }
         if( window.isKeyDown(KeyEvent.VK_DOWN)){
             
             speed--;
        }
         
         if(aircraft1.getPositionX()>800 || aircraft1.getPositionX()<0 ){
         aircraft1.rotate(3.14);
         }
         if(aircraft1.getPositionY()>600 || aircraft1.getPositionY()<0 ){
         aircraft1.rotate(3.14);
         }
        aircraft1.moveForwards(speed);
        SimpleTimer.sleep(10);
        
    }
    window.dispose();
    }
    }
    

