def call(Map config = [:]) {
    def scriptcontent = libraryResource "scripts/${config.name}"
    writeFile file: "${config.name}", text: scriptcontent
    sh "chmod +x ./${config.name}"
}