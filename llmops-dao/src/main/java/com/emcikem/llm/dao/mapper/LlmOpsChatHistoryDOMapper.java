package com.emcikem.llm.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.emcikem.llm.dao.entity.LlmOpsChatHistoryDO;
import org.apache.ibatis.annotations.*;

/**
 * Create with Emcikem on 2025/1/15
 *
 * @author Emcikem
 * @version 1.0.0
 */
@Mapper
public interface LlmOpsChatHistoryDOMapper extends BaseMapper<LlmOpsChatHistoryDO> {

    LlmOpsChatHistoryDO selectById(Long id);
}

