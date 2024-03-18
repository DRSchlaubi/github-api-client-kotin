/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param vcsUsername The username to provide to the originating repository.
 * @param vcsPassword The password to provide to the originating repository.
 * @param vcs The type of version control system you are migrating from.
 * @param tfvcProject For a tfvc import, the name of the project that is being imported.
 */
@Serializable

data class MigrationsUpdateImportRequest (

    /* The username to provide to the originating repository. */
    @SerialName(value = "vcs_username")
    val vcsUsername: kotlin.String? = null,

    /* The password to provide to the originating repository. */
    @SerialName(value = "vcs_password")
    val vcsPassword: kotlin.String? = null,

    /* The type of version control system you are migrating from. */
    @SerialName(value = "vcs")
    val vcs: MigrationsUpdateImportRequest.Vcs? = null,

    /* For a tfvc import, the name of the project that is being imported. */
    @SerialName(value = "tfvc_project")
    val tfvcProject: kotlin.String? = null

) {

    /**
     * The type of version control system you are migrating from.
     *
     * Values: subversion,tfvc,git,mercurial
     */
    @Serializable
    enum class Vcs(val value: kotlin.String) {
        @SerialName(value = "subversion") subversion("subversion"),
        @SerialName(value = "tfvc") tfvc("tfvc"),
        @SerialName(value = "git") git("git"),
        @SerialName(value = "mercurial") mercurial("mercurial");
    }
}

