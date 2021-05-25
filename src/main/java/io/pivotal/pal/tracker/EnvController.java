package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EnvController {

    private String port;
    private String memoryLimit;
    private String cfInstanceIndex;
    private String cfInstanceAddr;


    public EnvController(@Value("${port:NOT SET}") String port, @Value("${memory.limit:NOT SET}")String memoryLimit,
                         @Value("${cf.instance.index:NOT SET}")String cfInstanceIndex,
                         @Value("${cf.instance.addr:NOT SET}")String cfInstanceAddr) {
        this.port = port;
        this.memoryLimit = memoryLimit;
        this.cfInstanceIndex = cfInstanceIndex;
        this.cfInstanceAddr = cfInstanceAddr;
    }

    @GetMapping("/env")
    public Map getEnv() {
        Map hashMap = new HashMap();
        hashMap.put("PORT",port);
        hashMap.put("MEMORY_LIMIT",memoryLimit);
        hashMap.put("CF_INSTANCE_INDEX",cfInstanceIndex);
        hashMap.put("CF_INSTANCE_ADDR",cfInstanceAddr);
        return hashMap;

    }
}
