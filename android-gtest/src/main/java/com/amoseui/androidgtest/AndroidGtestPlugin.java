package com.amoseui.androidgtest;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class AndroidGtestPlugin implements Plugin<Project> {

    private static final String TASK_NAME = "gtest";

    @Override
    public void apply(Project project) {
        project.getTasks().create(TASK_NAME, AndroidGtestTask.class);
    }
}
