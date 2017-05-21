package pack1.model;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class StudentModel {

	@NotEmpty
    private String studentFirstName;
	
	@NotEmpty
	private String studentLastName;
	
	@NotEmpty
	private String studentAge;
	
	@Past
	@NotNull
	private Date studentDOB;
	
	@NotEmpty
	private String studentCountry;
	
	@NotNull
	private Gender studentGender;
	
	@NotEmpty
	@Email
	private String studentEmail;
	
	public enum Gender
	{
		MALE,FEMALE
	}

	
	
	
	public StudentModel() {
		
	}


	public StudentModel(String studentFirstName, String studentLastName,
			String studentAge, Date studentDOB, String studentCountry,
			Gender studentGender, String studentEmail) {
		
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentAge = studentAge;
		this.studentDOB = studentDOB;
		this.studentCountry = studentCountry;
		this.studentGender = studentGender;
		this.studentEmail = studentEmail;
	}


	public String getStudentFirstName() {
		return studentFirstName;
	}


	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}


	public String getStudentLastName() {
		return studentLastName;
	}


	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}


	public String getStudentAge() {
		return studentAge;
	}


	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}


	public Date getStudentDOB() {
		return studentDOB;
	}


	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}


	public String getStudentCountry() {
		return studentCountry;
	}


	public void setStudentCountry(String studentCountry) {
		this.studentCountry = studentCountry;
	}


	public Gender getStudentGender() {
		return studentGender;
	}


	public void setStudentGender(Gender studentGender) {
		this.studentGender = studentGender;
	}


	public String getStudentEmail() {
		return studentEmail;
	}


	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}


	@Override
	public String toString() {
		return "StudentModel [studentFirstName=" + studentFirstName
				+ ", studentLastName=" + studentLastName + ", studentAge="
				+ studentAge + ", studentDOB=" + studentDOB
				+ ", studentCountry=" + studentCountry + ", studentGender="
				+ studentGender + ", studentEmail=" + studentEmail + "]";
	}

	
	
	
	
	
	

	



	
	
}
