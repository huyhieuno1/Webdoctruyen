package group1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TRUYEN")
public class Truyen {

	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="YEAR")
	private int year;
	@Column(name="CONTANT")
	private String conTant;
	@Column(name="DETAIL")
	private String deTail;
	@Column(name="ID_TACGIA")
	private int idTacGia;
	@Column(name="ID_THELOAI")
	private int idTheLoai;
	@Column(name="VIEWS")
	private int views;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getConTant() {
		return conTant;
	}
	public void setConTant(String conTant) {
		this.conTant = conTant;
	}
	public String getDeTail() {
		return deTail;
	}
	public void setDeTail(String deTail) {
		this.deTail = deTail;
	}
	public int getIdTacGia() {
		return idTacGia;
	}
	public void setIdTacGia(int idTacGia) {
		this.idTacGia = idTacGia;
	}
	public int getIdTheLoai() {
		return idTheLoai;
	}
	public void setIdTheLoai(int idTheLoai) {
		this.idTheLoai = idTheLoai;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public Truyen() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
