def call(){
    withSonarQubeEnv("Sonar"){
       sh "$SONAR_HOME/bin/sonar-scanner -Dsonar.projectName=easyshop-app -Dsonar.projectKey=easyshop-app"
}
}

