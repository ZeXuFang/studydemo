package com.ibm.portalserver.study;

import java.util.HashMap;
import java.util.Map;
/*你别定义成空的字符串数组 你定义一个长度为8的字符串数组 然后往数组里塞进八个元素 比如 "test1" "test2"...... 然后你再输出
        你那个string arr[] = new String[10]
        这个是空数组*/
public class array {
    public static void main(String[] args) {
        HashMap<String , String>map = new HashMap<>();
        String arr[] =  new String[10];
        for(int i=0;i<10;i++){
            arr[i] = String.valueOf(i);
            map.put("key"+(i),"value"+arr[i]);

        }
        System.out.println(map);

        String arr2[] = {"test1","test2","test3","test4","test5","test6","test7","test8"};
        HashMap<String , String>map2 = new HashMap<>();
        for(int i=0;i<arr2.length;i++){
            map2.put("key"+(i),"value"+arr2[i]);
        }
        System.out.println(map2);

    }
}
