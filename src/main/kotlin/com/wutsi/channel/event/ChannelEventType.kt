package com.wutsi.channel.event

enum class ChannelEventType(val urn: String) {
  SECRET_SUBMITTED("urn:event:wutsi:channel:secret-submitted"),
  SECRET_REVOKED("urn:event:wutsi:channel:secret-revoked")
}
