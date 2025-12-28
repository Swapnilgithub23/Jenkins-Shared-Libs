def call(Map config = [:]){
    def imageName = config.imageName ?: error("Image name is required")
    def imageTag = config.imageTag ?: 'latest'
    def dockerfile = config.dockerfile ?: 'dockerfile'
    def context = config.context ?: '.'
    
    echo "Building Docker Image: ${imageName}:${imageTag} using ${dockerfile}"
    sh """
        docker build -t ${imageName}:${imageTag} -t ${imageName}:latest f ${dockerfile} ${context}
        """
}
