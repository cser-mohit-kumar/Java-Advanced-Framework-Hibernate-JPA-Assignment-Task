package java_dev.framework.hibernate_jpa.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.io.Serializable;
import java.util.Objects;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

//import java.util.Objects;
@Entity
public class Student implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String mailId;
	private Long contact;
	public Student() {
		
	}
	
	public Student(Integer id, String name, String mailId, Long contact) {
		super();
		this.id = id;
		this.name = name;
		this.mailId = mailId;
		this.contact = contact;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mailId=" + mailId + ", contact=" + contact + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(contact, id, mailId, name);
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
				&& Objects.equals(mailId, other.mailId) && Objects.equals(name, other.name);
	}
	

}
