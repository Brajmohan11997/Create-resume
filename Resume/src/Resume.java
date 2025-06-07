import java.util.Scanner;

public class Resume {
    String fName;
    String lName;
    int age;
    String contact;

    String professionalCourseName; // Specific field for professional summary's course
    String techSkills;

    String instituteName;
    String educationDegreeName; // Specific field for education's degree/program name
    String collegeName;
    String schoolName;

    // Default constructor
    // This constructor allows creating a Resume object without immediately providing all details.
    public Resume() {
        // No initial parameters needed, as details will be added incrementally via overloaded methods.
    }

    // Overloaded method: addDetails for personal details
    // This demonstrates compile-time polymorphism (method overloading) as it shares the name 'addDetails'
    // but has a different parameter signature (String, String, int, String).
    public void addDetails(String fName, String lName, int age, String contact) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.contact = contact;
        System.out.println("\n--- Personal Details Added ---");
    }

    // Overloaded method: addDetails for professional summary details
    // This also demonstrates compile-time polymorphism, with a signature of (String, String).
    // The compiler differentiates this from other 'addDetails' methods by the types and number of arguments.
    public void addDetails(String professionalCourseName, String techSkills) {
        this.professionalCourseName = professionalCourseName;
        this.techSkills = techSkills;
        System.out.println("--- Professional Summary Added ---");
    }

    // Overloaded method: addDetails for education details
    // Another example of compile-time polymorphism, with a signature of (String, String, String, String).
    public void addDetails(String instituteName, String educationDegreeName, String collegeName, String schoolName) {
        this.instituteName = instituteName;
        this.educationDegreeName = educationDegreeName;
        this.collegeName = collegeName;
        this.schoolName = schoolName;
        System.out.println("--- Education Details Added ---");
    }

    // Method to display the complete resume
    public void displayResume() {
        System.out.println("\n--- FINAL RESUME ---");
        System.out.println("---------------------------------------------------");

        // Display Personal Details if available
        if (fName != null && lName != null) {
            System.out.println("\nPERSONAL DETAILS");
            System.out.println("Full Name: " + fName + " " + lName);
            System.out.println("Age: " + age);
            System.out.println("Contact No.: " + contact);
        }

        // Display Professional Summary if available
        if (professionalCourseName != null && techSkills != null) {
            System.out.println("\nPROFESSIONAL SUMMARY ");
            System.out.println("---------------------------------------------------");
            System.out.println("Dynamic " + professionalCourseName + " with strong expertise in " + techSkills + ".");
            System.out.println("Adept at designing robust test strategies, collaborating across teams, and ensuring high software quality in fast-paced environments.");
        }

        // Display Education if available
        if (instituteName != null || professionalCourseName != null || collegeName != null || schoolName != null) {
            System.out.println("\nEDUCATION");
            System.out.println("---------------------------------------------------");
            System.out.println("Institute Name: " + (instituteName != null ? instituteName : "N/A"));
            System.out.println("Program: " + (professionalCourseName != null ? professionalCourseName : "N/A"));
            System.out.println("College Name: " + (collegeName != null ? collegeName : "N/A"));
            System.out.println("Degree: " + (educationDegreeName != null ? educationDegreeName : "N/A"));
            System.out.println("School Name: " + (schoolName != null ? schoolName : "N/A"));
        }

        // Display Skills if available
        if(techSkills!=null){
            System.out.println("\nSKILLS");
            System.out.println("---------------------------------------------------");
            System.out.println("Tech skills");
            System.out.println(techSkills!=null?techSkills: "N/A");
        }

        System.out.println("\n---------------------------------------------------");
    }

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        // Create a single Resume object.
        // Compile-time polymorphism allows us to use different methods based on arguments.
        Resume myResume = new Resume();

        // --- Input Personal Details ---
        System.out.print("Please enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Please enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character

        System.out.print("Please enter your contact details: ");
        String contact = scanner.nextLine();

        // Calling the overloaded addDetails method for personal details.
        // The Java compiler selects this specific 'addDetails' method based on the
        // four arguments (String, String, int, String).
        myResume.addDetails(firstName, lastName, age, contact);

        // --- Input Professional Summary Details ---
        System.out.print("Please enter your primary professional course/field (e.g., 'Software Developer'): ");
        String profCourse = scanner.nextLine();

        System.out.print("Please enter your technical skills (e.g., 'Java, Python, SQL'): ");
        String skills = scanner.nextLine();

        // --- Input Education Details ---
        System.out.print("Please enter your main institute/university name: ");
        String institute = scanner.nextLine();

        System.out.print("Please enter your specific degree or program name (e.g., 'B.Tech in CS'): ");
        String eduDegree = scanner.nextLine();

        System.out.print("Please enter your college name (if different from institute): ");
        String college = scanner.nextLine();

        System.out.print("Please enter your school name: ");
        String school = scanner.nextLine();

        // Calling the overloaded addDetails method for education.
        // The compiler selects this 'addDetails' method based on the four String arguments.
        myResume.addDetails(institute, eduDegree, college, school);
        myResume.addDetails(profCourse, skills);
        myResume.displayResume();

        scanner.close();
    }
}
