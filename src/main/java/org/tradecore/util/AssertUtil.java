/**
 * Beijing Jiaotong University
 * Copyright (c) 1896-2016 All Rights Reserved.
 */
package org.tradecore.util;

import java.util.Collection;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.tradecore.enums.ErrorDetailEnum;
import org.tradecore.exception.TradeCoreException;

/**
 * 断言工具类
 * @author HuHui
 * @version $Id: AssertUtil.java, v 0.1 2016年9月12日 下午3:43:48 HuHui Exp $
 */
public class AssertUtil {

    /**
     * 断言表达式的值为true，否则抛TradeException
     * 
     * @param expValue 断言表达式
     * @param errCode 异常错误码
     * @param errMsg 异常描述
     */
    public static void assertTrue(boolean expValue, ErrorDetailEnum errCode, String errMsg) {

        if (!expValue) {

            throw new TradeCoreException(errCode, errMsg);
        }
    }

    /**
     * 断言表达式的值为false，否则抛TradeException
     * 
     * @param expValue 断言表达式
     * @param errCode 异常错误码
     * @param errMsg 异常描述
     */
    public static void assertFalse(boolean expValue, ErrorDetailEnum errCode, String errMsg) {

        if (expValue) {

            throw new TradeCoreException(errCode, errMsg);
        }
    }

    /**
     * 断言两个对象相等，否则抛TradeException
     * 
     * @param obj1
     * @param obj2
     * @param errCode 异常错误码
     * @param errMsg 异常描述
     */
    public static void assertEquals(Object obj1, Object obj2, ErrorDetailEnum errCode, String errMsg) {

        if (obj1 == null) {

            assertNull(obj2, errCode, errMsg);
            return;
        }

        if (!obj1.equals(obj2)) {

            throw new TradeCoreException(errCode, errMsg);
        }
    }

    /**
     * 断言两个对象不等，否则抛TradeException
     * 
     * @param obj1
     * @param obj2
     * @param errCode 异常错误码
     * @param errMsg 异常描述
     */
    public static void assertNotEquals(Object obj1, Object obj2, ErrorDetailEnum errCode, String errMsg) {

        if (obj1 == null) {

            assertNotNull(obj2, errCode, errMsg);
            return;
        }

        if (obj1.equals(obj2)) {

            throw new TradeCoreException(errCode, errMsg);
        }
    }

    /**
     * 断言对象至少等于容器中的一个
     * 
     * @param obj1
     * @param objects
     * @param errCode 异常错误码
     * @param errMsg 异常描述
     */
    public static void assertEqualsAny(Object obj1, Object[] objects, ErrorDetailEnum errCode, String errMsg) {

        if (null == objects) {

            throw new TradeCoreException(errCode, errMsg);
        }

        for (Object obj2 : objects) {

            if (obj1 == null) {

                if (obj2 == null) {
                    return;
                }

                continue;
            }

            if (obj1.equals(obj2)) {

                return;
            }
        }

        throw new TradeCoreException(errCode, errMsg);
    }

    /**
     * 断言两个对象相同，否则抛TradeException
     * 
     * @param obj1
     * @param obj2
     * @param errCode 异常错误码
     * @param errMsg 异常描述
     */
    public static void assertIs(Object obj1, Object obj2, ErrorDetailEnum errCode, String errMsg) {

        if (obj1 != obj2) {

            throw new TradeCoreException(errCode, errMsg);
        }
    }

    /**
     * 断言两个对象不同，否则抛TradeException
     * 
     * @param obj1
     * @param obj2
     * @param errCode 异常错误码
     * @param errMsg 异常描述
     */
    public static void assertIsNot(Object obj1, Object obj2, ErrorDetailEnum errCode, String errMsg) {

        if (obj1 == obj2) {

            throw new TradeCoreException(errCode, errMsg);
        }
    }

    /**
     * 断言对象在容器中
     * 
     * @param obj1
     * @param objs
     * @param errCode 异常错误码
     * @param errMsg 异常描述
     */
    public static void assertIn(Object obj1, Object[] objs, ErrorDetailEnum errCode, String errMsg) {

        if (null == objs) {

            throw new TradeCoreException(errCode, errMsg);
        }

        for (Object obj : objs) {

            if (obj == obj1) {

                return;
            }
        }

        throw new TradeCoreException(errCode, errMsg);
    }

    /**
     * 断言对象为空，否则抛TradeException
     * 
     * @param str 断言字符串
     * @param errCode 异常错误码
     * @param errMsg 异常描述
     */
    public static void assertBlank(String str, ErrorDetailEnum errCode, String errMsg) {

        if (StringUtils.isNotBlank(str)) {

            throw new TradeCoreException(errCode, errMsg);
        }
    }

    /**
     * 断言对象为空，否则抛TradeException
     * 
     * @param str 断言字符串
     * @param errCode 异常错误码
     * @param errMsg 异常描述
     */
    public static void assertNotBlank(String str, ErrorDetailEnum errCode, String errMsg) {

        if (StringUtils.isBlank(str)) {

            throw new TradeCoreException(errCode, errMsg);
        }
    }

    /**
     * 断言对象为null，否则抛TradeException
     * 
     * @param object 断言对象
     * @param errCode 异常错误码
     * @param errMsg 异常描述
     */
    public static void assertNull(Object object, ErrorDetailEnum errCode, String errMsg) {

        if (object != null) {

            throw new TradeCoreException(errCode, errMsg);
        }
    }

    /**
     * 断言对象非null，否则抛TradeException
     * 
     * @param object 断言对象
     * @param errCode 异常错误码
     * @param errMsg 异常描述
     */
    public static void assertNotNull(Object object, ErrorDetailEnum errCode, String errMsg) {

        if (null == object) {

            throw new TradeCoreException(errCode, errMsg);
        }
    }

    /**
     * 断言对象非null，否则抛TradeException
     * 
     * @param object 断言对象
     * @param errCode 异常错误码
     */
    public static void assertNotNull(Object object, ErrorDetailEnum errCode) {

        if (null == object) {

            throw new TradeCoreException(errCode);
        }
    }

    /**
     * 断言集合不为空或null，否则抛TradeException
     * 
     * @param collection 断言集合
     * @param errCode 异常错误码
     * @param errMsg 异常描述
     */
    @SuppressWarnings("rawtypes")
    public static void assertNotBlank(Collection collection, ErrorDetailEnum errCode, String errMsg) {

        if (CollectionUtils.isEmpty(collection)) {

            throw new TradeCoreException(errCode, errMsg);
        }
    }
}
