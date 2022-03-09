pipeline{
    agent any
    stages{
        stage("ZIP HTML"){
            steps{
                echo "ZIPPING index html as artifact"
                zip zipFile: 'index.zip', archive: false, dir: ''
             }
        }
        stage("Get artifacts"){
            steps{
             archiveArtifacts artifacts: '**/index.zip', followSymlinks: false
            }
        }            
    }
}
