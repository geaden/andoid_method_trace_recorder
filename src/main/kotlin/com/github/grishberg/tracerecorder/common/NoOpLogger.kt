package com.github.grishberg.tracerecorder.common

class NoOpLogger : RecorderLogger {
    override fun d(msg: String) = Unit

    override fun e(msg: String) = Unit

    override fun e(msg: String, t: Throwable) = Unit

    override fun w(msg: String) = Unit
}
