def call(string AppName){
   withSonarQubeEnv("Sonar"){
       sh "$SONAR_HOME/bin/sonar-scanner -Dsonar.projectName=${AppName} -Dsonar.projectKey=${AppName}"
}
}

