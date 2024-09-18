package com.kaito071831.spring_ai_amazon_bedrock_demo.controller

import org.springframework.ai.bedrock.titan.BedrockTitanChatModel
import org.springframework.ai.chat.messages.UserMessage
import org.springframework.ai.chat.model.ChatResponse
import org.springframework.ai.chat.prompt.Prompt
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
class TitanController(
    private val chatModel: BedrockTitanChatModel
) {
    @GetMapping("/ai/generate")
    fun generate(
        @RequestParam(value = "message", defaultValue = "Tell me a joke")
        message: String
    ): Map<String, String> {
        return mapOf("generation" to chatModel.call(message))
    }

    @GetMapping("/ai/generateStream")
    fun generateStream(
        @RequestParam(value = "message", defaultValue = "Tell me a joke")
        message: String
    ): Flux<ChatResponse> {
        val prompt = Prompt(UserMessage(message))
        return chatModel.stream(prompt)
    }
}
