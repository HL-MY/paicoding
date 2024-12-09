package com.github.paicoding.forum.service.pay;

import com.github.paicoding.forum.api.model.enums.pay.ThirdPayWayEnum;
import com.github.paicoding.forum.api.model.vo.pay.dto.PayInfoDTO;
import com.github.paicoding.forum.service.article.repository.entity.ArticlePayRecordDO;

/**
 * 技术派的支付服务接口
 *
 * @author YiHui
 * @date 2024/12/9
 */
public interface PayService {

    boolean support(ThirdPayWayEnum payWay);

    PayInfoDTO toPay(ArticlePayRecordDO record, boolean needRefresh);

    /**
     * 前端告知后端，将支付状态更新为支付中时，支付服务的处理逻辑
     *
     * @param record
     * @return true 执行成功，record记录有变更，需要执行保存操作  false 无需变更
     */
    boolean paying(ArticlePayRecordDO record);

}
