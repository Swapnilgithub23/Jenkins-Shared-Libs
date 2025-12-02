def call(String dcname){
    dependencyCheck additionalArguments: '--scan ./', odcInstallation: '${dcname}'
    dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
