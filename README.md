## example program showing how to use spring profiles

###run dev environment
java -jar target/profile-demo-0.0.1-SNAPSHOT.jar or
java -jar -Dspring.profiles.active=dev target/profile-demo-0.0.1-SNAPSHOT.jar

###run test environment
java -jar -Dspring.profiles.active=test target/profile-demo-0.0.1-SNAPSHOT.jar

###run prod environment
java -jar -Dspring.profiles.active=prod target/profile-demo-0.0.1-SNAPSHOT.jar

###run non-existing environment
java -jar -Dspring.profiles.active=abc target/profile-demo-0.0.1-SNAPSHOT.jar