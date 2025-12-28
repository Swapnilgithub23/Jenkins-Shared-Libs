def call() {
  sh "trivy image --format json --output trivy-image-scan-results.json tws-app/easyshop-app:latest"
  sh "trivy image --format json --output trivy-image-scan-results.json tws-app/easyshop-migration:latest
}
