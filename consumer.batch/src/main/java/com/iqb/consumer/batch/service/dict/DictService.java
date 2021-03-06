package com.iqb.consumer.batch.service.dict;

import java.util.List;

import com.iqb.consumer.batch.data.entity.IqbSysDictItemEntity;
import com.iqb.consumer.batch.util.Constant.DictTypeCodeEnum;

public interface DictService {

    /**
     * 
     * Description: 通过表字段DTC [DICT_TYPE_CODE] 获取list
     * 
     * @param
     * @return List<IqbSysDictItemEntity>
     * @throws
     * @Author adam Create Date: 2017年6月19日 下午2:16:50
     */
    List<IqbSysDictItemEntity> getDictListByDTC(DictTypeCodeEnum dtce);

    /**
     * 
     * Description: 通过表字段DTC [DICT_TYPE_CODE]和 DC [DICT_CODE] 获取一条记录 。
     * 
     * 例如： 通过DTC [bizType2OpenId]和DC [biztype]找到对应的openId
     * 
     * @param
     * @return IqbSysDictItemEntity
     * @throws
     * @Author adam Create Date: 2017年6月19日 下午12:01:33
     */
    IqbSysDictItemEntity getDictByDTCAndDC(DictTypeCodeEnum dtc, String bizType);

    /**
     * 
     * Description: 通过openId 获取bizType
     * 
     * @param
     * @return String
     * @throws
     * @Author adam Create Date: 2017年6月19日 下午2:39:10
     */
    String getOpenIdByBizType(String bizType);
}
