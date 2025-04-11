package cn.shl.sdk.infrastructure.openai;


import cn.shl.sdk.infrastructure.openai.dto.ChatCompletionRequestDTO;
import cn.shl.sdk.infrastructure.openai.dto.ChatCompletionSyncResponseDTO;

public interface IOpenAI {

    ChatCompletionSyncResponseDTO completions(ChatCompletionRequestDTO requestDTO) throws Exception;

}
