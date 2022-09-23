package com.example.crash_demo

import android.app.Application
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.embedding.engine.FlutterEngineGroup

/**
 * author: lee
 * createTime: 2022/9/23 11:53
 * description:
 **/
class MyApplication : Application() {
    companion object {
        lateinit var flutterEngine: FlutterEngine
    }

    private lateinit var flutterEngineGroup: FlutterEngineGroup
    override fun onCreate() {
        super.onCreate()
        flutterEngineGroup = FlutterEngineGroup(this)
        flutterEngine = flutterEngineGroup.createAndRunDefaultEngine(this)
    }
}