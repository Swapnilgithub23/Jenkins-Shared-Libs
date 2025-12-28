def call() {
  sh "trivy image --format json tws-app:latest > trivy-report.json"
}
