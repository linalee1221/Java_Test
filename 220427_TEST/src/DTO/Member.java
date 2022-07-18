package DTO;


public class Member extends Person {
	

	String text;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	

	public Member(int id, String name, String description, String text) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.text = text;
	}

	public Member() {
	}

	@Override
	public void printMember() {
		System.out.println("안녕하세요.");
		super.printMember();
	}
}
