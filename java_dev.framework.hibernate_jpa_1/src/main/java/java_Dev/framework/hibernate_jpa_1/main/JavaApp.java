package java_Dev.framework.hibernate_jpa_1.main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import java_dev.framework.hibernate_jpa_1.entity.*;

public class JavaApp {
	public static void exec() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Student");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        
//        Project project1=new Project();
//        project1.setId(1);
//        project1.setName("Java");
//        project1.setDescription("A Java Project");
//        entityManager.persist(project1);
//        
//        Student student1=new Student();
//        student1.setId(1);
//        student1.setName("Raja");
//        student1.setContact(86256327L);
//        student1.setMailId("Raja@gmail.com");
//        student1.setProject(project1);
//        entityManager.persist(student1);
//        
//        Project project2=new Project();
//        project2.setId(2);
//        project2.setName("C++");
//        project2.setDescription("A c++ Project");
//        entityManager.persist(project2);
//        
//        Student student2=new Student();
//        student2.setId(2);
//        student2.setName("Rani");
//        student2.setContact(86286327L);
//        student2.setMailId("Rani@gmail.com");
//        student2.setProject(project2);
//        entityManager.persist(student2);
//        
//        Project project3=new Project();
//        project3.setId(3);
//        project3.setName("mern");
//        project3.setDescription("A mern Project");
//        entityManager.persist(project3);
//        
//        Student student3=new Student();
//        student3.setId(3);
//        student3.setName("Rocky");
//        student3.setContact(86252327L);
//        student3.setMailId("Rockya@gmail.com");
//        student3.setProject(project3);
//        entityManager.persist(student3);
//        
//        Project project4=new Project();
//        project4.setId(4);
//        project4.setName("html");
//        project4.setDescription("A html Project");
//        entityManager.persist(project4);
//        
//        Student student4=new Student();
//        student4.setId(4);
//        student4.setName("piyush");
//        student4.setContact(86256727L);
//        student4.setMailId("piyush@gmail.com");
//        student4.setProject(project4);
//        entityManager.persist(student4);
        
//        Student student=entityManager.find(Student.class,1);
//        if(student!=null) {
//        	System.out.println(student);
//        	Project project=student.getProject();
//        	if(project!=null) {
//        		System.out.println(project);
//        	}
//        }
        //Update
//        Student student=entityManager.find(Student.class,1);
//        if(student!=null) {
//        	student.setName("Mohit");
//        	
//        	System.out.println(student);
//        	Project project=student.getProject();
//        	if(project!=null) {
//        		project.setName("python");
//        		project.setDescription("A python project");
//        		System.out.println(project);
//        	}
//        }
        
        Project project1=new Project();
      project1.setId(1);
      project1.setName("Java");
      project1.setDescription("A Java Project");
      entityManager.persist(project1);
      
      Project project2=new Project();
      project2.setId(2);
      project2.setName("C++");
      project2.setDescription("A c++ Project");
      entityManager.persist(project2);
      
      Project project3=new Project();
      project3.setId(3);
      project3.setName("mern");
      project3.setDescription("A mern Project");
      entityManager.persist(project3);
      
      Project project4=new Project();
      project4.setId(4);
      project4.setName("html");
      project4.setDescription("A html Project");
      entityManager.persist(project4);
      Project[] project_t= {project1,project2,project3,project4};
      
      Student student1=new Student();
      student1.setId(1);
      student1.setName("piyush");
      student1.setContact(86256727L);
      student1.setMailId("piyush@gmail.com");
      student1.setProject(project_t);
      entityManager.persist(student1);
      
        
        
        entityTransaction.commit();
	    entityManager.close();
	    entityManagerFactory.close();
	    

	}

}
