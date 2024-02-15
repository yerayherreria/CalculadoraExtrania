pipeline {
    agent any
   
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/yerayherreria/CalculadoraExtrania.git'
            }
        }
        
}
        stage('Deploy') {
            steps {
                echo 'Despliegue exitoso'
            }
        }
    }
}
