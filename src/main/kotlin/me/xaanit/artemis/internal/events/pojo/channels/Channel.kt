package me.xaanit.artemis.internal.events.pojo.channels

data class Channel(
        val type: Int,
        val topic: String,
        val position: Int,
        val parent_id: String?,
        val nsfw: Boolean,
        val name: String,
        val last_pin_timestamp: String,
        val last_message_id: String,
        val id: String,
        val permission_overwrites: Array<PermissionOverwrite>
)