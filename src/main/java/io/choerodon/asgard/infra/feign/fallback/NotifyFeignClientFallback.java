package io.choerodon.asgard.infra.feign.fallback;

import io.choerodon.asgard.infra.feign.NotifyFeignClient;
import io.choerodon.core.exception.CommonException;
import io.choerodon.core.notify.NoticeSendDTO;
import org.springframework.stereotype.Component;


@Component
public class NotifyFeignClientFallback implements NotifyFeignClient {

    private static final String FEIGN_ERROR = "notify.error";

    @Override
    public void postNotice(NoticeSendDTO dto) {
        throw new CommonException(FEIGN_ERROR);
    }
}
