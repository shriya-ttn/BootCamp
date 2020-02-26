Gradle Exercise

Following parameters are to be considered for exercise submission:

Complete project has to be submitted.
.gradle, .idea, build directories should be excluded
A text file containing the relevant URLs which are referenced and any other documentation.
Questions:

Add a gradle dependency and its related repository url.
Using java plugin, make changes in the manifest to make the jar executable. Using java -jar JAR_NAME, the output should be printed as "Hello World"
Differentiate between the different dependency scopes: compile, runtime, testCompile, testRuntime using different dependencies being defined in your build.gradle.
Create a custom plugin which contains a custom task which prints the current date-time. Using that plugin in your project, execute that task after the jar task executes.
Instead of using default source set, use src/main/javaCode1, src/main/javaCode2 to be taken as code source. Make sure that the JAR created contains files from both the directories and not from src/main/java.
Override the Gradle Wrapper task to install a different version of gradle. Make sure that the task written in Q4 also executes with it.
Run the gradle profile command and attach the resulting files.
