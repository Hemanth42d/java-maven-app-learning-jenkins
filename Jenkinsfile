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

        stage ("Build Image"){
            steps{
                script{
                    gv.buildApp()
                }
            }
        }
        stage ("Test"){
            when{
                expression{
                    env.BRANCH_NAME == 'dev' || env.BRANCH_NAME == 'main'
                }
            }
            steps{
                script{
                    gv.testApp()
                }
            }
        }
        stage ("Push Image"){
            steps{
                script{
                    gv.deployApp()
                }
            }
        }
    }
}
