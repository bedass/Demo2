package com.aaa.util;

/**
 * fileName:JedisUtil
 * description:
 * author:zz
 * createTime:2019-03-02 19:04
 */
public interface JedisUtil {
    /**
     * 放入缓存
     * @param key
     * @param value
     */
    void putObject(Object key, Object value);
    /**
     * 清除缓存
     * @param arg0
     * @return
     */
    Object removeObject(Object arg0);
    /**
     * 从缓存中获取
     * @param arg0
     * @return
     */
    Object getObject(Object arg0);
}
