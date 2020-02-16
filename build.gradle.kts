plugins {
    id("org.jetbrains.kotlin.jvm") version "1.3.61"
    id("net.minecrell.plugin-yml.nukkit") version "0.3.0"
    id("com.github.johnrengelman.shadow") version "5.2.0"
}

group = "com.ree.reefnetwork"
version = "2.0-SNAPSHOT"

repositories {
    jcenter()
    maven {
        url = uri("https://repo.nukkitx.com/main/")
    }
}

dependencies {
    compileOnly("cn.nukkit:nukkit:2.0.0-SNAPSHOT")
    testCompileOnly("cn.nukkit:nukkit:2.0.0-SNAPSHOT")
    implementation ("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }

}

nukkit {
    name = "ReefNetWork"
    main = "com.ree.reefnetwork.ReefNetworkPlugin"
    api = listOf("2.0.0")
    author = "Ree-jp"
    description = "ReefNetWorkPlugin"
    website = "https://github.com/ReefNetwork/ReefNetWorkPvP"
    version = "1.0.0"
}