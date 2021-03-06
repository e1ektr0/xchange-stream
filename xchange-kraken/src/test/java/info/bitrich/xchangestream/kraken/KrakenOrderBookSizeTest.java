package info.bitrich.xchangestream.kraken;

import org.apache.commons.lang3.reflect.MethodUtils;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import static org.mockito.Mockito.mock;

public class KrakenOrderBookSizeTest {

    @Test
    public void test() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        KrakenStreamingMarketDataService krakenStreamingMarketDataService = new KrakenStreamingMarketDataService(mock(KrakenStreamingService.class));
        Assert.assertEquals(25, MethodUtils.invokeMethod(krakenStreamingMarketDataService, true, "parseOrderBookSize", new Object [] { new Object [] { "22" } }));
        Assert.assertEquals(25, MethodUtils.invokeMethod(krakenStreamingMarketDataService, true, "parseOrderBookSize", new Object [] { null }));
        Assert.assertEquals(25, MethodUtils.invokeMethod(krakenStreamingMarketDataService, true, "parseOrderBookSize", new Object [] { new Object [] { 22 } }));
        Assert.assertEquals(100, MethodUtils.invokeMethod(krakenStreamingMarketDataService, true, "parseOrderBookSize", new Object [] { new Object [] { 100 } }));
    }
}
