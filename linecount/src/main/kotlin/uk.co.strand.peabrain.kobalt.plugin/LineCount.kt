package com.beust.kobalt.plugin.linecount

import com.beust.kobalt.api.BasePlugin
import com.beust.kobalt.api.KobaltContext
import com.beust.kobalt.api.Project

/**
 * Copyright (c) Martin Gittins 2017.
 * User: martingittins
 * Date: 16/11/2017
 * Time: 15:45
 */
class LineCountPlugin : BasePlugin() {

    override val name = "kobalt-line-count"

        override fun apply(project: Project, context: KobaltContext) {
            println("*** Applying plugin $name with project $project")
        }

}