package com.atguigu.gmall.service;

import com.atguigu.gmall.entity.WmsWareOrderTask;
import java.util.List;

/**
 * åº“å­˜å·¥ä½œå•è¡¨ åº“å­˜å·¥ä½œå•è¡¨(WmsWareOrderTask)表服务接口
 *
 * @author makejava
 * @since 2020-02-13 11:01:54
 */
public interface WmsWareOrderTaskService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WmsWareOrderTask queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WmsWareOrderTask> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param wmsWareOrderTask 实例对象
     * @return 实例对象
     */
    WmsWareOrderTask insert(WmsWareOrderTask wmsWareOrderTask);

    /**
     * 修改数据
     *
     * @param wmsWareOrderTask 实例对象
     * @return 实例对象
     */
    WmsWareOrderTask update(WmsWareOrderTask wmsWareOrderTask);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}