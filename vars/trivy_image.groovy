def call() {
  sh "trivy image --format json tws-app:latest > trivy-report1.json"
  sh "trivy image --format json tws-app-migration > trivy-report2.json"
}
