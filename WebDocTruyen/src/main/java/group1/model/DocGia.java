package group1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DOCGIA")
public class DocGia {

	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	@Column(name="USERNAME")
	private String userName;
	@Column(name="PASSWORD")
	private String passWord;
	@Column(name="FULL_NAME")
	private String fullName;
	@Column(name="POLICY")
	private int policy;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getPolicy() {
		return policy;
	}
	public void setPolicy(int policy) {
		this.policy = policy;
	}
	public DocGia() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
