package win.icpc.tacocloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lucy
 */
@SpringBootApplication
public class TacoCloudApplication {
    
    /**
     * @description TODO
     *
     * @param args
     * @return void
     */
    public static void main(String[] args) {
        /**
         * run 创建 Spring 的应用上下文
         * @param 配置类
         * @param 命令行参数
         */
        SpringApplication.run(TacoCloudApplication.class, args);
    }

}
