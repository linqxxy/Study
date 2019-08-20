package com.linqxxy.convert;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConvertTools implements Converter<String, Date> {

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date date = null;

    @Override
    public Date convert(String s) {
        try {
            date = simpleDateFormat.parse(s);
            return date;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
