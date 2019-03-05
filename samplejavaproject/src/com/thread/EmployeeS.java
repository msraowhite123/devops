package com.thread;
class EmployeeS {
    private Integer id;
    private String firstName;
    private String lastName;
    Integer age;
     
    public EmployeeS(Integer id, String firstName, String lastName, Integer age){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
     
    //Other getter and setter methods
     
    @Override
    public String toString() {
        return "\n["+this.id+","+this.firstName+","+this.lastName+","+this.age+"]";
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}