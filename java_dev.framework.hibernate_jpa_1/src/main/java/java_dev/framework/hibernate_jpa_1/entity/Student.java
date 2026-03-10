package java_dev.framework.hibernate_jpa_1.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;

//import java.util.Objects;
@Entity
public class Student implements Serializable{
//	@Id
////	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer id;
//	private String name;
//	private String mailId;
//	private Long contact;
//	@OneToOne
//	private Project project;
//	public Student() {
//		super();
//	}
//	public Student(Integer id, String name, String mailId, Long contact, Project project) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.mailId = mailId;
//		this.contact = contact;
//		this.project = project;
//	}
//	public Integer getId() {
//		return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getMailId() {
//		return mailId;
//	}
//	public void setMailId(String mailId) {
//		this.mailId = mailId;
//	}
//	public Long getContact() {
//		return contact;
//	}
//	public void setContact(Long contact) {
//		this.contact = contact;
//	}
//	public Project getProject() {
//		return project;
//	}
//	public void setProject(Project project) {
//		this.project = project;
//	}
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", mailId=" + mailId + ", contact=" + contact + ", project="
//				+ project + "]";
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(contact, id, mailId, name, project);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return Objects.equals(contact, other.contact) && Objects.equals(id, other.id)
//				&& Objects.equals(mailId, other.mailId) && Objects.equals(name, other.name)
//				&& Objects.equals(project, other.project);
//	}
	
	@Id
	private Integer id;
	private String name;
	private String mailId;
	private Long contact;
	@OneToMany(cascade = CascadeType.ALL)
	private Project[] project;
	public Student() {
		super();
	}
	public Student(Integer id, String name, String mailId, Long contact, Project[] project) {
		super();
		this.id = id;
		this.name = name;
		this.mailId = mailId;
		this.contact = contact;
		this.project = project;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	public Project[] getProject() {
		return project;
	}
	public void setProject(Project[] project) {
		this.project = project;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mailId=" + mailId + ", contact=" + contact + ", project="
				+ Arrays.toString(project) + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(project);
		result = prime * result + Objects.hash(contact, id, mailId, name);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(contact, other.contact) && Objects.equals(id, other.id)
				&& Objects.equals(mailId, other.mailId) && Objects.equals(name, other.name)
				&& Arrays.equals(project, other.project);
	}
	
	
	
	
	
}