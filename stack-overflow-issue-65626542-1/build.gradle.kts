plugins {
    java
    eclipse
}

repositories {
	jcenter()
}

dependencies {
	implementation("com.fasterxml.jackson.core:jackson-databind:2.12.0")

	testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
	
}
