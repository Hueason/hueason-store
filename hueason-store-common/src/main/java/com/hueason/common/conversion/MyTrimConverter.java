package com.hueason.common.conversion;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

/**
 * DESCRIPTION
 *
 * @Author hueason
 * @create 2017-06-25 15:22
 */
@Configuration
public class MyTrimConverter implements Converter<String,String>{

    @Override
    public String convert(String source) {
        if(null != source){
            source = source.trim();
            if(!"".equals(source)){
                return source;
            }
        }
        return null;
    }
}
