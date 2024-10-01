set projectLocation=C:\Users\c.JERVIN\eclipse-workspace\SeleniumAutomation

cd %projectLocation%

set classpath=%projectLocation%\target\classes\sampleletshop;%projectLocation%\lib\*

java org.testng.TestNG %projectLocation%\project.xml

pause