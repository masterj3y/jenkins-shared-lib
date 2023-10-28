def call(String imageName) {
    def docker = new Docker(this)
    docker.login()
    docker.buildImage(imageName)
    docker.pushImage(imageName)
}