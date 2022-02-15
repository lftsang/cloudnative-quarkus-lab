package org.acme;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/getStudent")
@Produces(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class Lab2HttpReturnJsonObjList {
    @GET
    @Path("/one")
    public Student sayHello() {
        Student s  = new Student("M","Felix T","year 12");
        return s;
    }
    @GET
    @Path("/all")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList();
        Student s1  = new Student("M","Felix","Year 12");
        Student s2  = new Student("F","Fanny","Year 11");
        students.add(s1); 
        students.add(s2);
        return students;
    }

}