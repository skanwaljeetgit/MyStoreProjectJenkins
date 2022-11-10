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
    


    stage ("Sonar Analysis")
    {
        steps{
            withSonarQubeEnv("SonarQubeServerDevTestOps")
            {
                bat "mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.2:sonar"
                //"mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.7.0.1746:sonar"

            }
        }
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
