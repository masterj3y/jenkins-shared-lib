def call() {
    notif "Running Tests"
    sh 'cargo test'
}