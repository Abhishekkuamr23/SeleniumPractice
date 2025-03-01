# SeleniumPractice
Selenium all actions/method practice 

# Selenium WebDriver - Web Elements Practice (Java)

This repository contains a collection of Java Selenium WebDriver scripts designed to practice interacting with various web elements (e.g., buttons, links, input fields, checkboxes, radio buttons, etc.) in an automated browser environment.

## Project Setup

### Prerequisites
- Java 8 or higher
- Apache Maven (for dependency management)
- Selenium WebDriver
- ChromeDriver (or any other WebDriver for the browser you intend to use)

### Installation

1. **Clone the repository:**

2. **Navigate to the project folder:**

3. **Build the project dependencies using Maven:**

4. **Download the necessary WebDriver (e.g., ChromeDriver):**
- [ChromeDriver download](https://sites.google.com/a/chromium.org/chromedriver/)
- Make sure the WebDriver version is compatible with the browser version you are using.

- Add the WebDriver path to your environment variables, or specify the path in the script.

### Project Structure

- `src/main/java/com/selenium/webelements/` - Contains Java classes with WebDriver scripts.
- `src/test/resources/` - Contains any resource files or configuration files.
- `pom.xml` - The Maven build file that includes all the necessary dependencies.

## How to Run

1. **Run WebElement Practice Test:**
- Open the terminal or command prompt.
- Navigate to the project directory.
- Run the following Maven command to execute the Selenium tests:
  ```
  mvn test
  ```

2. **Running Specific Test:**
If you'd like to run a specific test (class) manually, you can use the following command:

## Key Web Element Practices Covered

- **Clicking buttons**: Automating button clicks on web pages.
- **Filling text inputs**: Interacting with input fields (e.g., typing into forms).
- **Checkboxes & Radio buttons**: Handling form controls.
- **Handling dropdowns**: Selecting options from dropdown lists.
- **Validating web elements**: Verifying the existence and state of elements.
- **Element waiting**: Handling dynamic web content with implicit and explicit waits.

## Dependencies

The project uses the following key dependencies:

- Selenium WebDriver
- TestNG (for test management)
- Maven for dependency management

Here's a list of dependencies used in the `pom.xml`:

```xml
<dependencies>
 <!-- Selenium WebDriver -->
 <dependency>
     <groupId>org.seleniumhq.selenium</groupId>
     <artifactId>selenium-java</artifactId>
     <version>4.0.0</version>
 </dependency>

 <!-- TestNG for test execution -->
 <dependency>
     <groupId>org.testng</groupId>
     <artifactId>testng</artifactId>
     <version>7.4.0</version>
     <scope>test</scope>
 </dependency>

 <!-- WebDriver Manager (Optional, for managing driver binaries) -->
 <dependency>
     <groupId>io.github.bonigarcia</groupId>
     <artifactId>webdrivermanager</artifactId>
     <version>5.1.0</version>
 </dependency>
</dependencies>


This `README.md` provides essential information about setting up and running your Selenium Java project. It includes instructions on how to clone the repository, install dependencies, run tests, and explains the project structure. You can modify this template to fit your specific project setup or add additional sections as needed!

