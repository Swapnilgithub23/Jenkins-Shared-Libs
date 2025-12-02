def call(){
    sh "trivy image --format json --output trivy-image-scan-results.json online-shop-app:latest"
}
