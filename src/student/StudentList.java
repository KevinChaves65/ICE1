/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author kevinchaves
 * commit for roll back
 */
public class StudentList {
    public static void main(String[]args){
      
        Student s1 = new Student("s1","Ronak");
        Student[] StudentList = new Student[3];
        StudentList[0] = new Student("s1","Ronak");
        StudentList[1] = new Student("s2","John");
        StudentList[2] = new Student("s3","Alex");
        
        for (int i=0;i<StudentList.length;i++){
            System.out.println(StudentList[i].getStudentName());
        }


    }//main
}//class
