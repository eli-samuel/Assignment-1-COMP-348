import java.math.BigDecimal;

public class Employee implements Person {
    private BigDecimal salary;
    private String id;
    private String fName;
    private String lName;


    public Employee(String id, String fName, String lName, BigDecimal salary) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
    }

    @Override
	public String id() {
        return id;
	}

	@Override
	public String name() {
        return fName + " " + lName;
    }
    
    public static Employee parse(String s) {
        String[] info = s.split(",");
        return new Employee(info[0], info[1], info[2], new BigDecimal(info[3]));
    }

    @Override
    public String toString() {
        return id + ": " + fName + " " + lName + ", $" + salary.toString();
    }

}
