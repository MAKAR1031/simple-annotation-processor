package ru.makar.demo.annotation.processor;

import ru.makar.demo.annotation.RandomInt;

import java.lang.reflect.Field;
import java.util.Random;

public class RandomIntAnnotationProcessor {
    public static <T> T makeInstance(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        T instance = clazz.newInstance();
        Random random = new Random();
        for (Field field : clazz.getDeclaredFields()) {
            RandomInt annotation = field.getAnnotation(RandomInt.class);
            if (annotation != null) {
                field.setAccessible(true);
                field.set(instance, random.nextInt(annotation.bound()));
            }
        }
        return instance;
    }
}
