pipeline{
    agent any
    stages{
        stage("ZIP HTML"){
            steps{
                echo "ZIPPING index html as artifact"
                zip dir: '', exclude: '', glob: '**/index.html', zipFile: 'index.zip'
             }
        }
        stage("Get artifacts"){
            steps{
             archiveArtifacts artifacts: '**/index.zip', followSymlinks: false
            }
        }            
    }
}
