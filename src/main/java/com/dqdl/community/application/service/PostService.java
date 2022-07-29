package com.dqdl.community.application.service;

import com.dqdl.community.infrastructure.exception.BusinessException;
import com.dqdl.community.ui.dto.base.RequestDto;
import com.dqdl.community.ui.dto.post.*;

/**
 * @author daoqidelv
 * @createdate 2017年10月15日
 */
public interface PostService {
    /**
     * 删除指定帖子
     *
     * @param requestDto
     * @return DeletePostRespBody
     * @throws BusinessException
     */
    DeletePostRespBody delete(RequestDto<DeletePostReqBody> requestDto) throws BusinessException;

    /**
     * 发帖
     *
     * @param requestDto
     * @return PostingRespBody
     * @throws BusinessException
     */
    PostingRespBody posting(RequestDto<PostingReqBody> requestDto) throws BusinessException;

    /**
     * 查询帖子详情
     *
     * @param requestDto
     * @return QueryPostDetailRespBody
     * @throws BusinessException
     */
    QueryPostDetailRespBody queryPostDetail(RequestDto<QueryPostDetailReqBody> requestDto) throws BusinessException;

}
