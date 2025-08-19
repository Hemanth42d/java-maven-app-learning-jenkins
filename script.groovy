def buildApp() {
    withCredentials([
        usernamePassword(credentialsId: 'docker-hub-credentials', usernameVariable: 'USER', passwordVariable: 'PASS')
    ]) {
        echo "Building the application...."
        sh "mvn clean package"
        sh "docker build -t hemanth42/java-maven-app:jma-2.0 ."
        sh "echo \$PASS | docker login -u \$USER --password-stdin"
        sh "docker push hemanth42/java-maven-app:jma-2.0"
        echo "Docker image pushed successfully!"
    }
}


def testApp() {
    echo "Testing the application...."
}

def deployApp() {
    echo "Deploying the application...."
}

return this
