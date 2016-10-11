1. To run the Workshop code, copy the wlworkshop directories into a Workshop project.

2. To run the Beehive code, follow the steps below. (This assumes that you have already followed Appendix A in the book).


Make a Project Folder
First make sure you have read Appendix A. Then, on your C: drive, create a directory named “beehive-projects”. In the “beehive-projects” directory, create a directory named “helloworld”. Before proceeding, confirm that the following directory structure exists
C: \
  beehive-projects
    	helloworld
To Copy Runtime Jars to the Project Folder
Copy the folder BEEHIVE_HOME/samples/netui-blank/resources into your project folder C:\beehive_projects\helloworld.
Copy the folder BEEHIVE_HOME/samples/netui-blank/WEB-INF into your project folder C:\beehive-projects\helloworld.

In this step you will assemble the runtime resources for your Page Flow application. The runtime Jars include the Page Flow runtime, the <netui> tag library, etc. These resources are loaded into your project's WEB-INF/lib folder using the Ant command below.
At the command prompt, enter the following Ant command:
ant -f %BEEHIVE_HOME%\ant\buildWebapp.xml -Dwebapp.dir=C:\beehive-projects\helloworld deploy.beehive.webapp.runtime

This command will copy all jar files to the WEB-INF/lib directory.

In this step you will create the Controller file, the central file on any Page Flow.
In the directory C:/beehive-projects/helloworld, create a file named HelloWorldController.jpf.
In a text editor (or your IDE of choice), open the file HelloWorldController.jpf.

In the directory C:/beehive-projects/helloworld, create a file named helloworld.jsp.

To Compile and Deploy the Page Flow
You are now ready to compile the Page Flow and deploy it to Tomcat. Start the tomcat server.
Using the command shell opened in the previous step, at the command prompt, enter:

ant –f  %BEEHIVE_HOME%\ant\buildWebapp.xml   -Dwebapp.dir=C:\beehive-projects\helloworld  -Dcontext.path=helloworld  build.webapp  deploy

To undeploy the application use the following Ant command

ant  -f %BEEHIVE_HOME%\ant\buildWebapp.xml –Dwebapp.dir=C:\beehive-projects\helloworld -Dcontext.path=helloworld  undeploy
