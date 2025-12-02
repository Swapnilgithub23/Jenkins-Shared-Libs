def call(){
    timeout(time: 5, unit: "MINUTES"){
       waitForQualityGates abortPipeline: false
}
}
