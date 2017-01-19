package com.ihuaqiang.core.java.chapter_4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ihuaqiang
 * @version 1.0
 * @date：2017/1/18
 */
public class Clone {

    private Date hireDay;


    public Clone(Date hireDay) {
        this.hireDay = hireDay;
    }

    public Date getHireDay() {
        //如果返回一个可变数据域的拷贝，就应该使用克隆
        return (Date) hireDay.clone();
    }

    public static void main(String args[]) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2008-08-08 12:10:12");
        Clone harry = new Clone(date);
        Date hireDay = harry.getHireDay();
        System.out.println(harry.getHireDay());
        double tenYearsMilliSeconds = 24 * 60 * 60 * 1000;
        hireDay.setTime(hireDay.getTime()-(long)tenYearsMilliSeconds);
        System.out.println(harry.getHireDay());
    }
}
