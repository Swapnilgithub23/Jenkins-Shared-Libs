def call(string dc_name){
   dependencyCheck additionalArguments: '--scan ./', odcInstallation: '${dc_name}'
   dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
