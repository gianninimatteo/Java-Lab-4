plugins {
    java // Carica il necessario per la compilazione di Java
    application // Carica il necessario per l'esecuzione di classi con la JVM
    checkstyle
}
application { // Configurazione dell'esecuzione, la main class è sufficiente
    mainClass.set("it.unibo.qa.Cat") //Serve a dire a Gradle quale classe deve eseguire, in questo caso 'Cat'. In un progetto grande di solito si mette la classe che contiene il Main.
}

repositories {
    mavenCentral()
}

checkstyle {
    configFile = file("../checkstyle-files/checkstyle.xml")
}
