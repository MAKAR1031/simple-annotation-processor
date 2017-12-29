package ru.makar.demo;

import ru.makar.demo.bean.SimpleBean;
import ru.makar.demo.annotation.processor.RandomIntAnnotationProcessor;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        SimpleBean bean = RandomIntAnnotationProcessor.makeInstance(SimpleBean.class);
        System.out.println(bean);
    }
}
