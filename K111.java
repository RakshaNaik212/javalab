/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;
class MultiThreadingThree extends Thread{
    public void run() {
        for(int i=1;i<5;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                
            }
        }
    }
}

/**
 *
 * @author smv
 */
public class K111 {
    public static void main(String[] args){
            MultiThreadingThree mt1=new MultiThreadingThree();
            mt1.start();
        }
    }
    


    

