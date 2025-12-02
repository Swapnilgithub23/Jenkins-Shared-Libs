def call(){
   timeout(time: 2, unit: "MINUTES"){
      waitForQualityGates abortPipeline: false
}
}
