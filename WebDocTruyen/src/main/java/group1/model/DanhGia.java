package group1.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DANHGIA")
public class DanhGia {
	
	@Id
	@GeneratedValue
	@Column(name="ID", nullable = false)
	private int id;
	@Column(name="DETAIL", nullable = true)
	private String deTail;
	@Column(name="RATE", nullable = true)
	private int rate;
	@Column(name="ID_TRUYEN", nullable = false)
	private int idTruyen;
	@Column(name="ID_DOCGIA", nullable = false)
	private  int idDocGia;
	@Column(name="DATE", nullable = true)
	private Date date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeTail() {
		return deTail;
	}
	public void setDeTail(String deTail) {
		this.deTail = deTail;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getIdTruyen() {
		return idTruyen;
	}
	public void setIdTruyen(int idTruyen) {
		this.idTruyen = idTruyen;
	}
	public int getIdDocGia() {
		return idDocGia;
	}
	public void setIdDocGia(int idDocGia) {
		this.idDocGia = idDocGia;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public DanhGia() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
