/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import Node.Node;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import model.Student;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 
 * @version 1
 * @since 17/03/2019
 * @author Abel Kinkela
 * 
 */
public class StudentListTest {
    DateTimeFormatter format = DateTimeFormatter.ofPattern("d/MM/yyyy");
    LocalDate date = LocalDate.parse("13/01/2012", format);
    LocalDate date2 = LocalDate.parse("20/01/2018", format);
    Student student = new Student("S1234567", "John", 3, date);
    Student student2 = new Student("S0034522", "Abel", 4, date2);
    StudentList instance = new StudentList();
    
    public StudentListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addAtStart method, of class StudentList.
     */
    @Test
    public void testAddAtStart() {
        System.out.println("addAtStart");
        instance.addAtStart(student);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(student, instance.getHead().getStudent());
    }

    /**
     * Test of addLast method, of class StudentList.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        instance.addLast(student);
        // TODO review the generated test code and remove the default call to fail.
         assertEquals(student, instance.getTail().getStudent());
    }

    /**
     * Test of getLength method, of class StudentList.
     */
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        instance.addAtStart(student);
        int expResult = 1;
        int result = instance.getLength();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHead method, of class StudentList.
     */
    @Test
    public void testGetHead() {
        System.out.println("getHead");
        instance.addLast(student);
        instance.addLast(student2);
        Node result = instance.getHead();
        assertEquals(student, result.getStudent());

    }

    /**
     * Test of getTail method, of class StudentList.
     */
    @Test
    public void testGetTail() {
        System.out.println("getTail");

        instance.addLast(student);
        instance.addLast(student2);
        Node result = instance.getTail();
        assertEquals(student2, result.getStudent());
    }

    /**
     * Test of setTail method, of class StudentList.
     */
    @Test
    public void testSetTail() {
        System.out.println("setTail");
        instance.addLast(student);
        instance.addLast(student);
        Node newNode = new Node(student2);
         instance.setTail(newNode);
        assertEquals(newNode, instance.getTail()); //if the tail of the instance is the new node then OK
    }



    /**
     * Test of deleteStudent method, of class StudentList.
     */
    @Test
    public void testDeleteStudent() {
        System.out.println("deleteStudent");
        instance.addLast(student);
        instance.addLast(student);
        instance.addLast(student2);
        instance.addLast(student);
        String reference = "S0034522";
        String type = "ID";
        instance.deleteStudent(reference, type);
        Node node = null;
        assertEquals(null, instance.searchStudentByName(reference));
    }

    /**
     * Test of searchStudentByID method, of class StudentList.
     */
    @Test
    public void testSearchStudentByID() {
        System.out.println("searchStudentByID");
        instance.addLast(student2);
        instance.addLast(student);
        String ID = "S1234567";
        String ID2 = "S1234560";
        Node result = instance.searchStudentByID(ID);
        Node result2 = instance.searchStudentByID(ID2);
        
        assertEquals(student, result.getStudent());
        assertEquals(null, result2);
    }

    /**
     * Test of searchStudentByName method, of class StudentList.
     */
    @Test
    public void testSearchStudentByName() {
        System.out.println("searchStudentByName");

        instance.addLast(student2);
        instance.addLast(student);
        String name = "Abel";
        String name2 = "Pedro";
        Node result = instance.searchStudentByName(name);
        Node result2 = instance.searchStudentByName(name2);
        
        assertEquals(student2, result.getStudent());
        assertEquals(null, result2);

    }
}

