pipeline{
agent any
stages
    {
    stage("code checkout"){
        steps{
        bat "echo hello stage"
        }
    }
    stage("code build"){
        steps{
        bat "echo build stage"
        }
    }
    stage("unit test"){steps{        bat "echo unit stage"}
        }
    

}

    post{
        //always{//execute all times
       //}
        success{
        bat "echo success"
        }
    }
}
