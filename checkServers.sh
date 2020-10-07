#!/bin/sh
# This is a script file to check if the Rest Proxy, Wiremock, Schema Registry have started running before executing the end to end test cases
# This script file is called in run-demo.sh after the execution of docker-compose up command
#Check if the Rest Proxy, Schema Registry, Wiremock are running
echo "Checking if the SUT is running....."

#Setting initial status for Rest proxy, Schema Registry, Wiremock calls
sutCallStatus="checking"

#Setting time interval to check within how many seconds testing needs to be done
timeInterval=30

#Setting expiration time
expirationTime=$(( `date +%s` + timeInterval ))

#Entering into a loop until the calls to Rest proxy, Schema registry, Wiremock are successful
while [ "$sutCallStatus" != "success" ];
do
  #looping is done until current time is less than the expiration time
  if [[ `date +%s` -gt expirationTime ]];
  then
    echo "Testing SUT call failed......."
    break
  else
    #Testing System under test (SUT) calls
    if [[ "$sutCallStatus" != "success" ]];
    then
      if curl --silent 'http://localhost:8080/actuator/health' > /dev/null
      then
        echo "System under test (SUT) started running"
        sutCallStatus="success"
      fi
    fi
  fi
done
