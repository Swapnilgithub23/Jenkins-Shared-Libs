def call() {
  sh "trivy image --format json swapnildocker23/easyshop-app:${BUILD_NUMBER} > trivy-report.json"
  sh "trivy image --format json swapnildocker23/easyshop-migration:${BUILD_NUMBER} > trivy-report.json"
  sh "trivy image --format json swapnildocker23/easyshop-migration:latest > trivy-report.json"
  sh "trivy image --format json swapnildocker23/easyshop-app:latest > trivy-report.json"
}
