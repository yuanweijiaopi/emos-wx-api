package com.example.emos.wx.bean.common;

public enum ResultStatus {

    /**
     * 请求处理成功
     */
    OK(200, "请求处理成功"),

    /**
     * 错误的请求
     */
    BAD_REQUEST(400, "错误的请求"),

    /**
     * 当前请求未认证
     */
    UNAUTHORIZED(401, "当前请求未认证"),

    /**
     * 用户名或密码错误
     */
    PASSWORD_ERROR(402, "用户名或密码错误"),

    /**
     * 没有权限
     */
    PERMISSION_DENIED(403, "没有权限"),

    /**
     * 资源不存在，API路径不对，或者无效路径
     */
    NOT_FOUND(404, "资源不存在，API路径不对，或者无效路径"),

    /**
     * 您商户还未开通
     */
    NOT_OPEN(405, "您商户还未开通"),

    /**
     * 操作员未启用
     */
    OPERATOR_DISABLED(406, "操作员未启用"),

    /**
     * 角色名已存在
     */
    EXISTED_ROLE(407, "角色名已存在"),

    /**
     * 请求超时
     */
    REQUEST_TIMEOUT(408, "请求超时"),

    /**
     * 未配置角色
     */
    NO_ROLE(409, "未配置角色"),

    /**
     * 角色被禁用
     */
    NOT_OPEN_ROLE(410, "角色被禁用"),

    /**
     * 参数错误
     */
    PARAMETER_ERROR(415, "参数错误"),

    /**
     * token缺失
     */
    NOTFOUNDTOKEN(416, "token缺失"),

    /**
     * 文件格式错误
     */
    FILE_FOEMATERROR(417, "文件格式错误"),

    /**
     * 上传文件失败
     */
    FILE_UPLOADERROR(418, "上传文件失败"),

    /**
     * 验证码错误
     */
    VERIFICATION_CODE_ERROR(430, "验证码错误"),

    /**
     * 验证码过期
     */
    VERIFICATION_CODE_DATED(431, "验证码过期"),

    /**
     * 用户不存在
     */
    USER_NOT_EXISTS(432, "用户不存在, 或被禁用"),

    /**
     * 验证码为空
     */
    VERIFICATION_CODE_NULL(433, "验证码为空"),

    /**
     * 密码错误次数过多，用户锁定
     */
    USER_LOCKED(434, "用户被锁定"),

    /**
     * 用户密码过期
     */
    EXPIRE_PASSWORD(435, "密码过期"),

    /**
     * 登陆密码未设置
     */
    PASSWORD_NOT_SET(436, "密码未设置或动态密码不正确"),

    /**
     * 授权失败
     */
    AUTH_ERROR(437, "授权失败"),

    /**
     * 服务异常
     */
    SERVER_ERROR(500, "服务异常"),

    /**
     * 交易 - 卡种不能为空
     */
    TRADE_CARD_NULL(1001, "卡种不能为空"),

    MER_SHOPOPERA_WEBSITEREPEAT(3001, "网站地址已经存在"),
    MER_SHOPOPERA_PASSWORD(3002, "密码格式不正确"),
    MER_SHOPOPERA_EMAIL(3003, "邮箱格式不正确"),
    MER_SHOPOPERA_USERNAMEISNULL(3004, "用户名不能为空"),
    MER_SHOPOPERA_PASSWORDISNULL(3005, "密码不能不能为空"),
    MER_SHOPOPERA_EMAILISNULL(3006, "邮箱不能为空"),
    VERIFICATION_Pwd_WRONG(3007, "原密码错误"),
    MER_SHOPOPERA_UreName(3008, ""),
    PASSWORD_NOT_VALID(3009, "必须包含数字、字符、字母（不分大小写）"),
    EMAIL_EXISTS(3010, "邮箱已存在"),
    USERNAME_EXISTS(3011, "用户名已存在"),


    /**
     * sdk服务管理
     */
    SDK_MOBILE_TYPE(3101, "当前包名的应用类型已经存在"),

    /**
     * 代理商
     */
    PAYTNER_LOGIN(4001, "账号未激活"),
    PAYTNER_LOGIN_ACCOUNT(4002, "代理商未激活"),
    PARTNER_LOGIN_WL_DOMAINERR(4003, "登陆账户不存在"),

    /**
     * 链接支付输入参数验证提示
     */
    TRADE_LINKPAY_PRODUCTNAME_NULL(1002, "商品名称不能为空"),
    TRADE_LINKPAY_ORDERNO_NULL(1003, "订单号不能为空"),
    TRADE_LINKPAY_ORDERAMOUNT_NULL(1004, "订单金额不能为空"),
    TRADE_LINKPAY_ORDERAMOUNT_FORMAT(1005, "订单金额最多两位小数"),
    TRADE_LINKPAY_CURRENCY_NULL(1006, "币种不能为空"),
    TRADE_LINKPAY_NOTIFYURL_NULL(1007, "通知地址不能为空"),
    TRADE_LINKPAY_NOTIFYURL_FORMAT(1008, "通知地址必须以'http'或'https'开头"),
    TRADE_LINKPAY_RETURNURL_NULL(1009, "返回地址不能为空"),
    TRADE_LINKPAY_RETURNURL_FORMAT(1010, "返回地址必须以'http'或'https'开头"),
    TRADE_LINKPAY_EMAIL_NULL(1011, "收件人邮箱不能为空"),
    TRADE_LINKPAY_EMAIL_FORMAT(1012, "收件人邮箱格式错误"),
    TRADE_LINKPAY_URL_NULL(1013, "支付链接不能为空"),
    TRADE_LINKPAY_URL_FORMAT(1014, "支付链接格式错误"),

    /**
     * 链接支付发送邮件 同一商户订单只能发送一次
     */
    TRADE_LINKPAY_SENDMAIL_ONCE(1015, "该订单的支付链接邮件已成功发送，不能重复发送！"),

    /**
     * 链接支付调用网关错误
     */
    TRADE_LINKPAY_GATEWAY_ERROR(1016, "调用网关异常"),

    /**
     * 白标代理商
     */
    PARTNER_CONFIG_LOGO(40001, "logo不能为空"),
    PARTNER_CONFIG_LOGOWEB(40002, "企业官网不能为空"),
    PARTNER_CONFIG_DOMAINNAME(40003, "域名不能为空"),
    PARTNER_CONFIG_EMAIL(40004, "无效邮件"),
    PARTNER_CONFIG_CODE(40005, "备案号不能为空"),
    PARTNER_CONFIG_GATEWAY(40006, "无效网址"),
    PARTNER_TEMPLATE_TYPE(40007, "模板类型不能为空"),
    PARTNER_TEMPLATE_TMPL(40008, "模板内容不能为空"),
    PARTNER_DOMAIN_EXIST(40009, "合作伙伴主域名已存在"),
    DOWNDOWNLOAD_RECONCILE_LIST(40010, "未找到结算单");


    /**
     * 状态码
     */
    private final int value;

    /**
     * 描述
     */
    private final String describe;

    ResultStatus(int value, String reason) {
        this.value = value;
        this.describe = reason;
    }

    /**
     * 获取状态码
     */
    public int value() {
        return this.value;
    }

    /**
     * 获取描述
     */
    public String getDescribe() {
        return this.describe;
    }

    @Override
    public String toString() {
        return Integer.toString(this.value);
    }

    /**
     * 根据状态码查找对象
     *
     * @param statusCode 状态码
     * @return ResultStatus
     * @throws IllegalArgumentException
     */
    public static ResultStatus valueOf(int statusCode) {
        ResultStatus status = resolve(statusCode);
        if (status == null) {
            throw new IllegalArgumentException("状态码不能为空");
        }
        return status;
    }

    /**
     * 根据状态码查找对象
     *
     * @param statusCode 状态码
     * @return ResultStatus
     */
    public static ResultStatus resolve(int statusCode) {
        for (ResultStatus status : values()) {
            if (status.value == statusCode) {
                return status;
            }
        }
        return null;
    }

}
