package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2019030363446823";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDoxjSMVr9I7OiniuuEFALoi0Bl9/Sv5NLZxzoIeZUZHxOVKkfAL7w+PsX6eYoAP64t3igQfDNLYc8zqC13BnvcNHsVhu2ODqk/I67L9QNtdNxLZbF1TsB7Ae+CZ/jvHRHfDExZ/tsfrN36YV8AjtNGmku52WcEoOJo8UmB0uzpU4N+FY5Hos4zWVT7KeGdFeD00mMQyQlYO4j/CS1vz5GVxHYhLILguiyxVxcarP6x/lxoZgkccZnaSkeQJeXCmtW05KiXjKmU+Hbny5wIXfcmAFBnBF+nujyMBu6PAcvco0rTXK7CvX+4RdxZJgS3jMgWhcyqnmfOw5Y3PkV+lxTFAgMBAAECggEAOFpTum393S/Nm1IcdltJ4PZlXspKqJKjISoEOK0GlZBac1BLEpH75q3XzC3EZQ8FogEYffUzjdpeCUl7yEb/kW37JlkGBdAy1SBUXvgwHj2eX3p9HcM1AhKT42Q8ddb5zp/xlBAJCIAXNViBYWcyavNLxfCF6i7w4SsY+p8Pz+R7yxi9PsU318vLvHhdOozs7xmMGAIe2kjZ9NwGDrCUAqD1G9UnxtcdIG2vJmkwPeMFSUvdSqzgAcz2GbJzI2az3x2iC01knrg5Birv44q+8xYoAkUBwYJvobS//ZZ6Y3mnD9EZw7qGTBkLBpHcQWmIOlE2p+NIHAmx2vvGKzycQQKBgQD2l2ri2uZIxxKJCT1H4ZSW/hYqhL1IhdK3JVNUWHFJ7VoUMe7JNqL8OGkc+gB0hR3G5zT2EDSPfMS6IneC5n/2YdfMpL8qX4/WSWLlMgPrNipd6Di/IvuqhA2og0Yf02uMreivdHHgP9DhYY2+Cmro7v04KVihlFkCIaHN2mLWeQKBgQDxp9PwEk7Cl0xzlbG2TyOVmtqh6qira5GjQb//lASfMAgn9uKJKYszk+T6/1VVwER5S5rAAflLUIBLQ4cAwrX5mGgylDpH/g01u75LRdXT0lKndcaPaC6ga+BVZqnDLK6eJIwDW8ea2IlCnQe5aKiCULgpvLcjymjOKPJy8igNrQKBgQDiAJrs+dUvhIyfXgF1PPFzhcKJC4lzy3r5clMyLbD/IXN6qN0CO3obkhP8g8EhCdPltYgbsXSKwb6IHgjMxzcmeDxRifjO/DCXJEFocHOZAtbHpItF2ukvOcJO3KnLh3i9wbJOBHpOHg7yUfeX4nJjtI4OCA78YDtHsc1bHrmReQKBgF71nSHUf+CVhbRR2ZCTTp9mR42i4X7i+UrW9nSfHKXVQQ87Q8+0ZH/zGOLM3SKiOAYWAIx8+hJvYsqwkWdqHAolqqRdfP13Roeb6+42Vg0zs8kcTddikBf37CKDAiiw8TkxkVdshGZDusRTYoqoJrd2srer8ad9zWtdydADelvNAoGBANzkWRsiykFKySm6LEBZAaFqi4/j0C3wjY8Q3/u6+6yH5MEeyUW+Gpt9fosSYVV/Up4GM6QhVUhxJrmIy+qxiW5TlyjI9cp+YY+tpYu0baQnToJCFNeAFy0QxO5OyggC6ZT56VO73pZHBfpVxYa5X3tYVN+qpo0h/3f3SXJwmIIo";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA1xP1SUgNleaOJbiEZRNEZEW/hDP7pvw2KtN/KOZ/yXXPjZiHvWE4ZXmYm728qndTFwxPYiTf2LVNPUf6V+BTNMp8NhyRQ5Su2ko0oYxvHj/hU3UPo3Vp2wMANe8whtRhLIAiJuhHoPQNXSyd/3CZphzZgA3BPkn6t54opYUKgTD8LS2BgrK+1/Qd+U7/3jGco2enhU14B8xoVYoqIaIpYhkRoNFP2T2m1UcT/sF3wWOoUo3+eCxASWVdQUDZuKruSBop89o7UXwW24cFydujesMs9HPqKVvir84Kp2S0T6wFyTx1X+xTkdahqP2lVnAJZtpMRO4qry6dgjYoh4NCcwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipay.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

