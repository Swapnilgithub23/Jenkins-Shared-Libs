def call(string emailId){
   success{
     script{
       emailext attachlog: true,
       from: '${emailId}',
       to: '${emailID}',
       body: 'Build SUCCESS For Your cicd Pipeline',
       subject: 'Build SUCCESS FOR Your cicd Pipeline',
       mimeType: 'text/html'
}
}
}
