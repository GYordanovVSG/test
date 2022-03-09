pipeline{
    agent any
    stages{
        stage("Publish HTML"){
            steps{
                echo "Archiving index html as artifact"
                archiveArtifacts artifacts: '**/index.html', followSymlinks: false
            }
        }
    }
}
