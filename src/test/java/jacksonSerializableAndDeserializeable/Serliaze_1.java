package jacksonSerializableAndDeserializeable;

import java.io.File;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonPropertyOrder(value = { "createdBy", "projectName", "status", "teamSize" })

@JsonIgnoreProperties(value = { "team xSize" }, allowSetters = true)

class Project {
	// POJO(Plain Old Java Object) class

//	@JsonProperty(value="project Name")
	private String projectName;
	
//	@JsonProperty(value="created By")
	private String createdBy;
	
//	@JsonProperty(value="team Size")
	private int teamSize;
	
	private String status;

	public Project() {

	}

	public Project(String projectName, String createdBy, int teamSize, String status) {
		super();
		this.projectName = projectName;
		this.createdBy = createdBy;
		this.teamSize = teamSize;
		this.status = status;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getProjectName() {
		return projectName;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public String getStatus() {
		return status;
	}
}

public class Serliaze_1 {

	public static void main(String[] args) throws Throwable {
		Project p1 = new Project("Project_01", "pavankalyan", 3, "created");

		ObjectMapper objm = new ObjectMapper();
		objm.writeValue(new File("./p1.json"), p1);

		System.out.println("===done===");

	}

}
