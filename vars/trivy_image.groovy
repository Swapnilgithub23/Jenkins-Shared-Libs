def call(string ImageName){
   sh "trivy image --format json --output trivy-image-scan-results.json ${ImageName}:latest"
}
