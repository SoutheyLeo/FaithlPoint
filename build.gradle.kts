plugins {
    java
    id("io.izzel.taboolib") version "1.34"
    kotlin("jvm") version "1.6.10"
}

taboolib {
    install("common")
    install("common-5")
    install("platform-bukkit")
    install("module-lang")
    install("module-nms")
    install("module-ui-receptacle")
    install("module-chat")
    install("module-configuration")
    install("module-metrics")
    install("module-database")
    install("expansion-player-database")
    classifier = null
    version = "6.0.7-14"
    description {
        contributors {
            name("Leosouthey")
        }
        links {
            name("homepage").url("https://faithl.com")
        }
        dependencies {
            name("AttributePlus").optional(true)
            name("OriginAttribute").optional(true)
            name("SX-Attribute").optional(true)
            name("Zaphkiel").optional(true)
            name("PlaceholderAPI").optional(true)
        }
    }
}

repositories {
    maven {
        url = uri("http://mcsy.net:8081/repository/releases/")
        isAllowInsecureProtocol = true
    }
    maven { url = uri("https://maven.aliyun.com/nexus/content/groups/public/") }
    mavenCentral()
}

dependencies {
    compileOnly("ink.ptms.core:v11800:11800:api")
    compileOnly("ink.ptms.core:v11800:11800:mapped")
    compileOnly("ink.ptms.core:v11800:11800:universal")
    compileOnly("com.alibaba:fastjson:1.2.79")
    compileOnly("org.jetbrains.kotlin:kotlin-stdlib:1.6.10")
    taboo("com.faithl:milim:1.0.1")
    compileOnly(fileTree("libs"))
}

tasks {
    withType<JavaCompile> {
        options.encoding = "UTF-8"
    }
    withType<Javadoc> {
        options.encoding = "UTF-8"
    }
}

configure<JavaPluginExtension> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}