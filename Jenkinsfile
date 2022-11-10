pipeline{
agent any
    tools{
    maven "Maven"
    }
    
stages
    {
    stage("code checkout"){
        steps{
        bat "echo hello stage"
        }
    }
    stage("code build"){
        steps{
        bat "mvn clean"
        }
    }
    stage("unit test"){
        steps{
           bat "mvn test"}
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
