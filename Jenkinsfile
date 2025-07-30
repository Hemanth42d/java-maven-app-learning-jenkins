def gv

pipeline{
    agent any

    stages{

        stage ("init"){
            steps{
                script{
                    gv = load "script.groovy"
                }
            }
        }

        stage ("Build"){
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
        stage ("Deploy"){
            steps{
                script{
                    gv.deployApp()
                }
            }
        }
    }
}
