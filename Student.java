public class Student {
	
	private String firstName;
	private String lastName;
	private int id;
	private double gpa;
	
	public Student(String firstName, String lastName, int id, double gpa){
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.gpa = gpa;
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the gpa
	 */
	public double getGpa() {
		return gpa;
	}
	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public void display() {
		System.out.println("\n\n" + firstName + "\n" + lastName + "\n" + id + "\n" + gpa);
		
	}

	public void display(int i) {
		System.out.println("\n\n" + firstName + "\n" + lastName + "\n" + id + "\n" + gpa);
		
	}

	
		
	}

