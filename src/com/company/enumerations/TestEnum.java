package com.company.enumerations;

public class TestEnum {

  public void method(){

  }
  public static void main(String[] args) throws NoSuchMethodException {
    JavaStudent student1 = new JavaStudent();
    
    student1.setName("Vahe");
    student1.setLastName("Mikayelyan");
    student1.setAge(38);
    student1.setLevel(Level.BEGINNER);
    student1.setGender(Gender.MALE);

    JavaStudent student2 = new JavaStudent();

    student2.setName("Gagik");
    student2.setLastName("Movsesyan");
    student2.setAge(22);
    student2.setLevel(Level.INTERMEDIATE);
    student2.setGender(Gender.MALE);

    JavaStudent student3 = new JavaStudent();

    student3.setName("Aram");
    student3.setLastName("Mirzoyan");
    student3.setAge(22);
    student3.setLevel(Level.EXPERT);
    student3.setGender(Gender.MALE);

    JavaStudent[] javaStudents = new JavaStudent[3];
    javaStudents[0] = student1;
    javaStudents[1] = student2;
    javaStudents[2] = student3;

    Level level = null;
    for (JavaStudent javaStudent : javaStudents) {
      level = javaStudent.getLevel();

      switch (level) {
        case BEGINNER:
          System.out.println(javaStudent.getName() + " Your level is " + Level.BEGINNER.name());
          break;
        case INTERMEDIATE:
          System.out.println(javaStudent.getName() + " Your level is " + Level.INTERMEDIATE.name());
          break;
        case EXPERT:
          System.out.println(javaStudent.getName() + " Your level is " + Level.EXPERT.name());
          break;
        default:
          System.out.println("no such level");
      }
    }

    if (student3.getLevel() == Level.EXPERT) {
      System.out.println("I am a expert");
    }
  }

}
