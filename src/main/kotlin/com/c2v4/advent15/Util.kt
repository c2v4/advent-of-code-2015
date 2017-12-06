package com.c2v4.advent15


fun String.asResource() = Thread.currentThread().contextClassLoader.getResource(this).readText()
