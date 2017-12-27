/**
 * 
 */
package com.fpt.fresher.springmvc.model;

/**
 * @author hungxoan
 *
 */
public class Student extends BaseModel{
	private String className;
	private double diemToan;
	private double diemLy;
	private double diemHoa;
	
	public Student(){
		this.id=0;
	}
	
	public Student(long id, String username,String className, double diemToan, double diemLy, double diemHoa){
		this.id = id;
		this.className = className;
		this.username = username;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}

	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * @return the diemToan
	 */
	public double getDiemToan() {
		return diemToan;
	}

	/**
	 * @param diemToan the diemToan to set
	 */
	public void setDiemToan(double diemToan) {
		this.diemToan = diemToan;
	}

	/**
	 * @return the diemLy
	 */
	public double getDiemLy() {
		return diemLy;
	}

	/**
	 * @param diemLy the diemLy to set
	 */
	public void setDiemLy(double diemLy) {
		this.diemLy = diemLy;
	}

	/**
	 * @return the diemHoa
	 */
	public double getDiemHoa() {
		return diemHoa;
	}

	/**
	 * @param diemHoa the diemHoa to set
	 */
	public void setDiemHoa(double diemHoa) {
		this.diemHoa = diemHoa;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof User))
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
