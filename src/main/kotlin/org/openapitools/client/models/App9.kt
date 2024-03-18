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

import org.openapitools.client.models.App8Permissions
import org.openapitools.client.models.User

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps are first class actors within GitHub.
 *
 * @param createdAt 
 * @param description 
 * @param externalUrl 
 * @param htmlUrl 
 * @param id Unique identifier of the GitHub app
 * @param name The name of the GitHub app
 * @param nodeId 
 * @param owner 
 * @param updatedAt 
 * @param events The list of events for the GitHub app
 * @param permissions 
 * @param slug The slug name of the GitHub app
 */
@Serializable

data class App9 (

    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlinx.datetime.Instant?,

    @SerialName(value = "description")
    val description: kotlin.String?,

    @Contextual @SerialName(value = "external_url")
    val externalUrl: java.net.URI?,

    @Contextual @SerialName(value = "html_url")
    val htmlUrl: java.net.URI,

    /* Unique identifier of the GitHub app */
    @SerialName(value = "id")
    val id: kotlin.Int?,

    /* The name of the GitHub app */
    @SerialName(value = "name")
    val name: kotlin.String,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String,

    @SerialName(value = "owner")
    val owner: User,

    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlinx.datetime.Instant?,

    /* The list of events for the GitHub app */
    @SerialName(value = "events")
    val events: kotlin.collections.List<App9.Events>? = null,

    @SerialName(value = "permissions")
    val permissions: App8Permissions? = null,

    /* The slug name of the GitHub app */
    @SerialName(value = "slug")
    val slug: kotlin.String? = null

) {

    /**
     * The list of events for the GitHub app
     *
     * Values: branch_protection_rule,check_run,check_suite,code_scanning_alert,commit_comment,content_reference,create,delete,deployment,deployment_review,deployment_status,deploy_key,discussion,discussion_comment,fork,gollum,issues,issue_comment,label,member,membership,milestone,organization,org_block,page_build,project,project_card,project_column,`public`,pull_request,pull_request_review,pull_request_review_comment,push,registry_package,release,repository,repository_dispatch,secret_scanning_alert,star,status,team,team_add,watch,workflow_dispatch,workflow_run,security_and_analysis,reminder,pull_request_review_thread
     */
    @Serializable
    enum class Events(val value: kotlin.String) {
        @SerialName(value = "branch_protection_rule") branch_protection_rule("branch_protection_rule"),
        @SerialName(value = "check_run") check_run("check_run"),
        @SerialName(value = "check_suite") check_suite("check_suite"),
        @SerialName(value = "code_scanning_alert") code_scanning_alert("code_scanning_alert"),
        @SerialName(value = "commit_comment") commit_comment("commit_comment"),
        @SerialName(value = "content_reference") content_reference("content_reference"),
        @SerialName(value = "create") create("create"),
        @SerialName(value = "delete") delete("delete"),
        @SerialName(value = "deployment") deployment("deployment"),
        @SerialName(value = "deployment_review") deployment_review("deployment_review"),
        @SerialName(value = "deployment_status") deployment_status("deployment_status"),
        @SerialName(value = "deploy_key") deploy_key("deploy_key"),
        @SerialName(value = "discussion") discussion("discussion"),
        @SerialName(value = "discussion_comment") discussion_comment("discussion_comment"),
        @SerialName(value = "fork") fork("fork"),
        @SerialName(value = "gollum") gollum("gollum"),
        @SerialName(value = "issues") issues("issues"),
        @SerialName(value = "issue_comment") issue_comment("issue_comment"),
        @SerialName(value = "label") label("label"),
        @SerialName(value = "member") member("member"),
        @SerialName(value = "membership") membership("membership"),
        @SerialName(value = "milestone") milestone("milestone"),
        @SerialName(value = "organization") organization("organization"),
        @SerialName(value = "org_block") org_block("org_block"),
        @SerialName(value = "page_build") page_build("page_build"),
        @SerialName(value = "project") project("project"),
        @SerialName(value = "project_card") project_card("project_card"),
        @SerialName(value = "project_column") project_column("project_column"),
        @SerialName(value = "public") `public`("public"),
        @SerialName(value = "pull_request") pull_request("pull_request"),
        @SerialName(value = "pull_request_review") pull_request_review("pull_request_review"),
        @SerialName(value = "pull_request_review_comment") pull_request_review_comment("pull_request_review_comment"),
        @SerialName(value = "push") push("push"),
        @SerialName(value = "registry_package") registry_package("registry_package"),
        @SerialName(value = "release") release("release"),
        @SerialName(value = "repository") repository("repository"),
        @SerialName(value = "repository_dispatch") repository_dispatch("repository_dispatch"),
        @SerialName(value = "secret_scanning_alert") secret_scanning_alert("secret_scanning_alert"),
        @SerialName(value = "star") star("star"),
        @SerialName(value = "status") status("status"),
        @SerialName(value = "team") team("team"),
        @SerialName(value = "team_add") team_add("team_add"),
        @SerialName(value = "watch") watch("watch"),
        @SerialName(value = "workflow_dispatch") workflow_dispatch("workflow_dispatch"),
        @SerialName(value = "workflow_run") workflow_run("workflow_run"),
        @SerialName(value = "security_and_analysis") security_and_analysis("security_and_analysis"),
        @SerialName(value = "reminder") reminder("reminder"),
        @SerialName(value = "pull_request_review_thread") pull_request_review_thread("pull_request_review_thread");
    }
}

