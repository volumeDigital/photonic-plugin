package com.github.volumedigital.photonicplugin.services

import com.github.volumedigital.photonicplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
