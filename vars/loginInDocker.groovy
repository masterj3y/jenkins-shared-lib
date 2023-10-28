import github.masterj3y.Docker

def call() {
    return new Docker(this).login()
}