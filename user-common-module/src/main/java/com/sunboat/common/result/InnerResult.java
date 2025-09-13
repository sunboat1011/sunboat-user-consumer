package com.sunboat.common.result;

import lombok.Data;

import java.io.Serializable;

/**
 * RPC调用内部返回结果封装类
 * 用于服务间RPC调用时统一返回格式
 * @param <T> 数据类型
 */
@Data
public class InnerResult<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    
    /** 成功状态码 */
    public static final int SUCCESS_CODE = 200;
    /** 失败状态码 */
    public static final int FAIL_CODE = 500;
    /** 业务异常状态码 */
    public static final int BUSINESS_EXCEPTION_CODE = 400;
    /** 权限不足状态码 */
    public static final int FORBIDDEN_CODE = 403;
    /** 资源未找到状态码 */
    public static final int NOT_FOUND_CODE = 404;
    
    /** 状态码 */
    private int code;
    
    /** 消息 */
    private String message;
    
    /** 数据 */
    private T data;
    
    /** 时间戳 */
    private long timestamp;
    
    /**
     * 无参构造函数
     */
    public InnerResult() {
        this.timestamp = System.currentTimeMillis();
    }
    
    /**
     * 全参构造函数
     * @param code 状态码
     * @param message 消息
     * @param data 数据
     */
    public InnerResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.timestamp = System.currentTimeMillis();
    }
    
    /**
     * 创建成功的结果
     * @param <T> 数据类型
     * @return 成功的结果对象
     */
    public static <T> InnerResult<T> success() {
        return new InnerResult<>(SUCCESS_CODE, "操作成功", null);
    }
    
    /**
     * 创建带数据的成功结果
     * @param <T> 数据类型
     * @param data 数据
     * @return 带数据的成功结果对象
     */
    public static <T> InnerResult<T> success(T data) {
        return new InnerResult<>(SUCCESS_CODE, "操作成功", data);
    }
    
    /**
     * 创建带消息和数据的成功结果
     * @param <T> 数据类型
     * @param message 消息
     * @param data 数据
     * @return 带消息和数据的成功结果对象
     */
    public static <T> InnerResult<T> success(String message, T data) {
        return new InnerResult<>(SUCCESS_CODE, message, data);
    }
    
    /**
     * 创建失败的结果
     * @param <T> 数据类型
     * @return 失败的结果对象
     */
    public static <T> InnerResult<T> fail() {
        return new InnerResult<>(FAIL_CODE, "操作失败", null);
    }
    
    /**
     * 创建带消息的失败结果
     * @param <T> 数据类型
     * @param message 消息
     * @return 带消息的失败结果对象
     */
    public static <T> InnerResult<T> fail(String message) {
        return new InnerResult<>(FAIL_CODE, message, null);
    }
    
    /**
     * 创建带状态码和消息的失败结果
     * @param <T> 数据类型
     * @param code 状态码
     * @param message 消息
     * @return 带状态码和消息的失败结果对象
     */
    public static <T> InnerResult<T> fail(int code, String message) {
        return new InnerResult<>(code, message, null);
    }
    
    /**
     * 创建业务异常结果
     * @param <T> 数据类型
     * @param message 异常消息
     * @return 业务异常结果对象
     */
    public static <T> InnerResult<T> businessException(String message) {
        return new InnerResult<>(BUSINESS_EXCEPTION_CODE, message, null);
    }
    
    /**
     * 判断结果是否成功
     * @return 是否成功
     */
    public boolean isSuccess() {
        return this.code == SUCCESS_CODE;
    }

    
    @Override
    public String toString() {
        return "RpcInnerResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                ", timestamp=" + timestamp +
                '}';
    }
}
