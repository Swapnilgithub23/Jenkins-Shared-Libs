def call() {
  sh "trivy image --format json swapnildocker23/easyshop-app:${BUILD_NUMBER} > trivy-report1.json"
  sh "trivy image --format json swapnildocker23/easyshop-migration:${BUILD_NUMBER} > trivy-report2.json"
}
