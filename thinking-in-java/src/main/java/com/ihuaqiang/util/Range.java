package com.ihuaqiang.util;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/2/7
 */
public class Range {
    public static int[] range(int n){
        int[] result=new int[n];
        for (int i=0;i<result.length;i++){
            result[i]=i;
        }
        return result;
    }

    public static int[] range(int start,int end){
        int sz=end-start;
        int[] result=new int[sz];
        for (int i=0;i<sz;i++){
            result[i]=i+start;
        }
        return result;
    }


    //Produce a sequence [start..end) incrementing by step
    public static int[] range(int start,int end,int step){
        int sz=(end-start)/step;
        int[] result=new int[sz];
        for (int i=0;i<sz;i++){
            result[i]=start+(i*step);
        }
       return result;
    }
}
