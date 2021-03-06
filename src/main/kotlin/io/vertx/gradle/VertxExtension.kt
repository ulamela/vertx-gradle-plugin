/*
 * Copyright 2017 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.vertx.gradle

import org.apache.tools.ant.taskdefs.condition.Os
import org.gradle.api.Project
import java.io.File

/**
 * Vertx Gradle extension.
 *
 * @author [Julien Ponge](https://julien.ponge.org/)
 */
open class VertxExtension(private val project: Project) {

  var vertxVersion = "3.4.2"

  var launcher = "io.vertx.core.Launcher"
  var mainVerticle = ""

  var args = listOf<String>()
  var config = ""
  var workDirectory = project.projectDir.absolutePath
  var jvmArgs = listOf<String>()

  var redeploy = true
  var watch = listOf("${project.projectDir.absolutePath}/src/**/*")
  var onRedeploy = listOf("classes")
  var redeployScanPeriod = 1000L
  var redeployGracePeriod = 1000L
  var redeployTerminationPeriod = 1000L

  override fun toString(): String {
    return "VertxExtension(project=$project, vertxVersion='$vertxVersion', launcher='$launcher', mainVerticle='$mainVerticle', args=$args, config='$config', workDirectory='$workDirectory', jvmArgs=$jvmArgs, redeploy=$redeploy, watch=$watch, onRedeploy='$onRedeploy', redeployScanPeriod=$redeployScanPeriod, redeployGracePeriod=$redeployGracePeriod, redeployTerminationPeriod=$redeployTerminationPeriod)"
  }
}
