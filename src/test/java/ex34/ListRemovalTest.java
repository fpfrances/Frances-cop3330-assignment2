/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Filipe Frances
 */
package ex34;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;


class ListRemovalTest{

    @Test
    void test1(){
        ArrayList<String> employees;
       assertEquals("\nThere are 4 employees:" +
               "\nJackie Jackson" +
               "\nChris Jones" +
               "\nAmanda Cullen" +
               "\nJeremy Goodwin", ListRemoval.EmployeeList());
    }


    //@Test
    //void printEmployees() {

}