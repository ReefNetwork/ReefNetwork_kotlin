package com.ree.reefnetwork

import cn.nukkit.level.ChunkManager
import cn.nukkit.level.chunk.IChunk
import cn.nukkit.level.generator.Generator
import cn.nukkit.math.BedrockRandom
import cn.nukkit.math.Vector3f

class VoidWorld : Generator {

    private val setting : String = ""

    private val spawnX : Double = 256.5
    private val spawnY : Double = 50.0
    private val spawnZ : Double = 256.5

    override fun getSettings(): String {
        return setting
    }

    override fun getSpawn(): Vector3f {
        return Vector3f(spawnX, spawnY, spawnZ)
    }

    override fun generateChunk(random: BedrockRandom?, chunk: IChunk?) {
    }

    override fun populateChunk(level: ChunkManager?, random: BedrockRandom?, chunkX: Int, chunkZ: Int) {
    }
}