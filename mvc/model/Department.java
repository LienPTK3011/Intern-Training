package mvc.model;

public class Department {
	private String codeDepartment;
	private String nameDepartment;
	
	public Department(String codeDepartment, String nameDepartment) {
		this.codeDepartment = codeDepartment;
		this.nameDepartment = nameDepartment;
	}
	public Department() {
		
	}
	public String getCodeDepartment() {
		return codeDepartment;
	}
	public void setCodeDepartment(String codeDepartment) {
		this.codeDepartment = codeDepartment;
	}
	public String getNameDepartment() {
		return nameDepartment;
	}
	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}
	
	@Override
	public String toString() {
		return "Department [codeDepartment=" + codeDepartment + ", nameDepartment=" + nameDepartment + "]";
	}

	
}
