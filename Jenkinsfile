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
                    env.BRANCH_NAME == 'dev' || env.BRANCH_NAME == 'main'
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
