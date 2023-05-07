def call(String project, String hubUser) {
    sh "docker rmi ${hubUser}/${project}:${ImageTag}"
    sh "docker rmi ${hubUser}/${project}:latest"
}
