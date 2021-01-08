plugins {
    java
    eclipse
}

repositories {
	jcenter()
}

dependencies {
	implementation("org.codehaus.jackson:jackson-mapper-asl:1.9.13")

	testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
	
}
