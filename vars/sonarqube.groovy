def call(){
    withSonarQubeEnv("Sonar"){
       sh "$SONAR_HOME/bin/sonar-scanner -Dsonar.projectName=online-shop-app -Dsonar.projectKey=online-shop-app"
}
}

