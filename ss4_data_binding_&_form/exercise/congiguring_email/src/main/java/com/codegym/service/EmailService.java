package com.codegym.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmailService implements IEmailService {
    @Override
    public List<String> listLanguage() {
        List<String> listLanguage = new ArrayList<>();
        listLanguage.add("English");
        listLanguage.add("Vietnamese");
        listLanguage.add("Japanese");
        listLanguage.add("Chinese");
        return listLanguage;
    }

    @Override
    public List<Integer> listSize() {
        List<Integer> listSize = new ArrayList<>();
        listSize.add(5);
        listSize.add(15);
        listSize.add(25);
        listSize.add(50);
        listSize.add(100);
        return listSize;
    }
}
