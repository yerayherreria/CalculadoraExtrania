
pipeline {
    agent any
    
    tools {
        maven 'Maven'
    }
    
    stages {
        stage('Clonar Repositorio') {
        steps {
            git branch: 'main', url: 'https://github.com/JesusLopezGomez/calculadoraSpring.git'
        }
        }
        stage('Construir Aplicación') {
        steps {
            sh 'mvn clean package -DskipTests=true'
        }
        }
    }
}
