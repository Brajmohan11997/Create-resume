# Create-resume
Create a resume
This Java project demonstrates the creation of a simple command-line Resume Generator application. It utilizes compile-time polymorphism (method overloading) to allow for flexible input of different sections of a resume, such as personal details, professional summary, and educational background.

## ✨ Features
Personal Details: Capture name, age, and contact information.
Professional Summary: Add your primary professional course/field and key technical skills.
Education Details: Include institute, degree/program, college, and school names.
Method Overloading: Showcases compile-time polymorphism by using a single addDetails method name with different parameter signatures for various resume sections.
Interactive Input: Uses Scanner for user input to build the resume dynamically.
Structured Output: Displays the complete resume in a well-formatted manner.
 ## Code Explanation
The core of this application lies in the Resume class, which has:
Fields: To store various resume details like fName, lName, professionalCourseName, techSkills, instituteName, etc.
Default Constructor: public Resume(): Allows for creating a Resume object without initial parameters, enabling incremental data addition.
Overloaded addDetails Methods:
addDetails(String fName, String lName, int age, String contact): For personal information.
addDetails(String professionalCourseName, String techSkills): For professional summary and skills.
addDetails(String instituteName, String educationDegreeName, String collegeName, String schoolName): For educational background. These methods demonstrate compile-time polymorphism, as the Java compiler determines which addDetails method to call based on the number and types of arguments provided.
displayResume() Method: Gathers all the entered information and prints a formatted resume to the console.
main Method:
### Creates a Resume object.
Interactively prompts the user for various resume details using Scanner.
Calls the appropriate addDetails overloaded methods to populate the Resume object.
Finally, calls displayResume() to show the generated resume.
### 🧠Polymorphism in Action
This project is a great example of compile-time polymorphism (method overloading). Notice how the addDetails method is defined multiple times within the Resume class, each with a unique signature (different number or type of parameters).
