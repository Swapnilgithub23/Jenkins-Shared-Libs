def call() {
  sh "trivy image --format json tws-app:latest > trivy-report1.json"
  sh "trivy image --format json tws-app-migration:latest > trivy-report2.json"
}
