def call() {
  sh "trivy image --format json tws-app:latest tws-app-migration:latest > trivy-report.json"
}
