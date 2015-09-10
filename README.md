# mtom-sample
This repository contains the example client and server for the article TODO

They are both checked in as Maven-based Eclipse projects, but they also contain a Gradle build. To start the client or server, just run the provided launcher. 

If you are not used to Maven or Gradle, you may use the self-installing gradle wrapper. Just the check out the projects and run `gradlew build` (resp. `gradlew.bat build` for windows) in both directories `mtom-client` and `mtom-server`. This installs gradle and builds the executable jars. To run the client, just call `java -jar build/libs/mtom-client.jar` in directory `mtom-client`, resp. to start the server call `java -jar build/libs/mtom-server.jar` in directory `mtom-server`.

