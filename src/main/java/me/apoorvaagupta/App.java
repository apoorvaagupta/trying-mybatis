package me.apoorvaagupta;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 */

public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DbConfig.class);

        TestMapper t = context.getBean(TestMapper.class);
//        Test t1 = new Test(1, "t1");
//        System.out.println(t1.getTestId());
//        t.insertPerson(t1);
        //t.insertPerson(new Test(5, "test2"));
//        t.insertPerson(new Test(3, "test3"));
        System.out.println(t.selectPerson(5).getTestId() + " " + t.selectPerson(5).getTestName());

        //t.selectPerson(4);
        //System.out.println(t4.getTestName());

    }
}
