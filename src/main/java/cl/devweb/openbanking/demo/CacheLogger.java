package cl.devweb.openbanking.demo;

import org.ehcache.event.CacheEvent;
import org.ehcache.event.CacheEventListener;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CacheLogger implements CacheEventListener<Object, Object> {

    public void onEvent(CacheEvent<?, ?> cacheEvent) {

        log.debug("Key: {} | EventType: {} | Old value: {} | New value: {}", cacheEvent.getKey(), cacheEvent.getType(),
                cacheEvent.getOldValue(), cacheEvent.getNewValue());
    }

}
