package com.company.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {

  public static void main(String[] args)
      throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
    Student student = new Student();

    Class<? extends Student> aClass = student.getClass();
    Method method = aClass.getDeclaredMethod("calculate");
    method.setAccessible(true); //alohomora

    Object invoke = method.invoke(student);
    System.out.println(invoke);

    Field field = aClass.getDeclaredField("bDayYear");
    field.setAccessible(true);

    field.set(student, 1000);
    System.out.println(student.getbDayYear());
  }

}
