import github.masterj3y.Docker

def call(String imageName) {
    return new Docker(this).pushImage(imageName)
}