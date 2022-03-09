pipeline{
    agent any
    stages{
        stage("Publish HTML"){
            steps{
                echo "Archiving index html as artifact"
                zip zipFile: 'index.zip', dir:'**/index.html'
             }
        }
        stage("Get artifacts"){
             archiveArtifacts artifacts: '**/index.zip', followSymlinks: false
        }            
    }
}
