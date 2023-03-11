package com.mzvzm;

import org.openjdk.jol.info.ClassLayout;

public class Main {
    public static void main(String[] args) {
        Student o = new Student();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());

        synchronized (o) {
            System.out.println(ClassLayout.parseInstance(o).toPrintable());
        }

        System.out.println(ClassLayout.parseInstance(o).toPrintable());
    }

    static class Student {
        private String name;
        private int age;

        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }
}