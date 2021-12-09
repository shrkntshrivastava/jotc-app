## Introduction
There is a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads and others are cumulus. The player can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus  or . The player must avoid the thunderheads. Determine the minimum number of jumps it will take to jump from the starting postion to the last cloud. It is always possible to win the game.

Given the jumping on the clouds console application that take user input from console and return the minimum number of jumps for given request.
Request : console will ask user to provide the input in expected form.
Request Constraints:
	- request must have only numeric value 0 and 1.
	- request size must be between 2-100.
	- request must start and end with 0.
	- request can not have two consecutive 1.

Response : Console will return the minimum number of jumps required for given request.
 
## Getting Started

###Installation Process
Ready with latest version of GIT, maven, Java 8+.

### Latest release  
0.0.1

### run application on local environment

	- Clone jotc-app repository using below url on your command line or Git Bash.
		clone url : https://github.com/shrkntshrivastava/jotc-app.git
	- go inside jotc-app project
		cd jotc-app
	- install maven project
		mvn clean install
	- go to local maven repository
		 \.m2\repository\com\assessment1\jotc\jotc-app\1.0-SNAPSHOT
	- run built jar file
		java -jar jotc-app-1.0-SNAPSHOT.jar
	- Follow the instruction on console and and provide a request (considering the constraint mentioned in Introduction)
		

## Contribute
  * Feel free to provide any feedback to improve the application.
