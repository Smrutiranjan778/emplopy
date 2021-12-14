package com.employee.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class EmployeeBean.
 */
public class EmployeeBean {
	
	/** The id. */
	private Integer id;
	
	/** The name. */
	private String name;
	
	/** The gender. */
	private String gender;
	
	/** The salary. */
	private Float salary;
	
	/**
	 * Instantiates a new employee bean.
	 */
	public EmployeeBean() {
		super();
	}
	
	/**
	 * Instantiates a new employee bean.
	 *
	 * @param name the name
	 * @param gender the gender
	 * @param salary the salary
	 */
	public EmployeeBean(String name, String gender, Float salary) {
		super();
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}
	
	/**
	 * Instantiates a new employee bean.
	 *
	 * @param id the id
	 * @param name the name
	 * @param gender the gender
	 * @param salary the salary
	 */
	public EmployeeBean(Integer id, String name, String gender, Float salary) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the gender.
	 *
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	
	/**
	 * Sets the gender.
	 *
	 * @param gender the new gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	/**
	 * Gets the salary.
	 *
	 * @return the salary
	 */
	public Float getSalary() {
		return salary;
	}
	
	/**
	 * Sets the salary.
	 *
	 * @param salary the new salary
	 */
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	
}
