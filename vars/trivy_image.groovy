def call() {
  sh "trivy image --format json --output trivy-image-scan-results.json tws-app:latest"
  sh "trivy image --format json --output trivy-image-scan-results.json tws-app-migration:latest
}
