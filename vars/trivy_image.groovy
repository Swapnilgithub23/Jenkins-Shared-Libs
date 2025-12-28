def call(String imagename){
    sh "trivy image --format json --output trivy-image-scan-results.json ${imagename}:latest"
}
