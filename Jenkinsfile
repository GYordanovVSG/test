pipeline{
    agent any
    stages{
        stage("Publish HTML"){
            steps{
                echo "Archiving index html as artifact"
                zip dir: '', exclude: '', glob: '', zipFile: 'index.html'
             }
        }
        stage("Get artifacts"){
            steps{
             archiveArtifacts artifacts: '**/index.zip', followSymlinks: false
            }
        }            
    }
}
