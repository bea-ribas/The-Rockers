package rockersModel;

public class Contract {
	
	private String projectType;
	private User user;
	
	
	public Contract(String projectType) {
		
		this.projectType = projectType;
	}

	public String getProjectType() {
		
		return projectType;
	}

	public void setProjectType(String projectType) {
		
		this.projectType = projectType;
	}

	public User getUser() {
		
		return user;
	}

	public void setUser(User user) {
		
		this.user = user;
	}
}