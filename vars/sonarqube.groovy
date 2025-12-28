def call(){
    withSonarQubeEnv("Sonar"){
       sh "$SONAR_HOME/bin/sonar-scanner -Dsonar.projectName=notes-app -Dsonar.projectKey=notes-app"
}
}

