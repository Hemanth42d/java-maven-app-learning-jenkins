CODE_CHANGES = getGitChanges()

pipeline{
    agent any

    stages{
        stage ("Build"){
            when{
                expression{
                    CODE_CHANGES == true
                }
            }
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
