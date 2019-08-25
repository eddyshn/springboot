package com.example.eddy;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: eddy
 * @description:
 * @author: Eddy.Shan
 * @create: 2019-08-25 00:03
 **/
@Component
public class DateConverter implements Converter<String, Date> {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    @Override
    public Date convert(String s) {
        if (s!=null&&!"".equals(s)){
            try {
                return sdf.parse(s);
            } catch (ParseException e){
                e.printStackTrace();
            }
        }
        return null;
    }
}
