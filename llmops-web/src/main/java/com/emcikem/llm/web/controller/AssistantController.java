package com.emcikem.llm.web.controller;

import com.emcikem.llm.common.util.GsonUtil;
import com.emcikem.llm.dao.entity.LlmOpsChatHistoryDO;
import com.emcikem.llm.dao.mapper.LlmOpsChatHistoryDOMapper;
import com.emcikem.llm.service.aiservice.Assistant;
import com.emcikem.llm.service.aiservice.StreamingAssistant;
import dev.langchain4j.service.spring.AiService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import static org.springframework.http.MediaType.TEXT_EVENT_STREAM_VALUE;

/**
 * This is an example of using an {@link AiService}, a high-level LangChain4j API.
 */
@RestController
class AssistantController {

    @Resource
    private LlmOpsChatHistoryDOMapper llmOpsChatHistoryDOMapper;

    private Assistant assistant;
    private StreamingAssistant streamingAssistant;

    AssistantController(Assistant assistant, StreamingAssistant streamingAssistant) {
        this.assistant = assistant;
        this.streamingAssistant = streamingAssistant;
    }

    @GetMapping("/assistant")
    public String assistant(@RequestParam(value = "message", defaultValue = "What time is it now?") String message) {
        return assistant.chat(message);
    }

    @GetMapping(value = "/streamingAssistant", produces = TEXT_EVENT_STREAM_VALUE)
    public Flux<String> streamingAssistant(
            @RequestParam(value = "message", defaultValue = "Tell me an interesting story in 100 words") String message) {
        return streamingAssistant.chat(message);
    }

    @GetMapping(value = "/hello")
    public String hello() {
        LlmOpsChatHistoryDO llmOpsChatHistoryDO = llmOpsChatHistoryDOMapper.selectById(1L);
        return GsonUtil.toJSONString(llmOpsChatHistoryDO);
    }
}
