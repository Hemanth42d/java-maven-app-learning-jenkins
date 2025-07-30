def gv

pipeline{
    agent any

    stages{

        stage ("init"){
            steps{
                gv = load "script.groovy"
            }
        }

        stage ("Build"){
            steps{
                gv.buildApp()
            }
        }
        stage ("Test"){
            when{
                expression{
                    env.BRANCH_NAME == 'dev' || env.BRANCH_NAME == 'main'
                }
            }
            steps{
                gv.testApp()
            }
        }
        stage ("Deploy"){
            steps{
                gv.deployApp()
            }
        }
    }
}
