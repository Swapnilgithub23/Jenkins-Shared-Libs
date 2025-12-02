def call(string emailId){
   failure{
     script{
       emailext attachlog: true,
       from: '${emailId}',
       to: '${emailID}',
       body: 'Build FAILED For Your cicd Pipeline',
       subject: 'Build FAILED For Your cicd Pipeline',
       mimeType: 'text/html'
}
}
}
