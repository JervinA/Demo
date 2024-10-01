set projectLocation=C:\Users\c.JERVIN\eclipse-workspace\SeleniumAutomation

cd %projectLocation%

set classpath=%projectLocation%\target\classes;%projectLocation%\lib\*

java org.testng.TestNG %projectLocation%\src\main\java\Sampleletshop\samplelet.xml

java org.testng.TestNG %projectLocation%\project.xml

pause