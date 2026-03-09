package java_dev.framework.hibernate_jpa.main;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import java_dev.framework.hibernate_jpa.entity.Employee;
import java_dev.framework.hibernate_jpa.entity.Student;
import java.util.Scanner;

public class JavaApp {
    public static void exec() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Student");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Student student1 = new Student();
        student1.setName("Raja");
        student1.setContact(93461278L);
        student1.setMailId("raja@gmail.com");
//        entityManager.persist(student1);

        Student student2 = new Student();
        student2.setName("Rani");
        student2.setContact(93461274L);
        student2.setMailId("rani@gmail.com");
//        entityManager.persist(student2);

        Student student3 = new Student();
        student3.setName("Rocky");
        student3.setContact(93461272L);
        student3.setMailId("rocky@gmail.com");
//        entityManager.persist(student3);
        
        Student st=entityManager.find(Student.class,2);
		if(st!=null) {
			System.out.println(st);
			//update
			st.setMailId("yashi@gmail.com");
			st.setContact(77889933L);
			entityManager.merge(st);
			System.out.println("student data updated successfully");
		}
		else {
			System.out.println("student not found");
		}
		
		//delete
		Student data=entityManager.find(Student.class,4 );
		entityManager.remove(data);
		
		
		entityTransaction.commit();
		//read
		
		if(st!=null) {
			System.out.println(st);
			//update
			st.setMailId("yashi@gmail.com");
			st.setContact(77889933L);
			entityManager.merge(st);
			System.out.println("student data updated successfully");
		}
		else {
			System.out.println("student not found");
		}
		

        entityTransaction.commit();
        entityManager.close();
        entityManagerFactory.close();

        System.out.println("Done - 3 students inserted!");
    }
    public static void exec2() {
    	Scanner sc = new Scanner(System.in);

	    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Employee");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    EntityTransaction entityTransaction = entityManager.getTransaction();

	    entityTransaction.begin();

	    // INSERT
	    System.out.println("How many employees you want to add?");
	    int n = sc.nextInt();

	    for (int i = 1; i <= n; i++) {

	        Employee emp = new Employee();

	        System.out.println("Enter Employee ID:");
	        emp.setId(sc.nextInt());

	        System.out.println("Enter Employee Name:");
	        emp.setName(sc.next());

	        System.out.println("Enter Employee Mail:");
	        emp.setMailId(sc.next());

	        System.out.println("Enter Employee Number:");
	        emp.setContact(sc.nextLong());

	        entityManager.persist(emp);
	    }

	    System.out.println("Employees inserted successfully");

	    // UPDATE
	    System.out.println("Enter Employee ID to update:");
	    int updateId = sc.nextInt();

	    Employee empUpdate = entityManager.find(Employee.class, updateId);

	    if (empUpdate != null) {

	        System.out.println("Enter new Mail:");
	        empUpdate.setMailId(sc.next());
	        
	        System.out.println("Enter new Name:");
	        empUpdate.setName(sc.next());

	        System.out.println("Enter new Number:");
	        empUpdate.setContact(sc.nextLong());

	        entityManager.merge(empUpdate);

	        System.out.println("Employee updated successfully");
	    } 
	    else {
	        System.out.println("Employee not found");
	    }

	    // DELETE
	    System.out.println("Enter Employee ID to delete:");
	    int deleteId = sc.nextInt();

	    Employee empDelete = entityManager.find(Employee.class, deleteId);

	    if (empDelete != null) {

	        entityManager.remove(empDelete);

	        System.out.println("Employee deleted successfully");
	    } 
	    else {
	        System.out.println("Employee not found");
	    }

	    entityTransaction.commit();

	    entityManager.close();
	    entityManagerFactory.close();
	    sc.close();

	    System.out.println("Operation Completed");
	}
    
}