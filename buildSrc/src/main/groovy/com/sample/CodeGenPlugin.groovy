package com.sample

import org.gradle.api.Plugin
import org.gradle.api.Project

class CodeGenPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.extensions.create("codegen", CodeGenPluginExtension.class)
        project.task("codegen", type: GenerateTask)


        //test 2 - dev - commit

//        test

        //test dev -commit - 2
    }
}
