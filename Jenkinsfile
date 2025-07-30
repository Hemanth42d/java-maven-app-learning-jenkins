pipeline{
    agent any

    stages{
        stage ("Build"){
            steps{
                echo "Building the application"
            }
        }
        stage ("Test"){
            when{
                expression{
                    BRANCH_NAME == 'dev' || BRANCH_NAME == 'main'
                }
            }
            steps{
                echo "Testing the application"
            }
        }
        stage ("Deploy"){
            steps{
                echo "Deploying the application"
            }
        }
    }
}
