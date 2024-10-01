@echo off

set projectLocation=C:\Users\c.JERVIN\eclipse-workspace\SeleniumAutomation

cd %projectLocation%

set classpath=%projectLocation%\target\classes;%projectLocation%\lib\*;

echo Classpath: %classpath%  // For debugging

java -cp "%classpath%" org.testng.TestNG %projectLocation%\sampleproject.xml

pause
