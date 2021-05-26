package com.github.tdzienniak.grumpyintellij.services

import com.github.tdzienniak.grumpyintellij.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
