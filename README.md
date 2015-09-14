# mtom-sample
This repository contains the example client and server for the article [Use MTOM to Efficiently Transmit Binary Content in SOAP](http://dzone.com/articles/use-mtom-to-efficiently-transmit-binary-content-in).

There are three branches:

Branch   | Description
---------| ------------------------------------------------------------------
`base64` | Contains the initial SOAP setup using the default base64 encoding 
`mtom`   | This setup uses MTOM as transport encoding 
`master` | The final example demonstrating MTOM with streaming 

There are two projects `mtom-client` and `mtom-server`, which are checked in as Maven-based Eclipse projects. To start the client or server, just run the provided launcher. They also contain a Gradle build if you prefer that.

If you are not used to Maven or Gradle, you may use the self-installing gradle wrapper. Just the check out the projects and run `gradlew build` (resp. `gradlew.bat build` on Windows) in both directories `mtom-client` and `mtom-server`. This installs gradle and builds the executable jars. To run the client, just call `java -jar build/libs/mtom-client.jar` in directory `mtom-client`, resp. to start the server call `java -jar build/libs/mtom-server.jar` in directory `mtom-server`.

