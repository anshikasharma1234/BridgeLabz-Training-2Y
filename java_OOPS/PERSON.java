package java_OOPS;

public class PERSON {
	    private String name;
	    private int age;

	    public PERSON() {
	        this.name = "Unknown";
	        this.age = 0;
	    }

	    public PERSON(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public PERSON(PERSON other) {
	        this.name = other.name;
	        this.age = other.age;
	    }

	    public void display() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }

	    public static void main(String[] args) {
	        PERSON p1 = new PERSON("Alice", 25);  
	        PERSON p2 = new PERSON(p1);      

	        System.out.println("Original Person:");
	        p1.display();

	        System.out.println("Copied Person:");
	        p2.display();
	    }
	}
