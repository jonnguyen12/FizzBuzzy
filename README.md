# Fizzbuzzy - A web app to teach programming logic to kids

### Instructions to run the web app on a local computer
**1. MySQL:**
- Download and install MySQL (just google it)
- username = root
- password = empty (nothing)
- url = localhost:3306/fizzbuzzy_db
- before running the app, run the SQL script named **create_fizzbuzzy_db** first which is in the **SQL files** folder.

**2. Netbeans Project**
- Start mySQL server first.
- Open Netbeans and then choose Open Project. Choose the folder **Fizzbuzzy_NB**

**3. Add additional Libraries**
- After adding the project to your Netbeans IDE, find **Libraries** folder and right-click, choose **Add Libaries.**
- Add 2 libraries: **mySQL DJBC Driver and EclipseLink (JPA 2.1)**

**4. Set up Tomcat Server**
- Netbeans, version J2EE comes with built-in Tomcat so you don't have to download and install Tomcat.
- When you are in Netbeans, find the menu bar, choose **Tools -> Servers**
- If Tomcat appears on the left hand side, then you are fine, skip to the next step.
- If not, you have to download Tomcat in binary (just google tomcat) then unzip it. Place it in a nice place, ur desktop, for example.
- Then go back to Netbeans, Choose Tools-> Servers -> Add Servers
- Choose Tomcat. Click Next
- In server location, browse to your Tomcat folder.
- In Catalina Base, browse to your Netbeans folder. The file should be called apache-tomcat-8.0.15.0_base
- Choose a username and password
- Click Finish. Done!

**4. Run the app**
- Run the mySQL server first.
- Then click RUN in Netbeans.
- The website will then automatically appears in your browser.

### Technologies
Technologies we use during the development:
- Java EE
- Ant
- mySQL
- JDBC
- Javabeans
- JSP
- EL
- HTML/CSS
- Javascript
- Tomcat

### Screenshots
###### Fizzbuzzy Main Page

![Fizzbuzzy Web App](/app_screenshots/Pic_1.png)