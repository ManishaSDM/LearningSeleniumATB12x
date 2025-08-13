# Selenium Automation Project (Java)

## ​ Project Goal

Learn Selenium WebDriver by practicing:

- Core WebDriver architecture and setup
- Element interactions and locators
- Synchronization via waits
- Browser actions (alerts, dropdowns, frames)
- Page Object Model design
- Test structure with TestNG/JUnit
- Reporting, driver management, and project scalability

---

## ​ Getting Started

### Prerequisites

Ensure you have:

- Java JDK 8+ (11+ recommended)
- Maven or Gradle
- IDE (IntelliJ IDEA or Eclipse)
- Internet access (for WebDriverManager)

### Project Setup (Maven)

Add dependencies to `pom.xml`:

```xml
<dependencies>
  <!-- Selenium -->
  <dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.21.0</version>
  </dependency>
  <!-- TestNG / JUnit -->
  <dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.10.2</version>
    <scope>test</scope>
  </dependency>
  <!-- Automatically manage WebDriver binaries -->
  <dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>5.8.0</version>
  </dependency>
</dependencies>
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
Best Practices Summary

Page Object Model: structure code for maintainability 
testgrid.io
GeeksforGeeks

Explicit waits, not sleeps 
Medium
GeeksforGeeks

Reliable locators (id/name > css > xpath) 
GeeksforGeeks
testgrid.io

Manage drivers with WebDriverManager 
Medium
+1

Assertion-driven tests 
Medium
+1

Modular & reusable code (utilities, base classes) 
Medium
Training In AnnaNagar

Data-driven tests via TestNG or external files 
testgrid.io
Medium

Cross-browser capability using TestNG params or Selenium Grid 
testgrid.io
GeeksforGeeks

Screenshot on failure, logging, CI integration 
GeeksforGeeks
Medium
Recommended Project Structure
selenium-java-project/
├── pom.xml
├── src/
│   ├── main/java/
│   │   ├── base/
│   │   │   └── BaseTest.java
│   │   └── pages/
│   │       ├── BasePage.java
│   │       └── LoginPage.java
│   └── test/java/
│       ├── tests/
│       │   └── LoginTest.java
│       └── utils/
│           └── TestUtil.java
