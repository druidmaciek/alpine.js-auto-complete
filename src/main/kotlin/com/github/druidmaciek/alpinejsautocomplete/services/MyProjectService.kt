package com.github.druidmaciek.alpinejsautocomplete.services

import com.intellij.openapi.project.Project
import com.github.druidmaciek.alpinejsautocomplete.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
