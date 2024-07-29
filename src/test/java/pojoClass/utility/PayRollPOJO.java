package pojoClass.utility;


class Employee {
	public String designation;
	public String dob;
	public String email;
	public String empName;
	public int experience;
	public String mobileNo;
	public String project;
	public String role;
	public String username;
	
	public Employee(String designation, String dob, String email, String empName, int experience, String mobileNo,
			String project, String role, String username) {
		super();
		this.designation = designation;
		this.dob = dob;
		this.email = email;
		this.empName = empName;
		this.experience = experience;
		this.mobileNo = mobileNo;
		this.project = project;
		this.role = role;
		this.username = username;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}

public class PayRollPOJO {
	public int basicPlusVda;
	public Employee employee;
	public double hra;
	public double insurance;
	public double lta;
	public double lwf;
	public double netPay;
	public int payroll_id;
	public double pf;
	public double pt;
	public double stat_bonus;
	public String status;

	
	
//	employeee=new Employee("QA", "20/01/1998", "kalyan@0832", "pavan0832", 3, "9640680832", "NH_PROJ_3818", "QA", "kal9640")
	
	public PayRollPOJO(int basicPlusVda, Employee employee, double hra, double insurance, double lta, double lwf,
			double netPay, int payroll_id, double pf, double pt, double stat_bonus, String status) {
		super();
		this.basicPlusVda = basicPlusVda;
		this.employee = employee;
		this.hra = hra;
		this.insurance = insurance;
		this.lta = lta;
		this.lwf = lwf;
		this.netPay = netPay;
		this.payroll_id = payroll_id;
		this.pf = pf;
		this.pt = pt;
		this.stat_bonus = stat_bonus;
		this.status = status;
	}
	public int getBasicPlusVda() {
		return basicPlusVda;
	}
	public void setBasicPlusVda(int basicPlusVda) {
		this.basicPlusVda = basicPlusVda;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getInsurance() {
		return insurance;
	}
	public void setInsurance(double insurance) {
		this.insurance = insurance;
	}
	public double getLta() {
		return lta;
	}
	public void setLta(double lta) {
		this.lta = lta;
	}
	public double getLwf() {
		return lwf;
	}
	public void setLwf(double lwf) {
		this.lwf = lwf;
	}
	public double getNetPay() {
		return netPay;
	}
	public void setNetPay(double netPay) {
		this.netPay = netPay;
	}
	public int getPayroll_id() {
		return payroll_id;
	}
	public void setPayroll_id(int payroll_id) {
		this.payroll_id = payroll_id;
	}
	public double getPf() {
		return pf;
	}
	public void setPf(double pf) {
		this.pf = pf;
	}
	public double getPt() {
		return pt;
	}
	public void setPt(double pt) {
		this.pt = pt;
	}
	public double getStat_bonus() {
		return stat_bonus;
	}
	public void setStat_bonus(double stat_bonus) {
		this.stat_bonus = stat_bonus;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

	
	
	
	
	
	
	
}