/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;
class MultiThreadingTwo implements Runnable{
    public void run(){
        try {
            System.out.println("Thread"+Thread.currentThread().getId()+"is running");
        }
        catch(Exception e){
            System.out.println("Exception is caught");
        }
    }
}

/**
 *
 * @author smv
 */

public class RunableInference {
    public static void main(String[] args){
        for(int i=0;i<8;i++){
            MultiThreadingTwo mt1=new MultiThreadingTwo();
            Thread t1=new Thread(mt1);
            t1.start();
        }
    }
    
}
