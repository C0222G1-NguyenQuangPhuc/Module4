package com.codegym.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DictionaryServiceImpl implements IDictionaryService{
    private static Map<String, String> map = new HashMap<>();
    static {
        map.put("hello","xin chào");
        map.put("age","tuổi");
        map.put("gender","giới tính");
        map.put("address","địa chỉ");
    }

    public String translate(String keyword){
        if (map.containsKey(keyword)){
            return map.get(keyword);
        }else {
            return "not found";
        }
    }
}
