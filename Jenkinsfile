pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                // Indica que se debe obtener la rama "main" del repositorio
                git branch: 'main', url: ''
                // Opcional: Si el repositorio es privado y requiere autenticación
                // git credentialsId: 'id-de-las-credenciales', branch: 'main', url: 'https://ruta-del-repositorio.git'
            }
        }
        // Otros pasos del pipeline
    }
    // Opciones adicionales como notificaciones, post-actions, etc.
}
