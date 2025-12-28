def call() {
  sh "trivy image --format json swapnildocker23/easyshop-app > trivy-report1.json"
  sh "trivy image --format json swapnildocker23/easyshop-migration > trivy-report2.json"
}
