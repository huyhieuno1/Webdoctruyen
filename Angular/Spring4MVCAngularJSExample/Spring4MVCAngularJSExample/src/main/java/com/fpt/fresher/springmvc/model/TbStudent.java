package com.fpt.fresher.springmvc.model;
// Generated Dec 13, 2017 11:41:48 PM by Hibernate Tools 4.3.5.Final

/**
 * TbStudent generated by hbm2java
 */
public class TbStudent implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4241563771942026383L;
	
	private long id;
	private String username;
	private String address;
	private String email;
	private Double diemtoan;
	private Double diemly;
	private Double diemhoa;
	private String classname;

	public TbStudent() {
	}

	public TbStudent(long id, String username, String address, String email, Double diemtoan, Double diemly, Double diemhoa,
			String classname) {
		this.id = id;
		this.username = username;
		this.address = address;
		this.email = email;
		this.diemtoan = diemtoan;
		this.diemly = diemly;
		this.diemhoa = diemhoa;
		this.classname = classname;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the diemtoan
	 */
	public Double getDiemtoan() {
		return diemtoan;
	}

	/**
	 * @param diemtoan the diemtoan to set
	 */
	public void setDiemtoan(Double diemtoan) {
		this.diemtoan = diemtoan;
	}

	/**
	 * @return the diemly
	 */
	public Double getDiemly() {
		return diemly;
	}

	/**
	 * @param diemly the diemly to set
	 */
	public void setDiemly(Double diemly) {
		this.diemly = diemly;
	}

	/**
	 * @return the diemhoa
	 */
	public Double getDiemhoa() {
		return diemhoa;
	}

	/**
	 * @param diemhoa the diemhoa to set
	 */
	public void setDiemhoa(Double diemhoa) {
		this.diemhoa = diemhoa;
	}

	/**
	 * @return the classname
	 */
	public String getClassname() {
		return classname;
	}

	/**
	 * @param classname the classname to set
	 */
	public void setClassname(String classname) {
		this.classname = classname;
	}


}