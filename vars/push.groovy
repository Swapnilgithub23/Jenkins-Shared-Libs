def call(String credsid,String imagename){
    withCredentials([usernamePassword(
               credentialsId: "${credsid}", 
               usernameVariable: "dockerhubuser", 
               passwordVariable: "dockerhubpass"
   )]){

               sh "docker login -u ${env.dockerhubuser} -p ${env.dockerhubpass}"
               sh "docker image tag ${imagename} ${env.dockerhubuser}/${imagename}"
               sh "docker push ${env.dockerhubuser}/${imagename}:latest"
}
}
