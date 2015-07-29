COPY ..\target\generator-0.1.0-SNAPSHOT-jar-with-dependencies.jar .

java -cp .;postgresql-9.3-1102-jdbc4.jar;generator-0.1.0-SNAPSHOT-jar-with-dependencies.jar net.matthoyt.database.App ..\testFiles\realConnections.mrhdb.config ..\..\java-test\src\main java

pause