
public class C {
	private String name;
	private B birthDate;
	private int a;
	public C(String name , B birthDate){
		this.name = name;
		this.birthDate = birthDate;
	}
	
	public String toString(){
		return "Employee = name = " + name+ " birthDate = " + birthDate;
	}
}
