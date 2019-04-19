package list;




import Node.Node;
import daos.DAOO;
import daos.IDisplayable;
import java.io.Serializable;
import model.Student;

/**
 * A Serializable Double-linked list
 * @version 1
 * @since 17/03/2019
 * @author Abel Kinkela
 * 
 */
public class StudentList implements IDisplayable, Serializable{
    private Node head;
    private Node tail;

    /**
     * Add student at the head of the student list
     * @param student list to add at head
     */
    public void addAtStart(Student student){ 
        Node node = new Node(student);
        node.setNext(head);
        
        if(this.head != null){
            this.head.setPrevious(node);
        }
        this.head= node;
    }
    
    /**
     * Add student at the the tail of the student list
     * @param student list to add at tail
     */
     public void addLast(Student student) {
        Node node = new Node(student);
        if(this.head==null){
            this.head=node;
        }
        else{
            node.setPrevious(getTail());
            getTail().setNext(node);
            setTail(node);
        }
    }
     /**
     * @return the size of the list
     * 
     */
    public int getLength(){ //counts the number of nodes starting from head
        Node node = head;
        int length = 0; // is local, otherwise it won't decrement when deleting is done
        while(node != null){
            length++;    
            node=node.getNext();
        } 
        return length;
        
    }

    public Node getHead() {
        return this.head;
    }

    public Node getTail() {
        Node node = head;
        while(node.getNext() != null){    
            node=node.getNext();
        }
        tail=node;
        return tail;
    }

    public void setTail(Node node) {
        Node ctail = getTail();
        ctail.setNext(node);
        node.setPrevious(ctail);
        node.setNext(null);
        
        this.tail = node;
    }
    

    public void addStudentMarks(String name){
        Node node = searchStudentByName(name);
        node.getStudent().setMarks();
        
    }
    /**
     * Important: Can delete Student at any positon in the double linked list given the Student ID or Name.
     * This method gets a String reference ID or Name of student to be deleted from the list.
     *
     * @param reference the reference ID or Name of the node to be deleted
     * @param type an indication ID or Name that is being given 
     */
    public void deleteStudent(String reference, String type){
        //Levarages both searchStudentByID() and searchStudentByName() 
        //to find and get the Node of the Student we want to delete
        //checks some conditions to determine the position of the student in the list
        //and delete the student's node based on that
        
        Node node;
        if(type.equals("ID")){ //call searchStudentByID() if type is ID, meaning you are searching based on the ID
            node = searchStudentByID(reference); //
        }else{
            node = searchStudentByName(reference);
        }
        
        Node next;
        Node previous;
            
        if(node !=null){
            if((node.getNext() == null)&&(node.getPrevious() == null)){
                System.out.println("Student: "+node.getStudent() + " deleted");
                head=null;
                tail = null;
            }
            if((node.getNext() != null)&&(node.getPrevious() != null)){
                System.out.println("Student: "+node.getStudent() + " deleted");
                next = node.getNext();
                previous = node.getPrevious();
                previous.setNext(next);
                next.setPrevious(previous);

                
                
            }
            if((node.getNext() == null)&&(node.getPrevious() != null)){
                System.out.println("Student: "+node.getStudent() + " deleted");
                previous = node.getPrevious();
                previous.setNext(null);
                node.setPrevious(null);
            }
            
            if((node.getNext() != null)&&(node.getPrevious() == null)){
                System.out.println("Student: "+node.getStudent() + " deleted");
                next = node.getNext();
                next.setPrevious(null);
                node.setNext(null);
                head=next;
            }

            
        }
        else{
            System.out.println("Student with ID "+reference+" not found");
        }
    }
    
     
    /**
     * Method searches a student given a String ID of the student
     * @param ID the id of the Student to look for
     * @return Student if the Student is found in the list, null otherwise
     */
    public Node searchStudentByID(String ID){
        Node node = head;
        while(node != null){
            if(node.getStudent().getStudentID().equals(ID)){
                return node;
            }
            node = node.getNext();
        }
        return null;
    }
    
    /**
     * Method searches a student given a String name of the student
     * @param name the id of the Student to look for
     * @return Student if the Student is found in the list, null otherwise
     */
    public Node searchStudentByName(String name){
        Node node = head;
        while(node != null){
            if(node.getStudent().getName().equals(name)){
                return node;
            }
            node = node.getNext();
        }
        return null;
    }
     
    /**
     * saveStudentList(StudentList studentList)
     * Given a list, the method saves it to the external file
     * @param studentList A doublelinked list of Students
     */
    public void saveStudentList(StudentList studentList){
        DAOO daoo = new DAOO(); //an instance of DAOO which has saveList method for saving to a file
        daoo.saveList(studentList); //an instance of DAOO which has readList method for reading from a file
    }
    /**
     * readStudentList()
     * @return StudentList object read from a file or Null if object found 
     */
    public StudentList readStudentList(){
        DAOO daoo = new DAOO();
        return daoo.readList();
    }
    /**
     * Student list representation with full student details.
     * Node: call toString() for a simplified version of the display
     */
    @Override
    public void display(){
       Node node = head;
       while(node != null){//keep going untill there is no more
           node.display();
           node= node.getNext();
       }
       
    }
    /**
     * Student list representation that does not show the student details
     * @return String representation of the student list
     * Node: Call display() for a full version of the display
     */
    @Override
    public String toString(){
        String studentList ="Students: \n";
        Node node = this.head;
        while(node != null){
            studentList += node;
            if(node.getNext() !=null){//prevents this simbol ">>" from being printed at the end, signaling next, when indeed there is nothing to show
                studentList += " >> ";
            }
            node=node.getNext();
        } 
        
        return studentList;
    }
    
}
