package com.ibm.portalserver.study;

public class Loop {
    public static void main(String[] args) {
        int count = 0;
        for(int i=5;i<101;i++){
            count++;
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
