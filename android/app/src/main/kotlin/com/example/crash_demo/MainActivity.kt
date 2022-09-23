package com.example.crash_demo

import android.content.Context
import android.os.Bundle
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine

class MainActivity : FlutterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        if (savedInstanceState != null) {
//            MyApplication.flutterEngine.renderer.onTrimMemory(TRIM_MEMORY_COMPLETE)
//        }
    }

    override fun provideFlutterEngine(context: Context): FlutterEngine? {
        return MyApplication.flutterEngine
    }
}
