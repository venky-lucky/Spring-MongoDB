package ai.jobiak.bootforms.model;

import org.springframework.data.annotation.Id;

public class Student {
	@Id
	private String stdid;
	private String name;
	private String stream;
	private int year;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String stdid, String name, String stream, int year) {
		super();
		this.stdid = stdid;
		this.name = name;
		this.stream = stream;
		this.year = year;
	}
	public String getStdid() {
		return stdid;
	}
	public void setStdid(String stdid) {
		this.stdid = stdid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", name=" + name + ", stream=" + stream + ", year=" + year + "]";
	}	
}
