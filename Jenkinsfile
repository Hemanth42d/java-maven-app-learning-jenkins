def gv

pipeline{
    agent any

    tools{
        maven "my-maven-3.9"
    }

    stages{

        stage ("init"){
            steps{
                script{
                    gv = load "script.groovy"
                }
            }
        }
        stage ("Test"){
            steps{
                script{
                    gv.testApp()
                    echo "Testing the application in $BRANCH_NAME"
                }
            }
        }

        stage ("Build Image"){
            when{
                expression{
                    BRANCH_NAME == "main"
                }
            }
            steps{
                script{
                    gv.buildApp()
                }
            }
        }
        
        stage ("Push Image"){
            when{
                expression{
                    BRANCH_NAME == "main"
                }
            }
            steps{
                script{
                    gv.deployApp()
                }
            }
        }
    }
}
