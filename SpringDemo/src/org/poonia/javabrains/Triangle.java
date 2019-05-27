package org.poonia.javabrains;

public class Triangle {
	
	private String type;
//	private int height;
	
	public String getType() {
		return type;
	}
	
//	public int getHeight() {
//		return height;
//	}

	public Triangle(String type) {
		this.type = type;
	}
//	
//	public Triangle(String type, int height) {
//		this.type = type;
//		this.height = height;
//	}
	
//	public Triangle(int height) {
//		this.height = height;
//	}
	
//	 public void setType(String type) { this.type = type; }
	 

	public void draw() {
	//	System.out.println(getType()+ " Triangle Drawn of height " + getHeight() );
		System.out.println(getType()+ " Triangle Drawn ");

	}

}
