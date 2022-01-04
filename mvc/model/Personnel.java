package mvc.model;

public class Personnel  extends Department{
	
	private String codePersonnel;
	private String namePersonnel;
	private String skillPersonnel;
	
	public Personnel(String codeDepartment, String nameDepartment, String codePersonnel, String namePersonnel,
			String skillPersonnel) {
		super(codeDepartment, nameDepartment);
		this.codePersonnel = codePersonnel;
		this.namePersonnel = namePersonnel;
		this.skillPersonnel = skillPersonnel;
	}

	public Personnel() {
		super();
	}
	

	public String getCodePersonnel() {
		return codePersonnel;
	}

	public void setCodePersonnel(String codePersonnel) {
		this.codePersonnel = codePersonnel;
	}

	public String getNamePersonnel() {
		return namePersonnel;
	}

	public void setNamePersonnel(String namePersonnel) {
		this.namePersonnel = namePersonnel;
	}

	public String getSkillPersonnel() {
		return skillPersonnel;
	}

	public void setSkillPersonnel(String skillPersonnel) {
		this.skillPersonnel = skillPersonnel;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.print("Personnel [codePersonnel=" + codePersonnel + ", namePersonnel=" + namePersonnel + ", skillPersonnel=" + skillPersonnel + "]  ");
		return super.toString();
		
	}
	
	
	
}
