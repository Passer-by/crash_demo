# crash_demo

问题 ： drawRenderNode called on a context with no surface!
场景 ： FlutterActivity的所使用的FlutterEngine 引擎由开发者提供 并且flutter界面中由PlatformView
复现步骤 ：
1.开启开发者模式 并开启不保留activity的选项
2.打开app，点击按钮跳转至FlutterActivity界面   
3.回到后台 打开其他App 多打开几个
4.回到该App 崩溃
demo 地址 ： https://github.com/a1017480401/crash_demo.git
